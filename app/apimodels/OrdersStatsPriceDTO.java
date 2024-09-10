package apimodels;

import apimodels.OrdersStatsPriceType;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Цена или скидки на товар.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrdersStatsPriceDTO   {
  @JsonProperty("type")
  @Valid

  private OrdersStatsPriceType type;

  @JsonProperty("costPerItem")
  @Valid

  private BigDecimal costPerItem;

  @JsonProperty("total")
  @Valid

  private BigDecimal total;

  public OrdersStatsPriceDTO type(OrdersStatsPriceType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

