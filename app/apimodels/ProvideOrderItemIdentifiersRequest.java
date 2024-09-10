package apimodels;

import apimodels.OrderItemInstanceModificationDTO;
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
 * ProvideOrderItemIdentifiersRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ProvideOrderItemIdentifiersRequest   {
  @JsonProperty("items")
  @NotNull
@Valid

  private List<@Valid OrderItemInstanceModificationDTO> items = new ArrayList<>();

  public ProvideOrderItemIdentifiersRequest items(List<@Valid OrderItemInstanceModificationDTO> items) {
    this.items = items;
    return this;
  }

  public ProvideOrderItemIdentifiersRequest addItemsItem(OrderItemInstanceModificationDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Список позиций, требующих маркировки. 
   * @return items
  **/
  public List<@Valid OrderItemInstanceModificationDTO> getItems() {
    return items;
  }

  public void setItems(List<@Valid OrderItemInstanceModificationDTO> items) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

