package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GoodsStatsGoodsDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Отчет по товарам.
 */

@Schema(name = "GoodsStatsDTO", description = "Отчет по товарам.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GoodsStatsDTO {

  @Valid
  private List<@Valid GoodsStatsGoodsDTO> shopSkus = new ArrayList<>();

  public GoodsStatsDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GoodsStatsDTO(List<@Valid GoodsStatsGoodsDTO> shopSkus) {
    this.shopSkus = shopSkus;
  }

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
   */
  @NotNull @Valid 
  @Schema(name = "shopSkus", description = "Список товаров.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("shopSkus")
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

