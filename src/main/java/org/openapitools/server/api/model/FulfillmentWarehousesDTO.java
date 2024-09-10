package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.FulfillmentWarehouseDTO;

/**
 * Список складов Маркета (FBY).
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FulfillmentWarehousesDTO   {
  
  private List<FulfillmentWarehouseDTO> warehouses = new ArrayList<>();

  public FulfillmentWarehousesDTO () {

  }

  public FulfillmentWarehousesDTO (List<FulfillmentWarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

    
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
