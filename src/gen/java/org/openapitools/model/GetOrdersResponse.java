package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.OrderDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Модель для ответа API списка информации по заказам.
 **/
@ApiModel(description = "Модель для ответа API списка информации по заказам.")
@JsonTypeName("GetOrdersResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOrdersResponse   {
  private FlippingPagerDTO pager;
  private @Valid List<@Valid OrderDTO> orders = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  /**
   **/
  public GetOrdersResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pager")
  @Valid public FlippingPagerDTO getPager() {
    return pager;
  }

  @JsonProperty("pager")
  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }

  /**
   * Модель заказа. 
   **/
  public GetOrdersResponse orders(List<@Valid OrderDTO> orders) {
    this.orders = orders;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Модель заказа. ")
  @JsonProperty("orders")
  @NotNull @Valid public List<@Valid OrderDTO> getOrders() {
    return orders;
  }

  @JsonProperty("orders")
  public void setOrders(List<@Valid OrderDTO> orders) {
    this.orders = orders;
  }

  public GetOrdersResponse addOrdersItem(OrderDTO ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<>();
    }

    this.orders.add(ordersItem);
    return this;
  }

  public GetOrdersResponse removeOrdersItem(OrderDTO ordersItem) {
    if (ordersItem != null && this.orders != null) {
      this.orders.remove(ordersItem);
    }

    return this;
  }
  /**
   **/
  public GetOrdersResponse paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  @Valid public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  @JsonProperty("paging")
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

