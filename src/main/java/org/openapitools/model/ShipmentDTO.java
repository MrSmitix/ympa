package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.DeliveryServiceDTO;
import org.openapitools.model.PalletsCountDTO;
import org.openapitools.model.PartnerShipmentWarehouseDTO;
import org.openapitools.model.ShipmentActionType;
import org.openapitools.model.ShipmentStatusChangeDTO;
import org.openapitools.model.ShipmentType;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об отгрузке.
 */

@Schema(name = "ShipmentDTO", description = "Информация об отгрузке.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ShipmentDTO {

  private Long id;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date planIntervalFrom;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date planIntervalTo;

  private ShipmentType shipmentType;

  private PartnerShipmentWarehouseDTO warehouse;

  private PartnerShipmentWarehouseDTO warehouseTo;

  private String externalId;

  private DeliveryServiceDTO deliveryService;

  private PalletsCountDTO palletsCount;

  @Valid
  private Set<Long> orderIds = new LinkedHashSet<>();

  private Integer draftCount;

  private Integer plannedCount;

  private Integer factCount;

  private ShipmentStatusChangeDTO currentStatus;

  @Valid
  private Set<ShipmentActionType> availableActions = new LinkedHashSet<>();

  public ShipmentDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ShipmentDTO(Set<Long> orderIds, Set<ShipmentActionType> availableActions) {
    this.orderIds = orderIds;
    this.availableActions = availableActions;
  }

  public ShipmentDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор отгрузки.
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор отгрузки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ShipmentDTO planIntervalFrom(Date planIntervalFrom) {
    this.planIntervalFrom = planIntervalFrom;
    return this;
  }

  /**
   * Начало планового интервала отгрузки.
   * @return planIntervalFrom
   */
  @Valid 
  @Schema(name = "planIntervalFrom", description = "Начало планового интервала отгрузки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("planIntervalFrom")
  public Date getPlanIntervalFrom() {
    return planIntervalFrom;
  }

  public void setPlanIntervalFrom(Date planIntervalFrom) {
    this.planIntervalFrom = planIntervalFrom;
  }

  public ShipmentDTO planIntervalTo(Date planIntervalTo) {
    this.planIntervalTo = planIntervalTo;
    return this;
  }

  /**
   * Конец планового интервала отгрузки.
   * @return planIntervalTo
   */
  @Valid 
  @Schema(name = "planIntervalTo", description = "Конец планового интервала отгрузки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("planIntervalTo")
  public Date getPlanIntervalTo() {
    return planIntervalTo;
  }

  public void setPlanIntervalTo(Date planIntervalTo) {
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
  @Valid 
  @Schema(name = "shipmentType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipmentType")
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
  @Valid 
  @Schema(name = "warehouse", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warehouse")
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
  @Valid 
  @Schema(name = "warehouseTo", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warehouseTo")
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
  
  @Schema(name = "externalId", description = "Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalId")
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
  @Valid 
  @Schema(name = "deliveryService", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliveryService")
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
  @Valid 
  @Schema(name = "palletsCount", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("palletsCount")
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
  @NotNull 
  @Schema(name = "orderIds", description = "Идентификаторы заказов в отгрузке.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("orderIds")
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
  
  @Schema(name = "draftCount", description = "Количество заказов, которое Маркет запланировал к отгрузке.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("draftCount")
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
  
  @Schema(name = "plannedCount", description = "Количество заказов, которое Маркет подтвердил к отгрузке.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("plannedCount")
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
  
  @Schema(name = "factCount", description = "Количество заказов, принятых в сортировочном центре или пункте приема.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("factCount")
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
  @Valid 
  @Schema(name = "currentStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentStatus")
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
  @NotNull @Valid 
  @Schema(name = "availableActions", description = "Доступные действия над отгрузкой.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("availableActions")
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

