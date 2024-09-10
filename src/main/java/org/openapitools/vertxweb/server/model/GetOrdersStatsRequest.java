package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.OrderStatsStatusType;

/**
 * Запрос информации по заказам.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOrdersStatsRequest   {
  
  private LocalDate dateFrom;
  private LocalDate dateTo;
  private LocalDate updateFrom;
  private LocalDate updateTo;
  private List<Long> orders;
  private List<OrderStatsStatusType> statuses;
  private Boolean hasCis;

  public GetOrdersStatsRequest () {

  }

  public GetOrdersStatsRequest (LocalDate dateFrom, LocalDate dateTo, LocalDate updateFrom, LocalDate updateTo, List<Long> orders, List<OrderStatsStatusType> statuses, Boolean hasCis) {
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.updateFrom = updateFrom;
    this.updateTo = updateTo;
    this.orders = orders;
    this.statuses = statuses;
    this.hasCis = hasCis;
  }

    
  @JsonProperty("dateFrom")
  public LocalDate getDateFrom() {
    return dateFrom;
  }
  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

    
  @JsonProperty("dateTo")
  public LocalDate getDateTo() {
    return dateTo;
  }
  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

    
  @JsonProperty("updateFrom")
  public LocalDate getUpdateFrom() {
    return updateFrom;
  }
  public void setUpdateFrom(LocalDate updateFrom) {
    this.updateFrom = updateFrom;
  }

    
  @JsonProperty("updateTo")
  public LocalDate getUpdateTo() {
    return updateTo;
  }
  public void setUpdateTo(LocalDate updateTo) {
    this.updateTo = updateTo;
  }

    
  @JsonProperty("orders")
  public List<Long> getOrders() {
    return orders;
  }
  public void setOrders(List<Long> orders) {
    this.orders = orders;
  }

    
  @JsonProperty("statuses")
  public List<OrderStatsStatusType> getStatuses() {
    return statuses;
  }
  public void setStatuses(List<OrderStatsStatusType> statuses) {
    this.statuses = statuses;
  }

    
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
