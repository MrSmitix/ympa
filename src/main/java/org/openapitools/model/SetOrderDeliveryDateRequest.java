package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OrderDeliveryDateDTO;
import org.openapitools.model.OrderDeliveryDateReasonType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SetOrderDeliveryDateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SetOrderDeliveryDateRequest {

  private OrderDeliveryDateDTO dates;

  private OrderDeliveryDateReasonType reason;

  public SetOrderDeliveryDateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SetOrderDeliveryDateRequest(OrderDeliveryDateDTO dates, OrderDeliveryDateReasonType reason) {
    this.dates = dates;
    this.reason = reason;
  }

  public SetOrderDeliveryDateRequest dates(OrderDeliveryDateDTO dates) {
    this.dates = dates;
    return this;
  }

  /**
   * Get dates
   * @return dates
   */
  @NotNull @Valid 
  @Schema(name = "dates", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("dates")
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
  @NotNull @Valid 
  @Schema(name = "reason", requiredMode = Schema.RequiredMode.REQUIRED)
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

