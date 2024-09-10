package org.openapitools.server.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Годные/негодные ярлыки по заказам в отгрузке.
 */
public class OrdersShipmentInfoDTO   {

    private Set<Long> orderIdsWithLabels = new LinkedHashSet<>();
    private Set<Long> orderIdsWithoutLabels = new LinkedHashSet<>();

    /**
     * Default constructor.
     */
    public OrdersShipmentInfoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrdersShipmentInfoDTO.
     *
     * @param orderIdsWithLabels Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
     * @param orderIdsWithoutLabels Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
     */
    public OrdersShipmentInfoDTO(
        Set<Long> orderIdsWithLabels, 
        Set<Long> orderIdsWithoutLabels
    ) {
        this.orderIdsWithLabels = orderIdsWithLabels;
        this.orderIdsWithoutLabels = orderIdsWithoutLabels;
    }



    /**
     * Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
     * @return orderIdsWithLabels
     */
    public Set<Long> getOrderIdsWithLabels() {
        return orderIdsWithLabels;
    }

    public void setOrderIdsWithLabels(Set<Long> orderIdsWithLabels) {
        this.orderIdsWithLabels = orderIdsWithLabels;
    }

    /**
     * Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
     * @return orderIdsWithoutLabels
     */
    public Set<Long> getOrderIdsWithoutLabels() {
        return orderIdsWithoutLabels;
    }

    public void setOrderIdsWithoutLabels(Set<Long> orderIdsWithoutLabels) {
        this.orderIdsWithoutLabels = orderIdsWithoutLabels;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrdersShipmentInfoDTO {\n");
        
        sb.append("    orderIdsWithLabels: ").append(toIndentedString(orderIdsWithLabels)).append("\n");
        sb.append("    orderIdsWithoutLabels: ").append(toIndentedString(orderIdsWithoutLabels)).append("\n");
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

