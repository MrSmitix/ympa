package apimodels;

import apimodels.OrderDeliveryDateDTO;
import apimodels.OrderDeliveryDateReasonType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SetOrderDeliveryDateRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SetOrderDeliveryDateRequest   {
  @JsonProperty("dates")
  @NotNull
@Valid

  private OrderDeliveryDateDTO dates;

  @JsonProperty("reason")
  @NotNull
@Valid

  private OrderDeliveryDateReasonType reason;

  public SetOrderDeliveryDateRequest dates(OrderDeliveryDateDTO dates) {
    this.dates = dates;
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

