package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GoodsStatsGoodsDTO;



/**
 * Отчет по товарам.
 **/

@ApiModel(description = "Отчет по товарам.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsStatsDTO   {
  @JsonProperty("shopSkus")
  private List<GoodsStatsGoodsDTO> shopSkus = new ArrayList<>();

  /**
   * Список товаров.
   **/
  public GoodsStatsDTO shopSkus(List<GoodsStatsGoodsDTO> shopSkus) {
    this.shopSkus = shopSkus;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список товаров.")
  @JsonProperty("shopSkus")
  public List<GoodsStatsGoodsDTO> getShopSkus() {
    return shopSkus;
  }
  public void setShopSkus(List<GoodsStatsGoodsDTO> shopSkus) {
    this.shopSkus = shopSkus;
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
    return Objects.equals(shopSkus, goodsStatsDTO.shopSkus);
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

