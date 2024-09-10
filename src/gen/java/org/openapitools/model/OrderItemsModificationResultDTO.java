package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BriefOrderItemDTO;



/**
 * Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ &#x60;OK&#x60;. 
 **/

@ApiModel(description = "Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ `OK`. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderItemsModificationResultDTO   {
  @JsonProperty("items")
  private List<BriefOrderItemDTO> items = new ArrayList<>();

  /**
   * Список позиций в заказе, подлежащих маркировке.
   **/
  public OrderItemsModificationResultDTO items(List<BriefOrderItemDTO> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список позиций в заказе, подлежащих маркировке.")
  @JsonProperty("items")
  public List<BriefOrderItemDTO> getItems() {
    return items;
  }
  public void setItems(List<BriefOrderItemDTO> items) {
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
    OrderItemsModificationResultDTO orderItemsModificationResultDTO = (OrderItemsModificationResultDTO) o;
    return Objects.equals(items, orderItemsModificationResultDTO.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItemsModificationResultDTO {\n");
    
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

