package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.DeliveryServiceDTO;
import org.openapitools.model.PalletsCountDTO;
import org.openapitools.model.PartnerShipmentWarehouseDTO;
import org.openapitools.model.ShipmentStatusType;
import org.openapitools.model.ShipmentType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список с информацией об отгрузках.
 **/
@ApiModel(description="Список с информацией об отгрузках.")

public class ShipmentInfoDTO  {
  
  @ApiModelProperty(value = "Идентификатор отгрузки.")
 /**
   * Идентификатор отгрузки.
  **/
  private Long id;

  @ApiModelProperty(value = "Начало планового интервала отгрузки.")
 /**
   * Начало планового интервала отгрузки.
  **/
  private Date planIntervalFrom;

  @ApiModelProperty(value = "Конец планового интервала отгрузки.")
 /**
   * Конец планового интервала отгрузки.
  **/
  private Date planIntervalTo;

  @ApiModelProperty(value = "")
  @Valid
  private ShipmentType shipmentType;

  @ApiModelProperty(value = "")
  @Valid
  private PartnerShipmentWarehouseDTO warehouse;

  @ApiModelProperty(value = "")
  @Valid
  private PartnerShipmentWarehouseDTO warehouseTo;

  @ApiModelProperty(value = "Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.")
 /**
   * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
  **/
  private String externalId;

  @ApiModelProperty(value = "")
  @Valid
  private DeliveryServiceDTO deliveryService;

  @ApiModelProperty(value = "")
  @Valid
  private PalletsCountDTO palletsCount;

  @ApiModelProperty(required = true, value = "Идентификаторы заказов в отгрузке.")
 /**
   * Идентификаторы заказов в отгрузке.
  **/
  private Set<Long> orderIds = new LinkedHashSet<>();

  @ApiModelProperty(value = "Количество заказов, которое Маркет запланировал к отгрузке.")
 /**
   * Количество заказов, которое Маркет запланировал к отгрузке.
  **/
  private Integer draftCount;

  @ApiModelProperty(value = "Количество заказов, которое Маркет подтвердил к отгрузке.")
 /**
   * Количество заказов, которое Маркет подтвердил к отгрузке.
  **/
  private Integer plannedCount;

  @ApiModelProperty(value = "Количество заказов, принятых в сортировочном центре или пункте приема.")
 /**
   * Количество заказов, принятых в сортировочном центре или пункте приема.
  **/
  private Integer factCount;

  @ApiModelProperty(value = "")
  @Valid
  private ShipmentStatusType status;

  @ApiModelProperty(value = "Описание статуса отгрузки.")
 /**
   * Описание статуса отгрузки.
  **/
  private String statusDescription;

  @ApiModelProperty(value = "Время последнего изменения статуса отгрузки.")
 /**
   * Время последнего изменения статуса отгрузки.
  **/
  private Date statusUpdateTime;
 /**
   * Идентификатор отгрузки.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ShipmentInfoDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Начало планового интервала отгрузки.
   * @return planIntervalFrom
  **/
  @JsonProperty("planIntervalFrom")
  public Date getPlanIntervalFrom() {
    return planIntervalFrom;
  }

  public void setPlanIntervalFrom(Date planIntervalFrom) {
    this.planIntervalFrom = planIntervalFrom;
  }

  public ShipmentInfoDTO planIntervalFrom(Date planIntervalFrom) {
    this.planIntervalFrom = planIntervalFrom;
    return this;
  }

 /**
   * Конец планового интервала отгрузки.
   * @return planIntervalTo
  **/
  @JsonProperty("planIntervalTo")
  public Date getPlanIntervalTo() {
    return planIntervalTo;
  }

  public void setPlanIntervalTo(Date planIntervalTo) {
    this.planIntervalTo = planIntervalTo;
  }

  public ShipmentInfoDTO planIntervalTo(Date planIntervalTo) {
    this.planIntervalTo = planIntervalTo;
    return this;
  }

 /**
   * Get shipmentType
   * @return shipmentType
  **/
  @JsonProperty("shipmentType")
  public ShipmentType getShipmentType() {
    return shipmentType;
  }

