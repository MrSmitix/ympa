package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderStatsStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Запрос информации по заказам.
 */
@ApiModel(description="Запрос информации по заказам.")

public class GetOrdersStatsRequest  {
  
 /**
  * Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
  */
  @ApiModelProperty(value = "Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate dateFrom;

 /**
  * Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
  */
  @ApiModelProperty(value = "Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate dateTo;

 /**
  * Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
  */
  @ApiModelProperty(value = "Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate updateFrom;

 /**
  * Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
  */
  @ApiModelProperty(value = "Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate updateTo;

 /**
  * Список идентификаторов заказов.
  */
  @ApiModelProperty(value = "Список идентификаторов заказов.")
  private List<Long> orders;

 /**
  * Список статусов заказов.
  */
  @ApiModelProperty(value = "Список статусов заказов.")
  @Valid
  private List<OrderStatsStatusType> statuses;

 /**
  * Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
  */
  @ApiModelProperty(value = "Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. ")
  private Boolean hasCis;
 /**
  * Начальная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. 
  * @return dateFrom
  */
  @JsonProperty("dateFrom")
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  /**
   * Sets the <code>dateFrom</code> property.
   */
 public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  /**
   * Sets the <code>dateFrom</code> property.
   */
  public GetOrdersStatsRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

 /**
  * Конечная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. 
  * @return dateTo
  */
  @JsonProperty("dateTo")
  public LocalDate getDateTo() {
    return dateTo;
  }

  /**
   * Sets the <code>dateTo</code> property.
   */
 public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  /**
   * Sets the <code>dateTo</code> property.
   */
  public GetOrdersStatsRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

 /**
  * Начальная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. 
  * @return updateFrom
  */
  @JsonProperty("updateFrom")
  public LocalDate getUpdateFrom() {
    return updateFrom;
  }

  /**
   * Sets the <code>updateFrom</code> property.
   */
 public void setUpdateFrom(LocalDate updateFrom) {
    this.updateFrom = updateFrom;
  }

  /**
   * Sets the <code>updateFrom</code> property.
   */
  public GetOrdersStatsRequest updateFrom(LocalDate updateFrom) {
    this.updateFrom = updateFrom;
    return this;
  }

 /**
  * Конечная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. 
  * @return updateTo
  */
  @JsonProperty("updateTo")
  public LocalDate getUpdateTo() {
    return updateTo;
  }

  /**
   * Sets the <code>updateTo</code> property.
   */
 public void setUpdateTo(LocalDate updateTo) {
    this.updateTo = updateTo;
  }

  /**
   * Sets the <code>updateTo</code> property.
   */
  public GetOrdersStatsRequest updateTo(LocalDate updateTo) {
    this.updateTo = updateTo;
    return this;
  }

 /**
  * Список идентификаторов заказов.
  * @return orders
  */
  @JsonProperty("orders")
  public List<Long> getOrders() {
    return orders;
  }

  /**
   * Sets the <code>orders</code> property.
   */
 public void setOrders(List<Long> orders) {
    this.orders = orders;
  }

  /**
   * Sets the <code>orders</code> property.
   */
  public GetOrdersStatsRequest orders(List<Long> orders) {
    this.orders = orders;
    return this;
  }

  /**
   * Adds a new item to the <code>orders</code> list.
   */
  public GetOrdersStatsRequest addOrdersItem(Long ordersItem) {
    this.orders.add(ordersItem);
    return this;
  }

 /**
  * Список статусов заказов.
  * @return statuses
  */
  @JsonProperty("statuses")
  public List<OrderStatsStatusType> getStatuses() {
    return statuses;
  }

  /**
   * Sets the <code>statuses</code> property.
   */
 public void setStatuses(List<OrderStatsStatusType> statuses) {
    this.statuses = statuses;
  }

  /**
   * Sets the <code>statuses</code> property.
   */
  public GetOrdersStatsRequest statuses(List<OrderStatsStatusType> statuses) {
    this.statuses = statuses;
    return this;
  }

  /**
   * Adds a new item to the <code>statuses</code> list.
   */
  public GetOrdersStatsRequest addStatusesItem(OrderStatsStatusType statusesItem) {
    this.statuses.add(statusesItem);
    return this;
  }

 /**
  * Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
  * @return hasCis
  */
  @JsonProperty("hasCis")
  public Boolean getHasCis() {
    return hasCis;
  }

  /**
   * Sets the <code>hasCis</code> property.
   */
 public void setHasCis(Boolean hasCis) {
    this.hasCis = hasCis;
  }

  /**
   * Sets the <code>hasCis</code> property.
   */
  public GetOrdersStatsRequest hasCis(Boolean hasCis) {
    this.hasCis = hasCis;
    return this;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOrdersStatsRequest getOrdersStatsRequest = (GetOrdersStatsRequest) o;
    return Objects.equals(this.dateFrom, getOrdersStatsRequest.dateFrom) &&
        Objects.equals(this.dateTo, getOrdersStatsRequest.dateTo) &&
        Objects.equals(this.updateFrom, getOrdersStatsRequest.updateFrom) &&
        Objects.equals(this.updateTo, getOrdersStatsRequest.updateTo) &&
        Objects.equals(this.orders, getOrdersStatsRequest.orders) &&
        Objects.equals(this.statuses, getOrdersStatsRequest.statuses) &&
        Objects.equals(this.hasCis, getOrdersStatsRequest.hasCis);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFrom, dateTo, updateFrom, updateTo, orders, statuses, hasCis);
  }

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

