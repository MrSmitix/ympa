package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.DeliveryServiceDTO;
import org.openapitools.model.PalletsCountDTO;
import org.openapitools.model.PartnerShipmentWarehouseDTO;
import org.openapitools.model.ShipmentType;

/**
 * Информация об отгрузке.
 */
@ApiModel(description = "Информация об отгрузке.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class BaseShipmentDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("planIntervalFrom")
  private Date planIntervalFrom;

  @JsonProperty("planIntervalTo")
  private Date planIntervalTo;

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

  public BaseShipmentDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор отгрузки.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор отгрузки.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BaseShipmentDTO planIntervalFrom(Date planIntervalFrom) {
    this.planIntervalFrom = planIntervalFrom;
    return this;
  }

   /**
   * Начало планового интервала отгрузки.
   * @return planIntervalFrom
  **/
  @ApiModelProperty(value = "Начало планового интервала отгрузки.")
  public Date getPlanIntervalFrom() {
    return planIntervalFrom;
  }

  public void setPlanIntervalFrom(Date planIntervalFrom) {
    this.planIntervalFrom = planIntervalFrom;
  }

  public BaseShipmentDTO planIntervalTo(Date planIntervalTo) {
    this.planIntervalTo = planIntervalTo;
    return this;
  }

   /**
   * Конец планового интервала отгрузки.
   * @return planIntervalTo
  **/
  @ApiModelProperty(value = "Конец планового интервала отгрузки.")
  public Date getPlanIntervalTo() {
    return planIntervalTo;
  }

  public void setPlanIntervalTo(Date planIntervalTo) {
    this.planIntervalTo = planIntervalTo;
  }

  public BaseShipmentDTO shipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
    return this;
  }

   /**
   * Get shipmentType
   * @return shipmentType
  **/
  @ApiModelProperty(value = "")
  public ShipmentType getShipmentType() {
    return shipmentType;
  }

  public void setShipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
  }

  public BaseShipmentDTO warehouse(PartnerShipmentWarehouseDTO warehouse) {
    this.warehouse = warehouse;
    return this;
  }

   /**
   * Get warehouse
   * @return warehouse
  **/
  @ApiModelProperty(value = "")
  public PartnerShipmentWarehouseDTO getWarehouse() {
    return warehouse;
  }

  public void setWarehouse(PartnerShipmentWarehouseDTO warehouse) {
    this.warehouse = warehouse;
  }

  public BaseShipmentDTO warehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
    this.warehouseTo = warehouseTo;
    return this;
  }

   /**
   * Get warehouseTo
   * @return warehouseTo
  **/
  @ApiModelProperty(value = "")
  public PartnerShipmentWarehouseDTO getWarehouseTo() {
    return warehouseTo;
  }

  public void setWarehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
    this.warehouseTo = warehouseTo;
  }

  public BaseShipmentDTO externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
   * @return externalId
  **/
  @ApiModelProperty(value = "Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public BaseShipmentDTO deliveryService(DeliveryServiceDTO deliveryService) {
    this.deliveryService = deliveryService;
    return this;
  }

   /**
   * Get deliveryService
   * @return deliveryService
  **/
  @ApiModelProperty(value = "")
  public DeliveryServiceDTO getDeliveryService() {
    return deliveryService;
  }

  public void setDeliveryService(DeliveryServiceDTO deliveryService) {
    this.deliveryService = deliveryService;
  }

  public BaseShipmentDTO palletsCount(PalletsCountDTO palletsCount) {
    this.palletsCount = palletsCount;
    return this;
  }

   /**
   * Get palletsCount
   * @return palletsCount
  **/
  @ApiModelProperty(value = "")
  public PalletsCountDTO getPalletsCount() {
    return palletsCount;
  }

  public void setPalletsCount(PalletsCountDTO palletsCount) {
    this.palletsCount = palletsCount;
  }

  public BaseShipmentDTO orderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  public BaseShipmentDTO addOrderIdsItem(Long orderIdsItem) {
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * Идентификаторы заказов в отгрузке.
   * @return orderIds
  **/
  @ApiModelProperty(required = true, value = "Идентификаторы заказов в отгрузке.")
  public Set<Long> getOrderIds() {
    return orderIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setOrderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
  }

  public BaseShipmentDTO draftCount(Integer draftCount) {
    this.draftCount = draftCount;
    return this;
  }

   /**
   * Количество заказов, которое Маркет запланировал к отгрузке.
   * @return draftCount
  **/
  @ApiModelProperty(value = "Количество заказов, которое Маркет запланировал к отгрузке.")
  public Integer getDraftCount() {
    return draftCount;
  }

  public void setDraftCount(Integer draftCount) {
    this.draftCount = draftCount;
  }

  public BaseShipmentDTO plannedCount(Integer plannedCount) {
    this.plannedCount = plannedCount;
    return this;
  }

   /**
   * Количество заказов, которое Маркет подтвердил к отгрузке.
   * @return plannedCount
  **/
  @ApiModelProperty(value = "Количество заказов, которое Маркет подтвердил к отгрузке.")
  public Integer getPlannedCount() {
    return plannedCount;
  }

  public void setPlannedCount(Integer plannedCount) {
    this.plannedCount = plannedCount;
  }

  public BaseShipmentDTO factCount(Integer factCount) {
    this.factCount = factCount;
    return this;
  }

   /**
   * Количество заказов, принятых в сортировочном центре или пункте приема.
   * @return factCount
  **/
  @ApiModelProperty(value = "Количество заказов, принятых в сортировочном центре или пункте приема.")
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
    return Objects.equals(this.id, baseShipmentDTO.id) &&
        Objects.equals(this.planIntervalFrom, baseShipmentDTO.planIntervalFrom) &&
        Objects.equals(this.planIntervalTo, baseShipmentDTO.planIntervalTo) &&
        Objects.equals(this.shipmentType, baseShipmentDTO.shipmentType) &&
        Objects.equals(this.warehouse, baseShipmentDTO.warehouse) &&
        Objects.equals(this.warehouseTo, baseShipmentDTO.warehouseTo) &&
        Objects.equals(this.externalId, baseShipmentDTO.externalId) &&
        Objects.equals(this.deliveryService, baseShipmentDTO.deliveryService) &&
        Objects.equals(this.palletsCount, baseShipmentDTO.palletsCount) &&
        Objects.equals(this.orderIds, baseShipmentDTO.orderIds) &&
        Objects.equals(this.draftCount, baseShipmentDTO.draftCount) &&
        Objects.equals(this.plannedCount, baseShipmentDTO.plannedCount) &&
        Objects.equals(this.factCount, baseShipmentDTO.factCount);
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

