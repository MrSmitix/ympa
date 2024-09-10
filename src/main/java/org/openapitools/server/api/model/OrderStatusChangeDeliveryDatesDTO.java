package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

/**
 * Диапазон дат доставки.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderStatusChangeDeliveryDatesDTO   {
  
  private LocalDate realDeliveryDate;

  public OrderStatusChangeDeliveryDatesDTO () {

  }

  public OrderStatusChangeDeliveryDatesDTO (LocalDate realDeliveryDate) {
    this.realDeliveryDate = realDeliveryDate;
  }

    
  @JsonProperty("realDeliveryDate")
  public LocalDate getRealDeliveryDate() {
    return realDeliveryDate;
  }
  public void setRealDeliveryDate(LocalDate realDeliveryDate) {
    this.realDeliveryDate = realDeliveryDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderStatusChangeDeliveryDatesDTO orderStatusChangeDeliveryDatesDTO = (OrderStatusChangeDeliveryDatesDTO) o;
    return Objects.equals(realDeliveryDate, orderStatusChangeDeliveryDatesDTO.realDeliveryDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realDeliveryDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderStatusChangeDeliveryDatesDTO {\n");
    
    sb.append("    realDeliveryDate: ").append(toIndentedString(realDeliveryDate)).append("\n");
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
