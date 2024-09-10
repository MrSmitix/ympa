package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Ограничения в акции.
 */
@ApiModel(description = "Ограничения в акции.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoConstraintsDTO   {
  @JsonProperty("warehouseIds")
  
  private List<Long> warehouseIds = null;

  public GetPromoConstraintsDTO warehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
    return this;
  }

  public GetPromoConstraintsDTO addWarehouseIdsItem(Long warehouseIdsItem) {
    if (this.warehouseIds == null) {
      this.warehouseIds = new ArrayList<>();
    }
    this.warehouseIds.add(warehouseIdsItem);
    return this;
  }

  /**
   * Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
   * @return warehouseIds
   */
  @ApiModelProperty(value = "Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. ")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

