package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderItemInstanceModificationDTO;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ProvideOrderItemIdentifiersRequest   {
  @JsonProperty("items")
  private List<OrderItemInstanceModificationDTO> items = new ArrayList<>();

  /**
   * Список позиций, требующих маркировки. 
   **/
  public ProvideOrderItemIdentifiersRequest items(List<OrderItemInstanceModificationDTO> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список позиций, требующих маркировки. ")
  @JsonProperty("items")
  public List<OrderItemInstanceModificationDTO> getItems() {
    return items;
  }
  public void setItems(List<OrderItemInstanceModificationDTO> items) {
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
    ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest = (ProvideOrderItemIdentifiersRequest) o;
    return Objects.equals(items, provideOrderItemIdentifiersRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvideOrderItemIdentifiersRequest {\n");
    
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

