package org.openapitools.server.model;

import org.openapitools.server.model.OrderStatusChangeDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class UpdateOrderStatusRequest   {

    private OrderStatusChangeDTO order;

    /**
     * Default constructor.
     */
    public UpdateOrderStatusRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateOrderStatusRequest.
     *
     * @param order order
     */
    public UpdateOrderStatusRequest(
        OrderStatusChangeDTO order
    ) {
        this.order = order;
    }



    /**
     * Get order
     * @return order
     */
    public OrderStatusChangeDTO getOrder() {
        return order;
    }

    public void setOrder(OrderStatusChangeDTO order) {
        this.order = order;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOrderStatusRequest {\n");
        
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

