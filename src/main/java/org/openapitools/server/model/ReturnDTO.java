package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.LogisticPickupPointDTO;
import org.openapitools.server.model.RecipientType;
import org.openapitools.server.model.RefundStatusType;
import org.openapitools.server.model.ReturnItemDTO;
import org.openapitools.server.model.ReturnShipmentStatusType;
import org.openapitools.server.model.ReturnType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Возврат заказа.
 */
public class ReturnDTO   {

    private Long id;
    private Long orderId;
    private OffsetDateTime creationDate;
    private OffsetDateTime updateDate;
    private RefundStatusType refundStatus;
    private LogisticPickupPointDTO logisticPickupPoint;
    private RecipientType shipmentRecipientType;
    private ReturnShipmentStatusType shipmentStatus;
    private Long refundAmount;
    private List<@Valid ReturnItemDTO> items = new ArrayList<>();
    private ReturnType returnType;
    private Boolean fastReturn;

    /**
     * Default constructor.
     */
    public ReturnDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ReturnDTO.
     *
     * @param id Идентификатор возврата.
     * @param orderId Номер заказа.
     * @param creationDate Дата создания возврата клиентом.
     * @param updateDate Дата обновления возврата.
     * @param refundStatus refundStatus
     * @param logisticPickupPoint logisticPickupPoint
     * @param shipmentRecipientType shipmentRecipientType
     * @param shipmentStatus shipmentStatus
     * @param refundAmount Сумма возврата.
     * @param items Список товаров в возврате.
     * @param returnType returnType
     * @param fastReturn Используется ли опция **Быстрый возврат денег за дешевый брак**. 
     */
    public ReturnDTO(
        Long id, 
        Long orderId, 
        OffsetDateTime creationDate, 
        OffsetDateTime updateDate, 
        RefundStatusType refundStatus, 
        LogisticPickupPointDTO logisticPickupPoint, 
        RecipientType shipmentRecipientType, 
        ReturnShipmentStatusType shipmentStatus, 
        Long refundAmount, 
        List<@Valid ReturnItemDTO> items, 
        ReturnType returnType, 
        Boolean fastReturn
    ) {
        this.id = id;
        this.orderId = orderId;
        this.creationDate = creationDate;
        this.updateDate = updateDate;
        this.refundStatus = refundStatus;
        this.logisticPickupPoint = logisticPickupPoint;
        this.shipmentRecipientType = shipmentRecipientType;
        this.shipmentStatus = shipmentStatus;
        this.refundAmount = refundAmount;
        this.items = items;
        this.returnType = returnType;
        this.fastReturn = fastReturn;
    }



    /**
     * Идентификатор возврата.
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Номер заказа.
     * @return orderId
     */
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * Дата создания возврата клиентом.
     * @return creationDate
     */
    public OffsetDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(OffsetDateTime creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Дата обновления возврата.
     * @return updateDate
     */
    public OffsetDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(OffsetDateTime updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * Get refundStatus
     * @return refundStatus
     */
    public RefundStatusType getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(RefundStatusType refundStatus) {
        this.refundStatus = refundStatus;
    }

    /**
     * Get logisticPickupPoint
     * @return logisticPickupPoint
     */
    public LogisticPickupPointDTO getLogisticPickupPoint() {
        return logisticPickupPoint;
    }

    public void setLogisticPickupPoint(LogisticPickupPointDTO logisticPickupPoint) {
        this.logisticPickupPoint = logisticPickupPoint;
    }

    /**
     * Get shipmentRecipientType
     * @return shipmentRecipientType
     */
    public RecipientType getShipmentRecipientType() {
        return shipmentRecipientType;
    }

    public void setShipmentRecipientType(RecipientType shipmentRecipientType) {
        this.shipmentRecipientType = shipmentRecipientType;
    }

    /**
     * Get shipmentStatus
     * @return shipmentStatus
     */
    public ReturnShipmentStatusType getShipmentStatus() {
        return shipmentStatus;
    }

    public void setShipmentStatus(ReturnShipmentStatusType shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    /**
     * Сумма возврата.
     * @return refundAmount
     */
    public Long getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Long refundAmount) {
        this.refundAmount = refundAmount;
    }

    /**
     * Список товаров в возврате.
     * @return items
     */
    public List<@Valid ReturnItemDTO> getItems() {
        return items;
    }

    public void setItems(List<@Valid ReturnItemDTO> items) {
        this.items = items;
    }

    /**
     * Get returnType
     * @return returnType
     */
    public ReturnType getReturnType() {
        return returnType;
    }

    public void setReturnType(ReturnType returnType) {
        this.returnType = returnType;
    }

    /**
     * Используется ли опция **Быстрый возврат денег за дешевый брак**. 
     * @return fastReturn
     */
    public Boolean getFastReturn() {
        return fastReturn;
    }

    public void setFastReturn(Boolean fastReturn) {
        this.fastReturn = fastReturn;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReturnDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
        sb.append("    refundStatus: ").append(toIndentedString(refundStatus)).append("\n");
        sb.append("    logisticPickupPoint: ").append(toIndentedString(logisticPickupPoint)).append("\n");
        sb.append("    shipmentRecipientType: ").append(toIndentedString(shipmentRecipientType)).append("\n");
        sb.append("    shipmentStatus: ").append(toIndentedString(shipmentStatus)).append("\n");
        sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    returnType: ").append(toIndentedString(returnType)).append("\n");
        sb.append("    fastReturn: ").append(toIndentedString(fastReturn)).append("\n");
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

