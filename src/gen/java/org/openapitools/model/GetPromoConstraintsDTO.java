package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Ограничения в акции.
 **/
@ApiModel(description = "Ограничения в акции.")
@JsonTypeName("GetPromoConstraintsDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromoConstraintsDTO   {
  private @Valid List<Long> warehouseIds;

  /**
   * Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. 
   **/
  public GetPromoConstraintsDTO warehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификаторы складов, для которых действует акция. Товары, которые лежат на других складах, не будут продаваться по акции.  Параметр возвращается, только если в условиях акции есть ограничение по складу. ")
  @JsonProperty("warehouseIds")
  public List<Long> getWarehouseIds() {
    return warehouseIds;
  }

  @JsonProperty("warehouseIds")
  public void setWarehouseIds(List<Long> warehouseIds) {
    this.warehouseIds = warehouseIds;
  }

  public GetPromoConstraintsDTO addWarehouseIdsItem(Long warehouseIdsItem) {
    if (this.warehouseIds == null) {
      this.warehouseIds = new ArrayList<>();
    }

    this.warehouseIds.add(warehouseIdsItem);
    return this;
  }

  public GetPromoConstraintsDTO removeWarehouseIdsItem(Long warehouseIdsItem) {
    if (warehouseIdsItem != null && this.warehouseIds != null) {
      this.warehouseIds.remove(warehouseIdsItem);
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

