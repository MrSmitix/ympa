package org.openapitools.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Запрос отчета по товарам.
 */
@ApiModel(description="Запрос отчета по товарам.")

public class GetGoodsStatsRequest  {
  
 /**
  * Список ваших идентификаторов SKU. 
  */
  @ApiModelProperty(required = true, value = "Список ваших идентификаторов SKU. ")
  private Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSkus = new LinkedHashSet<>();
 /**
  * Список ваших идентификаторов SKU. 
  * @return shopSkus
  */
  @JsonProperty("shopSkus")
  @NotNull
 @Size(min=1,max=500)  public Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getShopSkus() {
    return shopSkus;
  }

  /**
   * Sets the <code>shopSkus</code> property.
   */
 @JsonDeserialize(as = LinkedHashSet.class)
 public void setShopSkus(Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSkus) {
    this.shopSkus = shopSkus;
  }

  /**
   * Sets the <code>shopSkus</code> property.
   */
  public GetGoodsStatsRequest shopSkus(Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> shopSkus) {
    this.shopSkus = shopSkus;
    return this;
  }

  /**
   * Adds a new item to the <code>shopSkus</code> list.
   */
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

