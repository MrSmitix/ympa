package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderStatusChangeDeliveryDatesDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о доставке.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация о доставке.")
public class OrderStatusChangeDeliveryDTO   {
  
  private OrderStatusChangeDeliveryDatesDTO dates;

  /**
   **/
  public OrderStatusChangeDeliveryDTO dates(OrderStatusChangeDeliveryDatesDTO dates) {
    this.dates = dates;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("dates")
  public OrderStatusChangeDeliveryDatesDTO getDates() {
    return dates;
  }
  public void setDates(OrderStatusChangeDeliveryDatesDTO dates) {
    this.dates = dates;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO = (OrderStatusChangeDeliveryDTO) o;
    return Objects.equals(this.dates, orderStatusChangeDeliveryDTO.dates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dates);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatusChangeDeliveryDTO {\n");
    
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
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

