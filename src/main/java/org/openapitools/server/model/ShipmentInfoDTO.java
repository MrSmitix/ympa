package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.server.model.DeliveryServiceDTO;
import org.openapitools.server.model.PalletsCountDTO;
import org.openapitools.server.model.PartnerShipmentWarehouseDTO;
import org.openapitools.server.model.ShipmentStatusType;
import org.openapitools.server.model.ShipmentType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список с информацией об отгрузках.
 */
public class ShipmentInfoDTO   {

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
    private ShipmentStatusType status;
    private String statusDescription;
    private OffsetDateTime statusUpdateTime;

    /**
     * Default constructor.
     */
    public ShipmentInfoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ShipmentInfoDTO.
     *
     * @param id Идентификатор отгрузки.
     * @param planIntervalFrom Начало планового интервала отгрузки.
     * @param planIntervalTo Конец планового интервала отгрузки.
     * @param shipmentType shipmentType
     * @param warehouse warehouse
     * @param warehouseTo warehouseTo
     * @param externalId Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра &#x60;id&#x60;.
     * @param deliveryService deliveryService
     * @param palletsCount palletsCount
     * @param orderIds Идентификаторы заказов в отгрузке.
     * @param draftCount Количество заказов, которое Маркет запланировал к отгрузке.
     * @param plannedCount Количество заказов, которое Маркет подтвердил к отгрузке.
     * @param factCount Количество заказов, принятых в сортировочном центре или пункте приема.
     * @param status status
     * @param statusDescription Описание статуса отгрузки.
     * @param statusUpdateTime Время последнего изменения статуса отгрузки.
     */
    public ShipmentInfoDTO(
        Long id, 
        OffsetDateTime planIntervalFrom, 
        OffsetDateTime planIntervalTo, 
        ShipmentType shipmentType, 
        PartnerShipmentWarehouseDTO warehouse, 
        PartnerShipmentWarehouseDTO warehouseTo, 
        String externalId, 
        DeliveryServiceDTO deliveryService, 
        PalletsCountDTO palletsCount, 
        Set<Long> orderIds, 
        Integer draftCount, 
        Integer plannedCount, 
        Integer factCount, 
        ShipmentStatusType status, 
        String statusDescription, 
        OffsetDateTime statusUpdateTime
    ) {
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
        this.status = status;
        this.statusDescription = statusDescription;
        this.statusUpdateTime = statusUpdateTime;
    }



    /**
     * Идентификатор отгрузки.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Начало планового интервала отгрузки.
     * @return planIntervalFrom
     */
    public OffsetDateTime getPlanIntervalFrom() {
        return planIntervalFrom;
    }

    public void setPlanIntervalFrom(OffsetDateTime planIntervalFrom) {
        this.planIntervalFrom = planIntervalFrom;
    }

    /**
     * Конец планового интервала отгрузки.
     * @return planIntervalTo
     */
    public OffsetDateTime getPlanIntervalTo() {
        return planIntervalTo;
    }

    public void setPlanIntervalTo(OffsetDateTime planIntervalTo) {
        this.planIntervalTo = planIntervalTo;
    }

    /**
     * Get shipmentType
     * @return shipmentType
     */
    public ShipmentType getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(ShipmentType shipmentType) {
        this.shipmentType = shipmentType;
    }

    /**
     * Get warehouse
     * @return warehouse
     */
    public PartnerShipmentWarehouseDTO getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(PartnerShipmentWarehouseDTO warehouse) {
        this.warehouse = warehouse;
    }

    /**
     * Get warehouseTo
     * @return warehouseTo
     */
    public PartnerShipmentWarehouseDTO getWarehouseTo() {
        return warehouseTo;
    }

    public void setWarehouseTo(PartnerShipmentWarehouseDTO warehouseTo) {
        this.warehouseTo = warehouseTo;
    }

    /**
     * Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
     * @return externalId
     */
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * Get deliveryService
     * @return deliveryService
     */
    public DeliveryServiceDTO getDeliveryService() {
        return deliveryService;
    }

    public void setDeliveryService(DeliveryServiceDTO deliveryService) {
        this.deliveryService = deliveryService;
    }

    /**
     * Get palletsCount
     * @return palletsCount
     */
    public PalletsCountDTO getPalletsCount() {
        return palletsCount;
    }

    public void setPalletsCount(PalletsCountDTO palletsCount) {
        this.palletsCount = palletsCount;
    }

    /**
     * Идентификаторы заказов в отгрузке.
     * @return orderIds
     */
    public Set<Long> getOrderIds() {
        return orderIds;
    }

    public void setOrderIds(Set<Long> orderIds) {
        this.orderIds = orderIds;
    }

    /**
     * Количество заказов, которое Маркет запланировал к отгрузке.
     * @return draftCount
     */
    public Integer getDraftCount() {
        return draftCount;
    }

    public void setDraftCount(Integer draftCount) {
        this.draftCount = draftCount;
    }

    /**
     * Количество заказов, которое Маркет подтвердил к отгрузке.
     * @return plannedCount
     */
    public Integer getPlannedCount() {
        return plannedCount;
    }

    public void setPlannedCount(Integer plannedCount) {
        this.plannedCount = plannedCount;
    }

    /**
     * Количество заказов, принятых в сортировочном центре или пункте приема.
     * @return factCount
     */
    public Integer getFactCount() {
        return factCount;
    }

    public void setFactCount(Integer factCount) {
        this.factCount = factCount;
    }

    /**
     * Get status
     * @return status
     */
    public ShipmentStatusType getStatus() {
        return status;
    }

    public void setStatus(ShipmentStatusType status) {
        this.status = status;
    }

    /**
     * Описание статуса отгрузки.
     * @return statusDescription
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    /**
     * Время последнего изменения статуса отгрузки.
     * @return statusUpdateTime
     */
    public OffsetDateTime getStatusUpdateTime() {
        return statusUpdateTime;
    }

    public void setStatusUpdateTime(OffsetDateTime statusUpdateTime) {
        this.statusUpdateTime = statusUpdateTime;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

