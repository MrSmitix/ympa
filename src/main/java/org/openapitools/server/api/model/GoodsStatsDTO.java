package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.GoodsStatsGoodsDTO;

/**
 * Отчет по товарам.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GoodsStatsDTO   {
  
  private List<GoodsStatsGoodsDTO> shopSkus = new ArrayList<>();

  public GoodsStatsDTO () {

  }

  public GoodsStatsDTO (List<GoodsStatsGoodsDTO> shopSkus) {
    this.shopSkus = shopSkus;
  }

    
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
