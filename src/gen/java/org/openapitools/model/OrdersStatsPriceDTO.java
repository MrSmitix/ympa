/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.OrdersStatsPriceType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Цена или скидки на товар.
 */
@ApiModel(description = "Цена или скидки на товар.")
@JsonPropertyOrder({
  OrdersStatsPriceDTO.JSON_PROPERTY_TYPE,
  OrdersStatsPriceDTO.JSON_PROPERTY_COST_PER_ITEM,
  OrdersStatsPriceDTO.JSON_PROPERTY_TOTAL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrdersStatsPriceDTO   {
  public static final String JSON_PROPERTY_TYPE = "type";
  @JsonProperty(JSON_PROPERTY_TYPE)
  private OrdersStatsPriceType type;

  public static final String JSON_PROPERTY_COST_PER_ITEM = "costPerItem";
  @JsonProperty(JSON_PROPERTY_COST_PER_ITEM)
  private BigDecimal costPerItem;

  public static final String JSON_PROPERTY_TOTAL = "total";
  @JsonProperty(JSON_PROPERTY_TOTAL)
  private BigDecimal total;

  public OrdersStatsPriceDTO type(OrdersStatsPriceType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @JsonProperty(value = "type")
  @ApiModelProperty(value = "")
  
  public OrdersStatsPriceType getType() {
    return type;
  }

  public void setType(OrdersStatsPriceType type) {
    this.type = type;
  }

  public OrdersStatsPriceDTO costPerItem(BigDecimal costPerItem) {
    this.costPerItem = costPerItem;
    return this;
  }

  /**
   * Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. 
   * @return costPerItem
   **/
  @JsonProperty(value = "costPerItem")
  @ApiModelProperty(value = "Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой. ")
  @Valid 
  public BigDecimal getCostPerItem() {
    return costPerItem;
  }

  public void setCostPerItem(BigDecimal costPerItem) {
    this.costPerItem = costPerItem;
  }

  public OrdersStatsPriceDTO total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. 
   * @return total
   **/
  @JsonProperty(value = "total")
  @ApiModelProperty(value = "Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой. ")
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

