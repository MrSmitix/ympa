/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderDigitalItemDTO;



/**
 * Запрос на передачу ключей цифровых товаров.
 */

@ApiModel(description = "Запрос на передачу ключей цифровых товаров.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ProvideOrderDigitalCodesRequest   {
  
  private List<OrderDigitalItemDTO> items = new ArrayList<>();

  /**
   * Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же. 
   */
  public ProvideOrderDigitalCodesRequest items(List<OrderDigitalItemDTO> items) {
    this.items = items;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же. ")
  @JsonProperty("items")
  public List<OrderDigitalItemDTO> getItems() {
    return items;
  }
  public void setItems(List<OrderDigitalItemDTO> items) {
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
    return Objects.equals(items, provideOrderDigitalCodesRequest.items);
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

