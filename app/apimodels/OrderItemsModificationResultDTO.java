package apimodels;

import apimodels.BriefOrderItemDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ &#x60;OK&#x60;. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderItemsModificationResultDTO   {
  @JsonProperty("items")
  @NotNull
@Valid

  private List<@Valid BriefOrderItemDTO> items = new ArrayList<>();

  public OrderItemsModificationResultDTO items(List<@Valid BriefOrderItemDTO> items) {
    this.items = items;
    return this;
  }

  public OrderItemsModificationResultDTO addItemsItem(BriefOrderItemDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Список позиций в заказе, подлежащих маркировке.
   * @return items
  **/
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
    return Objects.equals(items, orderItemsModificationResultDTO.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

