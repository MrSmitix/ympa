package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderStatsStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Запрос информации по заказам.
 **/
@ApiModel(description = "Запрос информации по заказам.")
@JsonTypeName("GetOrdersStatsRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOrdersStatsRequest   {
  private LocalDate dateFrom;
  private LocalDate dateTo;
  private LocalDate updateFrom;
  private LocalDate updateTo;
  private @Valid List<Long> orders;
  private @Valid List<OrderStatsStatusType> statuses;
  private Boolean hasCis;

  /**
   * Начальная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. 
   **/
  public GetOrdersStatsRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  
  @ApiModelProperty(value = "Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. ")
  @JsonProperty("dateFrom")
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  @JsonProperty("dateFrom")
  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  /**
   * Конечная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. 
   **/
  public GetOrdersStatsRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  
  @ApiModelProperty(value = "Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. ")
  @JsonProperty("dateTo")
  public LocalDate getDateTo() {
    return dateTo;
  }

  @JsonProperty("dateTo")
  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  /**
   * Начальная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. 
   **/
  public GetOrdersStatsRequest updateFrom(LocalDate updateFrom) {
    this.updateFrom = updateFrom;
    return this;
  }

  
  @ApiModelProperty(value = "Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. ")
  @JsonProperty("updateFrom")
  public LocalDate getUpdateFrom() {
    return updateFrom;
  }

  @JsonProperty("updateFrom")
  public void setUpdateFrom(LocalDate updateFrom) {
    this.updateFrom = updateFrom;
  }

  /**
   * Конечная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. 
   **/
  public GetOrdersStatsRequest updateTo(LocalDate updateTo) {
    this.updateTo = updateTo;
    return this;
  }

  
  @ApiModelProperty(value = "Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. ")
  @JsonProperty("updateTo")
  public LocalDate getUpdateTo() {
    return updateTo;
  }

  @JsonProperty("updateTo")
  public void setUpdateTo(LocalDate updateTo) {
    this.updateTo = updateTo;
  }

  /**
   * Список идентификаторов заказов.
   **/
  public GetOrdersStatsRequest orders(List<Long> orders) {
    this.orders = orders;
    return this;
  }

  
  @ApiModelProperty(value = "Список идентификаторов заказов.")
  @JsonProperty("orders")
  public List<Long> getOrders() {
    return orders;
  }

  @JsonProperty("orders")
  public void setOrders(List<Long> orders) {
    this.orders = orders;
  }

  public GetOrdersStatsRequest addOrdersItem(Long ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<>();
    }

    this.orders.add(ordersItem);
    return this;
  }

  public GetOrdersStatsRequest removeOrdersItem(Long ordersItem) {
    if (ordersItem != null && this.orders != null) {
      this.orders.remove(ordersItem);
    }

    return this;
  }
  /**
   * Список статусов заказов.
   **/
  public GetOrdersStatsRequest statuses(List<OrderStatsStatusType> statuses) {
    this.statuses = statuses;
    return this;
  }

  
  @ApiModelProperty(value = "Список статусов заказов.")
  @JsonProperty("statuses")
  public List<OrderStatsStatusType> getStatuses() {
    return statuses;
  }

  @JsonProperty("statuses")
  public void setStatuses(List<OrderStatsStatusType> statuses) {
    this.statuses = statuses;
  }

  public GetOrdersStatsRequest addStatusesItem(OrderStatsStatusType statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }

    this.statuses.add(statusesItem);
    return this;
  }

  public GetOrdersStatsRequest removeStatusesItem(OrderStatsStatusType statusesItem) {
    if (statusesItem != null && this.statuses != null) {
      this.statuses.remove(statusesItem);
    }

    return this;
  }
  /**
   * Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
   **/
  public GetOrdersStatsRequest hasCis(Boolean hasCis) {
    this.hasCis = hasCis;
    return this;
  }

  
  @ApiModelProperty(value = "Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. ")
  @JsonProperty("hasCis")
  public Boolean getHasCis() {
    return hasCis;
  }

  @JsonProperty("hasCis")
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

