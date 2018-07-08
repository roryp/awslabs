/**
 * none
 */
package petstore;

import java.net.*;
import java.util.*;

import javax.annotation.Generated;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.opensdk.protect.model.transform.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.protocol.json.*;

import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.client.AwsSyncClientParams;

import com.amazonaws.client.ClientHandler;
import com.amazonaws.client.ClientHandlerParams;
import com.amazonaws.client.ClientExecutionParams;
import com.amazonaws.opensdk.protect.client.SdkClientHandler;
import com.amazonaws.SdkBaseException;

import petstore.model.*;
import petstore.model.transform.*;

/**
 * Client for accessing petstore. All service calls made using this client are blocking, and will not return until the
 * service call completes.
 * <p>
 * 
 */
@ThreadSafe
@Generated("com.amazonaws:aws-java-sdk-code-generator")
class petstoreClient implements petstore {

    private final ClientHandler clientHandler;

    private static final com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl protocolFactory = new com.amazonaws.opensdk.protect.protocol.ApiGatewayProtocolFactoryImpl(
            new JsonClientMetadata().withProtocolVersion("1.1").withSupportsCbor(false).withSupportsIon(false).withContentTypeOverride("application/json")
                    .withBaseServiceExceptionClass(petstoreException.class));

    /**
     * Constructs a new client to invoke service methods on petstore using the specified parameters.
     *
     * <p>
     * All service calls made using this new client object are blocking, and will not return until the service call
     * completes.
     *
     * @param clientParams
     *        Object providing client parameters.
     */
    petstoreClient(AwsSyncClientParams clientParams) {
        this.clientHandler = new SdkClientHandler(new ClientHandlerParams().withClientParams(clientParams));
    }

    /**
     * @param createPetRequest
     * @return Result of the CreatePet operation returned by the service.
     * @sample petstore.CreatePet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xuqebe08n4-2017-03-20T07:58:13Z/CreatePet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public CreatePetResult createPet(CreatePetRequest createPetRequest) {
        HttpResponseHandler<CreatePetResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new CreatePetResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<CreatePetRequest, CreatePetResult>()
                .withMarshaller(new CreatePetRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(createPetRequest));
    }

    /**
     * @param getApiRootRequest
     * @return Result of the GetApiRoot operation returned by the service.
     * @sample petstore.GetApiRoot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xuqebe08n4-2017-03-20T07:58:13Z/GetApiRoot"
     *      target="_top">AWS API Documentation</a>
     */
    @Override
    public GetApiRootResult getApiRoot(GetApiRootRequest getApiRootRequest) {
        HttpResponseHandler<GetApiRootResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetApiRootResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetApiRootRequest, GetApiRootResult>()
                .withMarshaller(new GetApiRootRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getApiRootRequest));
    }

    /**
     * @param getPetRequest
     * @return Result of the GetPet operation returned by the service.
     * @sample petstore.GetPet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xuqebe08n4-2017-03-20T07:58:13Z/GetPet" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetPetResult getPet(GetPetRequest getPetRequest) {
        HttpResponseHandler<GetPetResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetPetResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetPetRequest, GetPetResult>()
                .withMarshaller(new GetPetRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getPetRequest));
    }

    /**
     * @param getPetsRequest
     * @return Result of the GetPets operation returned by the service.
     * @sample petstore.GetPets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xuqebe08n4-2017-03-20T07:58:13Z/GetPets" target="_top">AWS
     *      API Documentation</a>
     */
    @Override
    public GetPetsResult getPets(GetPetsRequest getPetsRequest) {
        HttpResponseHandler<GetPetsResult> responseHandler = protocolFactory.createResponseHandler(new JsonOperationMetadata().withPayloadJson(true)
                .withHasStreamingSuccessResponse(false), new GetPetsResultJsonUnmarshaller());

        HttpResponseHandler<SdkBaseException> errorResponseHandler = createErrorResponseHandler();

        return clientHandler.execute(new ClientExecutionParams<GetPetsRequest, GetPetsResult>()
                .withMarshaller(new GetPetsRequestProtocolMarshaller(protocolFactory)).withResponseHandler(responseHandler)
                .withErrorResponseHandler(errorResponseHandler).withInput(getPetsRequest));
    }

    /**
     * Create the error response handler for the operation.
     * 
     * @param errorShapeMetadata
     *        Error metadata for the given operation
     * @return Configured error response handler to pass to HTTP layer
     */
    private HttpResponseHandler<SdkBaseException> createErrorResponseHandler(JsonErrorShapeMetadata... errorShapeMetadata) {
        return protocolFactory.createErrorResponseHandler(new JsonErrorResponseMetadata().withErrorShapes(Arrays.asList(errorShapeMetadata)));
    }

    @Override
    public void shutdown() {
        clientHandler.shutdown();
    }

}
