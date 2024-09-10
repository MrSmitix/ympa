package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.OrderStatusType;
import org.openapitools.vertxweb.server.model.OrderSubstatusType;
import org.openapitools.vertxweb.server.model.OrderUpdateStatusType;

/**
 * Список заказов.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateOrderStatusDTO   {
  
  private Long id;
  private OrderStatusType status;
  private OrderSubstatusType substatus;
  private OrderUpdateStatusType updateStatus;
  private String errorDetails;

  public UpdateOrderStatusDTO () {

  }

  public UpdateOrderStatusDTO (Long id, OrderStatusType status, OrderSubstatusType substatus, OrderUpdateStatusType updateStatus, String errorDetails) {
    this.id = id;
    this.status = status;
    this.substatus = substatus;
    this.updateStatus = updateStatus;
    this.errorDetails = errorDetails;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("status")
  public OrderStatusType getStatus() {
    return status;
  }
  public void setStatus(OrderStatusType status) {
    this.status = status;
  }

    
  @JsonProperty("substatus")
  public OrderSubstatusType getSubstatus() {
    return substatus;
  }
  public void setSubstatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
  }

    
  @JsonProperty("updateStatus")
  public OrderUpdateStatusType getUpdateStatus() {
    return updateStatus;
  }
  public void setUpdateStatus(OrderUpdateStatusType updateStatus) {
    this.updateStatus = updateStatus;
  }

    
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
