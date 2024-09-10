package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.FulfillmentWarehouseDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список складов Маркета (FBY).
 */
public class FulfillmentWarehousesDTO   {

    private List<@Valid FulfillmentWarehouseDTO> warehouses = new ArrayList<>();

    /**
     * Default constructor.
     */
    public FulfillmentWarehousesDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FulfillmentWarehousesDTO.
     *
     * @param warehouses Список складов Маркета (FBY).
     */
    public FulfillmentWarehousesDTO(
        List<@Valid FulfillmentWarehouseDTO> warehouses
    ) {
        this.warehouses = warehouses;
    }



    /**
     * Список складов Маркета (FBY).
     * @return warehouses
     */
    public List<@Valid FulfillmentWarehouseDTO> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(List<@Valid FulfillmentWarehouseDTO> warehouses) {
        this.warehouses = warehouses;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FulfillmentWarehousesDTO {\n");
        
        sb.append("    warehouses: ").append(toIndentedString(warehouses)).append("\n");
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

