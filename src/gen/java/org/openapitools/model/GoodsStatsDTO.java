package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GoodsStatsGoodsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Отчет по товарам.
 **/
@ApiModel(description = "Отчет по товарам.")
@JsonTypeName("GoodsStatsDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsStatsDTO   {
  private @Valid List<@Valid GoodsStatsGoodsDTO> shopSkus = new ArrayList<>();

  /**
   * Список товаров.
   **/
  public GoodsStatsDTO shopSkus(List<@Valid GoodsStatsGoodsDTO> shopSkus) {
    this.shopSkus = shopSkus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров.")
  @JsonProperty("shopSkus")
  @NotNull @Valid public List<@Valid GoodsStatsGoodsDTO> getShopSkus() {
    return shopSkus;
  }

  @JsonProperty("shopSkus")
  public void setShopSkus(List<@Valid GoodsStatsGoodsDTO> shopSkus) {
    this.shopSkus = shopSkus;
  }

  public GoodsStatsDTO addShopSkusItem(GoodsStatsGoodsDTO shopSkusItem) {
    if (this.shopSkus == null) {
      this.shopSkus = new ArrayList<>();
    }

    this.shopSkus.add(shopSkusItem);
    return this;
  }

  public GoodsStatsDTO removeShopSkusItem(GoodsStatsGoodsDTO shopSkusItem) {
    if (shopSkusItem != null && this.shopSkus != null) {
      this.shopSkus.remove(shopSkusItem);
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
    GoodsStatsDTO goodsStatsDTO = (GoodsStatsDTO) o;
    return Objects.equals(this.shopSkus, goodsStatsDTO.shopSkus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopSkus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsStatsDTO {\n");
    
    sb.append("    shopSkus: ").append(toIndentedString(shopSkus)).append("\n");
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

