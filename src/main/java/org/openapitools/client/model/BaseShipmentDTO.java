/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import java.util.*;
import java.util.Date;
import org.openapitools.client.model.DeliveryServiceDTO;
import org.openapitools.client.model.PalletsCountDTO;
import org.openapitools.client.model.PartnerShipmentWarehouseDTO;
import org.openapitools.client.model.ShipmentType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Информация об отгрузке.
 **/
@ApiModel(description = "Информация об отгрузке.")
public class BaseShipmentDTO {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("planIntervalFrom")
  private Date planIntervalFrom = null;
  @SerializedName("planIntervalTo")
  private Date planIntervalTo = null;
  @SerializedName("shipmentType")
  private ShipmentType shipmentType = null;
  @SerializedName("warehouse")
  private PartnerShipmentWarehouseDTO warehouse = null;
  @SerializedName("warehouseTo")
  private PartnerShipmentWarehouseDTO warehouseTo = null;
  @SerializedName("externalId")
  private String externalId = null;
  @SerializedName("deliveryService")
  private DeliveryServiceDTO deliveryService = null;
  @SerializedName("palletsCount")
  private PalletsCountDTO palletsCount = null;
  @SerializedName("orderIds")
  private Set<Long> orderIds = null;
  @SerializedName("draftCount")
  private Integer draftCount = null;
  @SerializedName("plannedCount")
  private Integer plannedCount = null;
  @SerializedName("factCount")
  private Integer factCount = null;

  /**
   * Идентификатор отгрузки.
   **/
  @ApiModelProperty(value = "Идентификатор отгрузки.")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Начало планового интервала отгрузки.
   **/
  @ApiModelProperty(value = "Начало планового интервала отгрузки.")
  public Date getPlanIntervalFrom() {
    return planIntervalFrom;
  }
  public void setPlanIntervalFrom(Date planIntervalFrom) {
    this.planIntervalFrom = planIntervalFrom;
  }

