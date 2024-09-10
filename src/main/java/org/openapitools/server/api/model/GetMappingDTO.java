package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Информация о товарах в каталоге. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetMappingDTO   {
  
  private Long marketSku;
  private String marketSkuName;
  private Long marketModelId;
  private String marketModelName;
  private Long marketCategoryId;
  private String marketCategoryName;

  public GetMappingDTO () {

  }

  public GetMappingDTO (Long marketSku, String marketSkuName, Long marketModelId, String marketModelName, Long marketCategoryId, String marketCategoryName) {
    this.marketSku = marketSku;
    this.marketSkuName = marketSkuName;
    this.marketModelId = marketModelId;
    this.marketModelName = marketModelName;
    this.marketCategoryId = marketCategoryId;
    this.marketCategoryName = marketCategoryName;
  }

    
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }
  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

    
  @JsonProperty("marketSkuName")
  public String getMarketSkuName() {
    return marketSkuName;
  }
  public void setMarketSkuName(String marketSkuName) {
    this.marketSkuName = marketSkuName;
  }

    
  @JsonProperty("marketModelId")
  public Long getMarketModelId() {
    return marketModelId;
  }
  public void setMarketModelId(Long marketModelId) {
    this.marketModelId = marketModelId;
  }

    
  @JsonProperty("marketModelName")
  public String getMarketModelName() {
    return marketModelName;
  }
  public void setMarketModelName(String marketModelName) {
    this.marketModelName = marketModelName;
  }

    
  @JsonProperty("marketCategoryId")
  public Long getMarketCategoryId() {
    return marketCategoryId;
  }
  public void setMarketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
  }

    
  @JsonProperty("marketCategoryName")
  public String getMarketCategoryName() {
    return marketCategoryName;
  }
  public void setMarketCategoryName(String marketCategoryName) {
    this.marketCategoryName = marketCategoryName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMappingDTO getMappingDTO = (GetMappingDTO) o;
    return Objects.equals(marketSku, getMappingDTO.marketSku) &&
        Objects.equals(marketSkuName, getMappingDTO.marketSkuName) &&
        Objects.equals(marketModelId, getMappingDTO.marketModelId) &&
        Objects.equals(marketModelName, getMappingDTO.marketModelName) &&
        Objects.equals(marketCategoryId, getMappingDTO.marketCategoryId) &&
        Objects.equals(marketCategoryName, getMappingDTO.marketCategoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketSku, marketSkuName, marketModelId, marketModelName, marketCategoryId, marketCategoryName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMappingDTO {\n");
    
    sb.append("    marketSku: ").append(toIndentedString(marketSku)).append("\n");
    sb.append("    marketSkuName: ").append(toIndentedString(marketSkuName)).append("\n");
    sb.append("    marketModelId: ").append(toIndentedString(marketModelId)).append("\n");
    sb.append("    marketModelName: ").append(toIndentedString(marketModelName)).append("\n");
    sb.append("    marketCategoryId: ").append(toIndentedString(marketCategoryId)).append("\n");
    sb.append("    marketCategoryName: ").append(toIndentedString(marketCategoryName)).append("\n");
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
