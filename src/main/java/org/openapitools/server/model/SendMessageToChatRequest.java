package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * В какой чат нужно отправить сообщение и текст сообщения.
 */
public class SendMessageToChatRequest   {

    private String message;

    /**
     * Default constructor.
     */
    public SendMessageToChatRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create SendMessageToChatRequest.
     *
     * @param message Текст сообщения. Максимальная длина — 4096 символа.
     */
    public SendMessageToChatRequest(
        String message
    ) {
        this.message = message;
    }



    /**
     * Текст сообщения. Максимальная длина — 4096 символа.
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
        sb.append("class SendMessageToChatRequest {\n");
        
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

