package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.OrderStatusChangeDeliveryDTO;
import org.openapitools.server.api.model.OrderStatusType;
import org.openapitools.server.api.model.OrderSubstatusType;

/**
 * Заказ.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderStatusChangeDTO   {
  
  private OrderStatusType status;
  private OrderSubstatusType substatus;
  private OrderStatusChangeDeliveryDTO delivery;

  public OrderStatusChangeDTO () {

  }

  public OrderStatusChangeDTO (OrderStatusType status, OrderSubstatusType substatus, OrderStatusChangeDeliveryDTO delivery) {
    this.status = status;
    this.substatus = substatus;
    this.delivery = delivery;
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

    
  @JsonProperty("delivery")
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
