package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GoodsStatsGoodsDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Отчет по товарам.
 **/
@ApiModel(description="Отчет по товарам.")

public class GoodsStatsDTO  {
  
  @ApiModelProperty(required = true, value = "Список товаров.")
 /**
   * Список товаров.
  **/
  private List<GoodsStatsGoodsDTO> shopSkus = new ArrayList<>();
 /**
   * Список товаров.
   * @return shopSkus
  **/
  @JsonProperty("shopSkus")
  public List<GoodsStatsGoodsDTO> getShopSkus() {
    return shopSkus;
  }

  public void setShopSkus(List<GoodsStatsGoodsDTO> shopSkus) {
    this.shopSkus = shopSkus;
  }

  public GoodsStatsDTO shopSkus(List<GoodsStatsGoodsDTO> shopSkus) {
    this.shopSkus = shopSkus;
    return this;
  }

  public GoodsStatsDTO addShopSkusItem(GoodsStatsGoodsDTO shopSkusItem) {
    this.shopSkus.add(shopSkusItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

