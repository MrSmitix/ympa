package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Возврат заказа.
 */

@Schema(name = "ReturnDTO", description = "Возврат заказа.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReturnDTO {

  private Long id;

  private Long orderId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date creationDate;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date updateDate;

  private RefundStatusType refundStatus;

  private LogisticPickupPointDTO logisticPickupPoint;

  private RecipientType shipmentRecipientType;

  private ReturnShipmentStatusType shipmentStatus;

  private Long refundAmount;

  @Valid
  private List<@Valid ReturnItemDTO> items = new ArrayList<>();

  private ReturnType returnType;

  private Boolean fastReturn;

  public ReturnDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ReturnDTO(List<@Valid ReturnItemDTO> items) {
    this.items = items;
  }

  public ReturnDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор возврата.
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор возврата.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
  
  @Schema(name = "orderId", description = "Номер заказа.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public ReturnDTO creationDate(Date creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Дата создания возврата клиентом.
   * @return creationDate
   */
  @Valid 
  @Schema(name = "creationDate", description = "Дата создания возврата клиентом.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("creationDate")
  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public ReturnDTO updateDate(Date updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Дата обновления возврата.
   * @return updateDate
   */
  @Valid 
  @Schema(name = "updateDate", description = "Дата обновления возврата.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateDate")
  public Date getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(Date updateDate) {
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
  @Valid 
  @Schema(name = "refundStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refundStatus")
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
  @Valid 
  @Schema(name = "logisticPickupPoint", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("logisticPickupPoint")
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
  @Valid 
  @Schema(name = "shipmentRecipientType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipmentRecipientType")
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
  @Valid 
  @Schema(name = "shipmentStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shipmentStatus")
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
  
  @Schema(name = "refundAmount", description = "Сумма возврата.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("refundAmount")
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
   */
  @NotNull @Valid 
  @Schema(name = "items", description = "Список товаров в возврате.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
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
   */
  @Valid 
  @Schema(name = "returnType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("returnType")
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
  
  @Schema(name = "fastReturn", description = "Используется ли опция **Быстрый возврат денег за дешевый брак**. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

