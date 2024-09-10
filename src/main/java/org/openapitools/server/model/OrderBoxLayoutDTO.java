package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OrderBoxLayoutItemDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о коробке.
 */
public class OrderBoxLayoutDTO   {

    private List<@Valid OrderBoxLayoutItemDTO> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public OrderBoxLayoutDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderBoxLayoutDTO.
     *
     * @param items Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
     */
    public OrderBoxLayoutDTO(
        List<@Valid OrderBoxLayoutItemDTO> items
    ) {
        this.items = items;
    }



    /**
     * Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
     * @return items
     */
    public List<@Valid OrderBoxLayoutItemDTO> getItems() {
        return items;
    }

    public void setItems(List<@Valid OrderBoxLayoutItemDTO> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

