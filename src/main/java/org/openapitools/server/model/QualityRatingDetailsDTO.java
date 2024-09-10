package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.QualityRatingAffectedOrderDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о заказах, которые повлияли на индекс качества.
 */
public class QualityRatingDetailsDTO   {

    private List<@Valid QualityRatingAffectedOrderDTO> affectedOrders = new ArrayList<>();

    /**
     * Default constructor.
     */
    public QualityRatingDetailsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create QualityRatingDetailsDTO.
     *
     * @param affectedOrders Список заказов, которые повлияли на индекс качества.
     */
    public QualityRatingDetailsDTO(
        List<@Valid QualityRatingAffectedOrderDTO> affectedOrders
    ) {
        this.affectedOrders = affectedOrders;
    }



    /**
     * Список заказов, которые повлияли на индекс качества.
     * @return affectedOrders
     */
    public List<@Valid QualityRatingAffectedOrderDTO> getAffectedOrders() {
        return affectedOrders;
    }

    public void setAffectedOrders(List<@Valid QualityRatingAffectedOrderDTO> affectedOrders) {
        this.affectedOrders = affectedOrders;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityRatingDetailsDTO {\n");
        
        sb.append("    affectedOrders: ").append(toIndentedString(affectedOrders)).append("\n");
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

