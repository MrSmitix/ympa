package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Историю какого чата нужно получить — и начиная с какого сообщения. 
 */
public class GetChatHistoryRequest   {

    private Long messageIdFrom;

    /**
     * Default constructor.
     */
    public GetChatHistoryRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetChatHistoryRequest.
     *
     * @param messageIdFrom Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
     */
    public GetChatHistoryRequest(
        Long messageIdFrom
    ) {
        this.messageIdFrom = messageIdFrom;
    }



    /**
     * Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения.
     * @return messageIdFrom
     */
    public Long getMessageIdFrom() {
        return messageIdFrom;
    }

    public void setMessageIdFrom(Long messageIdFrom) {
        this.messageIdFrom = messageIdFrom;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetChatHistoryRequest {\n");
        
        sb.append("    messageIdFrom: ").append(toIndentedString(messageIdFrom)).append("\n");
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

