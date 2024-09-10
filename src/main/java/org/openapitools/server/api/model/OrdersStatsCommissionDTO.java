package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.api.model.OrdersStatsCommissionType;

/**
 * Информация о стоимости услуг.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrdersStatsCommissionDTO   {
  
  private OrdersStatsCommissionType type;
  private BigDecimal actual;

  public OrdersStatsCommissionDTO () {

  }

  public OrdersStatsCommissionDTO (OrdersStatsCommissionType type, BigDecimal actual) {
    this.type = type;
    this.actual = actual;
  }

    
  @JsonProperty("type")
  public OrdersStatsCommissionType getType() {
    return type;
  }
  public void setType(OrdersStatsCommissionType type) {
    this.type = type;
  }

    
  @JsonProperty("actual")
  public BigDecimal getActual() {
    return actual;
  }
  public void setActual(BigDecimal actual) {
    this.actual = actual;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersStatsCommissionDTO ordersStatsCommissionDTO = (OrdersStatsCommissionDTO) o;
    return Objects.equals(type, ordersStatsCommissionDTO.type) &&
        Objects.equals(actual, ordersStatsCommissionDTO.actual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, actual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersStatsCommissionDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    actual: ").append(toIndentedString(actual)).append("\n");
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
