package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FulfillmentWarehouseDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список складов Маркета (FBY).
 */

@Schema(name = "FulfillmentWarehousesDTO", description = "Список складов Маркета (FBY).")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FulfillmentWarehousesDTO {

  @Valid
  private List<@Valid FulfillmentWarehouseDTO> warehouses = new ArrayList<>();

  public FulfillmentWarehousesDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FulfillmentWarehousesDTO(List<@Valid FulfillmentWarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

  public FulfillmentWarehousesDTO warehouses(List<@Valid FulfillmentWarehouseDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  public FulfillmentWarehousesDTO addWarehousesItem(FulfillmentWarehouseDTO warehousesItem) {
    if (this.warehouses == null) {
      this.warehouses = new ArrayList<>();
    }
    this.warehouses.add(warehousesItem);
    return this;
  }

  /**
   * Список складов Маркета (FBY).
   * @return warehouses
   */
  @NotNull @Valid 
  @Schema(name = "warehouses", description = "Список складов Маркета (FBY).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("warehouses")
  public List<@Valid FulfillmentWarehouseDTO> getWarehouses() {
    return warehouses;
  }

  public void setWarehouses(List<@Valid FulfillmentWarehouseDTO> warehouses) {
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
    FulfillmentWarehousesDTO fulfillmentWarehousesDTO = (FulfillmentWarehousesDTO) o;
    return Objects.equals(this.warehouses, fulfillmentWarehousesDTO.warehouses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FulfillmentWarehousesDTO {\n");
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

