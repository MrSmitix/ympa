package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.openapitools.model.OrdersStatsCommissionType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о стоимости услуг.
 **/
@ApiModel(description="Информация о стоимости услуг.")

public class OrdersStatsCommissionDTO  {
  
  @ApiModelProperty(value = "")
  private OrdersStatsCommissionType type;

  @ApiModelProperty(value = "Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. ")
 /**
   * Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
  **/
  private BigDecimal actual;
 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public OrdersStatsCommissionType getType() {
    return type;
  }

  public void setType(OrdersStatsCommissionType type) {
    this.type = type;
  }

  public OrdersStatsCommissionDTO type(OrdersStatsCommissionType type) {
    this.type = type;
    return this;
  }

 /**
   * Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой. 
   * @return actual
  **/
  @JsonProperty("actual")
  public BigDecimal getActual() {
    return actual;
  }

  public void setActual(BigDecimal actual) {
    this.actual = actual;
  }

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

