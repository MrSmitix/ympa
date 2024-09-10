package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.GoodsStatsWarehouseDTO;
import org.openapitools.server.api.model.GoodsStatsWeightDimensionsDTO;
import org.openapitools.server.api.model.TariffDTO;

/**
 * Информация о товаре.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GoodsStatsGoodsDTO   {
  
  private String shopSku;
  private Long marketSku;
  private String name;
  private BigDecimal price;
  private Long categoryId;
  private String categoryName;
  private GoodsStatsWeightDimensionsDTO weightDimensions;
  private List<GoodsStatsWarehouseDTO> warehouses;
  private List<TariffDTO> tariffs;
  private List<String> pictures;

  public GoodsStatsGoodsDTO () {

  }

  public GoodsStatsGoodsDTO (String shopSku, Long marketSku, String name, BigDecimal price, Long categoryId, String categoryName, GoodsStatsWeightDimensionsDTO weightDimensions, List<GoodsStatsWarehouseDTO> warehouses, List<TariffDTO> tariffs, List<String> pictures) {
    this.shopSku = shopSku;
    this.marketSku = marketSku;
    this.name = name;
    this.price = price;
    this.categoryId = categoryId;
    this.categoryName = categoryName;
    this.weightDimensions = weightDimensions;
    this.warehouses = warehouses;
    this.tariffs = tariffs;
    this.pictures = pictures;
  }

    
  @JsonProperty("shopSku")
  public String getShopSku() {
    return shopSku;
  }
  public void setShopSku(String shopSku) {
    this.shopSku = shopSku;
  }

    
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }
  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }
  public void setPrice(BigDecimal price) {
    this.price = price;
  }

    
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }
  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

    
  @JsonProperty("categoryName")
  public String getCategoryName() {
    return categoryName;
  }
  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
  }

    
  @JsonProperty("weightDimensions")
  public GoodsStatsWeightDimensionsDTO getWeightDimensions() {
    return weightDimensions;
  }
  public void setWeightDimensions(GoodsStatsWeightDimensionsDTO weightDimensions) {
    this.weightDimensions = weightDimensions;
  }

    
  @JsonProperty("warehouses")
  public List<GoodsStatsWarehouseDTO> getWarehouses() {
    return warehouses;
  }
  public void setWarehouses(List<GoodsStatsWarehouseDTO> warehouses) {
    this.warehouses = warehouses;
  }

    
  @JsonProperty("tariffs")
  public List<TariffDTO> getTariffs() {
    return tariffs;
  }
  public void setTariffs(List<TariffDTO> tariffs) {
    this.tariffs = tariffs;
  }

    
  @JsonProperty("pictures")
  public List<String> getPictures() {
    return pictures;
  }
  public void setPictures(List<String> pictures) {
    this.pictures = pictures;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GoodsStatsGoodsDTO goodsStatsGoodsDTO = (GoodsStatsGoodsDTO) o;
    return Objects.equals(shopSku, goodsStatsGoodsDTO.shopSku) &&
        Objects.equals(marketSku, goodsStatsGoodsDTO.marketSku) &&
        Objects.equals(name, goodsStatsGoodsDTO.name) &&
        Objects.equals(price, goodsStatsGoodsDTO.price) &&
        Objects.equals(categoryId, goodsStatsGoodsDTO.categoryId) &&
        Objects.equals(categoryName, goodsStatsGoodsDTO.categoryName) &&
        Objects.equals(weightDimensions, goodsStatsGoodsDTO.weightDimensions) &&
        Objects.equals(warehouses, goodsStatsGoodsDTO.warehouses) &&
        Objects.equals(tariffs, goodsStatsGoodsDTO.tariffs) &&
        Objects.equals(pictures, goodsStatsGoodsDTO.pictures);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopSku, marketSku, name, price, categoryId, categoryName, weightDimensions, warehouses, tariffs, pictures);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GoodsStatsGoodsDTO {\n");
    
    sb.append("    shopSku: ").append(toIndentedString(shopSku)).append("\n");
    sb.append("    marketSku: ").append(toIndentedString(marketSku)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    weightDimensions: ").append(toIndentedString(weightDimensions)).append("\n");
    sb.append("    warehouses: ").append(toIndentedString(warehouses)).append("\n");
    sb.append("    tariffs: ").append(toIndentedString(tariffs)).append("\n");
    sb.append("    pictures: ").append(toIndentedString(pictures)).append("\n");
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
