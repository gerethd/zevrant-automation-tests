package starter.stepdefinitions;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.Header;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import starter.pojo.Token;
import starter.services.SecretsManager;

import java.io.IOException;

public class Hooks {

    private Logger logger = LoggerFactory.getLogger(Hooks.class);
    private SecretsManager secretsManager = new SecretsManager();
    private ObjectMapper objectMapper = new ObjectMapper();

    @Before
    public void setupDnd() {
        RestAssured.useRelaxedHTTPSValidation();
        String baseUrl = System.getenv("BASE_URL") != null ? System.getenv("BASE_URL") : "https://develop.zevrant-services.com";
        RestAssured.given().header(new Header("Authorization", "bearer " + getToken(baseUrl)))
                .delete(baseUrl+ "/zevrant-dnd-service/campaigns?campaignName=test user automation")
                    .andReturn().getBody().prettyPrint();
    }

    private String getToken(String baseUrl) {
        String environment = System.getProperty("environment");
        if(environment == null) {
            environment = "local";
        }

        String clientId = secretsManager.getSecret("/" + environment + "/dnd/oauth2/username");
        String clientSecret = secretsManager.getSecret("/" + environment + "/dnd/oauth2/password");

        RestAssured.useRelaxedHTTPSValidation();
        System.out.println(System.getenv("BASE_URL") + "/zevrant-oauth2-service/oauth/token");
        String body = RestAssured
                .given()
                            .multiPart("client_id", clientId)
                            .multiPart("client_secret", clientSecret)
                            .multiPart("grant_type", "client_credentials")
                            .multiPart("scope", "DEFAULT")
                        .post(baseUrl + "/zevrant-oauth2-service/oauth/token")
                .andReturn().getBody().prettyPrint();


        try {
            return objectMapper.readValue(body, Token.class).getAccessToken();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
