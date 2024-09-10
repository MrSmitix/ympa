package apimodels;

import apimodels.GoodsStatsGoodsDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Отчет по товарам.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GoodsStatsDTO   {
  @JsonProperty("shopSkus")
  @NotNull
@Valid

  private List<@Valid GoodsStatsGoodsDTO> shopSkus = new ArrayList<>();

  public GoodsStatsDTO shopSkus(List<@Valid GoodsStatsGoodsDTO> shopSkus) {
    this.shopSkus = shopSkus;
    return this;
  }

  public GoodsStatsDTO addShopSkusItem(GoodsStatsGoodsDTO shopSkusItem) {
    if (this.shopSkus == null) {
      this.shopSkus = new ArrayList<>();
    }
    this.shopSkus.add(shopSkusItem);
    return this;
  }

   /**
   * Список товаров.
   * @return shopSkus
  **/
  public List<@Valid GoodsStatsGoodsDTO> getShopSkus() {
    return shopSkus;
  }

  public void setShopSkus(List<@Valid GoodsStatsGoodsDTO> shopSkus) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

