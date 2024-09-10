package apimodels;

import apimodels.OrderCancellationReasonType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * AcceptOrderCancellationRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AcceptOrderCancellationRequest   {
  @JsonProperty("accepted")
  @NotNull

  private Boolean accepted;

  @JsonProperty("reason")
  @Valid

  private OrderCancellationReasonType reason;

  public AcceptOrderCancellationRequest accepted(Boolean accepted) {
    this.accepted = accepted;
    return this;
  }

   /**
   * Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. 
   * @return accepted
  **/
  public Boolean getAccepted() {
    return accepted;
  }

  public void setAccepted(Boolean accepted) {
    this.accepted = accepted;
  }

  public AcceptOrderCancellationRequest reason(OrderCancellationReasonType reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
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
    return Objects.equals(accepted, acceptOrderCancellationRequest.accepted) &&
        Objects.equals(reason, acceptOrderCancellationRequest.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accepted, reason);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

