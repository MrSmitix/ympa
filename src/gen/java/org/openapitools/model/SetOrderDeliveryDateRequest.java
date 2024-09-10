package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderDeliveryDateDTO;
import org.openapitools.model.OrderDeliveryDateReasonType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SetOrderDeliveryDateRequest   {
  @JsonProperty("dates")
  private OrderDeliveryDateDTO dates;

  @JsonProperty("reason")
  private OrderDeliveryDateReasonType reason;

  /**
   **/
  public SetOrderDeliveryDateRequest dates(OrderDeliveryDateDTO dates) {
    this.dates = dates;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("dates")
  public OrderDeliveryDateDTO getDates() {
    return dates;
  }
  public void setDates(OrderDeliveryDateDTO dates) {
    this.dates = dates;
  }

  /**
   **/
  public SetOrderDeliveryDateRequest reason(OrderDeliveryDateReasonType reason) {
    this.reason = reason;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

