/*
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

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.model.DeliveryServiceDTO;
import org.openapitools.model.PalletsCountDTO;
import org.openapitools.model.PartnerShipmentWarehouseDTO;
import org.openapitools.model.ShipmentType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Информация об отгрузке.
 */
@JsonPropertyOrder({
  BaseShipmentDTO.JSON_PROPERTY_ID,
  BaseShipmentDTO.JSON_PROPERTY_PLAN_INTERVAL_FROM,
  BaseShipmentDTO.JSON_PROPERTY_PLAN_INTERVAL_TO,
  BaseShipmentDTO.JSON_PROPERTY_SHIPMENT_TYPE,
  BaseShipmentDTO.JSON_PROPERTY_WAREHOUSE,
  BaseShipmentDTO.JSON_PROPERTY_WAREHOUSE_TO,
  BaseShipmentDTO.JSON_PROPERTY_EXTERNAL_ID,
  BaseShipmentDTO.JSON_PROPERTY_DELIVERY_SERVICE,
  BaseShipmentDTO.JSON_PROPERTY_PALLETS_COUNT,
  BaseShipmentDTO.JSON_PROPERTY_ORDER_IDS,
  BaseShipmentDTO.JSON_PROPERTY_DRAFT_COUNT,
  BaseShipmentDTO.JSON_PROPERTY_PLANNED_COUNT,
  BaseShipmentDTO.JSON_PROPERTY_FACT_COUNT
})
@JsonTypeName("BaseShipmentDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class BaseShipmentDTO {
    public static final String JSON_PROPERTY_ID = "id";
    private Long id;

    public static final String JSON_PROPERTY_PLAN_INTERVAL_FROM = "planIntervalFrom";
    private OffsetDateTime planIntervalFrom;

    public static final String JSON_PROPERTY_PLAN_INTERVAL_TO = "planIntervalTo";
    private OffsetDateTime planIntervalTo;

    public static final String JSON_PROPERTY_SHIPMENT_TYPE = "shipmentType";
    private ShipmentType shipmentType;

    public static final String JSON_PROPERTY_WAREHOUSE = "warehouse";
    private PartnerShipmentWarehouseDTO warehouse;

    public static final String JSON_PROPERTY_WAREHOUSE_TO = "warehouseTo";
    private PartnerShipmentWarehouseDTO warehouseTo;

    public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
    private String externalId;

    public static final String JSON_PROPERTY_DELIVERY_SERVICE = "deliveryService";
    private DeliveryServiceDTO deliveryService;

    public static final String JSON_PROPERTY_PALLETS_COUNT = "palletsCount";
    private PalletsCountDTO palletsCount;

    public static final String JSON_PROPERTY_ORDER_IDS = "orderIds";
    private Set<Long> orderIds = new LinkedHashSet<>();

    public static final String JSON_PROPERTY_DRAFT_COUNT = "draftCount";
    private Integer draftCount;

    public static final String JSON_PROPERTY_PLANNED_COUNT = "plannedCount";
    private Integer plannedCount;

    public static final String JSON_PROPERTY_FACT_COUNT = "factCount";
    private Integer factCount;

    public BaseShipmentDTO(Set<Long> orderIds) {
        this.orderIds = orderIds;
    }

    public BaseShipmentDTO id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Идентификатор отгрузки.
     * @return id
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Long getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(Long id) {
        this.id = id;
    }

    public BaseShipmentDTO planIntervalFrom(OffsetDateTime planIntervalFrom) {
        this.planIntervalFrom = planIntervalFrom;
        return this;
    }

    /**
     * Начало планового интервала отгрузки.
     * @return planIntervalFrom
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_PLAN_INTERVAL_FROM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getPlanIntervalFrom() {
        return planIntervalFrom;
    }

    @JsonProperty(JSON_PROPERTY_PLAN_INTERVAL_FROM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setPlanIntervalFrom(OffsetDateTime planIntervalFrom) {
        this.planIntervalFrom = planIntervalFrom;
    }

    public BaseShipmentDTO planIntervalTo(OffsetDateTime planIntervalTo) {
        this.planIntervalTo = planIntervalTo;
        return this;
    }

    /**
     * Конец планового интервала отгрузки.
     * @return planIntervalTo
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_PLAN_INTERVAL_TO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public OffsetDateTime getPlanIntervalTo() {
        return planIntervalTo;
    }

    @JsonProperty(JSON_PROPERTY_PLAN_INTERVAL_TO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXXX")
    public void setPlanIntervalTo(OffsetDateTime planIntervalTo) {
        this.planIntervalTo = planIntervalTo;
    }

    public BaseShipmentDTO shipmentType(ShipmentType shipmentType) {
        this.shipmentType = shipmentType;
        return this;
    }

    /**
     * Get shipmentType
     * @return shipmentType
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_SHIPMENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public ShipmentType getShipmentType() {
        return shipmentType;
    }

    @JsonProperty(JSON_PROPERTY_SHIPMENT_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_WAREHOUSE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PartnerShipmentWarehouseDTO getWarehouse() {
        return warehouse;
    }

    @JsonProperty(JSON_PROPERTY_WAREHOUSE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_WAREHOUSE_TO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PartnerShipmentWarehouseDTO getWarehouseTo() {
        return warehouseTo;
    }

    @JsonProperty(JSON_PROPERTY_WAREHOUSE_TO)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWarehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
        this.warehouseTo = warehouseTo;
    }

    public BaseShipmentDTO externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.
     * @return externalId
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getExternalId() {
        return externalId;
    }

    @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_DELIVERY_SERVICE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public DeliveryServiceDTO getDeliveryService() {
        return deliveryService;
    }

    @JsonProperty(JSON_PROPERTY_DELIVERY_SERVICE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_PALLETS_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public PalletsCountDTO getPalletsCount() {
        return palletsCount;
    }

    @JsonProperty(JSON_PROPERTY_PALLETS_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_ORDER_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Set<Long> getOrderIds() {
        return orderIds;
    }

    @JsonProperty(JSON_PROPERTY_ORDER_IDS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_DRAFT_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getDraftCount() {
        return draftCount;
    }

    @JsonProperty(JSON_PROPERTY_DRAFT_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_PLANNED_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getPlannedCount() {
        return plannedCount;
    }

    @JsonProperty(JSON_PROPERTY_PLANNED_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_FACT_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getFactCount() {
        return factCount;
    }

    @JsonProperty(JSON_PROPERTY_FACT_COUNT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

