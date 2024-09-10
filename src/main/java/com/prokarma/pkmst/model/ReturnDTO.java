package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.LogisticPickupPointDTO;
import com.prokarma.pkmst.model.RecipientType;
import com.prokarma.pkmst.model.RefundStatusType;
import com.prokarma.pkmst.model.ReturnItemDTO;
import com.prokarma.pkmst.model.ReturnShipmentStatusType;
import com.prokarma.pkmst.model.ReturnType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Возврат заказа.
 */
@ApiModel(description = "Возврат заказа.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReturnDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("orderId")
  private Long orderId;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate;

  @JsonProperty("updateDate")
  private OffsetDateTime updateDate;

  @JsonProperty("refundStatus")
  private RefundStatusType refundStatus;

  @JsonProperty("logisticPickupPoint")
  private LogisticPickupPointDTO logisticPickupPoint;

  @JsonProperty("shipmentRecipientType")
  private RecipientType shipmentRecipientType;

  @JsonProperty("shipmentStatus")
  private ReturnShipmentStatusType shipmentStatus;

  @JsonProperty("refundAmount")
  private Long refundAmount;

  @JsonProperty("items")
  
  private List<ReturnItemDTO> items = new ArrayList<>();

  @JsonProperty("returnType")
  private ReturnType returnType;

  @JsonProperty("fastReturn")
  private Boolean fastReturn;

  public ReturnDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор возврата.
   * @return id
   */
  @ApiModelProperty(value = "Идентификатор возврата.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ReturnDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Номер заказа.
   * @return orderId
   */
  @ApiModelProperty(value = "Номер заказа.")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public ReturnDTO creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Дата создания возврата клиентом.
   * @return creationDate
   */
  @ApiModelProperty(value = "Дата создания возврата клиентом.")
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ReturnDTO updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Дата обновления возврата.
   * @return updateDate
   */
  @ApiModelProperty(value = "Дата обновления возврата.")
  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }

  public ReturnDTO refundStatus(RefundStatusType refundStatus) {
    this.refundStatus = refundStatus;
    return this;
  }

  /**
   * Get refundStatus
   * @return refundStatus
   */
  @ApiModelProperty(value = "")
  public RefundStatusType getRefundStatus() {
    return refundStatus;
  }

  public void setRefundStatus(RefundStatusType refundStatus) {
    this.refundStatus = refundStatus;
  }

  public ReturnDTO logisticPickupPoint(LogisticPickupPointDTO logisticPickupPoint) {
    this.logisticPickupPoint = logisticPickupPoint;
    return this;
  }

  /**
   * Get logisticPickupPoint
   * @return logisticPickupPoint
   */
  @ApiModelProperty(value = "")
  public LogisticPickupPointDTO getLogisticPickupPoint() {
    return logisticPickupPoint;
  }

  public void setLogisticPickupPoint(LogisticPickupPointDTO logisticPickupPoint) {
    this.logisticPickupPoint = logisticPickupPoint;
  }

  public ReturnDTO shipmentRecipientType(RecipientType shipmentRecipientType) {
    this.shipmentRecipientType = shipmentRecipientType;
    return this;
  }

  /**
   * Get shipmentRecipientType
   * @return shipmentRecipientType
   */
  @ApiModelProperty(value = "")
  public RecipientType getShipmentRecipientType() {
    return shipmentRecipientType;
  }

  public void setShipmentRecipientType(RecipientType shipmentRecipientType) {
    this.shipmentRecipientType = shipmentRecipientType;
  }

  public ReturnDTO shipmentStatus(ReturnShipmentStatusType shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
    return this;
  }

  /**
   * Get shipmentStatus
   * @return shipmentStatus
   */
  @ApiModelProperty(value = "")
  public ReturnShipmentStatusType getShipmentStatus() {
    return shipmentStatus;
  }

  public void setShipmentStatus(ReturnShipmentStatusType shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
  }

  public ReturnDTO refundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

  /**
   * Сумма возврата.
   * @return refundAmount
   */
  @ApiModelProperty(value = "Сумма возврата.")
  public Long getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
  }

  public ReturnDTO items(List<ReturnItemDTO> items) {
    this.items = items;
    return this;
  }

  public ReturnDTO addItemsItem(ReturnItemDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список товаров в возврате.
   * @return items
   */
  @ApiModelProperty(required = true, value = "Список товаров в возврате.")
  public List<ReturnItemDTO> getItems() {
    return items;
  }

  public void setItems(List<ReturnItemDTO> items) {
    this.items = items;
  }

  public ReturnDTO returnType(ReturnType returnType) {
    this.returnType = returnType;
    return this;
  }

  /**
   * Get returnType
   * @return returnType
   */
  @ApiModelProperty(value = "")
  public ReturnType getReturnType() {
    return returnType;
  }

  public void setReturnType(ReturnType returnType) {
    this.returnType = returnType;
  }

  public ReturnDTO fastReturn(Boolean fastReturn) {
    this.fastReturn = fastReturn;
    return this;
  }

  /**
   * Используется ли опция **Быстрый возврат денег за дешевый брак**. 
   * @return fastReturn
   */
  @ApiModelProperty(value = "Используется ли опция **Быстрый возврат денег за дешевый брак**. ")
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
    return Objects.equals(this.id, returnDTO.id) &&
        Objects.equals(this.orderId, returnDTO.orderId) &&
        Objects.equals(this.creationDate, returnDTO.creationDate) &&
        Objects.equals(this.updateDate, returnDTO.updateDate) &&
        Objects.equals(this.refundStatus, returnDTO.refundStatus) &&
        Objects.equals(this.logisticPickupPoint, returnDTO.logisticPickupPoint) &&
        Objects.equals(this.shipmentRecipientType, returnDTO.shipmentRecipientType) &&
        Objects.equals(this.shipmentStatus, returnDTO.shipmentStatus) &&
        Objects.equals(this.refundAmount, returnDTO.refundAmount) &&
        Objects.equals(this.items, returnDTO.items) &&
        Objects.equals(this.returnType, returnDTO.returnType) &&
        Objects.equals(this.fastReturn, returnDTO.fastReturn);
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

