package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OrderDigitalItemDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос на передачу ключей цифровых товаров.
 */
public class ProvideOrderDigitalCodesRequest   {

    private List<@Valid OrderDigitalItemDTO> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ProvideOrderDigitalCodesRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create ProvideOrderDigitalCodesRequest.
     *
     * @param items Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. &#x60;id&#x60; у этих элементов должен быть один и тот же. 
     */
    public ProvideOrderDigitalCodesRequest(
        List<@Valid OrderDigitalItemDTO> items
    ) {
        this.items = items;
    }



    /**
     * Список проданных ключей.  Если в заказе есть несколько **одинаковых** товаров (например, несколько ключей к одной и той же подписке), передайте каждый в виде отдельного элемента массива. `id` у этих элементов должен быть один и тот же. 
     * @return items
     */
    public List<@Valid OrderDigitalItemDTO> getItems() {
        return items;
    }

    public void setItems(List<@Valid OrderDigitalItemDTO> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

