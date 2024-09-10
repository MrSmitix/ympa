package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.WarehouseDTO;
import org.openapitools.server.model.WarehouseGroupDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о складах и группах складов.
 */
public class WarehousesDTO   {

    private List<@Valid WarehouseDTO> warehouses = new ArrayList<>();
    private List<@Valid WarehouseGroupDTO> warehouseGroups = new ArrayList<>();

    /**
     * Default constructor.
     */
    public WarehousesDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create WarehousesDTO.
     *
     * @param warehouses Список складов, не входящих в группы.
     * @param warehouseGroups Список групп складов.
     */
    public WarehousesDTO(
        List<@Valid WarehouseDTO> warehouses, 
        List<@Valid WarehouseGroupDTO> warehouseGroups
    ) {
        this.warehouses = warehouses;
        this.warehouseGroups = warehouseGroups;
    }



    /**
     * Список складов, не входящих в группы.
     * @return warehouses
     */
    public List<@Valid WarehouseDTO> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(List<@Valid WarehouseDTO> warehouses) {
        this.warehouses = warehouses;
    }

    /**
     * Список групп складов.
     * @return warehouseGroups
     */
    public List<@Valid WarehouseGroupDTO> getWarehouseGroups() {
        return warehouseGroups;
    }

    public void setWarehouseGroups(List<@Valid WarehouseGroupDTO> warehouseGroups) {
        this.warehouseGroups = warehouseGroups;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WarehousesDTO {\n");
        
        sb.append("    warehouses: ").append(toIndentedString(warehouses)).append("\n");
        sb.append("    warehouseGroups: ").append(toIndentedString(warehouseGroups)).append("\n");
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

