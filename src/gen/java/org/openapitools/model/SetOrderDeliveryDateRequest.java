package org.openapitools.model;

import org.openapitools.model.OrderDeliveryDateDTO;
import org.openapitools.model.OrderDeliveryDateReasonType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SetOrderDeliveryDateRequest  {
  
  @ApiModelProperty(required = true, value = "")
  private OrderDeliveryDateDTO dates;

  @ApiModelProperty(required = true, value = "")
  private OrderDeliveryDateReasonType reason;
 /**
   * Get dates
   * @return dates
  **/
  @JsonProperty("dates")
  public OrderDeliveryDateDTO getDates() {
    return dates;
  }

  public void setDates(OrderDeliveryDateDTO dates) {
    this.dates = dates;
  }

  public SetOrderDeliveryDateRequest dates(OrderDeliveryDateDTO dates) {
    this.dates = dates;
    return this;
  }

 /**
   * Get reason
   * @return reason
  **/
  @JsonProperty("reason")
  public OrderDeliveryDateReasonType getReason() {
    return reason;
  }

  public void setReason(OrderDeliveryDateReasonType reason) {
    this.reason = reason;
  }

  public SetOrderDeliveryDateRequest reason(OrderDeliveryDateReasonType reason) {
    this.reason = reason;
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
    SetOrderDeliveryDateRequest setOrderDeliveryDateRequest = (SetOrderDeliveryDateRequest) o;
    return Objects.equals(this.dates, setOrderDeliveryDateRequest.dates) &&
        Objects.equals(this.reason, setOrderDeliveryDateRequest.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dates, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetOrderDeliveryDateRequest {\n");
    
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

