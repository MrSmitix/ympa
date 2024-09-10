package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.FulfillmentWarehouseDTO;



/**
 * Список складов Маркета (FBY).
 **/

@ApiModel(description = "Список складов Маркета (FBY).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class FulfillmentWarehousesDTO   {
  @JsonProperty("warehouses")
  private List<FulfillmentWarehouseDTO> warehouses = new ArrayList<>();

  /**
   * Список складов Маркета (FBY).
   **/
  public FulfillmentWarehousesDTO warehouses(List<FulfillmentWarehouseDTO> warehouses) {
    this.warehouses = warehouses;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список складов Маркета (FBY).")
  @JsonProperty("warehouses")
  public List<FulfillmentWarehouseDTO> getWarehouses() {
    return warehouses;
  }
  public void setWarehouses(List<FulfillmentWarehouseDTO> warehouses) {
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
    return Objects.equals(warehouses, fulfillmentWarehousesDTO.warehouses);
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

