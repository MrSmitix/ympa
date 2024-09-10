package apimodels;

import apimodels.OrderStatsStatusType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Запрос информации по заказам.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetOrdersStatsRequest   {
  @JsonProperty("dateFrom")
  @Valid

  private LocalDate dateFrom;

  @JsonProperty("dateTo")
  @Valid

  private LocalDate dateTo;

  @JsonProperty("updateFrom")
  @Valid

  private LocalDate updateFrom;

  @JsonProperty("updateTo")
  @Valid

  private LocalDate updateTo;

  @JsonProperty("orders")
  
  private List<Long> orders = null;

  @JsonProperty("statuses")
  @Valid

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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

