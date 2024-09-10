package apimodels;

import apimodels.DeliveryServiceDTO;
import apimodels.PalletsCountDTO;
import apimodels.PartnerShipmentWarehouseDTO;
import apimodels.ShipmentStatusType;
import apimodels.ShipmentType;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Список с информацией об отгрузках.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ShipmentInfoDTO   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("planIntervalFrom")
  @Valid

  private OffsetDateTime planIntervalFrom;

  @JsonProperty("planIntervalTo")
  @Valid

  private OffsetDateTime planIntervalTo;

  @JsonProperty("shipmentType")
  @Valid

  private ShipmentType shipmentType;

  @JsonProperty("warehouse")
  @Valid

  private PartnerShipmentWarehouseDTO warehouse;

  @JsonProperty("warehouseTo")
  @Valid

  private PartnerShipmentWarehouseDTO warehouseTo;

  @JsonProperty("externalId")
  
  private String externalId;

  @JsonProperty("deliveryService")
  @Valid

  private DeliveryServiceDTO deliveryService;

  @JsonProperty("palletsCount")
  @Valid

  private PalletsCountDTO palletsCount;

  @JsonProperty("orderIds")
  @NotNull

  private Set<Long> orderIds = new LinkedHashSet<>();

  @JsonProperty("draftCount")
  
  private Integer draftCount;

  @JsonProperty("plannedCount")
  
  private Integer plannedCount;

  @JsonProperty("factCount")
  
  private Integer factCount;

  @JsonProperty("status")
  @Valid

  private ShipmentStatusType status;

  @JsonProperty("statusDescription")
  
  private String statusDescription;

  @JsonProperty("statusUpdateTime")
  @Valid

  private OffsetDateTime statusUpdateTime;

  public ShipmentInfoDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор отгрузки.
   * @return id
  **/
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ShipmentInfoDTO planIntervalFrom(OffsetDateTime planIntervalFrom) {
    this.planIntervalFrom = planIntervalFrom;
    return this;
  }

   /**
   * Начало планового интервала отгрузки.
   * @return planIntervalFrom
  **/
  public OffsetDateTime getPlanIntervalFrom() {
    return planIntervalFrom;
  }

  public void setPlanIntervalFrom(OffsetDateTime planIntervalFrom) {
    this.planIntervalFrom = planIntervalFrom;
  }

  public ShipmentInfoDTO planIntervalTo(OffsetDateTime planIntervalTo) {
    this.planIntervalTo = planIntervalTo;
    return this;
  }

   /**
   * Конец планового интервала отгрузки.
   * @return planIntervalTo
  **/
  public OffsetDateTime getPlanIntervalTo() {
    return planIntervalTo;
  }

  public void setPlanIntervalTo(OffsetDateTime planIntervalTo) {
    this.planIntervalTo = planIntervalTo;
  }

  public ShipmentInfoDTO shipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
    return this;
  }

   /**
   * Get shipmentType
   * @return shipmentType
  **/
  public ShipmentType getShipmentType() {
    return shipmentType;
  }

  public void setShipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
  }

  public ShipmentInfoDTO warehouse(PartnerShipmentWarehouseDTO warehouse) {
    this.warehouse = warehouse;
    return this;
  }

   /**
   * Get warehouse
   * @return warehouse
  **/
  public PartnerShipmentWarehouseDTO getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(PartnerShipmentWarehouseDTO warehouse) {
    this.warehouse = warehouse;
  }

  public ShipmentInfoDTO warehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
    this.warehouseTo = warehouseTo;
    return this;
  }

   /**
   * Get warehouseTo
   * @return warehouseTo
  **/
  public PartnerShipmentWarehouseDTO getWarehouseTo() {
    return warehouseTo;
  }

  public void setWarehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
    this.warehouseTo = warehouseTo;
  }

  public ShipmentInfoDTO externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
   * @return externalId
  **/
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public ShipmentInfoDTO deliveryService(DeliveryServiceDTO deliveryService) {
    this.deliveryService = deliveryService;
    return this;
  }

   /**
   * Get deliveryService
   * @return deliveryService
  **/
  public DeliveryServiceDTO getDeliveryService() {
    return deliveryService;
  }

  public void setDeliveryService(DeliveryServiceDTO deliveryService) {
    this.deliveryService = deliveryService;
  }

  public ShipmentInfoDTO palletsCount(PalletsCountDTO palletsCount) {
    this.palletsCount = palletsCount;
    return this;
  }

   /**
   * Get palletsCount
   * @return palletsCount
  **/
  public PalletsCountDTO getPalletsCount() {
    return palletsCount;
  }

  public void setPalletsCount(PalletsCountDTO palletsCount) {
    this.palletsCount = palletsCount;
  }

  public ShipmentInfoDTO orderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  public ShipmentInfoDTO addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new LinkedHashSet<>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * Идентификаторы заказов в отгрузке.
   * @return orderIds
  **/
  public Set<Long> getOrderIds() {
    return orderIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setOrderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
  }

  public ShipmentInfoDTO draftCount(Integer draftCount) {
    this.draftCount = draftCount;
    return this;
  }

   /**
   * Количество заказов, которое Маркет запланировал к отгрузке.
   * @return draftCount
  **/
  public Integer getDraftCount() {
    return draftCount;
  }

  public void setDraftCount(Integer draftCount) {
    this.draftCount = draftCount;
  }

  public ShipmentInfoDTO plannedCount(Integer plannedCount) {
    this.plannedCount = plannedCount;
    return this;
  }

   /**
   * Количество заказов, которое Маркет подтвердил к отгрузке.
   * @return plannedCount
  **/
  public Integer getPlannedCount() {
    return plannedCount;
  }

  public void setPlannedCount(Integer plannedCount) {
    this.plannedCount = plannedCount;
  }

  public ShipmentInfoDTO factCount(Integer factCount) {
    this.factCount = factCount;
    return this;
  }

   /**
   * Количество заказов, принятых в сортировочном центре или пункте приема.
   * @return factCount
  **/
  public Integer getFactCount() {
    return factCount;
  }

  public void setFactCount(Integer factCount) {
    this.factCount = factCount;
  }

  public ShipmentInfoDTO status(ShipmentStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public ShipmentStatusType getStatus() {
    return status;
  }

  public void setStatus(ShipmentStatusType status) {
    this.status = status;
  }

  public ShipmentInfoDTO statusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
    return this;
  }

   /**
   * Описание статуса отгрузки.
   * @return statusDescription
  **/
  public String getStatusDescription() {
    return statusDescription;
  }

  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }

  public ShipmentInfoDTO statusUpdateTime(OffsetDateTime statusUpdateTime) {
    this.statusUpdateTime = statusUpdateTime;
    return this;
  }

   /**
   * Время последнего изменения статуса отгрузки.
   * @return statusUpdateTime
  **/
  public OffsetDateTime getStatusUpdateTime() {
    return statusUpdateTime;
  }

  public void setStatusUpdateTime(OffsetDateTime statusUpdateTime) {
    this.statusUpdateTime = statusUpdateTime;
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
    return Objects.equals(id, shipmentInfoDTO.id) &&
        Objects.equals(planIntervalFrom, shipmentInfoDTO.planIntervalFrom) &&
        Objects.equals(planIntervalTo, shipmentInfoDTO.planIntervalTo) &&
        Objects.equals(shipmentType, shipmentInfoDTO.shipmentType) &&
        Objects.equals(warehouse, shipmentInfoDTO.warehouse) &&
        Objects.equals(warehouseTo, shipmentInfoDTO.warehouseTo) &&
        Objects.equals(externalId, shipmentInfoDTO.externalId) &&
        Objects.equals(deliveryService, shipmentInfoDTO.deliveryService) &&
        Objects.equals(palletsCount, shipmentInfoDTO.palletsCount) &&
        Objects.equals(orderIds, shipmentInfoDTO.orderIds) &&
        Objects.equals(draftCount, shipmentInfoDTO.draftCount) &&
        Objects.equals(plannedCount, shipmentInfoDTO.plannedCount) &&
        Objects.equals(factCount, shipmentInfoDTO.factCount) &&
        Objects.equals(status, shipmentInfoDTO.status) &&
        Objects.equals(statusDescription, shipmentInfoDTO.statusDescription) &&
        Objects.equals(statusUpdateTime, shipmentInfoDTO.statusUpdateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, planIntervalFrom, planIntervalTo, shipmentType, warehouse, warehouseTo, externalId, deliveryService, palletsCount, orderIds, draftCount, plannedCount, factCount, status, statusDescription, statusUpdateTime);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

