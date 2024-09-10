package org.openapitools.server.model;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ShipmentStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос информации об отгрузках.
 */
public class SearchShipmentsRequest   {

    private LocalDate dateFrom;
    private LocalDate dateTo;
    private Set<ShipmentStatusType> statuses;
    private Set<Long> orderIds;
    private Boolean cancelledOrders = true;

    /**
     * Default constructor.
     */
    public SearchShipmentsRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create SearchShipmentsRequest.
     *
     * @param dateFrom Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
     * @param dateTo Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
     * @param statuses Список статусов отгрузок.
     * @param orderIds Список идентификаторов заказов из отгрузок.
     * @param cancelledOrders Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;. 
     */
    public SearchShipmentsRequest(
        LocalDate dateFrom, 
        LocalDate dateTo, 
        Set<ShipmentStatusType> statuses, 
        Set<Long> orderIds, 
        Boolean cancelledOrders
    ) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.statuses = statuses;
        this.orderIds = orderIds;
        this.cancelledOrders = cancelledOrders;
    }



    /**
     * Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
     * @return dateFrom
     */
    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    /**
     * Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
     * @return dateTo
     */
    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    /**
     * Список статусов отгрузок.
     * @return statuses
     */
    public Set<ShipmentStatusType> getStatuses() {
        return statuses;
    }

    public void setStatuses(Set<ShipmentStatusType> statuses) {
        this.statuses = statuses;
    }

    /**
     * Список идентификаторов заказов из отгрузок.
     * @return orderIds
     */
    public Set<Long> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(Set<Long> orderIds) {
        this.orderIds = orderIds;
    }

    /**
     * Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
     * @return cancelledOrders
     */
    public Boolean getCancelledOrders() {
        return cancelledOrders;
    }

    public void setCancelledOrders(Boolean cancelledOrders) {
        this.cancelledOrders = cancelledOrders;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchShipmentsRequest {\n");
        
        sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
        sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
        sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
        sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
        sb.append("    cancelledOrders: ").append(toIndentedString(cancelledOrders)).append("\n");
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

