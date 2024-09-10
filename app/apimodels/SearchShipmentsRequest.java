package apimodels;

import apimodels.ShipmentStatusType;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Запрос информации об отгрузках.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SearchShipmentsRequest   {
  @JsonProperty("dateFrom")
  @NotNull
@Valid

  private LocalDate dateFrom;

  @JsonProperty("dateTo")
  @NotNull
@Valid

  private LocalDate dateTo;

  @JsonProperty("statuses")
  @Size(min=1)
@Valid

  private Set<ShipmentStatusType> statuses = null;

  @JsonProperty("orderIds")
  @Size(min=1)

  private Set<Long> orderIds = null;

  @JsonProperty("cancelledOrders")
  
  private Boolean cancelledOrders = true;

  public SearchShipmentsRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
   * @return dateFrom
  **/
  public LocalDate getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  public SearchShipmentsRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
   * @return dateTo
  **/
  public LocalDate getDateTo() {
    return dateTo;
  }

  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  public SearchShipmentsRequest statuses(Set<ShipmentStatusType> statuses) {
    this.statuses = statuses;
    return this;
  }

  public SearchShipmentsRequest addStatusesItem(ShipmentStatusType statusesItem) {
    if (this.statuses == null) {
      this.statuses = new LinkedHashSet<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * Список статусов отгрузок.
   * @return statuses
  **/
  public Set<ShipmentStatusType> getStatuses() {
    return statuses;
  }

  public void setStatuses(Set<ShipmentStatusType> statuses) {
    this.statuses = statuses;
  }

  public SearchShipmentsRequest orderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  public SearchShipmentsRequest addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new LinkedHashSet<>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * Список идентификаторов заказов из отгрузок.
   * @return orderIds
  **/
  public Set<Long> getOrderIds() {
    return orderIds;
  }

  public void setOrderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
  }

  public SearchShipmentsRequest cancelledOrders(Boolean cancelledOrders) {
    this.cancelledOrders = cancelledOrders;
    return this;
  }

   /**
   * Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
   * @return cancelledOrders
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

