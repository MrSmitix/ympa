package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ограничения в акции.
 **/
@ApiModel(description="Ограничения в акции.")

public class GetPromoConstraintsDTO  {
  
  @ApiModelProperty(value = "Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. ")
 /**
   * Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
  **/
  private List<Long> warehouseIds;
 /**
   * Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
   * @return warehouseIds
  **/
  @JsonProperty("warehouseIds")
  public List<Long> getWarehouseIds() {
    return warehouseIds;
  }

  public void setWarehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
  }

  public GetPromoConstraintsDTO warehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
    return this;
  }

  public GetPromoConstraintsDTO addWarehouseIdsItem(Long warehouseIdsItem) {
    this.warehouseIds.add(warehouseIdsItem);
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
    GetPromoConstraintsDTO getPromoConstraintsDTO = (GetPromoConstraintsDTO) o;
    return Objects.equals(this.warehouseIds, getPromoConstraintsDTO.warehouseIds);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

