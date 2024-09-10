package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WarehouseDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о группе складов.
 */

@Schema(name = "WarehouseGroupDTO", description = "Информация о группе складов.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehouseGroupDTO {

  private String name;

  private WarehouseDTO mainWarehouse;

  @Valid
  private List<@Valid WarehouseDTO> warehouses = new ArrayList<>();

  public WarehouseGroupDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WarehouseGroupDTO(String name, WarehouseDTO mainWarehouse, List<@Valid WarehouseDTO> warehouses) {
    this.name = name;
    this.mainWarehouse = mainWarehouse;
    this.warehouses = warehouses;
  }

  public WarehouseGroupDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Название группы складов.
   * @return name
   */
  @NotNull 
  @Schema(name = "name", description = "Название группы складов.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("name")
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
  @NotNull @Valid 
  @Schema(name = "mainWarehouse", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("mainWarehouse")
  public WarehouseDTO getMainWarehouse() {
    return mainWarehouse;
  }

  public void setMainWarehouse(WarehouseDTO mainWarehouse) {
    this.mainWarehouse = mainWarehouse;
  }

  public WarehouseGroupDTO warehouses(List<@Valid WarehouseDTO> warehouses) {
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
  @NotNull @Valid 
  @Schema(name = "warehouses", description = "Список складов, входящих в группу.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("warehouses")
  public List<@Valid WarehouseDTO> getWarehouses() {
    return warehouses;
  }

  public void setWarehouses(List<@Valid WarehouseDTO> warehouses) {
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

