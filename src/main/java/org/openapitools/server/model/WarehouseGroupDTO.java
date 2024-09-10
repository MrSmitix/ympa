package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.WarehouseDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о группе складов.
 */
public class WarehouseGroupDTO   {

    private String name;
    private WarehouseDTO mainWarehouse;
    private List<@Valid WarehouseDTO> warehouses = new ArrayList<>();

    /**
     * Default constructor.
     */
    public WarehouseGroupDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create WarehouseGroupDTO.
     *
     * @param name Название группы складов.
     * @param mainWarehouse mainWarehouse
     * @param warehouses Список складов, входящих в группу.
     */
    public WarehouseGroupDTO(
        String name, 
        WarehouseDTO mainWarehouse, 
        List<@Valid WarehouseDTO> warehouses
    ) {
        this.name = name;
        this.mainWarehouse = mainWarehouse;
        this.warehouses = warehouses;
    }



    /**
     * Название группы складов.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get mainWarehouse
     * @return mainWarehouse
     */
    public WarehouseDTO getMainWarehouse() {
        return mainWarehouse;
    }

    public void setMainWarehouse(WarehouseDTO mainWarehouse) {
        this.mainWarehouse = mainWarehouse;
    }

    /**
     * Список складов, входящих в группу.
     * @return warehouses
     */
    public List<@Valid WarehouseDTO> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(List<@Valid WarehouseDTO> warehouses) {
        this.warehouses = warehouses;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WarehouseGroupDTO {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    mainWarehouse: ").append(toIndentedString(mainWarehouse)).append("\n");
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

