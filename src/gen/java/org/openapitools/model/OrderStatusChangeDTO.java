package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.OrderStatusChangeDeliveryDTO;
import org.openapitools.model.OrderStatusType;
import org.openapitools.model.OrderSubstatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Заказ.
 **/
@ApiModel(description="Заказ.")

public class OrderStatusChangeDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private OrderStatusType status;

  @ApiModelProperty(value = "")
  @Valid
  private OrderSubstatusType substatus;

  @ApiModelProperty(value = "")
  @Valid
  private OrderStatusChangeDeliveryDTO delivery;
 /**
   * Get status
   * @return status
  **/
  @JsonProperty("status")
  @NotNull
  public OrderStatusType getStatus() {
    return status;
  }

  public void setStatus(OrderStatusType status) {
    this.status = status;
  }

  public OrderStatusChangeDTO status(OrderStatusType status) {
    this.status = status;
    return this;
  }

 /**
   * Get substatus
   * @return substatus
  **/
  @JsonProperty("substatus")
  public OrderSubstatusType getSubstatus() {
    return substatus;
  }

  public void setSubstatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
  }

  public OrderStatusChangeDTO substatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
    return this;
  }

 /**
   * Get delivery
   * @return delivery
  **/
  @JsonProperty("delivery")
  public OrderStatusChangeDeliveryDTO getDelivery() {
    return delivery;
  }

  public void setDelivery(OrderStatusChangeDeliveryDTO delivery) {
    this.delivery = delivery;
  }

  public OrderStatusChangeDTO delivery(OrderStatusChangeDeliveryDTO delivery) {
    this.delivery = delivery;
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
    OrderStatusChangeDTO orderStatusChangeDTO = (OrderStatusChangeDTO) o;
    return Objects.equals(this.status, orderStatusChangeDTO.status) &&
        Objects.equals(this.substatus, orderStatusChangeDTO.substatus) &&
        Objects.equals(this.delivery, orderStatusChangeDTO.delivery);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

