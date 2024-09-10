package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.WarehouseStockType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об остатках товара.
 */
public class WarehouseStockDTO   {

    private WarehouseStockType type;
    private Long count;

    /**
     * Default constructor.
     */
    public WarehouseStockDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create WarehouseStockDTO.
     *
     * @param type type
     * @param count Значение остатков.
     */
    public WarehouseStockDTO(
        WarehouseStockType type, 
        Long count
    ) {
        this.type = type;
        this.count = count;
    }



    /**
     * Get type
     * @return type
     */
    public WarehouseStockType getType() {
        return type;
    }

    public void setType(WarehouseStockType type) {
        this.type = type;
    }

    /**
     * Значение остатков.
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WarehouseStockDTO {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

