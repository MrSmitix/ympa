package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.LinkedHashSet;
import java.util.Set;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Запрос отчета по товарам.
 **/
@ApiModel(description="Запрос отчета по товарам.")

public class GetGoodsStatsRequest  {
  
  @ApiModelProperty(required = true, value = "Список ваших идентификаторов SKU. ")
 /**
   * Список ваших идентификаторов SKU. 
  **/
  private Set<String> shopSkus = new LinkedHashSet<>();
 /**
   * Список ваших идентификаторов SKU. 
   * @return shopSkus
  **/
  @JsonProperty("shopSkus")
  public Set<String> getShopSkus() {
    return shopSkus;
  }

  public void setShopSkus(Set<String> shopSkus) {
    this.shopSkus = shopSkus;
  }

  public GetGoodsStatsRequest shopSkus(Set<String> shopSkus) {
    this.shopSkus = shopSkus;
    return this;
  }

  public GetGoodsStatsRequest addShopSkusItem(String shopSkusItem) {
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
    GetGoodsStatsRequest getGoodsStatsRequest = (GetGoodsStatsRequest) o;
    return Objects.equals(this.shopSkus, getGoodsStatsRequest.shopSkus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopSkus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGoodsStatsRequest {\n");
    
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

