package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateOrderStatusDTO;



/**
 * Список заказов, статус которых обновился.
 **/

@ApiModel(description = "Список заказов, статус которых обновился.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateOrderStatusesDTO   {
  @JsonProperty("orders")
  private List<UpdateOrderStatusDTO> orders = new ArrayList<>();

  /**
   * Список с обновленными заказами.
   **/
  public UpdateOrderStatusesDTO orders(List<UpdateOrderStatusDTO> orders) {
    this.orders = orders;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список с обновленными заказами.")
  @JsonProperty("orders")
  public List<UpdateOrderStatusDTO> getOrders() {
    return orders;
  }
  public void setOrders(List<UpdateOrderStatusDTO> orders) {
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
    return Objects.equals(orders, updateOrderStatusesDTO.orders);
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

