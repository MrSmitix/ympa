package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Ограничения в акции.
 */
public class GetPromoConstraintsDTO   {

    private List<Long> warehouseIds;

    /**
     * Default constructor.
     */
    public GetPromoConstraintsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetPromoConstraintsDTO.
     *
     * @param warehouseIds Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
     */
    public GetPromoConstraintsDTO(
        List<Long> warehouseIds
    ) {
        this.warehouseIds = warehouseIds;
    }



    /**
     * Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
     * @return warehouseIds
     */
    public List<Long> getWarehouseIds() {
        return warehouseIds;
    }

    public void setWarehouseIds(List<Long> warehouseIds) {
        this.warehouseIds = warehouseIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPromoConstraintsDTO {\n");
        
        sb.append("    warehouseIds: ").append(toIndentedString(warehouseIds)).append("\n");
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

