package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Запрос отчета по товарам.
 */
@ApiModel(description = "Запрос отчета по товарам.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetGoodsStatsRequest   {
  @JsonProperty("shopSkus")
  
  private Set<String> shopSkus = new LinkedHashSet<>();

  public GetGoodsStatsRequest shopSkus(Set<String> shopSkus) {
    this.shopSkus = shopSkus;
    return this;
  }

  public GetGoodsStatsRequest addShopSkusItem(String shopSkusItem) {
    if (this.shopSkus == null) {
      this.shopSkus = new LinkedHashSet<>();
    }
    this.shopSkus.add(shopSkusItem);
    return this;
  }

  /**
   * Список ваших идентификаторов SKU. 
   * @return shopSkus
   */
  @ApiModelProperty(required = true, value = "Список ваших идентификаторов SKU. ")
  public Set<String> getShopSkus() {
    return shopSkus;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setShopSkus(Set<String> shopSkus) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

