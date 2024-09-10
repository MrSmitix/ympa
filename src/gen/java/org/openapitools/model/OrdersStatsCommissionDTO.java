package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.openapitools.model.OrdersStatsCommissionType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о стоимости услуг.
 */
@ApiModel(description="Информация о стоимости услуг.")

public class OrdersStatsCommissionDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private OrdersStatsCommissionType type;

 /**
  * Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
  */
  @ApiModelProperty(value = "Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. ")
  @Valid
  private BigDecimal actual;
 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  public OrdersStatsCommissionType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(OrdersStatsCommissionType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public OrdersStatsCommissionDTO type(OrdersStatsCommissionType type) {
    this.type = type;
    return this;
  }

 /**
  * Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
  * @return actual
  */
  @JsonProperty("actual")
  public BigDecimal getActual() {
    return actual;
  }

  /**
   * Sets the <code>actual</code> property.
   */
 public void setActual(BigDecimal actual) {
    this.actual = actual;
  }

  /**
   * Sets the <code>actual</code> property.
   */
  public OrdersStatsCommissionDTO actual(BigDecimal actual) {
    this.actual = actual;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

