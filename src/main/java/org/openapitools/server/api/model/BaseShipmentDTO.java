package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.server.api.model.DeliveryServiceDTO;
import org.openapitools.server.api.model.PalletsCountDTO;
import org.openapitools.server.api.model.PartnerShipmentWarehouseDTO;
import org.openapitools.server.api.model.ShipmentType;

/**
 * Информация об отгрузке.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseShipmentDTO   {
  
  private Long id;
  private OffsetDateTime planIntervalFrom;
  private OffsetDateTime planIntervalTo;
  private ShipmentType shipmentType;
  private PartnerShipmentWarehouseDTO warehouse;
  private PartnerShipmentWarehouseDTO warehouseTo;
  private String externalId;
  private DeliveryServiceDTO deliveryService;
  private PalletsCountDTO palletsCount;
  private Set<Long> orderIds = new LinkedHashSet<>();
  private Integer draftCount;
  private Integer plannedCount;
  private Integer factCount;

  public BaseShipmentDTO () {

  }

  public BaseShipmentDTO (Long id, OffsetDateTime planIntervalFrom, OffsetDateTime planIntervalTo, ShipmentType shipmentType, PartnerShipmentWarehouseDTO warehouse, PartnerShipmentWarehouseDTO warehouseTo, String externalId, DeliveryServiceDTO deliveryService, PalletsCountDTO palletsCount, Set<Long> orderIds, Integer draftCount, Integer plannedCount, Integer factCount) {
    this.id = id;
    this.planIntervalFrom = planIntervalFrom;
    this.planIntervalTo = planIntervalTo;
    this.shipmentType = shipmentType;
    this.warehouse = warehouse;
    this.warehouseTo = warehouseTo;
    this.externalId = externalId;
    this.deliveryService = deliveryService;
    this.palletsCount = palletsCount;
    this.orderIds = orderIds;
    this.draftCount = draftCount;
    this.plannedCount = plannedCount;
    this.factCount = factCount;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("planIntervalFrom")
  public OffsetDateTime getPlanIntervalFrom() {
    return planIntervalFrom;
  }
  public void setPlanIntervalFrom(OffsetDateTime planIntervalFrom) {
    this.planIntervalFrom = planIntervalFrom;
  }

    
  @JsonProperty("planIntervalTo")
  public OffsetDateTime getPlanIntervalTo() {
    return planIntervalTo;
  }
  public void setPlanIntervalTo(OffsetDateTime planIntervalTo) {
    this.planIntervalTo = planIntervalTo;
  }

    
  @JsonProperty("shipmentType")
  public ShipmentType getShipmentType() {
    return shipmentType;
  }
  public void setShipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
  }

    
  @JsonProperty("warehouse")
  public PartnerShipmentWarehouseDTO getWarehouse() {
    return warehouse;
  }
  public void setWarehouse(PartnerShipmentWarehouseDTO warehouse) {
    this.warehouse = warehouse;
  }

    
  @JsonProperty("warehouseTo")
  public PartnerShipmentWarehouseDTO getWarehouseTo() {
    return warehouseTo;
  }
  public void setWarehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
    this.warehouseTo = warehouseTo;
  }

    
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

    
  @JsonProperty("deliveryService")
  public DeliveryServiceDTO getDeliveryService() {
    return deliveryService;
  }
  public void setDeliveryService(DeliveryServiceDTO deliveryService) {
    this.deliveryService = deliveryService;
  }

    
  @JsonProperty("palletsCount")
  public PalletsCountDTO getPalletsCount() {
    return palletsCount;
  }
  public void setPalletsCount(PalletsCountDTO palletsCount) {
    this.palletsCount = palletsCount;
  }

    
  @JsonProperty("orderIds")
  public Set<Long> getOrderIds() {
    return orderIds;
  }
  public void setOrderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
  }

    
  @JsonProperty("draftCount")
  public Integer getDraftCount() {
    return draftCount;
  }
  public void setDraftCount(Integer draftCount) {
    this.draftCount = draftCount;
  }

    
  @JsonProperty("plannedCount")
  public Integer getPlannedCount() {
    return plannedCount;
  }
  public void setPlannedCount(Integer plannedCount) {
    this.plannedCount = plannedCount;
  }

    
  @JsonProperty("factCount")
  public Integer getFactCount() {
    return factCount;
  }
  public void setFactCount(Integer factCount) {
    this.factCount = factCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseShipmentDTO baseShipmentDTO = (BaseShipmentDTO) o;
    return Objects.equals(id, baseShipmentDTO.id) &&
        Objects.equals(planIntervalFrom, baseShipmentDTO.planIntervalFrom) &&
        Objects.equals(planIntervalTo, baseShipmentDTO.planIntervalTo) &&
        Objects.equals(shipmentType, baseShipmentDTO.shipmentType) &&
        Objects.equals(warehouse, baseShipmentDTO.warehouse) &&
        Objects.equals(warehouseTo, baseShipmentDTO.warehouseTo) &&
        Objects.equals(externalId, baseShipmentDTO.externalId) &&
        Objects.equals(deliveryService, baseShipmentDTO.deliveryService) &&
        Objects.equals(palletsCount, baseShipmentDTO.palletsCount) &&
        Objects.equals(orderIds, baseShipmentDTO.orderIds) &&
        Objects.equals(draftCount, baseShipmentDTO.draftCount) &&
        Objects.equals(plannedCount, baseShipmentDTO.plannedCount) &&
        Objects.equals(factCount, baseShipmentDTO.factCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, planIntervalFrom, planIntervalTo, shipmentType, warehouse, warehouseTo, externalId, deliveryService, palletsCount, orderIds, draftCount, plannedCount, factCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseShipmentDTO {\n");
    
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
