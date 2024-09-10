package apimodels;

import apimodels.LogisticPickupPointDTO;
import apimodels.RecipientType;
import apimodels.RefundStatusType;
import apimodels.ReturnItemDTO;
import apimodels.ReturnShipmentStatusType;
import apimodels.ReturnType;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Возврат заказа.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ReturnDTO   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("orderId")
  
  private Long orderId;

  @JsonProperty("creationDate")
  @Valid

  private OffsetDateTime creationDate;

  @JsonProperty("updateDate")
  @Valid

  private OffsetDateTime updateDate;

  @JsonProperty("refundStatus")
  @Valid

  private RefundStatusType refundStatus;

  @JsonProperty("logisticPickupPoint")
  @Valid

  private LogisticPickupPointDTO logisticPickupPoint;

  @JsonProperty("shipmentRecipientType")
  @Valid

  private RecipientType shipmentRecipientType;

  @JsonProperty("shipmentStatus")
  @Valid

  private ReturnShipmentStatusType shipmentStatus;

  @JsonProperty("refundAmount")
  
  private Long refundAmount;

  @JsonProperty("items")
  @NotNull
@Valid

  private List<@Valid ReturnItemDTO> items = new ArrayList<>();

  @JsonProperty("returnType")
  @Valid

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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
  public Long getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
  }

  public ReturnDTO items(List<@Valid ReturnItemDTO> items) {
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
  **/
  public List<@Valid ReturnItemDTO> getItems() {
    return items;
  }

  public void setItems(List<@Valid ReturnItemDTO> items) {
    this.items = items;
  }

  public ReturnDTO returnType(ReturnType returnType) {
    this.returnType = returnType;
    return this;
  }

   /**
   * Get returnType
   * @return returnType
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

