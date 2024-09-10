package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.OrderCancellationReasonType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AcceptOrderCancellationRequest   {
  
  private Boolean accepted;
  private OrderCancellationReasonType reason;

  public AcceptOrderCancellationRequest () {

  }

  public AcceptOrderCancellationRequest (Boolean accepted, OrderCancellationReasonType reason) {
    this.accepted = accepted;
    this.reason = reason;
  }

    
  @JsonProperty("accepted")
  public Boolean getAccepted() {
    return accepted;
  }
  public void setAccepted(Boolean accepted) {
    this.accepted = accepted;
  }

    
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
    return Objects.equals(accepted, acceptOrderCancellationRequest.accepted) &&
        Objects.equals(reason, acceptOrderCancellationRequest.reason);
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
