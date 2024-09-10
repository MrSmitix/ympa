package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OrderStateDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список заказов.
 */
public class UpdateOrderStatusesRequest   {

    private List<@Valid OrderStateDTO> orders = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UpdateOrderStatusesRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateOrderStatusesRequest.
     *
     * @param orders Список заказов.
     */
    public UpdateOrderStatusesRequest(
        List<@Valid OrderStateDTO> orders
    ) {
        this.orders = orders;
    }



    /**
     * Список заказов.
     * @return orders
     */
    public List<@Valid OrderStateDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<@Valid OrderStateDTO> orders) {
        this.orders = orders;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOrderStatusesRequest {\n");
        
        sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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

