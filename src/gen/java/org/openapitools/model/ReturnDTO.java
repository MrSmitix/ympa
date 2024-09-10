package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.openapitools.model.LogisticPickupPointDTO;
import org.openapitools.model.RecipientType;
import org.openapitools.model.RefundStatusType;
import org.openapitools.model.ReturnItemDTO;
import org.openapitools.model.ReturnShipmentStatusType;
import org.openapitools.model.ReturnType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Возврат заказа.
 **/
@ApiModel(description="Возврат заказа.")

public class ReturnDTO  {
  
  @ApiModelProperty(value = "Идентификатор возврата.")
 /**
   * Идентификатор возврата.
  **/
  private Long id;

  @ApiModelProperty(value = "Номер заказа.")
 /**
   * Номер заказа.
  **/
  private Long orderId;

  @ApiModelProperty(value = "Дата создания возврата клиентом.")
 /**
   * Дата создания возврата клиентом.
  **/
  private Date creationDate;

  @ApiModelProperty(value = "Дата обновления возврата.")
 /**
   * Дата обновления возврата.
  **/
  private Date updateDate;

  @ApiModelProperty(value = "")
  private RefundStatusType refundStatus;

  @ApiModelProperty(value = "")
  private LogisticPickupPointDTO logisticPickupPoint;

  @ApiModelProperty(value = "")
  private RecipientType shipmentRecipientType;

  @ApiModelProperty(value = "")
  private ReturnShipmentStatusType shipmentStatus;

  @ApiModelProperty(value = "Сумма возврата.")
 /**
   * Сумма возврата.
  **/
  private Long refundAmount;

  @ApiModelProperty(required = true, value = "Список товаров в возврате.")
 /**
   * Список товаров в возврате.
  **/
  private List<ReturnItemDTO> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  private ReturnType returnType;

  @ApiModelProperty(value = "Используется ли опция **Быстрый возврат денег за дешевый брак**. ")
 /**
   * Используется ли опция **Быстрый возврат денег за дешевый брак**. 
  **/
  private Boolean fastReturn;
 /**
   * Идентификатор возврата.
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ReturnDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Номер заказа.
   * @return orderId
  **/
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public ReturnDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
   * Дата создания возврата клиентом.
   * @return creationDate
  **/
  @JsonProperty("creationDate")
  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public ReturnDTO creationDate(Date creationDate) {
    this.creationDate = creationDate;
    return this;
  }

 /**
   * Дата обновления возврата.
   * @return updateDate
  **/
  @JsonProperty("updateDate")
  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  public ReturnDTO updateDate(Date updateDate) {
    this.updateDate = updateDate;
    return this;
  }

 /**
   * Get refundStatus
   * @return refundStatus
  **/
  @JsonProperty("refundStatus")
  public RefundStatusType getRefundStatus() {
    return refundStatus;
  }

  public void setRefundStatus(RefundStatusType refundStatus) {
    this.refundStatus = refundStatus;
  }

  public ReturnDTO refundStatus(RefundStatusType refundStatus) {
    this.refundStatus = refundStatus;
    return this;
  }

 /**
   * Get logisticPickupPoint
   * @return logisticPickupPoint
  **/
  @JsonProperty("logisticPickupPoint")
  public LogisticPickupPointDTO getLogisticPickupPoint() {
    return logisticPickupPoint;
  }

  public void setLogisticPickupPoint(LogisticPickupPointDTO logisticPickupPoint) {
    this.logisticPickupPoint = logisticPickupPoint;
  }

  public ReturnDTO logisticPickupPoint(LogisticPickupPointDTO logisticPickupPoint) {
    this.logisticPickupPoint = logisticPickupPoint;
    return this;
  }

 /**
   * Get shipmentRecipientType
   * @return shipmentRecipientType
  **/
  @JsonProperty("shipmentRecipientType")
  public RecipientType getShipmentRecipientType() {
    return shipmentRecipientType;
  }

  public void setShipmentRecipientType(RecipientType shipmentRecipientType) {
    this.shipmentRecipientType = shipmentRecipientType;
  }

  public ReturnDTO shipmentRecipientType(RecipientType shipmentRecipientType) {
    this.shipmentRecipientType = shipmentRecipientType;
    return this;
  }

 /**
   * Get shipmentStatus
   * @return shipmentStatus
  **/
  @JsonProperty("shipmentStatus")
  public ReturnShipmentStatusType getShipmentStatus() {
    return shipmentStatus;
  }

  public void setShipmentStatus(ReturnShipmentStatusType shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
  }

  public ReturnDTO shipmentStatus(ReturnShipmentStatusType shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
    return this;
  }

 /**
   * Сумма возврата.
   * @return refundAmount
  **/
  @JsonProperty("refundAmount")
  public Long getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
  }

  public ReturnDTO refundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

 /**
   * Список товаров в возврате.
   * @return items
  **/
  @JsonProperty("items")
  public List<ReturnItemDTO> getItems() {
    return items;
  }

  public void setItems(List<ReturnItemDTO> items) {
    this.items = items;
  }

  public ReturnDTO items(List<ReturnItemDTO> items) {
    this.items = items;
    return this;
  }

  public ReturnDTO addItemsItem(ReturnItemDTO itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
   * Get returnType
   * @return returnType
  **/
  @JsonProperty("returnType")
  public ReturnType getReturnType() {
    return returnType;
  }

  public void setReturnType(ReturnType returnType) {
    this.returnType = returnType;
  }

  public ReturnDTO returnType(ReturnType returnType) {
    this.returnType = returnType;
    return this;
  }

 /**
   * Используется ли опция **Быстрый возврат денег за дешевый брак**. 
   * @return fastReturn
  **/
  @JsonProperty("fastReturn")
  public Boolean getFastReturn() {
    return fastReturn;
  }

  public void setFastReturn(Boolean fastReturn) {
    this.fastReturn = fastReturn;
  }

  public ReturnDTO fastReturn(Boolean fastReturn) {
    this.fastReturn = fastReturn;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

