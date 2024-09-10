package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FulfillmentWarehouseDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список складов Маркета (FBY).
 **/
@ApiModel(description="Список складов Маркета (FBY).")

public class FulfillmentWarehousesDTO  {
  
  @ApiModelProperty(required = true, value = "Список складов Маркета (FBY).")
 /**
   * Список складов Маркета (FBY).
  **/
  private List<FulfillmentWarehouseDTO> warehouses = new ArrayList<>();
 /**
   * Список складов Маркета (FBY).
   * @return warehouses
  **/
  @JsonProperty("warehouses")
  public List<FulfillmentWarehouseDTO> getWarehouses() {
    return warehouses;
  }

  public void setWarehouses(List<FulfillmentWarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

  public FulfillmentWarehousesDTO warehouses(List<FulfillmentWarehouseDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  public FulfillmentWarehousesDTO addWarehousesItem(FulfillmentWarehouseDTO warehousesItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