  /**
   * Конец планового интервала отгрузки.
   **/
  @ApiModelProperty(value = "Конец планового интервала отгрузки.")
  public Date getPlanIntervalTo() {
    return planIntervalTo;
  }
  public void setPlanIntervalTo(Date planIntervalTo) {
    this.planIntervalTo = planIntervalTo;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ShipmentType getShipmentType() {
    return shipmentType;
  }
  public void setShipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PartnerShipmentWarehouseDTO getWarehouse() {
    return warehouse;
  }
  public void setWarehouse(PartnerShipmentWarehouseDTO warehouse) {
    this.warehouse = warehouse;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PartnerShipmentWarehouseDTO getWarehouseTo() {
    return warehouseTo;
  }
  public void setWarehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
    this.warehouseTo = warehouseTo;
  }

  /**
   * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
   **/
  @ApiModelProperty(value = "Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public DeliveryServiceDTO getDeliveryService() {
    return deliveryService;
  }
  public void setDeliveryService(DeliveryServiceDTO deliveryService) {
    this.deliveryService = deliveryService;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public PalletsCountDTO getPalletsCount() {
    return palletsCount;
  }
  public void setPalletsCount(PalletsCountDTO palletsCount) {
    this.palletsCount = palletsCount;
  }

  /**
   * Идентификаторы заказов в отгрузке.
   **/
  @ApiModelProperty(required = true, value = "Идентификаторы заказов в отгрузке.")
  public Set<Long> getOrderIds() {
    return orderIds;
  }
  public void setOrderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
  }

  /**
   * Количество заказов, которое Маркет запланировал к отгрузке.
   **/
  @ApiModelProperty(value = "Количество заказов, которое Маркет запланировал к отгрузке.")
  public Integer getDraftCount() {
    return draftCount;
  }
  public void setDraftCount(Integer draftCount) {
    this.draftCount = draftCount;
  }

  /**
   * Количество заказов, которое Маркет подтвердил к отгрузке.
   **/
  @ApiModelProperty(value = "Количество заказов, которое Маркет подтвердил к отгрузке.")
  public Integer getPlannedCount() {
    return plannedCount;
  }
  public void setPlannedCount(Integer plannedCount) {
    this.plannedCount = plannedCount;
  }

  /**
   * Количество заказов, принятых в сортировочном центре или пункте приема.
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
    return (this.id == null ? baseShipmentDTO.id == null : this.id.equals(baseShipmentDTO.id)) &&
        (this.planIntervalFrom == null ? baseShipmentDTO.planIntervalFrom == null : this.planIntervalFrom.equals(baseShipmentDTO.planIntervalFrom)) &&
        (this.planIntervalTo == null ? baseShipmentDTO.planIntervalTo == null : this.planIntervalTo.equals(baseShipmentDTO.planIntervalTo)) &&
        (this.shipmentType == null ? baseShipmentDTO.shipmentType == null : this.shipmentType.equals(baseShipmentDTO.shipmentType)) &&
        (this.warehouse == null ? baseShipmentDTO.warehouse == null : this.warehouse.equals(baseShipmentDTO.warehouse)) &&
        (this.warehouseTo == null ? baseShipmentDTO.warehouseTo == null : this.warehouseTo.equals(baseShipmentDTO.warehouseTo)) &&
        (this.externalId == null ? baseShipmentDTO.externalId == null : this.externalId.equals(baseShipmentDTO.externalId)) &&
        (this.deliveryService == null ? baseShipmentDTO.deliveryService == null : this.deliveryService.equals(baseShipmentDTO.deliveryService)) &&
        (this.palletsCount == null ? baseShipmentDTO.palletsCount == null : this.palletsCount.equals(baseShipmentDTO.palletsCount)) &&
        (this.orderIds == null ? baseShipmentDTO.orderIds == null : this.orderIds.equals(baseShipmentDTO.orderIds)) &&
        (this.draftCount == null ? baseShipmentDTO.draftCount == null : this.draftCount.equals(baseShipmentDTO.draftCount)) &&
        (this.plannedCount == null ? baseShipmentDTO.plannedCount == null : this.plannedCount.equals(baseShipmentDTO.plannedCount)) &&
        (this.factCount == null ? baseShipmentDTO.factCount == null : this.factCount.equals(baseShipmentDTO.factCount));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.planIntervalFrom == null ? 0: this.planIntervalFrom.hashCode());
    result = 31 * result + (this.planIntervalTo == null ? 0: this.planIntervalTo.hashCode());
    result = 31 * result + (this.shipmentType == null ? 0: this.shipmentType.hashCode());
    result = 31 * result + (this.warehouse == null ? 0: this.warehouse.hashCode());
    result = 31 * result + (this.warehouseTo == null ? 0: this.warehouseTo.hashCode());
    result = 31 * result + (this.externalId == null ? 0: this.externalId.hashCode());
    result = 31 * result + (this.deliveryService == null ? 0: this.deliveryService.hashCode());
    result = 31 * result + (this.palletsCount == null ? 0: this.palletsCount.hashCode());
    result = 31 * result + (this.orderIds == null ? 0: this.orderIds.hashCode());
    result = 31 * result + (this.draftCount == null ? 0: this.draftCount.hashCode());
    result = 31 * result + (this.plannedCount == null ? 0: this.plannedCount.hashCode());
    result = 31 * result + (this.factCount == null ? 0: this.factCount.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseShipmentDTO {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  planIntervalFrom: ").append(planIntervalFrom).append("\n");
    sb.append("  planIntervalTo: ").append(planIntervalTo).append("\n");
    sb.append("  shipmentType: ").append(shipmentType).append("\n");
    sb.append("  warehouse: ").append(warehouse).append("\n");
    sb.append("  warehouseTo: ").append(warehouseTo).append("\n");
    sb.append("  externalId: ").append(externalId).append("\n");
    sb.append("  deliveryService: ").append(deliveryService).append("\n");
    sb.append("  palletsCount: ").append(palletsCount).append("\n");
    sb.append("  orderIds: ").append(orderIds).append("\n");
    sb.append("  draftCount: ").append(draftCount).append("\n");
    sb.append("  plannedCount: ").append(plannedCount).append("\n");
    sb.append("  factCount: ").append(factCount).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
