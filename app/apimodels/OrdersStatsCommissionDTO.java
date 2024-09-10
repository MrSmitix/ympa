package apimodels;

import apimodels.OrdersStatsCommissionType;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о стоимости услуг.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrdersStatsCommissionDTO   {
  @JsonProperty("type")
  @Valid

  private OrdersStatsCommissionType type;

  @JsonProperty("actual")
  @Valid

  private BigDecimal actual;

  public OrdersStatsCommissionDTO type(OrdersStatsCommissionType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public OrdersStatsCommissionType getType() {
    return type;
  }

  public void setType(OrdersStatsCommissionType type) {
    this.type = type;
  }

  public OrdersStatsCommissionDTO actual(BigDecimal actual) {
    this.actual = actual;
    return this;
  }

   /**
   * Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
   * @return actual
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

