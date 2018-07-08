/**
 * none
 */
package petstore.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xuqebe08n4-2017-03-20T07:58:13Z/NewPetResponse"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NewPetResponse implements Serializable, Cloneable, StructuredPojo {

    private String message;

    private Pet pet;

    /**
     * @param message
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * @return
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * @param message
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPetResponse message(String message) {
        setMessage(message);
        return this;
    }

    /**
     * @param pet
     */

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    /**
     * @return
     */

    public Pet getPet() {
        return this.pet;
    }

    /**
     * @param pet
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NewPetResponse pet(Pet pet) {
        setPet(pet);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getPet() != null)
            sb.append("Pet: ").append(getPet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NewPetResponse == false)
            return false;
        NewPetResponse other = (NewPetResponse) obj;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getPet() == null ^ this.getPet() == null)
            return false;
        if (other.getPet() != null && other.getPet().equals(this.getPet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getPet() == null) ? 0 : getPet().hashCode());
        return hashCode;
    }

    @Override
    public NewPetResponse clone() {
        try {
            return (NewPetResponse) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        petstore.model.transform.NewPetResponseMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
