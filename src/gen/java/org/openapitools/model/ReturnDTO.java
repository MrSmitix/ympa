package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Возврат заказа.
 */
@ApiModel(description="Возврат заказа.")

public class ReturnDTO  {
  
 /**
  * Идентификатор возврата.
  */
  @ApiModelProperty(value = "Идентификатор возврата.")
  private Long id;

 /**
  * Номер заказа.
  */
  @ApiModelProperty(value = "Номер заказа.")
  private Long orderId;

 /**
  * Дата создания возврата клиентом.
  */
  @ApiModelProperty(value = "Дата создания возврата клиентом.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date creationDate;

 /**
  * Дата обновления возврата.
  */
  @ApiModelProperty(value = "Дата обновления возврата.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date updateDate;

  @ApiModelProperty(value = "")
  @Valid
  private RefundStatusType refundStatus;

  @ApiModelProperty(value = "")
  @Valid
  private LogisticPickupPointDTO logisticPickupPoint;

  @ApiModelProperty(value = "")
  @Valid
  private RecipientType shipmentRecipientType;

  @ApiModelProperty(value = "")
  @Valid
  private ReturnShipmentStatusType shipmentStatus;

 /**
  * Сумма возврата.
  */
  @ApiModelProperty(value = "Сумма возврата.")
  private Long refundAmount;

 /**
  * Список товаров в возврате.
  */
  @ApiModelProperty(required = true, value = "Список товаров в возврате.")
  @Valid
  private List<@Valid ReturnItemDTO> items = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private ReturnType returnType;

 /**
  * Используется ли опция **Быстрый возврат денег за дешевый брак**. 
  */
  @ApiModelProperty(value = "Используется ли опция **Быстрый возврат денег за дешевый брак**. ")
  private Boolean fastReturn;
 /**
  * Идентификатор возврата.
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
  public ReturnDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Номер заказа.
  * @return orderId
  */
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }

  /**
   * Sets the <code>orderId</code> property.
   */
 public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  /**
   * Sets the <code>orderId</code> property.
   */
  public ReturnDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
  * Дата создания возврата клиентом.
  * @return creationDate
  */
  @JsonProperty("creationDate")
  public Date getCreationDate() {
    return creationDate;
  }

  /**
   * Sets the <code>creationDate</code> property.
   */
 public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * Sets the <code>creationDate</code> property.
   */
  public ReturnDTO creationDate(Date creationDate) {
    this.creationDate = creationDate;
    return this;
  }

 /**
  * Дата обновления возврата.
  * @return updateDate
  */
  @JsonProperty("updateDate")
  public Date getUpdateDate() {
    return updateDate;
  }

  /**
   * Sets the <code>updateDate</code> property.
   */
 public void setUpdateDate(Date updateDate) {
    this.updateDate = updateDate;
  }

  /**
   * Sets the <code>updateDate</code> property.
   */
  public ReturnDTO updateDate(Date updateDate) {
    this.updateDate = updateDate;
    return this;
  }

 /**
  * Get refundStatus
  * @return refundStatus
  */
  @JsonProperty("refundStatus")
  public RefundStatusType getRefundStatus() {
    return refundStatus;
  }

  /**
   * Sets the <code>refundStatus</code> property.
   */
 public void setRefundStatus(RefundStatusType refundStatus) {
    this.refundStatus = refundStatus;
  }

  /**
   * Sets the <code>refundStatus</code> property.
   */
  public ReturnDTO refundStatus(RefundStatusType refundStatus) {
    this.refundStatus = refundStatus;
    return this;
  }

 /**
  * Get logisticPickupPoint
  * @return logisticPickupPoint
  */
  @JsonProperty("logisticPickupPoint")
  public LogisticPickupPointDTO getLogisticPickupPoint() {
    return logisticPickupPoint;
  }

  /**
   * Sets the <code>logisticPickupPoint</code> property.
   */
 public void setLogisticPickupPoint(LogisticPickupPointDTO logisticPickupPoint) {
    this.logisticPickupPoint = logisticPickupPoint;
  }

  /**
   * Sets the <code>logisticPickupPoint</code> property.
   */
  public ReturnDTO logisticPickupPoint(LogisticPickupPointDTO logisticPickupPoint) {
    this.logisticPickupPoint = logisticPickupPoint;
    return this;
  }

 /**
  * Get shipmentRecipientType
  * @return shipmentRecipientType
  */
  @JsonProperty("shipmentRecipientType")
  public RecipientType getShipmentRecipientType() {
    return shipmentRecipientType;
  }

  /**
   * Sets the <code>shipmentRecipientType</code> property.
   */
 public void setShipmentRecipientType(RecipientType shipmentRecipientType) {
    this.shipmentRecipientType = shipmentRecipientType;
  }

  /**
   * Sets the <code>shipmentRecipientType</code> property.
   */
  public ReturnDTO shipmentRecipientType(RecipientType shipmentRecipientType) {
    this.shipmentRecipientType = shipmentRecipientType;
    return this;
  }

 /**
  * Get shipmentStatus
  * @return shipmentStatus
  */
  @JsonProperty("shipmentStatus")
  public ReturnShipmentStatusType getShipmentStatus() {
    return shipmentStatus;
  }

  /**
   * Sets the <code>shipmentStatus</code> property.
   */
 public void setShipmentStatus(ReturnShipmentStatusType shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
  }

  /**
   * Sets the <code>shipmentStatus</code> property.
   */
  public ReturnDTO shipmentStatus(ReturnShipmentStatusType shipmentStatus) {
    this.shipmentStatus = shipmentStatus;
    return this;
  }

 /**
  * Сумма возврата.
  * @return refundAmount
  */
  @JsonProperty("refundAmount")
  public Long getRefundAmount() {
    return refundAmount;
  }

  /**
   * Sets the <code>refundAmount</code> property.
   */
 public void setRefundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
  }

  /**
   * Sets the <code>refundAmount</code> property.
   */
  public ReturnDTO refundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

 /**
  * Список товаров в возврате.
  * @return items
  */
  @JsonProperty("items")
  @NotNull
  public List<@Valid ReturnItemDTO> getItems() {
    return items;
  }

  /**
   * Sets the <code>items</code> property.
   */
 public void setItems(List<@Valid ReturnItemDTO> items) {
    this.items = items;
  }

  /**
   * Sets the <code>items</code> property.
   */
  public ReturnDTO items(List<@Valid ReturnItemDTO> items) {
    this.items = items;
    return this;
  }

  /**
   * Adds a new item to the <code>items</code> list.
   */
  public ReturnDTO addItemsItem(ReturnItemDTO itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

 /**
  * Get returnType
  * @return returnType
  */
  @JsonProperty("returnType")
  public ReturnType getReturnType() {
    return returnType;
  }

  /**
   * Sets the <code>returnType</code> property.
   */
 public void setReturnType(ReturnType returnType) {
    this.returnType = returnType;
  }

  /**
   * Sets the <code>returnType</code> property.
   */
  public ReturnDTO returnType(ReturnType returnType) {
    this.returnType = returnType;
    return this;
  }

 /**
  * Используется ли опция **Быстрый возврат денег за дешевый брак**. 
  * @return fastReturn
  */
  @JsonProperty("fastReturn")
  public Boolean getFastReturn() {
    return fastReturn;
  }

  /**
   * Sets the <code>fastReturn</code> property.
   */
 public void setFastReturn(Boolean fastReturn) {
    this.fastReturn = fastReturn;
  }

  /**
   * Sets the <code>fastReturn</code> property.
   */
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

