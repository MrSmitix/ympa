package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.WarehouseDTO;
import com.prokarma.pkmst.model.WarehouseGroupDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о складах и группах складов.
 */
@ApiModel(description = "Информация о складах и группах складов.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehousesDTO   {
  @JsonProperty("warehouses")
  
  private List<WarehouseDTO> warehouses = new ArrayList<>();

  @JsonProperty("warehouseGroups")
  
  private List<WarehouseGroupDTO> warehouseGroups = new ArrayList<>();

  public WarehousesDTO warehouses(List<WarehouseDTO> warehouses) {
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
   */
  @ApiModelProperty(required = true, value = "Список складов, не входящих в группы.")
  public List<WarehouseDTO> getWarehouses() {
    return warehouses;
  }

  public void setWarehouses(List<WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

  public WarehousesDTO warehouseGroups(List<WarehouseGroupDTO> warehouseGroups) {
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
   */
  @ApiModelProperty(required = true, value = "Список групп складов.")
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

