package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WarehouseDTO;
import org.openapitools.model.WarehouseGroupDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о складах и группах складов.
 */
@ApiModel(description="Информация о складах и группах складов.")

public class WarehousesDTO  {
  
 /**
  * Список складов, не входящих в группы.
  */
  @ApiModelProperty(required = true, value = "Список складов, не входящих в группы.")
  @Valid
  private List<@Valid WarehouseDTO> warehouses = new ArrayList<>();

 /**
  * Список групп складов.
  */
  @ApiModelProperty(required = true, value = "Список групп складов.")
  @Valid
  private List<@Valid WarehouseGroupDTO> warehouseGroups = new ArrayList<>();
 /**
  * Список складов, не входящих в группы.
  * @return warehouses
  */
  @JsonProperty("warehouses")
  @NotNull
  public List<@Valid WarehouseDTO> getWarehouses() {
    return warehouses;
  }

  /**
   * Sets the <code>warehouses</code> property.
   */
 public void setWarehouses(List<@Valid WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

  /**
   * Sets the <code>warehouses</code> property.
   */
  public WarehousesDTO warehouses(List<@Valid WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  /**
   * Adds a new item to the <code>warehouses</code> list.
   */
  public WarehousesDTO addWarehousesItem(WarehouseDTO warehousesItem) {
    this.warehouses.add(warehousesItem);
    return this;
  }

 /**
  * Список групп складов.
  * @return warehouseGroups
  */
  @JsonProperty("warehouseGroups")
  @NotNull
  public List<@Valid WarehouseGroupDTO> getWarehouseGroups() {
    return warehouseGroups;
  }

  /**
   * Sets the <code>warehouseGroups</code> property.
   */
 public void setWarehouseGroups(List<@Valid WarehouseGroupDTO> warehouseGroups) {
    this.warehouseGroups = warehouseGroups;
  }

  /**
   * Sets the <code>warehouseGroups</code> property.
   */
  public WarehousesDTO warehouseGroups(List<@Valid WarehouseGroupDTO> warehouseGroups) {
    this.warehouseGroups = warehouseGroups;
    return this;
  }

  /**
   * Adds a new item to the <code>warehouseGroups</code> list.
   */
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

