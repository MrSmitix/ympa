package apimodels;

import apimodels.OrderStatusType;
import apimodels.OrderSubstatusType;
import apimodels.OrderUpdateStatusType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Список заказов.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdateOrderStatusDTO   {
  @JsonProperty("id")
  
  private Long id;

  @JsonProperty("status")
  @Valid

  private OrderStatusType status;

  @JsonProperty("substatus")
  @Valid

  private OrderSubstatusType substatus;

  @JsonProperty("updateStatus")
  @Valid

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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

