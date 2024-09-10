package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.OrdersStatsOrderDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация по заказам.
 */
@ApiModel(description="Информация по заказам.")

public class OrdersStatsDTO  {
  
 /**
  * Список заказов.
  */
  @ApiModelProperty(required = true, value = "Список заказов.")
  @Valid
  private List<@Valid OrdersStatsOrderDTO> orders = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private ForwardScrollingPagerDTO paging;
 /**
  * Список заказов.
  * @return orders
  */
  @JsonProperty("orders")
  @NotNull
  public List<@Valid OrdersStatsOrderDTO> getOrders() {
    return orders;
  }

  /**
   * Sets the <code>orders</code> property.
   */
 public void setOrders(List<@Valid OrdersStatsOrderDTO> orders) {
    this.orders = orders;
  }

  /**
   * Sets the <code>orders</code> property.
   */
  public OrdersStatsDTO orders(List<@Valid OrdersStatsOrderDTO> orders) {
    this.orders = orders;
    return this;
  }

  /**
   * Adds a new item to the <code>orders</code> list.
   */
  public OrdersStatsDTO addOrdersItem(OrdersStatsOrderDTO ordersItem) {
    this.orders.add(ordersItem);
    return this;
  }

 /**
  * Get paging
  * @return paging
  */
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
 public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
  public OrdersStatsDTO paging(ForwardScrollingPagerDTO paging) {
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
    OrdersStatsDTO ordersStatsDTO = (OrdersStatsDTO) o;
    return Objects.equals(this.orders, ordersStatsDTO.orders) &&
        Objects.equals(this.paging, ordersStatsDTO.paging);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

