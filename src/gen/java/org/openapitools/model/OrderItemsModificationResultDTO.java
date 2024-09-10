package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BriefOrderItemDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ `OK`. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderItemsModificationResultDTO   {
  
  private List<@Valid BriefOrderItemDTO> items = new ArrayList<>();

  /**
   * Список позиций в заказе, подлежащих маркировке.
   **/
  
  @ApiModelProperty(required = true, value = "Список позиций в заказе, подлежащих маркировке.")
  @JsonProperty("items")
  @NotNull
  @Valid
  public List<@Valid BriefOrderItemDTO> getItems() {
    return items;
  }
  public void setItems(List<@Valid BriefOrderItemDTO> items) {
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
    return Objects.equals(this.items, orderItemsModificationResultDTO.items);
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

