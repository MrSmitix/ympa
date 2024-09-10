package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.OrderDeliveryDateDTO;
import org.openapitools.server.api.model.OrderDeliveryDateReasonType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetOrderDeliveryDateRequest   {
  
  private OrderDeliveryDateDTO dates;
  private OrderDeliveryDateReasonType reason;

  public SetOrderDeliveryDateRequest () {

  }

  public SetOrderDeliveryDateRequest (OrderDeliveryDateDTO dates, OrderDeliveryDateReasonType reason) {
    this.dates = dates;
    this.reason = reason;
  }

    
  @JsonProperty("dates")
  public OrderDeliveryDateDTO getDates() {
    return dates;
  }
  public void setDates(OrderDeliveryDateDTO dates) {
    this.dates = dates;
  }

    
  @JsonProperty("reason")
  public OrderDeliveryDateReasonType getReason() {
    return reason;
  }
  public void setReason(OrderDeliveryDateReasonType reason) {
    this.reason = reason;
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
    return Objects.equals(dates, setOrderDeliveryDateRequest.dates) &&
        Objects.equals(reason, setOrderDeliveryDateRequest.reason);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
