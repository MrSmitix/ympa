package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderDigitalItemDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Запрос на передачу ключей цифровых товаров.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Запрос на передачу ключей цифровых товаров.")
public class ProvideOrderDigitalCodesRequest   {
  
  private List<@Valid OrderDigitalItemDTO> items = new ArrayList<>();

  /**
   * Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. &#x60;id&#x60; у этих элементов должен быть один и тот же. 
   **/
  public ProvideOrderDigitalCodesRequest items(List<@Valid OrderDigitalItemDTO> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же. ")
  @JsonProperty("items")
  @NotNull
  public List<@Valid OrderDigitalItemDTO> getItems() {
    return items;
  }
  public void setItems(List<@Valid OrderDigitalItemDTO> items) {
    this.items = items;
  }

  public ProvideOrderDigitalCodesRequest addItemsItem(OrderDigitalItemDTO itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
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

