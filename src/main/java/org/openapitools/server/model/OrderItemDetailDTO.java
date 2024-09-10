package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.OrderItemStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Детали по товару в заказе.
 */
public class OrderItemDetailDTO   {

    private Long itemCount;
    private OrderItemStatusType itemStatus;
    private String updateDate;

    /**
     * Default constructor.
     */
    public OrderItemDetailDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderItemDetailDTO.
     *
     * @param itemCount Количество единиц товара.
     * @param itemStatus itemStatus
     * @param updateDate Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
     */
    public OrderItemDetailDTO(
        Long itemCount, 
        OrderItemStatusType itemStatus, 
        String updateDate
    ) {
        this.itemCount = itemCount;
        this.itemStatus = itemStatus;
        this.updateDate = updateDate;
    }



    /**
     * Количество единиц товара.
     * @return itemCount
     */
    public Long getItemCount() {
        return itemCount;
    }

    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * Get itemStatus
     * @return itemStatus
     */
    public OrderItemStatusType getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(OrderItemStatusType itemStatus) {
        this.itemStatus = itemStatus;
    }

    /**
     * Формат даты: `ДД-ММ-ГГГГ`. 
     * @return updateDate
     */
    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderItemDetailDTO {\n");
        
        sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
        sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
        sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

