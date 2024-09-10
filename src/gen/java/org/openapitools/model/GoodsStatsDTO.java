package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GoodsStatsGoodsDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Отчет по товарам.
 */
@ApiModel(description="Отчет по товарам.")

public class GoodsStatsDTO  {
  
 /**
  * Список товаров.
  */
  @ApiModelProperty(required = true, value = "Список товаров.")
  @Valid
  private List<@Valid GoodsStatsGoodsDTO> shopSkus = new ArrayList<>();
 /**
  * Список товаров.
  * @return shopSkus
  */
  @JsonProperty("shopSkus")
  @NotNull
  public List<@Valid GoodsStatsGoodsDTO> getShopSkus() {
    return shopSkus;
  }

  /**
   * Sets the <code>shopSkus</code> property.
   */
 public void setShopSkus(List<@Valid GoodsStatsGoodsDTO> shopSkus) {
    this.shopSkus = shopSkus;
  }

  /**
   * Sets the <code>shopSkus</code> property.
   */
  public GoodsStatsDTO shopSkus(List<@Valid GoodsStatsGoodsDTO> shopSkus) {
    this.shopSkus = shopSkus;
    return this;
  }

  /**
   * Adds a new item to the <code>shopSkus</code> list.
   */
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

