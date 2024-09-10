package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateOrderStatusDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список заказов, статус которых обновился.
 */

@Schema(name = "UpdateOrderStatusesDTO", description = "Список заказов, статус которых обновился.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOrderStatusesDTO {

  @Valid
  private List<@Valid UpdateOrderStatusDTO> orders = new ArrayList<>();

  public UpdateOrderStatusesDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateOrderStatusesDTO(List<@Valid UpdateOrderStatusDTO> orders) {
    this.orders = orders;
  }

  public UpdateOrderStatusesDTO orders(List<@Valid UpdateOrderStatusDTO> orders) {
    this.orders = orders;
    return this;
  }

  public UpdateOrderStatusesDTO addOrdersItem(UpdateOrderStatusDTO ordersItem) {
    if (this.orders == null) {
      this.orders = new ArrayList<>();
    }
    this.orders.add(ordersItem);
    return this;
  }

  /**
   * Список с обновленными заказами.
   * @return orders
   */
  @NotNull @Valid 
  @Schema(name = "orders", description = "Список с обновленными заказами.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("orders")
  public List<@Valid UpdateOrderStatusDTO> getOrders() {
    return orders;
  }

  public void setOrders(List<@Valid UpdateOrderStatusDTO> orders) {
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

