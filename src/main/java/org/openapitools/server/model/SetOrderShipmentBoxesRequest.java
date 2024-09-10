package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ParcelBoxDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class SetOrderShipmentBoxesRequest   {

    private List<@Valid ParcelBoxDTO> boxes = new ArrayList<>();

    /**
     * Default constructor.
     */
    public SetOrderShipmentBoxesRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create SetOrderShipmentBoxesRequest.
     *
     * @param boxes Список грузовых мест. Маркет определяет количество мест по длине этого списка.
     */
    public SetOrderShipmentBoxesRequest(
        List<@Valid ParcelBoxDTO> boxes
    ) {
        this.boxes = boxes;
    }



    /**
     * Список грузовых мест. Маркет определяет количество мест по длине этого списка.
     * @return boxes
     */
    public List<@Valid ParcelBoxDTO> getBoxes() {
        return boxes;
    }

    public void setBoxes(List<@Valid ParcelBoxDTO> boxes) {
        this.boxes = boxes;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetOrderShipmentBoxesRequest {\n");
        
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

