package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FulfillmentWarehouseDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Список складов Маркета (FBY).
 **/
@ApiModel(description = "Список складов Маркета (FBY).")
@JsonTypeName("FulfillmentWarehousesDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FulfillmentWarehousesDTO   {
  private @Valid List<@Valid FulfillmentWarehouseDTO> warehouses = new ArrayList<>();

  /**
   * Список складов Маркета (FBY).
   **/
  public FulfillmentWarehousesDTO warehouses(List<@Valid FulfillmentWarehouseDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список складов Маркета (FBY).")
  @JsonProperty("warehouses")
  @NotNull @Valid public List<@Valid FulfillmentWarehouseDTO> getWarehouses() {
    return warehouses;
  }

  @JsonProperty("warehouses")
  public void setWarehouses(List<@Valid FulfillmentWarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

  public FulfillmentWarehousesDTO addWarehousesItem(FulfillmentWarehouseDTO warehousesItem) {
    if (this.warehouses == null) {
      this.warehouses = new ArrayList<>();
    }

    this.warehouses.add(warehousesItem);
    return this;
  }

  public FulfillmentWarehousesDTO removeWarehousesItem(FulfillmentWarehouseDTO warehousesItem) {
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

