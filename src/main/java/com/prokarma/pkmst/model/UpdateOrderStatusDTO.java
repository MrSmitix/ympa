package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.OrderStatusType;
import com.prokarma.pkmst.model.OrderSubstatusType;
import com.prokarma.pkmst.model.OrderUpdateStatusType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Список заказов.
 */
@ApiModel(description = "Список заказов.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOrderStatusDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("status")
  private OrderStatusType status;

  @JsonProperty("substatus")
  private OrderSubstatusType substatus;

  @JsonProperty("updateStatus")
  private OrderUpdateStatusType updateStatus;

  @JsonProperty("errorDetails")
  private String errorDetails;

  public UpdateOrderStatusDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор заказа.
   * @return id
   */
  @ApiModelProperty(value = "Идентификатор заказа.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UpdateOrderStatusDTO status(OrderStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @ApiModelProperty(value = "")
  public OrderStatusType getStatus() {
    return status;
  }

  public void setStatus(OrderStatusType status) {
    this.status = status;
  }

  public UpdateOrderStatusDTO substatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
    return this;
  }

  /**
   * Get substatus
   * @return substatus
   */
  @ApiModelProperty(value = "")
  public OrderSubstatusType getSubstatus() {
    return substatus;
  }

  public void setSubstatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
  }

  public UpdateOrderStatusDTO updateStatus(OrderUpdateStatusType updateStatus) {
    this.updateStatus = updateStatus;
    return this;
  }

  /**
   * Get updateStatus
   * @return updateStatus
   */
  @ApiModelProperty(value = "")
  public OrderUpdateStatusType getUpdateStatus() {
    return updateStatus;
  }

  public void setUpdateStatus(OrderUpdateStatusType updateStatus) {
    this.updateStatus = updateStatus;
  }

  public UpdateOrderStatusDTO errorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. 
   * @return errorDetails
   */
  @ApiModelProperty(value = "Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. ")
  public String getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

