package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Заказ, для которого нужно создать чат. 
 */
public class CreateChatRequest   {

    private Long orderId;

    /**
     * Default constructor.
     */
    public CreateChatRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateChatRequest.
     *
     * @param orderId Идентификатор заказа на Маркете.
     */
    public CreateChatRequest(
        Long orderId
    ) {
        this.orderId = orderId;
    }



    /**
     * Идентификатор заказа на Маркете.
     * @return orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChatRequest {\n");
        
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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

