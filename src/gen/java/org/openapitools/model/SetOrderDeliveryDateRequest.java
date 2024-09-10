package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderDeliveryDateDTO;
import org.openapitools.model.OrderDeliveryDateReasonType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2024-09-09T22:24:51.464705463Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SetOrderDeliveryDateRequest   {
  
  private OrderDeliveryDateDTO dates;
  private OrderDeliveryDateReasonType reason;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("dates")
  @NotNull
  public OrderDeliveryDateDTO getDates() {
    return dates;
  }
  public void setDates(OrderDeliveryDateDTO dates) {
    this.dates = dates;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("reason")
  @NotNull
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

