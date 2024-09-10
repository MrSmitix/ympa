package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WarehouseDTO;
import org.openapitools.model.WarehouseGroupDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о складах и группах складов.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация о складах и группах складов.")
public class WarehousesDTO   {
  
  private List<@Valid WarehouseDTO> warehouses = new ArrayList<>();

  private List<@Valid WarehouseGroupDTO> warehouseGroups = new ArrayList<>();

  /**
   * Список складов, не входящих в группы.
   **/
  public WarehousesDTO warehouses(List<@Valid WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список складов, не входящих в группы.")
  @JsonProperty("warehouses")
  @NotNull
  public List<@Valid WarehouseDTO> getWarehouses() {
    return warehouses;
  }
  public void setWarehouses(List<@Valid WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

  public WarehousesDTO addWarehousesItem(WarehouseDTO warehousesItem) {
    if (this.warehouses == null) {
      this.warehouses = new ArrayList<>();
    }
    this.warehouses.add(warehousesItem);
    return this;
  }


  /**
   * Список групп складов.
   **/
  public WarehousesDTO warehouseGroups(List<@Valid WarehouseGroupDTO> warehouseGroups) {
    this.warehouseGroups = warehouseGroups;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список групп складов.")
  @JsonProperty("warehouseGroups")
  @NotNull
  public List<@Valid WarehouseGroupDTO> getWarehouseGroups() {
    return warehouseGroups;
  }
  public void setWarehouseGroups(List<@Valid WarehouseGroupDTO> warehouseGroups) {
    this.warehouseGroups = warehouseGroups;
  }

  public WarehousesDTO addWarehouseGroupsItem(WarehouseGroupDTO warehouseGroupsItem) {
    if (this.warehouseGroups == null) {
      this.warehouseGroups = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

