package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.OrderDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Модель для ответа API списка информации по заказам.
 **/
@ApiModel(description="Модель для ответа API списка информации по заказам.")

public class GetOrdersResponse  {
  
  @ApiModelProperty(value = "")
  private FlippingPagerDTO pager;

  @ApiModelProperty(required = true, value = "Модель заказа. ")
 /**
   * Модель заказа. 
  **/
  private List<OrderDTO> orders = new ArrayList<>();

  @ApiModelProperty(value = "")
  private ForwardScrollingPagerDTO paging;
 /**
   * Get pager
   * @return pager
  **/
  @JsonProperty("pager")
  public FlippingPagerDTO getPager() {
    return pager;
  }

  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }

  public GetOrdersResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

 /**
   * Модель заказа. 
   * @return orders
  **/
  @JsonProperty("orders")
  public List<OrderDTO> getOrders() {
    return orders;
  }

  public void setOrders(List<OrderDTO> orders) {
    this.orders = orders;
  }

  public GetOrdersResponse orders(List<OrderDTO> orders) {
    this.orders = orders;
    return this;
  }

  public GetOrdersResponse addOrdersItem(OrderDTO ordersItem) {
    this.orders.add(ordersItem);
    return this;
  }

 /**
   * Get paging
   * @return paging
  **/
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public GetOrdersResponse paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
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
    return Objects.equals(this.pager, getOrdersResponse.pager) &&
        Objects.equals(this.orders, getOrdersResponse.orders) &&
        Objects.equals(this.paging, getOrdersResponse.paging);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

