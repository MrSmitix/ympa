package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.BriefOrderItemDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Краткие сведения о промаркированных товарах. Параметр возвращается, если ответ `OK`. 
 */
public class OrderItemsModificationResultDTO   {

    private List<@Valid BriefOrderItemDTO> items = new ArrayList<>();

    /**
     * Default constructor.
     */
    public OrderItemsModificationResultDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderItemsModificationResultDTO.
     *
     * @param items Список позиций в заказе, подлежащих маркировке.
     */
    public OrderItemsModificationResultDTO(
        List<@Valid BriefOrderItemDTO> items
    ) {
        this.items = items;
    }



    /**
     * Список позиций в заказе, подлежащих маркировке.
     * @return items
     */
    public List<@Valid BriefOrderItemDTO> getItems() {
        return items;
    }

    public void setItems(List<@Valid BriefOrderItemDTO> items) {
        this.items = items;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

