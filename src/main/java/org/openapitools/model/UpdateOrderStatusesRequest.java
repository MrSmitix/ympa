package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderStateDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список заказов.
 */

@Schema(name = "UpdateOrderStatusesRequest", description = "Список заказов.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOrderStatusesRequest {

  @Valid
  private List<@Valid OrderStateDTO> orders = new ArrayList<>();

  public UpdateOrderStatusesRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateOrderStatusesRequest(List<@Valid OrderStateDTO> orders) {
    this.orders = orders;
  }

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
   */
  @NotNull @Valid @Size(min = 1, max = 30) 
  @Schema(name = "orders", description = "Список заказов.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("orders")
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
    return Objects.equals(this.orders, updateOrderStatusesRequest.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orders);
  }

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

