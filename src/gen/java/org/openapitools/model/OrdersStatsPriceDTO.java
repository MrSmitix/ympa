package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.math.BigDecimal;
import org.openapitools.model.OrdersStatsPriceType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Цена или скидки на товар.
 **/
@ApiModel(description="Цена или скидки на товар.")

public class OrdersStatsPriceDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private OrdersStatsPriceType type;

  @ApiModelProperty(value = "Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. ")
  @Valid
 /**
   * Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
  **/
  private BigDecimal costPerItem;

  @ApiModelProperty(value = "Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. ")
  @Valid
 /**
   * Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
  **/
  private BigDecimal total;
 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public OrdersStatsPriceType getType() {
    return type;
  }

  public void setType(OrdersStatsPriceType type) {
    this.type = type;
  }

  public OrdersStatsPriceDTO type(OrdersStatsPriceType type) {
    this.type = type;
    return this;
  }

 /**
   * Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
   * @return costPerItem
  **/
  @JsonProperty("costPerItem")
  public BigDecimal getCostPerItem() {
    return costPerItem;
  }

  public void setCostPerItem(BigDecimal costPerItem) {
    this.costPerItem = costPerItem;
  }

  public OrdersStatsPriceDTO costPerItem(BigDecimal costPerItem) {
    this.costPerItem = costPerItem;
    return this;
  }

 /**
   * Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
   * @return total
  **/
  @JsonProperty("total")
  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public OrdersStatsPriceDTO total(BigDecimal total) {
    this.total = total;
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
    OrdersStatsPriceDTO ordersStatsPriceDTO = (OrdersStatsPriceDTO) o;
    return Objects.equals(this.type, ordersStatsPriceDTO.type) &&
        Objects.equals(this.costPerItem, ordersStatsPriceDTO.costPerItem) &&
        Objects.equals(this.total, ordersStatsPriceDTO.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, costPerItem, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersStatsPriceDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    costPerItem: ").append(toIndentedString(costPerItem)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

