package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.LogisticPickupPointDTO;
import org.openapitools.server.api.model.RecipientType;
import org.openapitools.server.api.model.RefundStatusType;
import org.openapitools.server.api.model.ReturnItemDTO;
import org.openapitools.server.api.model.ReturnShipmentStatusType;
import org.openapitools.server.api.model.ReturnType;

/**
 * Возврат заказа.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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
  private List<ReturnItemDTO> items = new ArrayList<>();
  private ReturnType returnType;
  private Boolean fastReturn;

  public ReturnDTO () {

  }

  public ReturnDTO (Long id, Long orderId, OffsetDateTime creationDate, OffsetDateTime updateDate, RefundStatusType refundStatus, LogisticPickupPointDTO logisticPickupPoint, RecipientType shipmentRecipientType, ReturnShipmentStatusType shipmentStatus, Long refundAmount, List<ReturnItemDTO> items, ReturnType returnType, Boolean fastReturn) {
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

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

    
  @JsonProperty("creationDate")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

    
  @JsonProperty("updateDate")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }
  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }

    
  @JsonProperty("refundStatus")
  public RefundStatusType getRefundStatus() {
    return refundStatus;
  }
  public void setRefundStatus(RefundStatusType refundStatus) {
    this.refundStatus = refundStatus;
  }

    
  @JsonProperty("logisticPickupPoint")
  public LogisticPickupPointDTO getLogisticPickupPoint() {
    return logisticPickupPoint;
  }
  public void setLogisticPickupPoint(LogisticPickupPointDTO logisticPickupPoint) {
    this.logisticPickupPoint = logisticPickupPoint;
  }

    
  @JsonProperty("shipmentRecipientType")
  public RecipientType getShipmentRecipientType() {
    return shipmentRecipientType;
  }
  public void setShipmentRecipientType(RecipientType shipmentRecipientType) {
    this.shipmentRecipientType = shipmentRecipientType;
  }

    
  @JsonProperty("shipmentStatus")
  public ReturnShipmentStatusType getShipmentStatus() {
    return shipmentStatus;
  }
  public void setShipmentStatus(ReturnShipmentStatusType shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
  }

    
  @JsonProperty("refundAmount")
  public Long getRefundAmount() {
    return refundAmount;
  }
  public void setRefundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
  }

    
  @JsonProperty("items")
  public List<ReturnItemDTO> getItems() {
    return items;
  }
  public void setItems(List<ReturnItemDTO> items) {
    this.items = items;
  }

    
  @JsonProperty("returnType")
  public ReturnType getReturnType() {
    return returnType;
  }
  public void setReturnType(ReturnType returnType) {
    this.returnType = returnType;
  }

    
  @JsonProperty("fastReturn")
  public Boolean getFastReturn() {
    return fastReturn;
  }
  public void setFastReturn(Boolean fastReturn) {
    this.fastReturn = fastReturn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReturnDTO returnDTO = (ReturnDTO) o;
    return Objects.equals(id, returnDTO.id) &&
        Objects.equals(orderId, returnDTO.orderId) &&
        Objects.equals(creationDate, returnDTO.creationDate) &&
        Objects.equals(updateDate, returnDTO.updateDate) &&
        Objects.equals(refundStatus, returnDTO.refundStatus) &&
        Objects.equals(logisticPickupPoint, returnDTO.logisticPickupPoint) &&
        Objects.equals(shipmentRecipientType, returnDTO.shipmentRecipientType) &&
        Objects.equals(shipmentStatus, returnDTO.shipmentStatus) &&
        Objects.equals(refundAmount, returnDTO.refundAmount) &&
        Objects.equals(items, returnDTO.items) &&
        Objects.equals(returnType, returnDTO.returnType) &&
        Objects.equals(fastReturn, returnDTO.fastReturn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, orderId, creationDate, updateDate, refundStatus, logisticPickupPoint, shipmentRecipientType, shipmentStatus, refundAmount, items, returnType, fastReturn);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
