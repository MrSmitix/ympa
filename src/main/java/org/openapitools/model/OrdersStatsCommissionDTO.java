package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.model.OrdersStatsCommissionType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о стоимости услуг.
 */

@Schema(name = "OrdersStatsCommissionDTO", description = "Информация о стоимости услуг.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsCommissionDTO {

  private OrdersStatsCommissionType type;

  private BigDecimal actual;

  public OrdersStatsCommissionDTO type(OrdersStatsCommissionType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
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
   */
  @Valid 
  @Schema(name = "actual", description = "Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.type, ordersStatsCommissionDTO.type) &&
        Objects.equals(this.actual, ordersStatsCommissionDTO.actual);
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

