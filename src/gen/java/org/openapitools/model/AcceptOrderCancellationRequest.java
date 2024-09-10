package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OrderCancellationReasonType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AcceptOrderCancellationRequest   {
  
  private Boolean accepted;
  private OrderCancellationReasonType reason;

  /**
   * Решение об отмене заказа:  * &#x60;true&#x60; — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * &#x60;false&#x60; — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. 
   **/
  
  @ApiModelProperty(required = true, value = "Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. ")
  @JsonProperty("accepted")
  @NotNull
  public Boolean getAccepted() {
    return accepted;
  }
  public void setAccepted(Boolean accepted) {
    this.accepted = accepted;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("reason")
  @Valid
  public OrderCancellationReasonType getReason() {
    return reason;
  }
  public void setReason(OrderCancellationReasonType reason) {
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
    AcceptOrderCancellationRequest acceptOrderCancellationRequest = (AcceptOrderCancellationRequest) o;
    return Objects.equals(this.accepted, acceptOrderCancellationRequest.accepted) &&
        Objects.equals(this.reason, acceptOrderCancellationRequest.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accepted, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AcceptOrderCancellationRequest {\n");
    
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
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

