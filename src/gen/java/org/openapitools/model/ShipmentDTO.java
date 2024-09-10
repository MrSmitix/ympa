package org.openapitools.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация об отгрузке.
 **/
@ApiModel(description = "Информация об отгрузке.")
@JsonTypeName("ShipmentDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ShipmentDTO   {
  private Long id;
  private Date planIntervalFrom;
  private Date planIntervalTo;
  private ShipmentType shipmentType;
  private PartnerShipmentWarehouseDTO warehouse;
  private PartnerShipmentWarehouseDTO warehouseTo;
  private String externalId;
  private DeliveryServiceDTO deliveryService;
  private PalletsCountDTO palletsCount;
  private @Valid Set<Long> orderIds = new LinkedHashSet<>();
  private Integer draftCount;
  private Integer plannedCount;
  private Integer factCount;
  private ShipmentStatusChangeDTO currentStatus;
  private @Valid Set<ShipmentActionType> availableActions = new LinkedHashSet<>();

  /**
   * Идентификатор отгрузки.
   **/
  public ShipmentDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор отгрузки.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Начало планового интервала отгрузки.
   **/
  public ShipmentDTO planIntervalFrom(Date planIntervalFrom) {
    this.planIntervalFrom = planIntervalFrom;
    return this;
  }

  
  @ApiModelProperty(value = "Начало планового интервала отгрузки.")
  @JsonProperty("planIntervalFrom")
  public Date getPlanIntervalFrom() {
    return planIntervalFrom;
  }

  @JsonProperty("planIntervalFrom")
  public void setPlanIntervalFrom(Date planIntervalFrom) {
    this.planIntervalFrom = planIntervalFrom;
  }

  /**
   * Конец планового интервала отгрузки.
   **/
  public ShipmentDTO planIntervalTo(Date planIntervalTo) {
    this.planIntervalTo = planIntervalTo;
    return this;
  }

  
  @ApiModelProperty(value = "Конец планового интервала отгрузки.")
  @JsonProperty("planIntervalTo")
  public Date getPlanIntervalTo() {
    return planIntervalTo;
  }

  @JsonProperty("planIntervalTo")
  public void setPlanIntervalTo(Date planIntervalTo) {
    this.planIntervalTo = planIntervalTo;
  }

  /**
   **/
  public ShipmentDTO shipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("shipmentType")
  public ShipmentType getShipmentType() {
    return shipmentType;
  }

  @JsonProperty("shipmentType")
  public void setShipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
  }

  /**
   **/
  public ShipmentDTO warehouse(PartnerShipmentWarehouseDTO warehouse) {
    this.warehouse = warehouse;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("warehouse")
  @Valid public PartnerShipmentWarehouseDTO getWarehouse() {
    return warehouse;
  }

  @JsonProperty("warehouse")
  public void setWarehouse(PartnerShipmentWarehouseDTO warehouse) {
    this.warehouse = warehouse;
  }

  /**
   **/
  public ShipmentDTO warehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
    this.warehouseTo = warehouseTo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("warehouseTo")
  @Valid public PartnerShipmentWarehouseDTO getWarehouseTo() {
    return warehouseTo;
  }

  @JsonProperty("warehouseTo")
  public void setWarehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
    this.warehouseTo = warehouseTo;
  }

  /**
   * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.
   **/
  public ShipmentDTO externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  @JsonProperty("externalId")
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   **/
  public ShipmentDTO deliveryService(DeliveryServiceDTO deliveryService) {
    this.deliveryService = deliveryService;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("deliveryService")
  @Valid public DeliveryServiceDTO getDeliveryService() {
    return deliveryService;
  }

  @JsonProperty("deliveryService")
  public void setDeliveryService(DeliveryServiceDTO deliveryService) {
    this.deliveryService = deliveryService;
  }

  /**
   **/
  public ShipmentDTO palletsCount(PalletsCountDTO palletsCount) {
    this.palletsCount = palletsCount;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("palletsCount")
  @Valid public PalletsCountDTO getPalletsCount() {
    return palletsCount;
  }

  @JsonProperty("palletsCount")
  public void setPalletsCount(PalletsCountDTO palletsCount) {
    this.palletsCount = palletsCount;
  }

  /**
   * Идентификаторы заказов в отгрузке.
   **/
  public ShipmentDTO orderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификаторы заказов в отгрузке.")
  @JsonProperty("orderIds")
  @NotNull public Set<Long> getOrderIds() {
    return orderIds;
  }

  @JsonProperty("orderIds")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setOrderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
  }

  public ShipmentDTO addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new LinkedHashSet<>();
    }

    this.orderIds.add(orderIdsItem);
    return this;
  }

  public ShipmentDTO removeOrderIdsItem(Long orderIdsItem) {
    if (orderIdsItem != null && this.orderIds != null) {
      this.orderIds.remove(orderIdsItem);
    }

    return this;
  }
  /**
   * Количество заказов, которое Маркет запланировал к отгрузке.
   **/
  public ShipmentDTO draftCount(Integer draftCount) {
    this.draftCount = draftCount;
    return this;
  }

  
  @ApiModelProperty(value = "Количество заказов, которое Маркет запланировал к отгрузке.")
  @JsonProperty("draftCount")
  public Integer getDraftCount() {
    return draftCount;
  }

  @JsonProperty("draftCount")
  public void setDraftCount(Integer draftCount) {
    this.draftCount = draftCount;
  }

  /**
   * Количество заказов, которое Маркет подтвердил к отгрузке.
   **/
  public ShipmentDTO plannedCount(Integer plannedCount) {
    this.plannedCount = plannedCount;
    return this;
  }

  
  @ApiModelProperty(value = "Количество заказов, которое Маркет подтвердил к отгрузке.")
  @JsonProperty("plannedCount")
  public Integer getPlannedCount() {
    return plannedCount;
  }

  @JsonProperty("plannedCount")
  public void setPlannedCount(Integer plannedCount) {
    this.plannedCount = plannedCount;
  }

  /**
   * Количество заказов, принятых в сортировочном центре или пункте приема.
   **/
  public ShipmentDTO factCount(Integer factCount) {
    this.factCount = factCount;
    return this;
  }

  
  @ApiModelProperty(value = "Количество заказов, принятых в сортировочном центре или пункте приема.")
  @JsonProperty("factCount")
  public Integer getFactCount() {
    return factCount;
  }

  @JsonProperty("factCount")
  public void setFactCount(Integer factCount) {
    this.factCount = factCount;
  }

  /**
   **/
  public ShipmentDTO currentStatus(ShipmentStatusChangeDTO currentStatus) {
    this.currentStatus = currentStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("currentStatus")
  @Valid public ShipmentStatusChangeDTO getCurrentStatus() {
    return currentStatus;
  }

  @JsonProperty("currentStatus")
  public void setCurrentStatus(ShipmentStatusChangeDTO currentStatus) {
    this.currentStatus = currentStatus;
  }

  /**
   * Доступные действия над отгрузкой.
   **/
  public ShipmentDTO availableActions(Set<ShipmentActionType> availableActions) {
    this.availableActions = availableActions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Доступные действия над отгрузкой.")
  @JsonProperty("availableActions")
  @NotNull public Set<ShipmentActionType> getAvailableActions() {
    return availableActions;
  }

  @JsonProperty("availableActions")
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setAvailableActions(Set<ShipmentActionType> availableActions) {
    this.availableActions = availableActions;
  }

  public ShipmentDTO addAvailableActionsItem(ShipmentActionType availableActionsItem) {
    if (this.availableActions == null) {
      this.availableActions = new LinkedHashSet<>();
    }

    this.availableActions.add(availableActionsItem);
    return this;
  }

  public ShipmentDTO removeAvailableActionsItem(ShipmentActionType availableActionsItem) {
    if (availableActionsItem != null && this.availableActions != null) {
      this.availableActions.remove(availableActionsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

