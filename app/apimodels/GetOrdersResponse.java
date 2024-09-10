package apimodels;

import apimodels.FlippingPagerDTO;
import apimodels.ForwardScrollingPagerDTO;
import apimodels.OrderDTO;
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
 * Модель для ответа API списка информации по заказам.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetOrdersResponse   {
  @JsonProperty("pager")
  @Valid

  private FlippingPagerDTO pager;

  @JsonProperty("orders")
  @NotNull
@Valid

  private List<@Valid OrderDTO> orders = new ArrayList<>();

  @JsonProperty("paging")
  @Valid

  private ForwardScrollingPagerDTO paging;

  public GetOrdersResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

   /**
   * Get pager
   * @return pager
  **/
  public FlippingPagerDTO getPager() {
    return pager;
  }

  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }

  public GetOrdersResponse orders(List<@Valid OrderDTO> orders) {
    this.orders = orders;
    return this;
  }

  public GetOrdersResponse addOrdersItem(OrderDTO ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<>();
    }
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Модель заказа. 
   * @return orders
  **/
  public List<@Valid OrderDTO> getOrders() {
    return orders;
  }

  public void setOrders(List<@Valid OrderDTO> orders) {
    this.orders = orders;
  }

  public GetOrdersResponse paging(ForwardScrollingPagerDTO paging) {
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
    GetOrdersResponse getOrdersResponse = (GetOrdersResponse) o;
    return Objects.equals(pager, getOrdersResponse.pager) &&
        Objects.equals(orders, getOrdersResponse.orders) &&
        Objects.equals(paging, getOrdersResponse.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pager, orders, paging);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrdersResponse {\n");
    
    sb.append("    pager: ").append(toIndentedString(pager)).append("\n");
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

