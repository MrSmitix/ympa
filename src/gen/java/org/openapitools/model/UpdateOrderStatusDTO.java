package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderStatusType;
import org.openapitools.model.OrderSubstatusType;
import org.openapitools.model.OrderUpdateStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Список заказов.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOrderStatusDTO   {
  
  private Long id;
  private OrderStatusType status;
  private OrderSubstatusType substatus;
  private OrderUpdateStatusType updateStatus;
  private String errorDetails;

  /**
   * Идентификатор заказа.
   **/
  
  @ApiModelProperty(value = "Идентификатор заказа.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  @Valid
  public OrderStatusType getStatus() {
    return status;
  }
  public void setStatus(OrderStatusType status) {
    this.status = status;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("substatus")
  @Valid
  public OrderSubstatusType getSubstatus() {
    return substatus;
  }
  public void setSubstatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("updateStatus")
  @Valid
  public OrderUpdateStatusType getUpdateStatus() {
    return updateStatus;
  }
  public void setUpdateStatus(OrderUpdateStatusType updateStatus) {
    this.updateStatus = updateStatus;
  }

  /**
   * Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;. 
   **/
  
  @ApiModelProperty(value = "Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. ")
  @JsonProperty("errorDetails")
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

