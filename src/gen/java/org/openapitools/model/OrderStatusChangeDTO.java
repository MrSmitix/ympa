package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderStatusChangeDeliveryDTO;
import org.openapitools.model.OrderStatusType;
import org.openapitools.model.OrderSubstatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Заказ.
 **/
@ApiModel(description = "Заказ.")
@JsonTypeName("OrderStatusChangeDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderStatusChangeDTO   {
  private OrderStatusType status;
  private OrderSubstatusType substatus;
  private OrderStatusChangeDeliveryDTO delivery;

  /**
   **/
  public OrderStatusChangeDTO status(OrderStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  @NotNull public OrderStatusType getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(OrderStatusType status) {
    this.status = status;
  }

  /**
   **/
  public OrderStatusChangeDTO substatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("substatus")
  public OrderSubstatusType getSubstatus() {
    return substatus;
  }

  @JsonProperty("substatus")
  public void setSubstatus(OrderSubstatusType substatus) {
    this.substatus = substatus;
  }

  /**
   **/
  public OrderStatusChangeDTO delivery(OrderStatusChangeDeliveryDTO delivery) {
    this.delivery = delivery;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("delivery")
  @Valid public OrderStatusChangeDeliveryDTO getDelivery() {
    return delivery;
  }

  @JsonProperty("delivery")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

