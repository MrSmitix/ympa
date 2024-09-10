package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.WarehouseDTO;

/**
 * Информация о группе складов.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WarehouseGroupDTO   {
  
  private String name;
  private WarehouseDTO mainWarehouse;
  private List<WarehouseDTO> warehouses = new ArrayList<>();

  public WarehouseGroupDTO () {

  }

  public WarehouseGroupDTO (String name, WarehouseDTO mainWarehouse, List<WarehouseDTO> warehouses) {
    this.name = name;
    this.mainWarehouse = mainWarehouse;
    this.warehouses = warehouses;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("mainWarehouse")
  public WarehouseDTO getMainWarehouse() {
    return mainWarehouse;
  }
  public void setMainWarehouse(WarehouseDTO mainWarehouse) {
    this.mainWarehouse = mainWarehouse;
  }

    
  @JsonProperty("warehouses")
  public List<WarehouseDTO> getWarehouses() {
    return warehouses;
  }
  public void setWarehouses(List<WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarehouseGroupDTO warehouseGroupDTO = (WarehouseGroupDTO) o;
    return Objects.equals(name, warehouseGroupDTO.name) &&
        Objects.equals(mainWarehouse, warehouseGroupDTO.mainWarehouse) &&
        Objects.equals(warehouses, warehouseGroupDTO.warehouses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, mainWarehouse, warehouses);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
