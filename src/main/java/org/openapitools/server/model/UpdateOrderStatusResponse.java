package org.openapitools.server.model;

import org.openapitools.server.model.OrderDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об изменении статуса заказа.
 */
public class UpdateOrderStatusResponse   {

    private OrderDTO order;

    /**
     * Default constructor.
     */
    public UpdateOrderStatusResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateOrderStatusResponse.
     *
     * @param order order
     */
    public UpdateOrderStatusResponse(
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
        sb.append("class UpdateOrderStatusResponse {\n");
        
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

