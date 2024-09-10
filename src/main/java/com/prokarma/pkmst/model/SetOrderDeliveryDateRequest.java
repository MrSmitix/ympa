package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.OrderDeliveryDateDTO;
import com.prokarma.pkmst.model.OrderDeliveryDateReasonType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * SetOrderDeliveryDateRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SetOrderDeliveryDateRequest   {
  @JsonProperty("dates")
  private OrderDeliveryDateDTO dates;

  @JsonProperty("reason")
  private OrderDeliveryDateReasonType reason;

  public SetOrderDeliveryDateRequest dates(OrderDeliveryDateDTO dates) {
    this.dates = dates;
    return this;
  }

  /**
   * Get dates
   * @return dates
   */
  @ApiModelProperty(required = true, value = "")
  public OrderDeliveryDateDTO getDates() {
    return dates;
  }

  public void setDates(OrderDeliveryDateDTO dates) {
    this.dates = dates;
  }

  public SetOrderDeliveryDateRequest reason(OrderDeliveryDateReasonType reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
   */
  @ApiModelProperty(required = true, value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
