package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderStatusChangeDeliveryDTO;
import org.openapitools.model.OrderStatusType;
import org.openapitools.model.OrderSubstatusType;



/**
 * Заказ.
 **/

@ApiModel(description = "Заказ.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderStatusChangeDTO   {
  @JsonProperty("status")
  private OrderStatusType status;

  @JsonProperty("substatus")
  private OrderSubstatusType substatus;

  @JsonProperty("delivery")
  private OrderStatusChangeDeliveryDTO delivery;

  /**
   **/
  public OrderStatusChangeDTO status(OrderStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("status")
  public OrderStatusType getStatus() {
    return status;
  }
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

