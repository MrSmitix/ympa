package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.OrdersStatsPriceType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Цена или скидки на товар.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsPriceDTO   {
  
  private OrdersStatsPriceType type;
  private BigDecimal costPerItem;
  private BigDecimal total;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  @Valid
  public OrdersStatsPriceType getType() {
    return type;
  }
  public void setType(OrdersStatsPriceType type) {
    this.type = type;
  }

  /**
   * Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
   **/
  
  @ApiModelProperty(value = "Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. ")
  @JsonProperty("costPerItem")
  @Valid
  public BigDecimal getCostPerItem() {
    return costPerItem;
  }
  public void setCostPerItem(BigDecimal costPerItem) {
    this.costPerItem = costPerItem;
  }

  /**
   * Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
   **/
  
  @ApiModelProperty(value = "Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. ")
  @JsonProperty("total")
  @Valid
  public BigDecimal getTotal() {
    return total;
  }
  public void setTotal(BigDecimal total) {
    this.total = total;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

