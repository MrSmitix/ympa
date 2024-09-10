package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderItemInstanceModificationDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProvideOrderItemIdentifiersRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ProvideOrderItemIdentifiersRequest {

  @Valid
  private List<@Valid OrderItemInstanceModificationDTO> items = new ArrayList<>();

  public ProvideOrderItemIdentifiersRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProvideOrderItemIdentifiersRequest(List<@Valid OrderItemInstanceModificationDTO> items) {
    this.items = items;
  }

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
   */
  @NotNull @Valid 
  @Schema(name = "items", description = "Список позиций, требующих маркировки. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
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
    return Objects.equals(this.items, provideOrderItemIdentifiersRequest.items);
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

