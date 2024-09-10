package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.ForwardScrollingPagerDTO;
import org.openapitools.server.api.model.OrdersStatsOrderDTO;

/**
 * Информация по заказам.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrdersStatsDTO   {
  
  private List<OrdersStatsOrderDTO> orders = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  public OrdersStatsDTO () {

  }

  public OrdersStatsDTO (List<OrdersStatsOrderDTO> orders, ForwardScrollingPagerDTO paging) {
    this.orders = orders;
    this.paging = paging;
  }

    
  @JsonProperty("orders")
  public List<OrdersStatsOrderDTO> getOrders() {
    return orders;
  }
  public void setOrders(List<OrdersStatsOrderDTO> orders) {
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
    OrdersStatsDTO ordersStatsDTO = (OrdersStatsDTO) o;
    return Objects.equals(orders, ordersStatsDTO.orders) &&
        Objects.equals(paging, ordersStatsDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orders, paging);
  }

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
