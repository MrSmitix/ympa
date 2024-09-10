package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.FlippingPagerDTO;
import com.prokarma.pkmst.model.ForwardScrollingPagerDTO;
import com.prokarma.pkmst.model.OrderDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Модель для ответа API списка информации по заказам.
 */
@ApiModel(description = "Модель для ответа API списка информации по заказам.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOrdersResponse   {
  @JsonProperty("pager")
  private FlippingPagerDTO pager;

  @JsonProperty("orders")
  
  private List<OrderDTO> orders = new ArrayList<>();

  @JsonProperty("paging")
  private ForwardScrollingPagerDTO paging;

  public GetOrdersResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

  /**
   * Get pager
   * @return pager
   */
  @ApiModelProperty(value = "")
  public FlippingPagerDTO getPager() {
    return pager;
  }

  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }

  public GetOrdersResponse orders(List<OrderDTO> orders) {
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
   */
  @ApiModelProperty(required = true, value = "Модель заказа. ")
  public List<OrderDTO> getOrders() {
    return orders;
  }

  public void setOrders(List<OrderDTO> orders) {
    this.orders = orders;
  }

  public GetOrdersResponse paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   */
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

