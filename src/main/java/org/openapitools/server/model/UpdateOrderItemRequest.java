package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OrderItemModificationDTO;
import org.openapitools.server.model.OrderItemsModificationRequestReasonType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос на обновление состава заказа.
 */
public class UpdateOrderItemRequest   {

    private List<@Valid OrderItemModificationDTO> items = new ArrayList<>();
    private OrderItemsModificationRequestReasonType reason;

    /**
     * Default constructor.
     */
    public UpdateOrderItemRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateOrderItemRequest.
     *
     * @param items Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
     * @param reason reason
     */
    public UpdateOrderItemRequest(
        List<@Valid OrderItemModificationDTO> items, 
        OrderItemsModificationRequestReasonType reason
    ) {
        this.items = items;
        this.reason = reason;
    }



    /**
     * Список товаров в заказе.  Если магазин не передал информацию о товаре во входных данных, он будет удален из заказа.  Обязательный параметр. 
     * @return items
     */
    public List<@Valid OrderItemModificationDTO> getItems() {
        return items;
    }

    public void setItems(List<@Valid OrderItemModificationDTO> items) {
        this.items = items;
    }

    /**
     * Get reason
     * @return reason
     */
    public OrderItemsModificationRequestReasonType getReason() {
        return reason;
    }

    public void setReason(OrderItemsModificationRequestReasonType reason) {
        this.reason = reason;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOrderItemRequest {\n");
        
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

