package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.WarehouseDTO;
import org.openapitools.vertxweb.server.model.WarehouseGroupDTO;

/**
 * Информация о складах и группах складов.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WarehousesDTO   {
  
  private List<WarehouseDTO> warehouses = new ArrayList<>();
  private List<WarehouseGroupDTO> warehouseGroups = new ArrayList<>();

  public WarehousesDTO () {

  }

  public WarehousesDTO (List<WarehouseDTO> warehouses, List<WarehouseGroupDTO> warehouseGroups) {
    this.warehouses = warehouses;
    this.warehouseGroups = warehouseGroups;
  }

    
  @JsonProperty("warehouses")
  public List<WarehouseDTO> getWarehouses() {
    return warehouses;
  }
  public void setWarehouses(List<WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

    
  @JsonProperty("warehouseGroups")
  public List<WarehouseGroupDTO> getWarehouseGroups() {
    return warehouseGroups;
  }
  public void setWarehouseGroups(List<WarehouseGroupDTO> warehouseGroups) {
    this.warehouseGroups = warehouseGroups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WarehousesDTO warehousesDTO = (WarehousesDTO) o;
    return Objects.equals(warehouses, warehousesDTO.warehouses) &&
        Objects.equals(warehouseGroups, warehousesDTO.warehouseGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouses, warehouseGroups);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
