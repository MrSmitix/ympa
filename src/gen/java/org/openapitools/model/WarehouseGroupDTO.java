package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WarehouseDTO;



/**
 * Информация о группе складов.
 **/

@ApiModel(description = "Информация о группе складов.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehouseGroupDTO   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("mainWarehouse")
  private WarehouseDTO mainWarehouse;

  @JsonProperty("warehouses")
  private List<WarehouseDTO> warehouses = new ArrayList<>();

  /**
   * Название группы складов.
   **/
  public WarehouseGroupDTO name(String name) {
    this.name = name;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Название группы складов.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
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
  public WarehouseDTO getMainWarehouse() {
    return mainWarehouse;
  }
  public void setMainWarehouse(WarehouseDTO mainWarehouse) {
    this.mainWarehouse = mainWarehouse;
  }

  /**
   * Список складов, входящих в группу.
   **/
  public WarehouseGroupDTO warehouses(List<WarehouseDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список складов, входящих в группу.")
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

