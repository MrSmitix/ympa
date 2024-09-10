package apimodels;

import apimodels.OrderStateDTO;
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
 * Список заказов.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdateOrderStatusesRequest   {
  @JsonProperty("orders")
  @NotNull
@Size(min=1,max=30)
@Valid

  private List<@Valid OrderStateDTO> orders = new ArrayList<>();

  public UpdateOrderStatusesRequest orders(List<@Valid OrderStateDTO> orders) {
    this.orders = orders;
    return this;
  }

  public UpdateOrderStatusesRequest addOrdersItem(OrderStateDTO ordersItem) {
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
  public List<@Valid OrderStateDTO> getOrders() {
    return orders;
  }

  public void setOrders(List<@Valid OrderStateDTO> orders) {
    this.orders = orders;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrderStatusesRequest updateOrderStatusesRequest = (UpdateOrderStatusesRequest) o;
    return Objects.equals(orders, updateOrderStatusesRequest.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orders);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderStatusesRequest {\n");
    
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
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

