package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ShipmentStatusType;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Запрос информации об отгрузках.
 */

@Schema(name = "SearchShipmentsRequest", description = "Запрос информации об отгрузках.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SearchShipmentsRequest {

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date dateFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private Date dateTo;

  @Valid
  private JsonNullable<Set<ShipmentStatusType>> statuses = JsonNullable.<Set<ShipmentStatusType>>undefined();

  @Valid
  private JsonNullable<Set<Long>> orderIds = JsonNullable.<Set<Long>>undefined();

  private Boolean cancelledOrders = true;

  public SearchShipmentsRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SearchShipmentsRequest(Date dateFrom, Date dateTo) {
    this.dateFrom = dateFrom;
    this.dateTo = dateTo;
  }

  public SearchShipmentsRequest dateFrom(Date dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

  /**
   * Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
   * @return dateFrom
   */
  @NotNull @Valid 
  @Schema(name = "dateFrom", description = "Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dateFrom")
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
   */
  @NotNull @Valid 
  @Schema(name = "dateTo", description = "Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dateTo")
  public Date getDateTo() {
    return dateTo;
  }

  public void setDateTo(Date dateTo) {
    this.dateTo = dateTo;
  }

  public SearchShipmentsRequest statuses(Set<ShipmentStatusType> statuses) {
    this.statuses = JsonNullable.of(statuses);
    return this;
  }

  public SearchShipmentsRequest addStatusesItem(ShipmentStatusType statusesItem) {
    if (this.statuses == null || !this.statuses.isPresent()) {
      this.statuses = JsonNullable.of(new LinkedHashSet<>());
    }
    this.statuses.get().add(statusesItem);
    return this;
  }

  /**
   * Список статусов отгрузок.
   * @return statuses
   */
  @Valid @Size(min = 1) 
  @Schema(name = "statuses", description = "Список статусов отгрузок.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statuses")
  public JsonNullable<Set<ShipmentStatusType>> getStatuses() {
    return statuses;
  }

  public void setStatuses(JsonNullable<Set<ShipmentStatusType>> statuses) {
    this.statuses = statuses;
  }

  public SearchShipmentsRequest orderIds(Set<Long> orderIds) {
    this.orderIds = JsonNullable.of(orderIds);
    return this;
  }

  public SearchShipmentsRequest addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null || !this.orderIds.isPresent()) {
      this.orderIds = JsonNullable.of(new LinkedHashSet<>());
    }
    this.orderIds.get().add(orderIdsItem);
    return this;
  }

  /**
   * Список идентификаторов заказов из отгрузок.
   * @return orderIds
   */
  @Size(min = 1) 
  @Schema(name = "orderIds", description = "Список идентификаторов заказов из отгрузок.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderIds")
  public JsonNullable<Set<Long>> getOrderIds() {
    return orderIds;
  }

  public void setOrderIds(JsonNullable<Set<Long>> orderIds) {
    this.orderIds = orderIds;
  }

  public SearchShipmentsRequest cancelledOrders(Boolean cancelledOrders) {
    this.cancelledOrders = cancelledOrders;
    return this;
  }

  /**
   * Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
   * @return cancelledOrders
   */
  
  @Schema(name = "cancelledOrders", description = "Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.dateFrom, searchShipmentsRequest.dateFrom) &&
        Objects.equals(this.dateTo, searchShipmentsRequest.dateTo) &&
        equalsNullable(this.statuses, searchShipmentsRequest.statuses) &&
        equalsNullable(this.orderIds, searchShipmentsRequest.orderIds) &&
        Objects.equals(this.cancelledOrders, searchShipmentsRequest.cancelledOrders);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateFrom, dateTo, hashCodeNullable(statuses), hashCodeNullable(orderIds), cancelledOrders);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

