package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.api.model.OrdersStatsPriceType;

/**
 * Цена или скидки на товар.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrdersStatsPriceDTO   {
  
  private OrdersStatsPriceType type;
  private BigDecimal costPerItem;
  private BigDecimal total;

  public OrdersStatsPriceDTO () {

  }

  public OrdersStatsPriceDTO (OrdersStatsPriceType type, BigDecimal costPerItem, BigDecimal total) {
    this.type = type;
    this.costPerItem = costPerItem;
    this.total = total;
  }

    
  @JsonProperty("type")
  public OrdersStatsPriceType getType() {
    return type;
  }
  public void setType(OrdersStatsPriceType type) {
    this.type = type;
  }

    
  @JsonProperty("costPerItem")
  public BigDecimal getCostPerItem() {
    return costPerItem;
  }
  public void setCostPerItem(BigDecimal costPerItem) {
    this.costPerItem = costPerItem;
  }

    
  @JsonProperty("total")
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
    return Objects.equals(type, ordersStatsPriceDTO.type) &&
        Objects.equals(costPerItem, ordersStatsPriceDTO.costPerItem) &&
        Objects.equals(total, ordersStatsPriceDTO.total);
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
