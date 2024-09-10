package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.UpdateOrderStatusDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список заказов, статус которых обновился.
 */
public class UpdateOrderStatusesDTO   {

    private List<@Valid UpdateOrderStatusDTO> orders = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UpdateOrderStatusesDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateOrderStatusesDTO.
     *
     * @param orders Список с обновленными заказами.
     */
    public UpdateOrderStatusesDTO(
        List<@Valid UpdateOrderStatusDTO> orders
    ) {
        this.orders = orders;
    }



    /**
     * Список с обновленными заказами.
     * @return orders
     */
    public List<@Valid UpdateOrderStatusDTO> getOrders() {
        return orders;
    }

    public void setOrders(List<@Valid UpdateOrderStatusDTO> orders) {
        this.orders = orders;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOrderStatusesDTO {\n");
        
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

