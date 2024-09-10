package apimodels;

import apimodels.OrderStatusChangeDeliveryDatesDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о доставке.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderStatusChangeDeliveryDTO   {
  @JsonProperty("dates")
  @Valid

  private OrderStatusChangeDeliveryDatesDTO dates;

  public OrderStatusChangeDeliveryDTO dates(OrderStatusChangeDeliveryDatesDTO dates) {
    this.dates = dates;
    return this;
  }

   /**
   * Get dates
   * @return dates
  **/
  public OrderStatusChangeDeliveryDatesDTO getDates() {
    return dates;
  }

  public void setDates(OrderStatusChangeDeliveryDatesDTO dates) {
    this.dates = dates;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStatusChangeDeliveryDTO orderStatusChangeDeliveryDTO = (OrderStatusChangeDeliveryDTO) o;
    return Objects.equals(dates, orderStatusChangeDeliveryDTO.dates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dates);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatusChangeDeliveryDTO {\n");
    
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
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

