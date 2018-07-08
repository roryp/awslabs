/**
 * none
 */
package petstore;

import javax.annotation.Generated;

import com.amazonaws.*;
import com.amazonaws.opensdk.*;
import com.amazonaws.opensdk.model.*;
import com.amazonaws.regions.*;

import petstore.model.*;

/**
 * Interface for accessing petstore.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface petstore {

    /**
     * @param createPetRequest
     * @return Result of the CreatePet operation returned by the service.
     * @sample petstore.CreatePet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xuqebe08n4-2017-03-20T07:58:13Z/CreatePet" target="_top">AWS
     *      API Documentation</a>
     */
    CreatePetResult createPet(CreatePetRequest createPetRequest);

    /**
     * @param getApiRootRequest
     * @return Result of the GetApiRoot operation returned by the service.
     * @sample petstore.GetApiRoot
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xuqebe08n4-2017-03-20T07:58:13Z/GetApiRoot"
     *      target="_top">AWS API Documentation</a>
     */
    GetApiRootResult getApiRoot(GetApiRootRequest getApiRootRequest);

    /**
     * @param getPetRequest
     * @return Result of the GetPet operation returned by the service.
     * @sample petstore.GetPet
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xuqebe08n4-2017-03-20T07:58:13Z/GetPet" target="_top">AWS
     *      API Documentation</a>
     */
    GetPetResult getPet(GetPetRequest getPetRequest);

    /**
     * @param getPetsRequest
     * @return Result of the GetPets operation returned by the service.
     * @sample petstore.GetPets
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xuqebe08n4-2017-03-20T07:58:13Z/GetPets" target="_top">AWS
     *      API Documentation</a>
     */
    GetPetsResult getPets(GetPetsRequest getPetsRequest);

    /**
     * @return Create new instance of builder with all defaults set.
     */
    public static petstoreClientBuilder builder() {
        return new petstoreClientBuilder();
    }

    /**
     * Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
     * callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
     * has been shutdown, it should not be used to make any more requests.
     */
    void shutdown();

}
