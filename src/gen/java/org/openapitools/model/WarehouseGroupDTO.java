package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WarehouseDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация о группе складов.
 **/
@ApiModel(description = "Информация о группе складов.")
@JsonTypeName("WarehouseGroupDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehouseGroupDTO   {
  private String name;
  private WarehouseDTO mainWarehouse;
  private @Valid List<@Valid WarehouseDTO> warehouses = new ArrayList<>();

  /**
   * Название группы складов.
   **/
  public WarehouseGroupDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Название группы складов.")
  @JsonProperty("name")
  @NotNull public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  public WarehouseGroupDTO mainWarehouse(WarehouseDTO mainWarehouse) {
    this.mainWarehouse = mainWarehouse;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("mainWarehouse")
  @NotNull @Valid public WarehouseDTO getMainWarehouse() {
    return mainWarehouse;
  }

  @JsonProperty("mainWarehouse")
  public void setMainWarehouse(WarehouseDTO mainWarehouse) {
    this.mainWarehouse = mainWarehouse;
  }

  /**
   * Список складов, входящих в группу.
   **/
  public WarehouseGroupDTO warehouses(List<@Valid WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список складов, входящих в группу.")
  @JsonProperty("warehouses")
  @NotNull @Valid public List<@Valid WarehouseDTO> getWarehouses() {
    return warehouses;
  }

  @JsonProperty("warehouses")
  public void setWarehouses(List<@Valid WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

  public WarehouseGroupDTO addWarehousesItem(WarehouseDTO warehousesItem) {
    if (this.warehouses == null) {
      this.warehouses = new ArrayList<>();
    }

    this.warehouses.add(warehousesItem);
    return this;
  }

  public WarehouseGroupDTO removeWarehousesItem(WarehouseDTO warehousesItem) {
    if (warehousesItem != null && this.warehouses != null) {
      this.warehouses.remove(warehousesItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

