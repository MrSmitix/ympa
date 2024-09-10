package org.openapitools.server.model;

import org.openapitools.server.model.OrderDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GetOrderResponse   {

    private OrderDTO order;

    /**
     * Default constructor.
     */
    public GetOrderResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetOrderResponse.
     *
     * @param order order
     */
    public GetOrderResponse(
        OrderDTO order
    ) {
        this.order = order;
    }



    /**
     * Get order
     * @return order
     */
    public OrderDTO getOrder() {
        return order;
    }

    public void setOrder(OrderDTO order) {
        this.order = order;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOrderResponse {\n");
        
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

