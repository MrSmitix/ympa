package org.openapitools.server.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.OrderStatsStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос информации по заказам.
 */
public class GetOrdersStatsRequest   {

    private LocalDate dateFrom;
    private LocalDate dateTo;
    private LocalDate updateFrom;
    private LocalDate updateTo;
    private List<Long> orders;
    private List<OrderStatsStatusType> statuses;
    private Boolean hasCis;

    /**
     * Default constructor.
     */
    public GetOrdersStatsRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetOrdersStatsRequest.
     *
     * @param dateFrom Начальная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. 
     * @param dateTo Конечная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. 
     * @param updateFrom Начальная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. 
     * @param updateTo Конечная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. 
     * @param orders Список идентификаторов заказов.
     * @param statuses Список статусов заказов.
     * @param hasCis Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
     */
    public GetOrdersStatsRequest(
        LocalDate dateFrom, 
        LocalDate dateTo, 
        LocalDate updateFrom, 
        LocalDate updateTo, 
        List<Long> orders, 
        List<OrderStatsStatusType> statuses, 
        Boolean hasCis
    ) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.updateFrom = updateFrom;
        this.updateTo = updateTo;
        this.orders = orders;
        this.statuses = statuses;
        this.hasCis = hasCis;
    }



    /**
     * Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
     * @return dateFrom
     */
    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    /**
     * Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
     * @return dateTo
     */
    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }

    /**
     * Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
     * @return updateFrom
     */
    public LocalDate getUpdateFrom() {
        return updateFrom;
    }

    public void setUpdateFrom(LocalDate updateFrom) {
        this.updateFrom = updateFrom;
    }

    /**
     * Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
     * @return updateTo
     */
    public LocalDate getUpdateTo() {
        return updateTo;
    }

    public void setUpdateTo(LocalDate updateTo) {
        this.updateTo = updateTo;
    }

    /**
     * Список идентификаторов заказов.
     * @return orders
     */
    public List<Long> getOrders() {
        return orders;
    }

    public void setOrders(List<Long> orders) {
        this.orders = orders;
    }

    /**
     * Список статусов заказов.
     * @return statuses
     */
    public List<OrderStatsStatusType> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<OrderStatsStatusType> statuses) {
        this.statuses = statuses;
    }

    /**
     * Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
     * @return hasCis
     */
    public Boolean getHasCis() {
        return hasCis;
    }

    public void setHasCis(Boolean hasCis) {
        this.hasCis = hasCis;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOrdersStatsRequest {\n");
        
        sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
        sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
        sb.append("    updateFrom: ").append(toIndentedString(updateFrom)).append("\n");
        sb.append("    updateTo: ").append(toIndentedString(updateTo)).append("\n");
        sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
        sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
        sb.append("    hasCis: ").append(toIndentedString(hasCis)).append("\n");
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

