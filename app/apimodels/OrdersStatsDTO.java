package apimodels;

import apimodels.ForwardScrollingPagerDTO;
import apimodels.OrdersStatsOrderDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация по заказам.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrdersStatsDTO   {
  @JsonProperty("orders")
  @NotNull
@Valid

  private List<@Valid OrdersStatsOrderDTO> orders = new ArrayList<>();

  @JsonProperty("paging")
  @Valid

  private ForwardScrollingPagerDTO paging;

  public OrdersStatsDTO orders(List<@Valid OrdersStatsOrderDTO> orders) {
    this.orders = orders;
    return this;
  }

  public OrdersStatsDTO addOrdersItem(OrdersStatsOrderDTO ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<>();
    }
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Список заказов.
   * @return orders
  **/
  public List<@Valid OrdersStatsOrderDTO> getOrders() {
    return orders;
  }

  public void setOrders(List<@Valid OrdersStatsOrderDTO> orders) {
    this.orders = orders;
  }

  public OrdersStatsDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

   /**
   * Get paging
   * @return paging
  **/
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersStatsDTO ordersStatsDTO = (OrdersStatsDTO) o;
    return Objects.equals(orders, ordersStatsDTO.orders) &&
        Objects.equals(paging, ordersStatsDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orders, paging);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersStatsDTO {\n");
    
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

