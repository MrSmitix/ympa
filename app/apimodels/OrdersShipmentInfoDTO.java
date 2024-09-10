package apimodels;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Годные/негодные ярлыки по заказам в отгрузке.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrdersShipmentInfoDTO   {
  @JsonProperty("orderIdsWithLabels")
  @NotNull

  private Set<Long> orderIdsWithLabels = new LinkedHashSet<>();

  @JsonProperty("orderIdsWithoutLabels")
  @NotNull

  private Set<Long> orderIdsWithoutLabels = new LinkedHashSet<>();

  public OrdersShipmentInfoDTO orderIdsWithLabels(Set<Long> orderIdsWithLabels) {
    this.orderIdsWithLabels = orderIdsWithLabels;
    return this;
  }

  public OrdersShipmentInfoDTO addOrderIdsWithLabelsItem(Long orderIdsWithLabelsItem) {
    if (this.orderIdsWithLabels == null) {
      this.orderIdsWithLabels = new LinkedHashSet<>();
    }
    this.orderIdsWithLabels.add(orderIdsWithLabelsItem);
    return this;
  }

   /**
   * Идентификаторы заказов в отгрузке, для которых можно распечатать ярлыки.
   * @return orderIdsWithLabels
  **/
  public Set<Long> getOrderIdsWithLabels() {
    return orderIdsWithLabels;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setOrderIdsWithLabels(Set<Long> orderIdsWithLabels) {
    this.orderIdsWithLabels = orderIdsWithLabels;
  }

  public OrdersShipmentInfoDTO orderIdsWithoutLabels(Set<Long> orderIdsWithoutLabels) {
    this.orderIdsWithoutLabels = orderIdsWithoutLabels;
    return this;
  }

  public OrdersShipmentInfoDTO addOrderIdsWithoutLabelsItem(Long orderIdsWithoutLabelsItem) {
    if (this.orderIdsWithoutLabels == null) {
      this.orderIdsWithoutLabels = new LinkedHashSet<>();
    }
    this.orderIdsWithoutLabels.add(orderIdsWithoutLabelsItem);
    return this;
  }

   /**
   * Идентификаторы заказов в отгрузке, для которых нельзя распечатать ярлыки.
   * @return orderIdsWithoutLabels
  **/
  public Set<Long> getOrderIdsWithoutLabels() {
    return orderIdsWithoutLabels;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setOrderIdsWithoutLabels(Set<Long> orderIdsWithoutLabels) {
    this.orderIdsWithoutLabels = orderIdsWithoutLabels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersShipmentInfoDTO ordersShipmentInfoDTO = (OrdersShipmentInfoDTO) o;
    return Objects.equals(orderIdsWithLabels, ordersShipmentInfoDTO.orderIdsWithLabels) &&
        Objects.equals(orderIdsWithoutLabels, ordersShipmentInfoDTO.orderIdsWithoutLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderIdsWithLabels, orderIdsWithoutLabels);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersShipmentInfoDTO {\n");
    
    sb.append("    orderIdsWithLabels: ").append(toIndentedString(orderIdsWithLabels)).append("\n");
    sb.append("    orderIdsWithoutLabels: ").append(toIndentedString(orderIdsWithoutLabels)).append("\n");
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

