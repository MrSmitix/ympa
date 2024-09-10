package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderBoxLayoutItemDTO;



/**
 * Информация о коробке.
 **/

@ApiModel(description = "Информация о коробке.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderBoxLayoutDTO   {
  @JsonProperty("items")
  private List<OrderBoxLayoutItemDTO> items = new ArrayList<>();

  /**
   * Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
   **/
  public OrderBoxLayoutDTO items(List<OrderBoxLayoutItemDTO> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. ")
  @JsonProperty("items")
  public List<OrderBoxLayoutItemDTO> getItems() {
    return items;
  }
  public void setItems(List<OrderBoxLayoutItemDTO> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderBoxLayoutDTO orderBoxLayoutDTO = (OrderBoxLayoutDTO) o;
    return Objects.equals(items, orderBoxLayoutDTO.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBoxLayoutDTO {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

