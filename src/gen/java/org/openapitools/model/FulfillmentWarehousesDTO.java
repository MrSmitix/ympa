package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FulfillmentWarehouseDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список складов Маркета (FBY).
 */
@ApiModel(description="Список складов Маркета (FBY).")

public class FulfillmentWarehousesDTO  {
  
 /**
  * Список складов Маркета (FBY).
  */
  @ApiModelProperty(required = true, value = "Список складов Маркета (FBY).")
  @Valid
  private List<@Valid FulfillmentWarehouseDTO> warehouses = new ArrayList<>();
 /**
  * Список складов Маркета (FBY).
  * @return warehouses
  */
  @JsonProperty("warehouses")
  @NotNull
  public List<@Valid FulfillmentWarehouseDTO> getWarehouses() {
    return warehouses;
  }

  /**
   * Sets the <code>warehouses</code> property.
   */
 public void setWarehouses(List<@Valid FulfillmentWarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

  /**
   * Sets the <code>warehouses</code> property.
   */
  public FulfillmentWarehousesDTO warehouses(List<@Valid FulfillmentWarehouseDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  /**
   * Adds a new item to the <code>warehouses</code> list.
   */
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

