package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Ограничения в акции.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPromoConstraintsDTO   {
  
  private List<Long> warehouseIds;

  public GetPromoConstraintsDTO () {

  }

  public GetPromoConstraintsDTO (List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
  }

    
  @JsonProperty("warehouseIds")
  public List<Long> getWarehouseIds() {
    return warehouseIds;
  }
  public void setWarehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetPromoConstraintsDTO getPromoConstraintsDTO = (GetPromoConstraintsDTO) o;
    return Objects.equals(warehouseIds, getPromoConstraintsDTO.warehouseIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(warehouseIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromoConstraintsDTO {\n");
    
    sb.append("    warehouseIds: ").append(toIndentedString(warehouseIds)).append("\n");
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
