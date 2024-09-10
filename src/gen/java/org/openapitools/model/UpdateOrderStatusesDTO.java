package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateOrderStatusDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Список заказов, статус которых обновился.
 **/
@ApiModel(description = "Список заказов, статус которых обновился.")
@JsonTypeName("UpdateOrderStatusesDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOrderStatusesDTO   {
  private @Valid List<@Valid UpdateOrderStatusDTO> orders = new ArrayList<>();

  /**
   * Список с обновленными заказами.
   **/
  public UpdateOrderStatusesDTO orders(List<@Valid UpdateOrderStatusDTO> orders) {
    this.orders = orders;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список с обновленными заказами.")
  @JsonProperty("orders")
  @NotNull @Valid public List<@Valid UpdateOrderStatusDTO> getOrders() {
    return orders;
  }

  @JsonProperty("orders")
  public void setOrders(List<@Valid UpdateOrderStatusDTO> orders) {
    this.orders = orders;
  }

  public UpdateOrderStatusesDTO addOrdersItem(UpdateOrderStatusDTO ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<>();
    }

    this.orders.add(ordersItem);
    return this;
  }

  public UpdateOrderStatusesDTO removeOrdersItem(UpdateOrderStatusDTO ordersItem) {
    if (ordersItem != null && this.orders != null) {
      this.orders.remove(ordersItem);
    }

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
    UpdateOrderStatusesDTO updateOrderStatusesDTO = (UpdateOrderStatusesDTO) o;
    return Objects.equals(this.orders, updateOrderStatusesDTO.orders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderStatusesDTO {\n");
    
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

