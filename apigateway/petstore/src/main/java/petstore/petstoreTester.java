package petstore;

import com.amazonaws.opensdk.config.ConnectionConfiguration;
import com.amazonaws.opensdk.config.TimeoutConfiguration;
import petstore.model.GetPetsRequest;
import petstore.model.GetPetsResult;

public class petstoreTester {

    public static void main(String[] args) {
        petstoreClientBuilder builder = petstore.builder();
        petstore client = petstore.builder()
                .connectionConfiguration(new ConnectionConfiguration()
                        .maxConnections(100)
                        .connectionMaxIdleMillis(1000))
                .timeoutConfiguration(new TimeoutConfiguration()
                        .httpRequestTimeout(3000)
                        .totalExecutionTimeout(10000)
                        .socketTimeout(2000))
                .build();

        GetPetsResult result = client.getPets(new GetPetsRequest());
        System.out.println("Pets + "+result);
        //    System.out.println(result.sdkResponseMetadata().requestId());
        //    System.out.println(result.sdkResponseMetadata().httpStatusCode());
        result.sdkResponseMetadata().header("Content-Length").ifPresent(System.out::println);

        client.shutdown();

    }
}
