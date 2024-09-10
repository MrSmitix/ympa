package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderBoxLayoutItemDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о коробке.
 */

@Schema(name = "OrderBoxLayoutDTO", description = "Информация о коробке.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderBoxLayoutDTO {

  @Valid
  private List<@Valid OrderBoxLayoutItemDTO> items = new ArrayList<>();

  public OrderBoxLayoutDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrderBoxLayoutDTO(List<@Valid OrderBoxLayoutItemDTO> items) {
    this.items = items;
  }

  public OrderBoxLayoutDTO items(List<@Valid OrderBoxLayoutItemDTO> items) {
    this.items = items;
    return this;
  }

  public OrderBoxLayoutDTO addItemsItem(OrderBoxLayoutItemDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
   * @return items
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "items", description = "Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid OrderBoxLayoutItemDTO> getItems() {
    return items;
  }

  public void setItems(List<@Valid OrderBoxLayoutItemDTO> items) {
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
    return Objects.equals(this.items, orderBoxLayoutDTO.items);
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

