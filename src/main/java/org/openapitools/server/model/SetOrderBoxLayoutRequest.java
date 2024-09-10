package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OrderBoxLayoutDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class SetOrderBoxLayoutRequest   {

    private List<@Valid OrderBoxLayoutDTO> boxes = new ArrayList<>();
    private Boolean allowRemove = false;

    /**
     * Default constructor.
     */
    public SetOrderBoxLayoutRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create SetOrderBoxLayoutRequest.
     *
     * @param boxes Список коробок.
     * @param allowRemove Передайте &#x60;true&#x60;, если вы собираетесь удалить часть товаров из заказа.
     */
    public SetOrderBoxLayoutRequest(
        List<@Valid OrderBoxLayoutDTO> boxes, 
        Boolean allowRemove
    ) {
        this.boxes = boxes;
        this.allowRemove = allowRemove;
    }



    /**
     * Список коробок.
     * @return boxes
     */
    public List<@Valid OrderBoxLayoutDTO> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<@Valid OrderBoxLayoutDTO> boxes) {
        this.boxes = boxes;
    }

    /**
     * Передайте `true`, если вы собираетесь удалить часть товаров из заказа.
     * @return allowRemove
     */
    public Boolean getAllowRemove() {
        return allowRemove;
    }

    public void setAllowRemove(Boolean allowRemove) {
        this.allowRemove = allowRemove;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetOrderBoxLayoutRequest {\n");
        
        sb.append("    boxes: ").append(toIndentedString(boxes)).append("\n");
        sb.append("    allowRemove: ").append(toIndentedString(allowRemove)).append("\n");
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

