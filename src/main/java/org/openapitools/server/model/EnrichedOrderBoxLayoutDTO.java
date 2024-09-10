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
public class EnrichedOrderBoxLayoutDTO   {

    private List<@Valid OrderBoxLayoutItemDTO> items = new ArrayList<>();
    private Long boxId;

    /**
     * Default constructor.
     */
    public EnrichedOrderBoxLayoutDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create EnrichedOrderBoxLayoutDTO.
     *
     * @param items Список товаров в коробке.  Если в коробке едет часть большого товара, в списке может быть только один пункт. 
     * @param boxId Идентификатор коробки.
     */
    public EnrichedOrderBoxLayoutDTO(
        List<@Valid OrderBoxLayoutItemDTO> items, 
        Long boxId
    ) {
        this.items = items;
        this.boxId = boxId;
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
     * Идентификатор коробки.
     * @return boxId
     */
    public Long getBoxId() {
        return boxId;
    }

    public void setBoxId(Long boxId) {
        this.boxId = boxId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnrichedOrderBoxLayoutDTO {\n");
        
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    boxId: ").append(toIndentedString(boxId)).append("\n");
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

