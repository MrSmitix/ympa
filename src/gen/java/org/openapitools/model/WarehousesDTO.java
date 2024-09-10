package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WarehouseDTO;
import org.openapitools.model.WarehouseGroupDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о складах и группах складов.
 **/
@ApiModel(description="Информация о складах и группах складов.")

public class WarehousesDTO  {
  
  @ApiModelProperty(required = true, value = "Список складов, не входящих в группы.")
 /**
   * Список складов, не входящих в группы.
  **/
  private List<WarehouseDTO> warehouses = new ArrayList<>();

  @ApiModelProperty(required = true, value = "Список групп складов.")
 /**
   * Список групп складов.
  **/
  private List<WarehouseGroupDTO> warehouseGroups = new ArrayList<>();
 /**
   * Список складов, не входящих в группы.
   * @return warehouses
  **/
  @JsonProperty("warehouses")
  public List<WarehouseDTO> getWarehouses() {
    return warehouses;
  }

  public void setWarehouses(List<WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

  public WarehousesDTO warehouses(List<WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  public WarehousesDTO addWarehousesItem(WarehouseDTO warehousesItem) {
    this.warehouses.add(warehousesItem);
    return this;
  }

 /**
   * Список групп складов.
   * @return warehouseGroups
  **/
  @JsonProperty("warehouseGroups")
  public List<WarehouseGroupDTO> getWarehouseGroups() {
    return warehouseGroups;
  }

  public void setWarehouseGroups(List<WarehouseGroupDTO> warehouseGroups) {
    this.warehouseGroups = warehouseGroups;
  }

  public WarehousesDTO warehouseGroups(List<WarehouseGroupDTO> warehouseGroups) {
    this.warehouseGroups = warehouseGroups;
    return this;
  }

  public WarehousesDTO addWarehouseGroupsItem(WarehouseGroupDTO warehouseGroupsItem) {
    this.warehouseGroups.add(warehouseGroupsItem);
    return this;
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
    return Objects.equals(this.warehouses, warehousesDTO.warehouses) &&
        Objects.equals(this.warehouseGroups, warehousesDTO.warehouseGroups);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