  public void setShipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
  }

  public ShipmentInfoDTO shipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
    return this;
  }

 /**
   * Get warehouse
   * @return warehouse
  **/
  @JsonProperty("warehouse")
  public PartnerShipmentWarehouseDTO getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(PartnerShipmentWarehouseDTO warehouse) {
    this.warehouse = warehouse;
  }

  public ShipmentInfoDTO warehouse(PartnerShipmentWarehouseDTO warehouse) {
    this.warehouse = warehouse;
    return this;
  }

 /**
   * Get warehouseTo
   * @return warehouseTo
  **/
  @JsonProperty("warehouseTo")
  public PartnerShipmentWarehouseDTO getWarehouseTo() {
    return warehouseTo;
  }

  public void setWarehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
    this.warehouseTo = warehouseTo;
  }

  public ShipmentInfoDTO warehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
    this.warehouseTo = warehouseTo;
    return this;
  }

 /**
   * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.
   * @return externalId
  **/
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ShipmentInfoDTO externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
   * Get deliveryService
   * @return deliveryService
  **/
  @JsonProperty("deliveryService")
  public DeliveryServiceDTO getDeliveryService() {
    return deliveryService;
  }

  public void setDeliveryService(DeliveryServiceDTO deliveryService) {
    this.deliveryService = deliveryService;
  }

  public ShipmentInfoDTO deliveryService(DeliveryServiceDTO deliveryService) {
    this.deliveryService = deliveryService;
    return this;
  }

 /**
   * Get palletsCount
   * @return palletsCount
  **/
  @JsonProperty("palletsCount")
  public PalletsCountDTO getPalletsCount() {
    return palletsCount;
  }

  public void setPalletsCount(PalletsCountDTO palletsCount) {
    this.palletsCount = palletsCount;
  }

  public ShipmentInfoDTO palletsCount(PalletsCountDTO palletsCount) {
    this.palletsCount = palletsCount;
    return this;
  }

 /**
   * Идентификаторы заказов в отгрузке.
   * @return orderIds
  **/
  @JsonProperty("orderIds")
  @NotNull
  public Set<Long> getOrderIds() {
    return orderIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setOrderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
  }

  public ShipmentInfoDTO orderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  public ShipmentInfoDTO addOrderIdsItem(Long orderIdsItem) {
    this.orderIds.add(orderIdsItem);
    return this;
  }

 /**
   * Количество заказов, которое Маркет запланировал к отгрузке.
   * @return draftCount
  **/
  @JsonProperty("draftCount")
  public Integer getDraftCount() {
    return draftCount;
  }

  public void setDraftCount(Integer draftCount) {
    this.draftCount = draftCount;
  }

  public ShipmentInfoDTO draftCount(Integer draftCount) {
    this.draftCount = draftCount;
    return this;
  }

 /**
   * Количество заказов, которое Маркет подтвердил к отгрузке.
   * @return plannedCount
  **/
  @JsonProperty("plannedCount")
  public Integer getPlannedCount() {
    return plannedCount;
  }

  public void setPlannedCount(Integer plannedCount) {
    this.plannedCount = plannedCount;
  }

  public ShipmentInfoDTO plannedCount(Integer plannedCount) {
    this.plannedCount = plannedCount;
    return this;
  }

 /**
   * Количество заказов, принятых в сортировочном центре или пункте приема.
   * @return factCount
  **/
  @JsonProperty("factCount")
  public Integer getFactCount() {
    return factCount;
  }

  public void setFactCount(Integer factCount) {
    this.factCount = factCount;
  }

  public ShipmentInfoDTO factCount(Integer factCount) {
    this.factCount = factCount;
    return this;
  }

 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  public ShipmentStatusType getStatus() {
    return status;
  }

  public void setStatus(ShipmentStatusType status) {
    this.status = status;
  }

  public ShipmentInfoDTO status(ShipmentStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Описание статуса отгрузки.
   * @return statusDescription
  **/
  @JsonProperty("statusDescription")
  public String getStatusDescription() {
    return statusDescription;
  }

  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }

  public ShipmentInfoDTO statusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

 /**
   * Время последнего изменения статуса отгрузки.
   * @return statusUpdateTime
  **/
  @JsonProperty("statusUpdateTime")
  public Date getStatusUpdateTime() {
    return statusUpdateTime;
  }

  public void setStatusUpdateTime(Date statusUpdateTime) {
    this.statusUpdateTime = statusUpdateTime;
  }

  public ShipmentInfoDTO statusUpdateTime(Date statusUpdateTime) {
    this.statusUpdateTime = statusUpdateTime;
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
    ShipmentInfoDTO shipmentInfoDTO = (ShipmentInfoDTO) o;
    return Objects.equals(this.id, shipmentInfoDTO.id) &&
        Objects.equals(this.planIntervalFrom, shipmentInfoDTO.planIntervalFrom) &&
        Objects.equals(this.planIntervalTo, shipmentInfoDTO.planIntervalTo) &&
        Objects.equals(this.shipmentType, shipmentInfoDTO.shipmentType) &&
        Objects.equals(this.warehouse, shipmentInfoDTO.warehouse) &&
        Objects.equals(this.warehouseTo, shipmentInfoDTO.warehouseTo) &&
        Objects.equals(this.externalId, shipmentInfoDTO.externalId) &&
        Objects.equals(this.deliveryService, shipmentInfoDTO.deliveryService) &&
        Objects.equals(this.palletsCount, shipmentInfoDTO.palletsCount) &&
        Objects.equals(this.orderIds, shipmentInfoDTO.orderIds) &&
        Objects.equals(this.draftCount, shipmentInfoDTO.draftCount) &&
        Objects.equals(this.plannedCount, shipmentInfoDTO.plannedCount) &&
        Objects.equals(this.factCount, shipmentInfoDTO.factCount) &&
        Objects.equals(this.status, shipmentInfoDTO.status) &&
        Objects.equals(this.statusDescription, shipmentInfoDTO.statusDescription) &&
        Objects.equals(this.statusUpdateTime, shipmentInfoDTO.statusUpdateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, planIntervalFrom, planIntervalTo, shipmentType, warehouse, warehouseTo, externalId, deliveryService, palletsCount, orderIds, draftCount, plannedCount, factCount, status, statusDescription, statusUpdateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentInfoDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    planIntervalFrom: ").append(toIndentedString(planIntervalFrom)).append("\n");
    sb.append("    planIntervalTo: ").append(toIndentedString(planIntervalTo)).append("\n");
    sb.append("    shipmentType: ").append(toIndentedString(shipmentType)).append("\n");
    sb.append("    warehouse: ").append(toIndentedString(warehouse)).append("\n");
    sb.append("    warehouseTo: ").append(toIndentedString(warehouseTo)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    deliveryService: ").append(toIndentedString(deliveryService)).append("\n");
    sb.append("    palletsCount: ").append(toIndentedString(palletsCount)).append("\n");
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
    sb.append("    draftCount: ").append(toIndentedString(draftCount)).append("\n");
    sb.append("    plannedCount: ").append(toIndentedString(plannedCount)).append("\n");
    sb.append("    factCount: ").append(toIndentedString(factCount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
    sb.append("    statusUpdateTime: ").append(toIndentedString(statusUpdateTime)).append("\n");
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

