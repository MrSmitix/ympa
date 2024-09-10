package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WarehouseDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о группе складов.
 **/
@ApiModel(description="Информация о группе складов.")

public class WarehouseGroupDTO  {
  
  @ApiModelProperty(required = true, value = "Название группы складов.")
 /**
   * Название группы складов.
  **/
  private String name;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private WarehouseDTO mainWarehouse;

  @ApiModelProperty(required = true, value = "Список складов, входящих в группу.")
  @Valid
 /**
   * Список складов, входящих в группу.
  **/
  private List<@Valid WarehouseDTO> warehouses = new ArrayList<>();
 /**
   * Название группы складов.
   * @return name
  **/
  @JsonProperty("name")
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WarehouseGroupDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
   * Get mainWarehouse
   * @return mainWarehouse
  **/
  @JsonProperty("mainWarehouse")
  @NotNull
  public WarehouseDTO getMainWarehouse() {
    return mainWarehouse;
  }

  public void setMainWarehouse(WarehouseDTO mainWarehouse) {
    this.mainWarehouse = mainWarehouse;
  }

  public WarehouseGroupDTO mainWarehouse(WarehouseDTO mainWarehouse) {
    this.mainWarehouse = mainWarehouse;
    return this;
  }

 /**
   * Список складов, входящих в группу.
   * @return warehouses
  **/
  @JsonProperty("warehouses")
  @NotNull
  public List<@Valid WarehouseDTO> getWarehouses() {
    return warehouses;
  }

  public void setWarehouses(List<@Valid WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

  public WarehouseGroupDTO warehouses(List<@Valid WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  public WarehouseGroupDTO addWarehousesItem(WarehouseDTO warehousesItem) {
    this.warehouses.add(warehousesItem);
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
    WarehouseGroupDTO warehouseGroupDTO = (WarehouseGroupDTO) o;
    return Objects.equals(this.name, warehouseGroupDTO.name) &&
        Objects.equals(this.mainWarehouse, warehouseGroupDTO.mainWarehouse) &&
        Objects.equals(this.warehouses, warehouseGroupDTO.warehouses);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

