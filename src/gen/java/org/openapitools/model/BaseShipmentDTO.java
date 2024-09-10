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
import org.openapitools.model.ShipmentType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация об отгрузке.
 */
@ApiModel(description="Информация об отгрузке.")

public class BaseShipmentDTO  {
  
 /**
  * Идентификатор отгрузки.
  */
  @ApiModelProperty(value = "Идентификатор отгрузки.")
  private Long id;

 /**
  * Начало планового интервала отгрузки.
  */
  @ApiModelProperty(value = "Начало планового интервала отгрузки.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date planIntervalFrom;

 /**
  * Конец планового интервала отгрузки.
  */
  @ApiModelProperty(value = "Конец планового интервала отгрузки.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
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

 /**
  * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
  */
  @ApiModelProperty(value = "Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.")
  private String externalId;

  @ApiModelProperty(value = "")
  @Valid
  private DeliveryServiceDTO deliveryService;

  @ApiModelProperty(value = "")
  @Valid
  private PalletsCountDTO palletsCount;

 /**
  * Идентификаторы заказов в отгрузке.
  */
  @ApiModelProperty(required = true, value = "Идентификаторы заказов в отгрузке.")
  private Set<Long> orderIds = new LinkedHashSet<>();

 /**
  * Количество заказов, которое Маркет запланировал к отгрузке.
  */
  @ApiModelProperty(value = "Количество заказов, которое Маркет запланировал к отгрузке.")
  private Integer draftCount;

 /**
  * Количество заказов, которое Маркет подтвердил к отгрузке.
  */
  @ApiModelProperty(value = "Количество заказов, которое Маркет подтвердил к отгрузке.")
  private Integer plannedCount;

 /**
  * Количество заказов, принятых в сортировочном центре или пункте приема.
  */
  @ApiModelProperty(value = "Количество заказов, принятых в сортировочном центре или пункте приема.")
  private Integer factCount;
 /**
  * Идентификатор отгрузки.
  * @return id
  */
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public BaseShipmentDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Начало планового интервала отгрузки.
  * @return planIntervalFrom
  */
  @JsonProperty("planIntervalFrom")
  public Date getPlanIntervalFrom() {
    return planIntervalFrom;
  }

  /**
   * Sets the <code>planIntervalFrom</code> property.
   */
 public void setPlanIntervalFrom(Date planIntervalFrom) {
    this.planIntervalFrom = planIntervalFrom;
  }

  /**
   * Sets the <code>planIntervalFrom</code> property.
   */
  public BaseShipmentDTO planIntervalFrom(Date planIntervalFrom) {
    this.planIntervalFrom = planIntervalFrom;
    return this;
  }

 /**
  * Конец планового интервала отгрузки.
  * @return planIntervalTo
  */
  @JsonProperty("planIntervalTo")
  public Date getPlanIntervalTo() {
    return planIntervalTo;
  }

  /**
   * Sets the <code>planIntervalTo</code> property.
   */
 public void setPlanIntervalTo(Date planIntervalTo) {
    this.planIntervalTo = planIntervalTo;
  }

  /**
   * Sets the <code>planIntervalTo</code> property.
   */
  public BaseShipmentDTO planIntervalTo(Date planIntervalTo) {
    this.planIntervalTo = planIntervalTo;
    return this;
  }

 /**
  * Get shipmentType
  * @return shipmentType
  */
  @JsonProperty("shipmentType")
  public ShipmentType getShipmentType() {
    return shipmentType;
  }

  /**
   * Sets the <code>shipmentType</code> property.
   */
 public void setShipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
  }

  /**
   * Sets the <code>shipmentType</code> property.
   */
  public BaseShipmentDTO shipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
    return this;
  }

 /**
  * Get warehouse
  * @return warehouse
  */
  @JsonProperty("warehouse")
  public PartnerShipmentWarehouseDTO getWarehouse() {
    return warehouse;
  }

  /**
   * Sets the <code>warehouse</code> property.
   */
 public void setWarehouse(PartnerShipmentWarehouseDTO warehouse) {
    this.warehouse = warehouse;
  }

  /**
   * Sets the <code>warehouse</code> property.
   */
  public BaseShipmentDTO warehouse(PartnerShipmentWarehouseDTO warehouse) {
    this.warehouse = warehouse;
    return this;
  }

