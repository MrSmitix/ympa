package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.OfferContentErrorType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Текст ошибки.
 */
public class OfferContentErrorDTO   {

    private OfferContentErrorType type;
    private Long parameterId;
    private String message;

    /**
     * Default constructor.
     */
    public OfferContentErrorDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferContentErrorDTO.
     *
     * @param type type
     * @param parameterId Идентификатор характеристики, с которой связана ошибка.
     * @param message Текст ошибки.
     */
    public OfferContentErrorDTO(
        OfferContentErrorType type, 
        Long parameterId, 
        String message
    ) {
        this.type = type;
        this.parameterId = parameterId;
        this.message = message;
    }



    /**
     * Get type
     * @return type
     */
    public OfferContentErrorType getType() {
        return type;
    }

    public void setType(OfferContentErrorType type) {
        this.type = type;
    }

    /**
     * Идентификатор характеристики, с которой связана ошибка.
     * @return parameterId
     */
    public Long getParameterId() {
        return parameterId;
    }

    public void setParameterId(Long parameterId) {
        this.parameterId = parameterId;
    }

    /**
     * Текст ошибки.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferContentErrorDTO {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    parameterId: ").append(toIndentedString(parameterId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

