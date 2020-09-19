package starter.services;

import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.services.secretsmanager.AWSSecretsManager;
import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
import com.amazonaws.services.secretsmanager.model.GetSecretValueRequest;
import com.amazonaws.services.secretsmanager.model.GetSecretValueResult;

public class SecretsManager {

  private AWSSecretsManager secretsManager;

  public SecretsManager() {
    AwsClientBuilder.EndpointConfiguration config =
      new AwsClientBuilder.EndpointConfiguration("secretsmanager.us-east-1.amazonaws.com", "us-east-1");

    AWSSecretsManagerClientBuilder clientBuilder = AWSSecretsManagerClientBuilder.standard();
    clientBuilder.setEndpointConfiguration(config);
    secretsManager = clientBuilder.build();
  }

  public String getSecret(String secretName) {
    GetSecretValueRequest secretValueRequest = new GetSecretValueRequest();
    secretValueRequest.setSecretId(secretName);

    GetSecretValueResult secretResult = secretsManager.getSecretValue(secretValueRequest);

    return secretResult.getSecretString();
  }
}
