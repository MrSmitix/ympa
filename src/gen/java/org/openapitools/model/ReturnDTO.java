package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.LogisticPickupPointDTO;
import org.openapitools.model.RecipientType;
import org.openapitools.model.RefundStatusType;
import org.openapitools.model.ReturnItemDTO;
import org.openapitools.model.ReturnShipmentStatusType;
import org.openapitools.model.ReturnType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Возврат заказа.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Возврат заказа.")
public class ReturnDTO   {
  
  private Long id;

  private Long orderId;

  private java.util.Date creationDate;

  private java.util.Date updateDate;

  private RefundStatusType refundStatus;

  private LogisticPickupPointDTO logisticPickupPoint;

  private RecipientType shipmentRecipientType;

  private ReturnShipmentStatusType shipmentStatus;

  private Long refundAmount;

  private List<@Valid ReturnItemDTO> items = new ArrayList<>();

  private ReturnType returnType;

  private Boolean fastReturn;

  /**
   * Идентификатор возврата.
   **/
  public ReturnDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор возврата.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }


  /**
   * Номер заказа.
   **/
  public ReturnDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  
  @ApiModelProperty(value = "Номер заказа.")
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  /**
   * Дата создания возврата клиентом.
   **/
  public ReturnDTO creationDate(java.util.Date creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  
  @ApiModelProperty(value = "Дата создания возврата клиентом.")
  @JsonProperty("creationDate")
  public java.util.Date getCreationDate() {
    return creationDate;
  }
  public void setCreationDate(java.util.Date creationDate) {
    this.creationDate = creationDate;
  }


  /**
   * Дата обновления возврата.
   **/
  public ReturnDTO updateDate(java.util.Date updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  
  @ApiModelProperty(value = "Дата обновления возврата.")
  @JsonProperty("updateDate")
  public java.util.Date getUpdateDate() {
    return updateDate;
  }
  public void setUpdateDate(java.util.Date updateDate) {
    this.updateDate = updateDate;
  }


  /**
   **/
  public ReturnDTO refundStatus(RefundStatusType refundStatus) {
    this.refundStatus = refundStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("refundStatus")
  public RefundStatusType getRefundStatus() {
    return refundStatus;
  }
  public void setRefundStatus(RefundStatusType refundStatus) {
    this.refundStatus = refundStatus;
  }


  /**
   **/
  public ReturnDTO logisticPickupPoint(LogisticPickupPointDTO logisticPickupPoint) {
    this.logisticPickupPoint = logisticPickupPoint;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("logisticPickupPoint")
  public LogisticPickupPointDTO getLogisticPickupPoint() {
    return logisticPickupPoint;
  }
  public void setLogisticPickupPoint(LogisticPickupPointDTO logisticPickupPoint) {
    this.logisticPickupPoint = logisticPickupPoint;
  }


  /**
   **/
  public ReturnDTO shipmentRecipientType(RecipientType shipmentRecipientType) {
    this.shipmentRecipientType = shipmentRecipientType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("shipmentRecipientType")
  public RecipientType getShipmentRecipientType() {
    return shipmentRecipientType;
  }
  public void setShipmentRecipientType(RecipientType shipmentRecipientType) {
    this.shipmentRecipientType = shipmentRecipientType;
  }


  /**
   **/
  public ReturnDTO shipmentStatus(ReturnShipmentStatusType shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("shipmentStatus")
  public ReturnShipmentStatusType getShipmentStatus() {
    return shipmentStatus;
  }
  public void setShipmentStatus(ReturnShipmentStatusType shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
  }


  /**
   * Сумма возврата.
   **/
  public ReturnDTO refundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

  
  @ApiModelProperty(value = "Сумма возврата.")
  @JsonProperty("refundAmount")
  public Long getRefundAmount() {
    return refundAmount;
  }
  public void setRefundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
  }


  /**
   * Список товаров в возврате.
   **/
  public ReturnDTO items(List<@Valid ReturnItemDTO> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров в возврате.")
  @JsonProperty("items")
  @NotNull
  public List<@Valid ReturnItemDTO> getItems() {
    return items;
  }
  public void setItems(List<@Valid ReturnItemDTO> items) {
    this.items = items;
  }

  public ReturnDTO addItemsItem(ReturnItemDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }


  /**
   **/
  public ReturnDTO returnType(ReturnType returnType) {
    this.returnType = returnType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("returnType")
  public ReturnType getReturnType() {
    return returnType;
  }
  public void setReturnType(ReturnType returnType) {
    this.returnType = returnType;
  }


  /**
   * Используется ли опция **Быстрый возврат денег за дешевый брак**. 
   **/
  public ReturnDTO fastReturn(Boolean fastReturn) {
    this.fastReturn = fastReturn;
    return this;
  }

  
  @ApiModelProperty(value = "Используется ли опция **Быстрый возврат денег за дешевый брак**. ")
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

