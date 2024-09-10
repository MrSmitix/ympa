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
import org.openapitools.model.ShipmentActionType;
import org.openapitools.model.ShipmentStatusChangeDTO;
import org.openapitools.model.ShipmentType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация об отгрузке.
 **/
@ApiModel(description="Информация об отгрузке.")

public class ShipmentDTO  {
  
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
  private ShipmentStatusChangeDTO currentStatus;

  @ApiModelProperty(required = true, value = "Доступные действия над отгрузкой.")
  @Valid
 /**
   * Доступные действия над отгрузкой.
  **/
  private Set<ShipmentActionType> availableActions = new LinkedHashSet<>();
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

  public ShipmentDTO id(Long id) {
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

  public ShipmentDTO planIntervalFrom(Date planIntervalFrom) {
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

  public ShipmentDTO planIntervalTo(Date planIntervalTo) {
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

  public ShipmentDTO shipmentType(ShipmentType shipmentType) {
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

  public ShipmentDTO warehouse(PartnerShipmentWarehouseDTO warehouse) {
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

  public ShipmentDTO warehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
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

  public ShipmentDTO externalId(String externalId) {
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

  public ShipmentDTO deliveryService(DeliveryServiceDTO deliveryService) {
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

  public ShipmentDTO palletsCount(PalletsCountDTO palletsCount) {
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

  public ShipmentDTO orderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  public ShipmentDTO addOrderIdsItem(Long orderIdsItem) {
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

  public ShipmentDTO draftCount(Integer draftCount) {
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

  public ShipmentDTO plannedCount(Integer plannedCount) {
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

  public ShipmentDTO factCount(Integer factCount) {
    this.factCount = factCount;
    return this;
  }

 /**
   * Get currentStatus
   * @return currentStatus
  **/
  @JsonProperty("currentStatus")
  public ShipmentStatusChangeDTO getCurrentStatus() {
    return currentStatus;
  }

  public void setCurrentStatus(ShipmentStatusChangeDTO currentStatus) {
    this.currentStatus = currentStatus;
  }

  public ShipmentDTO currentStatus(ShipmentStatusChangeDTO currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }

 /**
   * Доступные действия над отгрузкой.
   * @return availableActions
  **/
  @JsonProperty("availableActions")
  @NotNull
  public Set<ShipmentActionType> getAvailableActions() {
    return availableActions;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setAvailableActions(Set<ShipmentActionType> availableActions) {
    this.availableActions = availableActions;
  }

  public ShipmentDTO availableActions(Set<ShipmentActionType> availableActions) {
    this.availableActions = availableActions;
    return this;
  }

  public ShipmentDTO addAvailableActionsItem(ShipmentActionType availableActionsItem) {
    this.availableActions.add(availableActionsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

