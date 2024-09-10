package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о товарах в каталоге. 
 **/
@ApiModel(description="Информация о товарах в каталоге. ")

public class GetMappingDTO  {
  
  @ApiModelProperty(value = "SKU на Маркете.")
 /**
   * SKU на Маркете.
  **/
  private Long marketSku;

  @ApiModelProperty(value = "Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ")
 /**
   * Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
  **/
  private String marketSkuName;

  @ApiModelProperty(value = "Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ")
 /**
   * Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
  **/
  private Long marketModelId;

  @ApiModelProperty(value = "Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ")
 /**
   * Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
  **/
  private String marketModelName;

  @ApiModelProperty(value = "Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. ")
 /**
   * Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
  **/
  private Long marketCategoryId;

  @ApiModelProperty(value = "Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. ")
 /**
   * Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
  **/
  private String marketCategoryName;
 /**
   * SKU на Маркете.
   * @return marketSku
  **/
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }

  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  public GetMappingDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

 /**
   * Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
   * @return marketSkuName
  **/
  @JsonProperty("marketSkuName")
  public String getMarketSkuName() {
    return marketSkuName;
  }

  public void setMarketSkuName(String marketSkuName) {
    this.marketSkuName = marketSkuName;
  }

  public GetMappingDTO marketSkuName(String marketSkuName) {
    this.marketSkuName = marketSkuName;
    return this;
  }

 /**
   * Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
   * @return marketModelId
  **/
  @JsonProperty("marketModelId")
  public Long getMarketModelId() {
    return marketModelId;
  }

  public void setMarketModelId(Long marketModelId) {
    this.marketModelId = marketModelId;
  }

  public GetMappingDTO marketModelId(Long marketModelId) {
    this.marketModelId = marketModelId;
    return this;
  }

 /**
   * Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
   * @return marketModelName
  **/
  @JsonProperty("marketModelName")
  public String getMarketModelName() {
    return marketModelName;
  }

  public void setMarketModelName(String marketModelName) {
    this.marketModelName = marketModelName;
  }

  public GetMappingDTO marketModelName(String marketModelName) {
    this.marketModelName = marketModelName;
    return this;
  }

 /**
   * Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
   * @return marketCategoryId
  **/
  @JsonProperty("marketCategoryId")
  public Long getMarketCategoryId() {
    return marketCategoryId;
  }

  public void setMarketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
  }

  public GetMappingDTO marketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
    return this;
  }

 /**
   * Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
   * @return marketCategoryName
  **/
  @JsonProperty("marketCategoryName")
  public String getMarketCategoryName() {
    return marketCategoryName;
  }

  public void setMarketCategoryName(String marketCategoryName) {
    this.marketCategoryName = marketCategoryName;
  }

  public GetMappingDTO marketCategoryName(String marketCategoryName) {
    this.marketCategoryName = marketCategoryName;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

