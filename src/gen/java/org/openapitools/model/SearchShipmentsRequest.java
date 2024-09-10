package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ShipmentStatusType;

/**
 * Запрос информации об отгрузках.
 */
@ApiModel(description = "Запрос информации об отгрузках.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SearchShipmentsRequest   {
  @JsonProperty("dateFrom")
  private Date dateFrom;

  @JsonProperty("dateTo")
  private Date dateTo;

  @JsonProperty("statuses")
  private Set<ShipmentStatusType> statuses = null;

  @JsonProperty("orderIds")
  private Set<Long> orderIds = null;

  @JsonProperty("cancelledOrders")
  private Boolean cancelledOrders = true;

  public SearchShipmentsRequest dateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
   * @return dateFrom
  **/
  @ApiModelProperty(required = true, value = "Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. ")
  public Date getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
  }

  public SearchShipmentsRequest dateTo(Date dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
   * @return dateTo
  **/
  @ApiModelProperty(required = true, value = "Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. ")
  public Date getDateTo() {
    return dateTo;
  }

  public void setDateTo(Date dateTo) {
    this.dateTo = dateTo;
  }

  public SearchShipmentsRequest statuses(Set<ShipmentStatusType> statuses) {
    this.statuses = statuses;
    return this;
  }

  public SearchShipmentsRequest addStatusesItem(ShipmentStatusType statusesItem) {
    if (this.statuses == null) {
      this.statuses = ;
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * Список статусов отгрузок.
   * @return statuses
  **/
  @ApiModelProperty(value = "Список статусов отгрузок.")
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
      this.orderIds = ;
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * Список идентификаторов заказов из отгрузок.
   * @return orderIds
  **/
  @ApiModelProperty(value = "Список идентификаторов заказов из отгрузок.")
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
  @ApiModelProperty(value = "Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. ")
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

