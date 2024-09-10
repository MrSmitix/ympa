package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.FlippingPagerDTO;
import org.openapitools.vertxweb.server.model.ForwardScrollingPagerDTO;
import org.openapitools.vertxweb.server.model.OrderDTO;

/**
 * Модель для ответа API списка информации по заказам.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOrdersResponse   {
  
  private FlippingPagerDTO pager;
  private List<OrderDTO> orders = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  public GetOrdersResponse () {

  }

  public GetOrdersResponse (FlippingPagerDTO pager, List<OrderDTO> orders, ForwardScrollingPagerDTO paging) {
    this.pager = pager;
    this.orders = orders;
    this.paging = paging;
  }

    
  @JsonProperty("pager")
  public FlippingPagerDTO getPager() {
    return pager;
  }
  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }

    
  @JsonProperty("orders")
  public List<OrderDTO> getOrders() {
    return orders;
  }
  public void setOrders(List<OrderDTO> orders) {
    this.orders = orders;
  }

    
  @JsonProperty("paging")
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
