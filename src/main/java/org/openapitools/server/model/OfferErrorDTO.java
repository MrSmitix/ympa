package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Сообщение об ошибке, связанной с размещением товара.
 */
public class OfferErrorDTO   {

    private String message;
    private String comment;

    /**
     * Default constructor.
     */
    public OfferErrorDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferErrorDTO.
     *
     * @param message Тип ошибки.
     * @param comment Пояснение.
     */
    public OfferErrorDTO(
        String message, 
        String comment
    ) {
        this.message = message;
        this.comment = comment;
    }



    /**
     * Тип ошибки.
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Пояснение.
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferErrorDTO {\n");
        
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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

