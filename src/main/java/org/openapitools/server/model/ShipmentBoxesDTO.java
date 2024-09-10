package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ParcelBoxDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
 */
public class ShipmentBoxesDTO   {

    private List<@Valid ParcelBoxDTO> boxes = new ArrayList<>();

    /**
     * Default constructor.
     */
    public ShipmentBoxesDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ShipmentBoxesDTO.
     *
     * @param boxes Список грузовых мест. Маркет определил количество мест по длине этого списка. 
     */
    public ShipmentBoxesDTO(
        List<@Valid ParcelBoxDTO> boxes
    ) {
        this.boxes = boxes;
    }



    /**
     * Список грузовых мест. Маркет определил количество мест по длине этого списка. 
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
        sb.append("class ShipmentBoxesDTO {\n");
        
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

