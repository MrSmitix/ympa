package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.server.model.OrdersStatsItemStatusType;
import org.openapitools.server.model.OrdersStatsStockType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об удалении товара из заказа.
 */
public class OrdersStatsDetailsDTO   {

    private OrdersStatsItemStatusType itemStatus;
    private Long itemCount;
    private LocalDate updateDate;
    private OrdersStatsStockType stockType;

    /**
     * Default constructor.
     */
    public OrdersStatsDetailsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrdersStatsDetailsDTO.
     *
     * @param itemStatus itemStatus
     * @param itemCount Количество товара со статусом, указанном в параметре &#x60;itemStatus&#x60;.
     * @param updateDate Дата, когда товар получил статус, указанный в параметре &#x60;itemStatus&#x60;.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
     * @param stockType stockType
     */
    public OrdersStatsDetailsDTO(
        OrdersStatsItemStatusType itemStatus, 
        Long itemCount, 
        LocalDate updateDate, 
        OrdersStatsStockType stockType
    ) {
        this.itemStatus = itemStatus;
        this.itemCount = itemCount;
        this.updateDate = updateDate;
        this.stockType = stockType;
    }



    /**
     * Get itemStatus
     * @return itemStatus
     */
    public OrdersStatsItemStatusType getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(OrdersStatsItemStatusType itemStatus) {
        this.itemStatus = itemStatus;
    }

    /**
     * Количество товара со статусом, указанном в параметре `itemStatus`.
     * @return itemCount
     */
    public Long getItemCount() {
        return itemCount;
    }

    public void setItemCount(Long itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
     * @return updateDate
     */
    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * Get stockType
     * @return stockType
     */
    public OrdersStatsStockType getStockType() {
        return stockType;
    }

    public void setStockType(OrdersStatsStockType stockType) {
        this.stockType = stockType;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrdersStatsDetailsDTO {\n");
        
        sb.append("    itemStatus: ").append(toIndentedString(itemStatus)).append("\n");
        sb.append("    itemCount: ").append(toIndentedString(itemCount)).append("\n");
        sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
        sb.append("    stockType: ").append(toIndentedString(stockType)).append("\n");
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

