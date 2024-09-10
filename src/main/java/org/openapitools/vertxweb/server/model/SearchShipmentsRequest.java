package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ShipmentStatusType;

/**
 * Запрос информации об отгрузках.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchShipmentsRequest   {
  
  private LocalDate dateFrom;
  private LocalDate dateTo;
  private Set<ShipmentStatusType> statuses;
  private Set<Long> orderIds;
  private Boolean cancelledOrders = true;

  public SearchShipmentsRequest () {

  }

  public SearchShipmentsRequest (LocalDate dateFrom, LocalDate dateTo, Set<ShipmentStatusType> statuses, Set<Long> orderIds, Boolean cancelledOrders) {
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
    this.statuses = statuses;
    this.orderIds = orderIds;
    this.cancelledOrders = cancelledOrders;
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

    
  @JsonProperty("statuses")
  public Set<ShipmentStatusType> getStatuses() {
    return statuses;
  }
  public void setStatuses(Set<ShipmentStatusType> statuses) {
    this.statuses = statuses;
  }

    
  @JsonProperty("orderIds")
  public Set<Long> getOrderIds() {
    return orderIds;
  }
  public void setOrderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
  }

    
  @JsonProperty("cancelledOrders")
  public Boolean getCancelledOrders() {
    return cancelledOrders;
  }
  public void setCancelledOrders(Boolean cancelledOrders) {
    this.cancelledOrders = cancelledOrders;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchShipmentsRequest searchShipmentsRequest = (SearchShipmentsRequest) o;
    return Objects.equals(dateFrom, searchShipmentsRequest.dateFrom) &&
        Objects.equals(dateTo, searchShipmentsRequest.dateTo) &&
        Objects.equals(statuses, searchShipmentsRequest.statuses) &&
        Objects.equals(orderIds, searchShipmentsRequest.orderIds) &&
        Objects.equals(cancelledOrders, searchShipmentsRequest.cancelledOrders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFrom, dateTo, statuses, orderIds, cancelledOrders);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
