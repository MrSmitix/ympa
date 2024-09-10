package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Информация о товарах в каталоге. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetMappingDTO   {
  
  private Long marketSku;
  private String marketSkuName;
  private Long marketModelId;
  private String marketModelName;
  private Long marketCategoryId;
  private String marketCategoryName;

  /**
   * SKU на Маркете.
   **/
  
  @ApiModelProperty(value = "SKU на Маркете.")
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }
  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  /**
   * Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
   **/
  
  @ApiModelProperty(value = "Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ")
  @JsonProperty("marketSkuName")
  public String getMarketSkuName() {
    return marketSkuName;
  }
  public void setMarketSkuName(String marketSkuName) {
    this.marketSkuName = marketSkuName;
  }

  /**
   * Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
   **/
  
  @ApiModelProperty(value = "Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ")
  @JsonProperty("marketModelId")
  public Long getMarketModelId() {
    return marketModelId;
  }
  public void setMarketModelId(Long marketModelId) {
    this.marketModelId = marketModelId;
  }

  /**
   * Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
   **/
  
  @ApiModelProperty(value = "Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ")
  @JsonProperty("marketModelName")
  public String getMarketModelName() {
    return marketModelName;
  }
  public void setMarketModelName(String marketModelName) {
    this.marketModelName = marketModelName;
  }

  /**
   * Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
   **/
  
  @ApiModelProperty(value = "Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. ")
  @JsonProperty("marketCategoryId")
  public Long getMarketCategoryId() {
    return marketCategoryId;
  }
  public void setMarketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
  }

  /**
   * Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
   **/
  
  @ApiModelProperty(value = "Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. ")
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
    return Objects.equals(this.marketSku, getMappingDTO.marketSku) &&
        Objects.equals(this.marketSkuName, getMappingDTO.marketSkuName) &&
        Objects.equals(this.marketModelId, getMappingDTO.marketModelId) &&
        Objects.equals(this.marketModelName, getMappingDTO.marketModelName) &&
        Objects.equals(this.marketCategoryId, getMappingDTO.marketCategoryId) &&
        Objects.equals(this.marketCategoryName, getMappingDTO.marketCategoryName);
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

