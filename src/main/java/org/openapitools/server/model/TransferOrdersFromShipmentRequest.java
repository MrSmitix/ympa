package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос переноса заказов из отгрузки.
 */
public class TransferOrdersFromShipmentRequest   {

    private List<Long> orderIds = new ArrayList<>();

    /**
     * Default constructor.
     */
    public TransferOrdersFromShipmentRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create TransferOrdersFromShipmentRequest.
     *
     * @param orderIds Список заказов, которые вы не успеваете подготовить.
     */
    public TransferOrdersFromShipmentRequest(
        List<Long> orderIds
    ) {
        this.orderIds = orderIds;
    }



    /**
     * Список заказов, которые вы не успеваете подготовить.
     * @return orderIds
     */
    public List<Long> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(List<Long> orderIds) {
        this.orderIds = orderIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransferOrdersFromShipmentRequest {\n");
        
        sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
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

