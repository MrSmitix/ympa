package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OrderCancellationReasonType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AcceptOrderCancellationRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class AcceptOrderCancellationRequest {

  private Boolean accepted;

  private OrderCancellationReasonType reason;

  public AcceptOrderCancellationRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AcceptOrderCancellationRequest(Boolean accepted) {
    this.accepted = accepted;
  }

  public AcceptOrderCancellationRequest accepted(Boolean accepted) {
    this.accepted = accepted;
    return this;
  }

  /**
   * Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. 
   * @return accepted
   */
  @NotNull 
  @Schema(name = "accepted", description = "Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("accepted")
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
   */
  @Valid 
  @Schema(name = "reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("reason")
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
