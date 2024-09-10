package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.LinkedHashSet;
import java.util.Set;
import org.joda.time.LocalDate;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ShipmentStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Запрос информации об отгрузках.
 */
@ApiModel(description="Запрос информации об отгрузках.")

public class SearchShipmentsRequest  {
  
 /**
  * Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
  */
  @ApiModelProperty(required = true, value = "Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate dateFrom;

 /**
  * Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
  */
  @ApiModelProperty(required = true, value = "Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. ")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
  private LocalDate dateTo;

 /**
  * Список статусов отгрузок.
  */
  @ApiModelProperty(value = "Список статусов отгрузок.")
  @Valid
  private Set<ShipmentStatusType> statuses;

 /**
  * Список идентификаторов заказов из отгрузок.
  */
  @ApiModelProperty(value = "Список идентификаторов заказов из отгрузок.")
  private Set<Long> orderIds;

 /**
  * Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
  */
  @ApiModelProperty(value = "Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. ")
  private Boolean cancelledOrders = true;
 /**
  * Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
  * @return dateFrom
  */
  @JsonProperty("dateFrom")
  @NotNull
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
  public SearchShipmentsRequest dateFrom(LocalDate dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

 /**
  * Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
  * @return dateTo
  */
  @JsonProperty("dateTo")
  @NotNull
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
  public SearchShipmentsRequest dateTo(LocalDate dateTo) {
    this.dateTo = dateTo;
    return this;
  }

 /**
  * Список статусов отгрузок.
  * @return statuses
  */
  @JsonProperty("statuses")
 @Size(min=1)  public Set<ShipmentStatusType> getStatuses() {
    return statuses;
  }

  /**
   * Sets the <code>statuses</code> property.
   */
 public void setStatuses(Set<ShipmentStatusType> statuses) {
    this.statuses = statuses;
  }

  /**
   * Sets the <code>statuses</code> property.
   */
  public SearchShipmentsRequest statuses(Set<ShipmentStatusType> statuses) {
    this.statuses = statuses;
    return this;
  }

  /**
   * Adds a new item to the <code>statuses</code> list.
   */
  public SearchShipmentsRequest addStatusesItem(ShipmentStatusType statusesItem) {
    this.statuses.add(statusesItem);
    return this;
  }

 /**
  * Список идентификаторов заказов из отгрузок.
  * @return orderIds
  */
  @JsonProperty("orderIds")
 @Size(min=1)  public Set<Long> getOrderIds() {
    return orderIds;
  }

  /**
   * Sets the <code>orderIds</code> property.
   */
 public void setOrderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
  }

  /**
   * Sets the <code>orderIds</code> property.
   */
  public SearchShipmentsRequest orderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  /**
   * Adds a new item to the <code>orderIds</code> list.
   */
  public SearchShipmentsRequest addOrderIdsItem(Long orderIdsItem) {
    this.orderIds.add(orderIdsItem);
    return this;
  }

 /**
  * Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;. 
  * @return cancelledOrders
  */
  @JsonProperty("cancelledOrders")
  public Boolean getCancelledOrders() {
    return cancelledOrders;
  }

  /**
   * Sets the <code>cancelledOrders</code> property.
   */
 public void setCancelledOrders(Boolean cancelledOrders) {
    this.cancelledOrders = cancelledOrders;
  }

  /**
   * Sets the <code>cancelledOrders</code> property.
   */
  public SearchShipmentsRequest cancelledOrders(Boolean cancelledOrders) {
    this.cancelledOrders = cancelledOrders;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

