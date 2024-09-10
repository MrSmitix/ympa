package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OrderStatusType;
import org.openapitools.model.OrderSubstatusType;
import org.openapitools.model.OrderUpdateStatusType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список заказов.
 */

@Schema(name = "UpdateOrderStatusDTO", description = "Список заказов.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOrderStatusDTO {

  private Long id;

  private OrderStatusType status;

  private OrderSubstatusType substatus;

  private OrderUpdateStatusType updateStatus;

  private String errorDetails;

  public UpdateOrderStatusDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор заказа.
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор заказа.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
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
  @Valid 
  @Schema(name = "substatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("substatus")
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
  @Valid 
  @Schema(name = "updateStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateStatus")
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
  
  @Schema(name = "errorDetails", description = "Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

