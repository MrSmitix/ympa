package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Запрос информации по заказам.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOrdersStatsRequest   {
  
  private Date dateFrom;
  private Date dateTo;
  private Date updateFrom;
  private Date updateTo;
  private List<Long> orders;
  private List<OrderStatsStatusType> statuses;
  private Boolean hasCis;

  /**
   * Начальная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. 
   **/
  
  @ApiModelProperty(value = "Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. ")
  @JsonProperty("dateFrom")
  public Date getDateFrom() {
    return dateFrom;
  }
  public void setDateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
  }

  /**
   * Конечная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. 
   **/
  
  @ApiModelProperty(value = "Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. ")
  @JsonProperty("dateTo")
  public Date getDateTo() {
    return dateTo;
  }
  public void setDateTo(Date dateTo) {
    this.dateTo = dateTo;
  }

  /**
   * Начальная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. 
   **/
  
  @ApiModelProperty(value = "Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. ")
  @JsonProperty("updateFrom")
  public Date getUpdateFrom() {
    return updateFrom;
  }
  public void setUpdateFrom(Date updateFrom) {
    this.updateFrom = updateFrom;
  }

  /**
   * Конечная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. 
   **/
  
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
  
  @ApiModelProperty(value = "Список статусов заказов.")
  @JsonProperty("statuses")
  @Valid
  public List<OrderStatsStatusType> getStatuses() {
    return statuses;
  }
  public void setStatuses(List<OrderStatsStatusType> statuses) {
    this.statuses = statuses;
  }

  /**
   * Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
   **/
  
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

