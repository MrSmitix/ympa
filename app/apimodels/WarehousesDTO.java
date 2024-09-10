package apimodels;

import apimodels.WarehouseDTO;
import apimodels.WarehouseGroupDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о складах и группах складов.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class WarehousesDTO   {
  @JsonProperty("warehouses")
  @NotNull
@Valid

  private List<@Valid WarehouseDTO> warehouses = new ArrayList<>();

  @JsonProperty("warehouseGroups")
  @NotNull
@Valid

  private List<@Valid WarehouseGroupDTO> warehouseGroups = new ArrayList<>();

  public WarehousesDTO warehouses(List<@Valid WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  public WarehousesDTO addWarehousesItem(WarehouseDTO warehousesItem) {
    if (this.warehouses == null) {
      this.warehouses = new ArrayList<>();
    }
    this.warehouses.add(warehousesItem);
    return this;
  }

   /**
   * Список складов, не входящих в группы.
   * @return warehouses
  **/
  public List<@Valid WarehouseDTO> getWarehouses() {
    return warehouses;
  }

  public void setWarehouses(List<@Valid WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

  public WarehousesDTO warehouseGroups(List<@Valid WarehouseGroupDTO> warehouseGroups) {
    this.warehouseGroups = warehouseGroups;
    return this;
  }

  public WarehousesDTO addWarehouseGroupsItem(WarehouseGroupDTO warehouseGroupsItem) {
    if (this.warehouseGroups == null) {
      this.warehouseGroups = new ArrayList<>();
    }
    this.warehouseGroups.add(warehouseGroupsItem);
    return this;
  }

   /**
   * Список групп складов.
   * @return warehouseGroups
  **/
  public List<@Valid WarehouseGroupDTO> getWarehouseGroups() {
    return warehouseGroups;
  }

  public void setWarehouseGroups(List<@Valid WarehouseGroupDTO> warehouseGroups) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

