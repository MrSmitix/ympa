package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.prokarma.pkmst.model.DeliveryServiceDTO;
import com.prokarma.pkmst.model.PalletsCountDTO;
import com.prokarma.pkmst.model.PartnerShipmentWarehouseDTO;
import com.prokarma.pkmst.model.ShipmentActionType;
import com.prokarma.pkmst.model.ShipmentStatusChangeDTO;
import com.prokarma.pkmst.model.ShipmentType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация об отгрузке.
 */
@ApiModel(description = "Информация об отгрузке.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ShipmentDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("planIntervalFrom")
  private OffsetDateTime planIntervalFrom;

  @JsonProperty("planIntervalTo")
  private OffsetDateTime planIntervalTo;

  @JsonProperty("shipmentType")
  private ShipmentType shipmentType;

  @JsonProperty("warehouse")
  private PartnerShipmentWarehouseDTO warehouse;

  @JsonProperty("warehouseTo")
  private PartnerShipmentWarehouseDTO warehouseTo;

  @JsonProperty("externalId")
  private String externalId;

  @JsonProperty("deliveryService")
  private DeliveryServiceDTO deliveryService;

  @JsonProperty("palletsCount")
  private PalletsCountDTO palletsCount;

  @JsonProperty("orderIds")
  
  private Set<Long> orderIds = new LinkedHashSet<>();

  @JsonProperty("draftCount")
  private Integer draftCount;

  @JsonProperty("plannedCount")
  private Integer plannedCount;

  @JsonProperty("factCount")
  private Integer factCount;

  @JsonProperty("currentStatus")
  private ShipmentStatusChangeDTO currentStatus;

  @JsonProperty("availableActions")
  
  private Set<ShipmentActionType> availableActions = new LinkedHashSet<>();

  public ShipmentDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор отгрузки.
   * @return id
   */
  @ApiModelProperty(value = "Идентификатор отгрузки.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ShipmentDTO planIntervalFrom(OffsetDateTime planIntervalFrom) {
    this.planIntervalFrom = planIntervalFrom;
    return this;
  }

  /**
   * Начало планового интервала отгрузки.
   * @return planIntervalFrom
   */
  @ApiModelProperty(value = "Начало планового интервала отгрузки.")
  public OffsetDateTime getPlanIntervalFrom() {
    return planIntervalFrom;
  }

  public void setPlanIntervalFrom(OffsetDateTime planIntervalFrom) {
    this.planIntervalFrom = planIntervalFrom;
  }

  public ShipmentDTO planIntervalTo(OffsetDateTime planIntervalTo) {
    this.planIntervalTo = planIntervalTo;
    return this;
  }

  /**
   * Конец планового интервала отгрузки.
   * @return planIntervalTo
   */
  @ApiModelProperty(value = "Конец планового интервала отгрузки.")
  public OffsetDateTime getPlanIntervalTo() {
    return planIntervalTo;
  }

  public void setPlanIntervalTo(OffsetDateTime planIntervalTo) {
    this.planIntervalTo = planIntervalTo;
  }

  public ShipmentDTO shipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
    return this;
  }

  /**
   * Get shipmentType
   * @return shipmentType
   */
  @ApiModelProperty(value = "")
  public ShipmentType getShipmentType() {
    return shipmentType;
  }

  public void setShipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
  }

  public ShipmentDTO warehouse(PartnerShipmentWarehouseDTO warehouse) {
    this.warehouse = warehouse;
    return this;
  }

  /**
   * Get warehouse
   * @return warehouse
   */
  @ApiModelProperty(value = "")
  public PartnerShipmentWarehouseDTO getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(PartnerShipmentWarehouseDTO warehouse) {
    this.warehouse = warehouse;
  }

  public ShipmentDTO warehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
    this.warehouseTo = warehouseTo;
    return this;
  }

  /**
   * Get warehouseTo
   * @return warehouseTo
   */
  @ApiModelProperty(value = "")
  public PartnerShipmentWarehouseDTO getWarehouseTo() {
    return warehouseTo;
  }

  public void setWarehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
    this.warehouseTo = warehouseTo;
  }

  public ShipmentDTO externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
   * @return externalId
   */
  @ApiModelProperty(value = "Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ShipmentDTO deliveryService(DeliveryServiceDTO deliveryService) {
    this.deliveryService = deliveryService;
    return this;
  }

  /**
   * Get deliveryService
   * @return deliveryService
   */
  @ApiModelProperty(value = "")
  public DeliveryServiceDTO getDeliveryService() {
    return deliveryService;
  }

  public void setDeliveryService(DeliveryServiceDTO deliveryService) {
    this.deliveryService = deliveryService;
  }

  public ShipmentDTO palletsCount(PalletsCountDTO palletsCount) {
    this.palletsCount = palletsCount;
    return this;
  }

  /**
   * Get palletsCount
   * @return palletsCount
   */
  @ApiModelProperty(value = "")
  public PalletsCountDTO getPalletsCount() {
    return palletsCount;
  }

  public void setPalletsCount(PalletsCountDTO palletsCount) {
    this.palletsCount = palletsCount;
  }

  public ShipmentDTO orderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  public ShipmentDTO addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new LinkedHashSet<>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

  /**
   * Идентификаторы заказов в отгрузке.
   * @return orderIds
   */
  @ApiModelProperty(required = true, value = "Идентификаторы заказов в отгрузке.")
  public Set<Long> getOrderIds() {
    return orderIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setOrderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
  }

  public ShipmentDTO draftCount(Integer draftCount) {
    this.draftCount = draftCount;
    return this;
  }

  /**
   * Количество заказов, которое Маркет запланировал к отгрузке.
   * @return draftCount
   */
  @ApiModelProperty(value = "Количество заказов, которое Маркет запланировал к отгрузке.")
  public Integer getDraftCount() {
    return draftCount;
  }

  public void setDraftCount(Integer draftCount) {
    this.draftCount = draftCount;
  }

  public ShipmentDTO plannedCount(Integer plannedCount) {
    this.plannedCount = plannedCount;
    return this;
  }

  /**
   * Количество заказов, которое Маркет подтвердил к отгрузке.
   * @return plannedCount
   */
  @ApiModelProperty(value = "Количество заказов, которое Маркет подтвердил к отгрузке.")
  public Integer getPlannedCount() {
    return plannedCount;
  }

  public void setPlannedCount(Integer plannedCount) {
    this.plannedCount = plannedCount;
  }

  public ShipmentDTO factCount(Integer factCount) {
    this.factCount = factCount;
    return this;
  }

  /**
   * Количество заказов, принятых в сортировочном центре или пункте приема.
   * @return factCount
   */
  @ApiModelProperty(value = "Количество заказов, принятых в сортировочном центре или пункте приема.")
  public Integer getFactCount() {
    return factCount;
  }

  public void setFactCount(Integer factCount) {
    this.factCount = factCount;
  }

  public ShipmentDTO currentStatus(ShipmentStatusChangeDTO currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }

  /**
   * Get currentStatus
   * @return currentStatus
   */
  @ApiModelProperty(value = "")
  public ShipmentStatusChangeDTO getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(ShipmentStatusChangeDTO currentStatus) {
    this.currentStatus = currentStatus;
  }

  public ShipmentDTO availableActions(Set<ShipmentActionType> availableActions) {
    this.availableActions = availableActions;
    return this;
  }

  public ShipmentDTO addAvailableActionsItem(ShipmentActionType availableActionsItem) {
    if (this.availableActions == null) {
      this.availableActions = new LinkedHashSet<>();
    }
    this.availableActions.add(availableActionsItem);
    return this;
  }

  /**
   * Доступные действия над отгрузкой.
   * @return availableActions
   */
  @ApiModelProperty(required = true, value = "Доступные действия над отгрузкой.")
  public Set<ShipmentActionType> getAvailableActions() {
    return availableActions;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setAvailableActions(Set<ShipmentActionType> availableActions) {
    this.availableActions = availableActions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentDTO shipmentDTO = (ShipmentDTO) o;
    return Objects.equals(this.id, shipmentDTO.id) &&
        Objects.equals(this.planIntervalFrom, shipmentDTO.planIntervalFrom) &&
        Objects.equals(this.planIntervalTo, shipmentDTO.planIntervalTo) &&
        Objects.equals(this.shipmentType, shipmentDTO.shipmentType) &&
        Objects.equals(this.warehouse, shipmentDTO.warehouse) &&
        Objects.equals(this.warehouseTo, shipmentDTO.warehouseTo) &&
        Objects.equals(this.externalId, shipmentDTO.externalId) &&
        Objects.equals(this.deliveryService, shipmentDTO.deliveryService) &&
        Objects.equals(this.palletsCount, shipmentDTO.palletsCount) &&
        Objects.equals(this.orderIds, shipmentDTO.orderIds) &&
        Objects.equals(this.draftCount, shipmentDTO.draftCount) &&
        Objects.equals(this.plannedCount, shipmentDTO.plannedCount) &&
        Objects.equals(this.factCount, shipmentDTO.factCount) &&
        Objects.equals(this.currentStatus, shipmentDTO.currentStatus) &&
        Objects.equals(this.availableActions, shipmentDTO.availableActions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, planIntervalFrom, planIntervalTo, shipmentType, warehouse, warehouseTo, externalId, deliveryService, palletsCount, orderIds, draftCount, plannedCount, factCount, currentStatus, availableActions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentDTO {\n");
    
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
    sb.append("    currentStatus: ").append(toIndentedString(currentStatus)).append("\n");
    sb.append("    availableActions: ").append(toIndentedString(availableActions)).append("\n");
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

