package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.OrderStatusType;
import org.openapitools.model.OrderSubstatusType;
import org.openapitools.model.OrderUpdateStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список заказов.
 */
@ApiModel(description="Список заказов.")

public class UpdateOrderStatusDTO  {
  
 /**
  * Идентификатор заказа.
  */
  @ApiModelProperty(value = "Идентификатор заказа.")
  private Long id;

  @ApiModelProperty(value = "")
  @Valid
  private OrderStatusType status;

  @ApiModelProperty(value = "")
  @Valid
  private OrderSubstatusType substatus;

  @ApiModelProperty(value = "")
  @Valid
  private OrderUpdateStatusType updateStatus;

 /**
  * Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. 
  */
  @ApiModelProperty(value = "Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. ")
  private String errorDetails;
 /**
  * Идентификатор заказа.
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
  public UpdateOrderStatusDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public OrderStatusType getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(OrderStatusType status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public UpdateOrderStatusDTO status(OrderStatusType status) {
    this.status = status;
    return this;
  }

 /**
  * Get substatus
  * @return substatus
  */
  @JsonProperty("substatus")
  public OrderSubstatusType getSubstatus() {
    return substatus;
  }

  /**
   * Sets the <code>substatus</code> property.
   */
 public void setSubstatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
  }

  /**
   * Sets the <code>substatus</code> property.
   */
  public UpdateOrderStatusDTO substatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
    return this;
  }

 /**
  * Get updateStatus
  * @return updateStatus
  */
  @JsonProperty("updateStatus")
  public OrderUpdateStatusType getUpdateStatus() {
    return updateStatus;
  }

  /**
   * Sets the <code>updateStatus</code> property.
   */
 public void setUpdateStatus(OrderUpdateStatusType updateStatus) {
    this.updateStatus = updateStatus;
  }

  /**
   * Sets the <code>updateStatus</code> property.
   */
  public UpdateOrderStatusDTO updateStatus(OrderUpdateStatusType updateStatus) {
    this.updateStatus = updateStatus;
    return this;
  }

 /**
  * Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;. 
  * @return errorDetails
  */
  @JsonProperty("errorDetails")
  public String getErrorDetails() {
    return errorDetails;
  }

  /**
   * Sets the <code>errorDetails</code> property.
   */
 public void setErrorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
  }

  /**
   * Sets the <code>errorDetails</code> property.
   */
  public UpdateOrderStatusDTO errorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
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
    UpdateOrderStatusDTO updateOrderStatusDTO = (UpdateOrderStatusDTO) o;
    return Objects.equals(this.id, updateOrderStatusDTO.id) &&
        Objects.equals(this.status, updateOrderStatusDTO.status) &&
        Objects.equals(this.substatus, updateOrderStatusDTO.substatus) &&
        Objects.equals(this.updateStatus, updateOrderStatusDTO.updateStatus) &&
        Objects.equals(this.errorDetails, updateOrderStatusDTO.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, substatus, updateStatus, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderStatusDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    substatus: ").append(toIndentedString(substatus)).append("\n");
    sb.append("    updateStatus: ").append(toIndentedString(updateStatus)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

