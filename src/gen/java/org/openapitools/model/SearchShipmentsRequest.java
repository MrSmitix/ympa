package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ShipmentStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Запрос информации об отгрузках.
 **/
@ApiModel(description = "Запрос информации об отгрузках.")
@JsonTypeName("SearchShipmentsRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SearchShipmentsRequest   {
  private LocalDate dateFrom;
  private LocalDate dateTo;
  private @Valid Set<ShipmentStatusType> statuses;
  private @Valid Set<Long> orderIds;
  private Boolean cancelledOrders = true;

  /**
   * Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   **/
  public SearchShipmentsRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. ")
  @JsonProperty("dateFrom")
  @NotNull public LocalDate getDateFrom() {
    return dateFrom;
  }

  @JsonProperty("dateFrom")
  public void setDateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
  }

  /**
   * Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
   **/
  public SearchShipmentsRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. ")
  @JsonProperty("dateTo")
  @NotNull public LocalDate getDateTo() {
    return dateTo;
  }

  @JsonProperty("dateTo")
  public void setDateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
  }

  /**
   * Список статусов отгрузок.
   **/
  public SearchShipmentsRequest statuses(Set<ShipmentStatusType> statuses) {
    this.statuses = statuses;
    return this;
  }

  
  @ApiModelProperty(value = "Список статусов отгрузок.")
  @JsonProperty("statuses")
   @Size(min=1)public Set<ShipmentStatusType> getStatuses() {
    return statuses;
  }

  @JsonProperty("statuses")
  public void setStatuses(Set<ShipmentStatusType> statuses) {
    this.statuses = statuses;
  }

  public SearchShipmentsRequest addStatusesItem(ShipmentStatusType statusesItem) {
    if (this.statuses == null) {
      this.statuses = new LinkedHashSet<>();
    }

    this.statuses.add(statusesItem);
    return this;
  }

  public SearchShipmentsRequest removeStatusesItem(ShipmentStatusType statusesItem) {
    if (statusesItem != null && this.statuses != null) {
      this.statuses.remove(statusesItem);
    }

    return this;
  }
  /**
   * Список идентификаторов заказов из отгрузок.
   **/
  public SearchShipmentsRequest orderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  
  @ApiModelProperty(value = "Список идентификаторов заказов из отгрузок.")
  @JsonProperty("orderIds")
   @Size(min=1)public Set<Long> getOrderIds() {
    return orderIds;
  }

  @JsonProperty("orderIds")
  public void setOrderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
  }

  public SearchShipmentsRequest addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new LinkedHashSet<>();
    }

    this.orderIds.add(orderIdsItem);
    return this;
  }

  public SearchShipmentsRequest removeOrderIdsItem(Long orderIdsItem) {
    if (orderIdsItem != null && this.orderIds != null) {
      this.orderIds.remove(orderIdsItem);
    }

    return this;
  }
  /**
   * Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;. 
   **/
  public SearchShipmentsRequest cancelledOrders(Boolean cancelledOrders) {
    this.cancelledOrders = cancelledOrders;
    return this;
  }

  
  @ApiModelProperty(value = "Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. ")
  @JsonProperty("cancelledOrders")
  public Boolean getCancelledOrders() {
    return cancelledOrders;
  }

  @JsonProperty("cancelledOrders")
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
    return Objects.equals(this.dateFrom, searchShipmentsRequest.dateFrom) &&
        Objects.equals(this.dateTo, searchShipmentsRequest.dateTo) &&
        Objects.equals(this.statuses, searchShipmentsRequest.statuses) &&
        Objects.equals(this.orderIds, searchShipmentsRequest.orderIds) &&
        Objects.equals(this.cancelledOrders, searchShipmentsRequest.cancelledOrders);
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

