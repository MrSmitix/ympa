package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderDigitalItemDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Запрос на передачу ключей цифровых товаров.
 */

@Schema(name = "ProvideOrderDigitalCodesRequest", description = "Запрос на передачу ключей цифровых товаров.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ProvideOrderDigitalCodesRequest {

  @Valid
  private List<@Valid OrderDigitalItemDTO> items = new ArrayList<>();

  public ProvideOrderDigitalCodesRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ProvideOrderDigitalCodesRequest(List<@Valid OrderDigitalItemDTO> items) {
    this.items = items;
  }

  public ProvideOrderDigitalCodesRequest items(List<@Valid OrderDigitalItemDTO> items) {
    this.items = items;
    return this;
  }

  public ProvideOrderDigitalCodesRequest addItemsItem(OrderDigitalItemDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же. 
   * @return items
   */
  @NotNull @Valid 
  @Schema(name = "items", description = "Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же. ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("items")
  public List<@Valid OrderDigitalItemDTO> getItems() {
    return items;
  }

  public void setItems(List<@Valid OrderDigitalItemDTO> items) {
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
    ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest = (ProvideOrderDigitalCodesRequest) o;
    return Objects.equals(this.items, provideOrderDigitalCodesRequest.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvideOrderDigitalCodesRequest {\n");
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

