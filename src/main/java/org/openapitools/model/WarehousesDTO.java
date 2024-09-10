package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.WarehouseDTO;
import org.openapitools.model.WarehouseGroupDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о складах и группах складов.
 */

@Schema(name = "WarehousesDTO", description = "Информация о складах и группах складов.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class WarehousesDTO {

  @Valid
  private List<@Valid WarehouseDTO> warehouses = new ArrayList<>();

  @Valid
  private List<@Valid WarehouseGroupDTO> warehouseGroups = new ArrayList<>();

  public WarehousesDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public WarehousesDTO(List<@Valid WarehouseDTO> warehouses, List<@Valid WarehouseGroupDTO> warehouseGroups) {
    this.warehouses = warehouses;
    this.warehouseGroups = warehouseGroups;
  }

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
   */
  @NotNull @Valid 
  @Schema(name = "warehouses", description = "Список складов, не входящих в группы.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("warehouses")
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
   */
  @NotNull @Valid 
  @Schema(name = "warehouseGroups", description = "Список групп складов.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("warehouseGroups")
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

