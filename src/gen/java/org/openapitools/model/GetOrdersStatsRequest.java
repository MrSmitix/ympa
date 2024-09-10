package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OrderStatsStatusType;



/**
 * Запрос информации по заказам.
 **/

@ApiModel(description = "Запрос информации по заказам.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOrdersStatsRequest   {
  @JsonProperty("dateFrom")
  private Date dateFrom;

  @JsonProperty("dateTo")
  private Date dateTo;

  @JsonProperty("updateFrom")
  private Date updateFrom;

  @JsonProperty("updateTo")
  private Date updateTo;

  @JsonProperty("orders")
  private List<Long> orders = null;

  @JsonProperty("statuses")
  private List<OrderStatsStatusType> statuses = null;

  @JsonProperty("hasCis")
  private Boolean hasCis;

  /**
   * Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
   **/
  public GetOrdersStatsRequest dateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  
  @ApiModelProperty(value = "Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. ")
  @JsonProperty("dateFrom")
  public Date getDateFrom() {
    return dateFrom;
  }
  public void setDateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
  }

  /**
   * Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
   **/
  public GetOrdersStatsRequest dateTo(Date dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  
  @ApiModelProperty(value = "Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. ")
  @JsonProperty("dateTo")
  public Date getDateTo() {
    return dateTo;
  }
  public void setDateTo(Date dateTo) {
    this.dateTo = dateTo;
  }

  /**
   * Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
   **/
  public GetOrdersStatsRequest updateFrom(Date updateFrom) {
    this.updateFrom = updateFrom;
    return this;
  }

  
  @ApiModelProperty(value = "Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. ")
  @JsonProperty("updateFrom")
  public Date getUpdateFrom() {
    return updateFrom;
  }
  public void setUpdateFrom(Date updateFrom) {
    this.updateFrom = updateFrom;
  }

  /**
   * Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
   **/
  public GetOrdersStatsRequest updateTo(Date updateTo) {
    this.updateTo = updateTo;
    return this;
  }

  
  @ApiModelProperty(value = "Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. ")
  @JsonProperty("updateTo")
  public Date getUpdateTo() {
    return updateTo;
  }
  public void setUpdateTo(Date updateTo) {
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
  public void setOrders(List<Long> orders) {
    this.orders = orders;
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
  public void setStatuses(List<OrderStatsStatusType> statuses) {
    this.statuses = statuses;
  }

  /**
   * Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
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
    return Objects.equals(dateFrom, getOrdersStatsRequest.dateFrom) &&
        Objects.equals(dateTo, getOrdersStatsRequest.dateTo) &&
        Objects.equals(updateFrom, getOrdersStatsRequest.updateFrom) &&
        Objects.equals(updateTo, getOrdersStatsRequest.updateTo) &&
        Objects.equals(orders, getOrdersStatsRequest.orders) &&
        Objects.equals(statuses, getOrdersStatsRequest.statuses) &&
        Objects.equals(hasCis, getOrdersStatsRequest.hasCis);
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

