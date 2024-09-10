package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.OrderStatsStatusType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Запрос информации по заказам.
 */
@ApiModel(description = "Запрос информации по заказам.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOrdersStatsRequest   {
  @JsonProperty("dateFrom")
  private LocalDate dateFrom;

  @JsonProperty("dateTo")
  private LocalDate dateTo;

  @JsonProperty("updateFrom")
  private LocalDate updateFrom;

  @JsonProperty("updateTo")
  private LocalDate updateTo;

  @JsonProperty("orders")
  
  private List<Long> orders = null;

  @JsonProperty("statuses")
  
  private List<OrderStatsStatusType> statuses = null;

  @JsonProperty("hasCis")
  private Boolean hasCis;

  public GetOrdersStatsRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
   * @return dateFrom
   */
  @ApiModelProperty(value = "Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. ")
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public GetOrdersStatsRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  /**
   * Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
   * @return dateTo
   */
  @ApiModelProperty(value = "Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. ")
  public LocalDate getDateTo() {
    return dateTo;
  }

  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  public GetOrdersStatsRequest updateFrom(LocalDate updateFrom) {
    this.updateFrom = updateFrom;
    return this;
  }

  /**
   * Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
   * @return updateFrom
   */
  @ApiModelProperty(value = "Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. ")
  public LocalDate getUpdateFrom() {
    return updateFrom;
  }

  public void setUpdateFrom(LocalDate updateFrom) {
    this.updateFrom = updateFrom;
  }

  public GetOrdersStatsRequest updateTo(LocalDate updateTo) {
    this.updateTo = updateTo;
    return this;
  }

  /**
   * Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
   * @return updateTo
   */
  @ApiModelProperty(value = "Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. ")
  public LocalDate getUpdateTo() {
    return updateTo;
  }

  public void setUpdateTo(LocalDate updateTo) {
    this.updateTo = updateTo;
  }

  public GetOrdersStatsRequest orders(List<Long> orders) {
    this.orders = orders;
    return this;
  }

  public GetOrdersStatsRequest addOrdersItem(Long ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<>();
    }
    this.orders.add(ordersItem);
    return this;
  }

  /**
   * Список идентификаторов заказов.
   * @return orders
   */
  @ApiModelProperty(value = "Список идентификаторов заказов.")
  public List<Long> getOrders() {
    return orders;
  }

  public void setOrders(List<Long> orders) {
    this.orders = orders;
  }

  public GetOrdersStatsRequest statuses(List<OrderStatsStatusType> statuses) {
    this.statuses = statuses;
    return this;
  }

  public GetOrdersStatsRequest addStatusesItem(OrderStatsStatusType statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

  /**
   * Список статусов заказов.
   * @return statuses
   */
  @ApiModelProperty(value = "Список статусов заказов.")
  public List<OrderStatsStatusType> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<OrderStatsStatusType> statuses) {
    this.statuses = statuses;
  }

  public GetOrdersStatsRequest hasCis(Boolean hasCis) {
    this.hasCis = hasCis;
    return this;
  }

  /**
   * Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
   * @return hasCis
   */
  @ApiModelProperty(value = "Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. ")
  public Boolean getHasCis() {
    return hasCis;
  }

  public void setHasCis(Boolean hasCis) {
    this.hasCis = hasCis;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