 /**
  * Get warehouseTo
  * @return warehouseTo
  */
  @JsonProperty("warehouseTo")
  public PartnerShipmentWarehouseDTO getWarehouseTo() {
    return warehouseTo;
  }

  /**
   * Sets the <code>warehouseTo</code> property.
   */
 public void setWarehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
    this.warehouseTo = warehouseTo;
  }

  /**
   * Sets the <code>warehouseTo</code> property.
   */
  public BaseShipmentDTO warehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
    this.warehouseTo = warehouseTo;
    return this;
  }

 /**
  * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.
  * @return externalId
  */
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }

  /**
   * Sets the <code>externalId</code> property.
   */
 public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   * Sets the <code>externalId</code> property.
   */
  public BaseShipmentDTO externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

 /**
  * Get deliveryService
  * @return deliveryService
  */
  @JsonProperty("deliveryService")
  public DeliveryServiceDTO getDeliveryService() {
    return deliveryService;
  }

  /**
   * Sets the <code>deliveryService</code> property.
   */
 public void setDeliveryService(DeliveryServiceDTO deliveryService) {
    this.deliveryService = deliveryService;
  }

  /**
   * Sets the <code>deliveryService</code> property.
   */
  public BaseShipmentDTO deliveryService(DeliveryServiceDTO deliveryService) {
    this.deliveryService = deliveryService;
    return this;
  }

 /**
  * Get palletsCount
  * @return palletsCount
  */
  @JsonProperty("palletsCount")
  public PalletsCountDTO getPalletsCount() {
    return palletsCount;
  }

  /**
   * Sets the <code>palletsCount</code> property.
   */
 public void setPalletsCount(PalletsCountDTO palletsCount) {
    this.palletsCount = palletsCount;
  }

  /**
   * Sets the <code>palletsCount</code> property.
   */
  public BaseShipmentDTO palletsCount(PalletsCountDTO palletsCount) {
    this.palletsCount = palletsCount;
    return this;
  }

 /**
  * Идентификаторы заказов в отгрузке.
  * @return orderIds
  */
  @JsonProperty("orderIds")
  @NotNull
  public Set<Long> getOrderIds() {
    return orderIds;
  }

  /**
   * Sets the <code>orderIds</code> property.
   */
 @JsonDeserialize(as = LinkedHashSet.class)
 public void setOrderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
  }

  /**
   * Sets the <code>orderIds</code> property.
   */
  public BaseShipmentDTO orderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  /**
   * Adds a new item to the <code>orderIds</code> list.
   */
  public BaseShipmentDTO addOrderIdsItem(Long orderIdsItem) {
    this.orderIds.add(orderIdsItem);
    return this;
  }

 /**
  * Количество заказов, которое Маркет запланировал к отгрузке.
  * @return draftCount
  */
  @JsonProperty("draftCount")
  public Integer getDraftCount() {
    return draftCount;
  }

  /**
   * Sets the <code>draftCount</code> property.
   */
 public void setDraftCount(Integer draftCount) {
    this.draftCount = draftCount;
  }

  /**
   * Sets the <code>draftCount</code> property.
   */
  public BaseShipmentDTO draftCount(Integer draftCount) {
    this.draftCount = draftCount;
    return this;
  }

 /**
  * Количество заказов, которое Маркет подтвердил к отгрузке.
  * @return plannedCount
  */
  @JsonProperty("plannedCount")
  public Integer getPlannedCount() {
    return plannedCount;
  }

  /**
   * Sets the <code>plannedCount</code> property.
   */
 public void setPlannedCount(Integer plannedCount) {
    this.plannedCount = plannedCount;
  }

  /**
   * Sets the <code>plannedCount</code> property.
   */
  public BaseShipmentDTO plannedCount(Integer plannedCount) {
    this.plannedCount = plannedCount;
    return this;
  }

 /**
  * Количество заказов, принятых в сортировочном центре или пункте приема.
  * @return factCount
  */
  @JsonProperty("factCount")
  public Integer getFactCount() {
    return factCount;
  }

  /**
   * Sets the <code>factCount</code> property.
   */
 public void setFactCount(Integer factCount) {
    this.factCount = factCount;
  }

  /**
   * Sets the <code>factCount</code> property.
   */
  public BaseShipmentDTO factCount(Integer factCount) {
    this.factCount = factCount;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

