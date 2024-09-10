package apimodels;

import apimodels.OrderStatusChangeDeliveryDTO;
import apimodels.OrderStatusType;
import apimodels.OrderSubstatusType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Заказ.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderStatusChangeDTO   {
  @JsonProperty("status")
  @NotNull
@Valid

  private OrderStatusType status;

  @JsonProperty("substatus")
  @Valid

  private OrderSubstatusType substatus;

  @JsonProperty("delivery")
  @Valid

  private OrderStatusChangeDeliveryDTO delivery;

  public OrderStatusChangeDTO status(OrderStatusType status) {
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

  public OrderStatusChangeDTO substatus(OrderSubstatusType substatus) {
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

  public OrderStatusChangeDTO delivery(OrderStatusChangeDeliveryDTO delivery) {
    this.delivery = delivery;
    return this;
  }

   /**
   * Get delivery
   * @return delivery
  **/
  public OrderStatusChangeDeliveryDTO getDelivery() {
    return delivery;
  }

  public void setDelivery(OrderStatusChangeDeliveryDTO delivery) {
    this.delivery = delivery;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStatusChangeDTO orderStatusChangeDTO = (OrderStatusChangeDTO) o;
    return Objects.equals(status, orderStatusChangeDTO.status) &&
        Objects.equals(substatus, orderStatusChangeDTO.substatus) &&
        Objects.equals(delivery, orderStatusChangeDTO.delivery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, substatus, delivery);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatusChangeDTO {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    substatus: ").append(toIndentedString(substatus)).append("\n");
    sb.append("    delivery: ").append(toIndentedString(delivery)).append("\n");
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

