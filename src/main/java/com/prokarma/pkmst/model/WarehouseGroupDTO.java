package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.WarehouseDTO;
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
 * Информация о группе складов.
 */
@ApiModel(description = "Информация о группе складов.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehouseGroupDTO   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("mainWarehouse")
  private WarehouseDTO mainWarehouse;

  @JsonProperty("warehouses")
  
  private List<WarehouseDTO> warehouses = new ArrayList<>();

  public WarehouseGroupDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название группы складов.
   * @return name
   */
  @ApiModelProperty(required = true, value = "Название группы складов.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public WarehouseGroupDTO mainWarehouse(WarehouseDTO mainWarehouse) {
    this.mainWarehouse = mainWarehouse;
    return this;
  }

  /**
   * Get mainWarehouse
   * @return mainWarehouse
   */
  @ApiModelProperty(required = true, value = "")
  public WarehouseDTO getMainWarehouse() {
    return mainWarehouse;
  }

  public void setMainWarehouse(WarehouseDTO mainWarehouse) {
    this.mainWarehouse = mainWarehouse;
  }

  public WarehouseGroupDTO warehouses(List<WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  public WarehouseGroupDTO addWarehousesItem(WarehouseDTO warehousesItem) {
    if (this.warehouses == null) {
      this.warehouses = new ArrayList<>();
    }
    this.warehouses.add(warehousesItem);
    return this;
  }

  /**
   * Список складов, входящих в группу.
   * @return warehouses
   */
  @ApiModelProperty(required = true, value = "Список складов, входящих в группу.")
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

