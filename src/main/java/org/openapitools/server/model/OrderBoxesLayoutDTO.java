package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.EnrichedOrderBoxLayoutDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Распределение товаров по коробкам.
 */
public class OrderBoxesLayoutDTO   {

    private List<@Valid EnrichedOrderBoxLayoutDTO> boxes = new ArrayList<>();

    /**
     * Default constructor.
     */
    public OrderBoxesLayoutDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderBoxesLayoutDTO.
     *
     * @param boxes Список коробок.
     */
    public OrderBoxesLayoutDTO(
        List<@Valid EnrichedOrderBoxLayoutDTO> boxes
    ) {
        this.boxes = boxes;
    }



    /**
     * Список коробок.
     * @return boxes
     */
    public List<@Valid EnrichedOrderBoxLayoutDTO> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<@Valid EnrichedOrderBoxLayoutDTO> boxes) {
        this.boxes = boxes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderBoxesLayoutDTO {\n");
        
        sb.append("    boxes: ").append(toIndentedString(boxes)).append("\n");
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

