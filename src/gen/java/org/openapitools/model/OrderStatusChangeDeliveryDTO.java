package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.OrderStatusChangeDeliveryDatesDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о доставке.
 **/
@ApiModel(description="Информация о доставке.")

public class OrderStatusChangeDeliveryDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private OrderStatusChangeDeliveryDatesDTO dates;
 /**
   * Get dates
   * @return dates
  **/
  @JsonProperty("dates")
  public OrderStatusChangeDeliveryDatesDTO getDates() {
    return dates;
  }

  public void setDates(OrderStatusChangeDeliveryDatesDTO dates) {
    this.dates = dates;
  }

  public OrderStatusChangeDeliveryDTO dates(OrderStatusChangeDeliveryDatesDTO dates) {
    this.dates = dates;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

