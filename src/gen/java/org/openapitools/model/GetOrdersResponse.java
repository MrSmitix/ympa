package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.OrderDTO;



/**
 * Модель для ответа API списка информации по заказам.
 **/

@ApiModel(description = "Модель для ответа API списка информации по заказам.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOrdersResponse   {
  @JsonProperty("pager")
  private FlippingPagerDTO pager;

  @JsonProperty("orders")
  private List<OrderDTO> orders = new ArrayList<>();

  @JsonProperty("paging")
  private ForwardScrollingPagerDTO paging;

  /**
   **/
  public GetOrdersResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pager")
  public FlippingPagerDTO getPager() {
    return pager;
  }
  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }

  /**
   * Модель заказа. 
   **/
  public GetOrdersResponse orders(List<OrderDTO> orders) {
    this.orders = orders;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Модель заказа. ")
  @JsonProperty("orders")
  public List<OrderDTO> getOrders() {
    return orders;
  }
  public void setOrders(List<OrderDTO> orders) {
    this.orders = orders;
  }

  /**
   **/
  public GetOrdersResponse paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

