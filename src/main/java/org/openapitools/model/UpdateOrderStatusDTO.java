/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderStatusType;
import org.openapitools.model.OrderSubstatusType;
import org.openapitools.model.OrderUpdateStatusType;



/**
 * Список заказов.
 */

@ApiModel(description = "Список заказов.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOrderStatusDTO   {
  
  private Long id;
  private OrderStatusType status;
  private OrderSubstatusType substatus;
  private OrderUpdateStatusType updateStatus;
  private String errorDetails;

  /**
   * Идентификатор заказа.
   */
  public UpdateOrderStatusDTO id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор заказа.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   */
  public UpdateOrderStatusDTO status(OrderStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public OrderStatusType getStatus() {
    return status;
  }
  public void setStatus(OrderStatusType status) {
    this.status = status;
  }

  /**
   */
  public UpdateOrderStatusDTO substatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("substatus")
  public OrderSubstatusType getSubstatus() {
    return substatus;
  }
  public void setSubstatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
  }

  /**
   */
  public UpdateOrderStatusDTO updateStatus(OrderUpdateStatusType updateStatus) {
    this.updateStatus = updateStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("updateStatus")
  public OrderUpdateStatusType getUpdateStatus() {
    return updateStatus;
  }
  public void setUpdateStatus(OrderUpdateStatusType updateStatus) {
    this.updateStatus = updateStatus;
  }

  /**
   * Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. 
   */
  public UpdateOrderStatusDTO errorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  
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
    return Objects.equals(id, updateOrderStatusDTO.id) &&
        Objects.equals(status, updateOrderStatusDTO.status) &&
        Objects.equals(substatus, updateOrderStatusDTO.substatus) &&
        Objects.equals(updateStatus, updateOrderStatusDTO.updateStatus) &&
        Objects.equals(errorDetails, updateOrderStatusDTO.errorDetails);
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

