package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
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
import org.openapitools.model.ShipmentStatusType;
import org.openapitools.model.ShipmentType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Список с информацией об отгрузках.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ShipmentInfoDTO   {
  
  private Long id;
  private Date planIntervalFrom;
  private Date planIntervalTo;
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
  private ShipmentStatusType status;
  private String statusDescription;
  private Date statusUpdateTime;

  /**
   * Идентификатор отгрузки.
   **/
  
  @ApiModelProperty(value = "Идентификатор отгрузки.")
  @JsonProperty("id")
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
  @JsonProperty("planIntervalFrom")
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
  @JsonProperty("planIntervalTo")
  public Date getPlanIntervalTo() {
    return planIntervalTo;
  }
  public void setPlanIntervalTo(Date planIntervalTo) {
    this.planIntervalTo = planIntervalTo;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("shipmentType")
  @Valid
  public ShipmentType getShipmentType() {
    return shipmentType;
  }
  public void setShipmentType(ShipmentType shipmentType) {
    this.shipmentType = shipmentType;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("warehouse")
  @Valid
  public PartnerShipmentWarehouseDTO getWarehouse() {
    return warehouse;
  }
  public void setWarehouse(PartnerShipmentWarehouseDTO warehouse) {
    this.warehouse = warehouse;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("warehouseTo")
  @Valid
  public PartnerShipmentWarehouseDTO getWarehouseTo() {
    return warehouseTo;
  }
  public void setWarehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
    this.warehouseTo = warehouseTo;
  }

  /**
   * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.
   **/
  
  @ApiModelProperty(value = "Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.")
  @JsonProperty("externalId")
  public String getExternalId() {
    return externalId;
  }
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("deliveryService")
  @Valid
  public DeliveryServiceDTO getDeliveryService() {
    return deliveryService;
  }
  public void setDeliveryService(DeliveryServiceDTO deliveryService) {
    this.deliveryService = deliveryService;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("palletsCount")
  @Valid
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
  @JsonProperty("orderIds")
  @NotNull
  public Set<Long> getOrderIds() {
    return orderIds;
  }
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setOrderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
  }

  /**
   * Количество заказов, которое Маркет запланировал к отгрузке.
   **/
  
  @ApiModelProperty(value = "Количество заказов, которое Маркет запланировал к отгрузке.")
  @JsonProperty("draftCount")
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
  @JsonProperty("plannedCount")
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
  @JsonProperty("factCount")
  public Integer getFactCount() {
    return factCount;
  }
  public void setFactCount(Integer factCount) {
    this.factCount = factCount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  @Valid
  public ShipmentStatusType getStatus() {
    return status;
  }
  public void setStatus(ShipmentStatusType status) {
    this.status = status;
  }

  /**
   * Описание статуса отгрузки.
   **/
  
  @ApiModelProperty(value = "Описание статуса отгрузки.")
  @JsonProperty("statusDescription")
  public String getStatusDescription() {
    return statusDescription;
  }
  public void setStatusDescription(String statusDescription) {
    this.statusDescription = statusDescription;
  }

  /**
   * Время последнего изменения статуса отгрузки.
   **/
  
  @ApiModelProperty(value = "Время последнего изменения статуса отгрузки.")
  @JsonProperty("statusUpdateTime")
  public Date getStatusUpdateTime() {
    return statusUpdateTime;
  }
  public void setStatusUpdateTime(Date statusUpdateTime) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

