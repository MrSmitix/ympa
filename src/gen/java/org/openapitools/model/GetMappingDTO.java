package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Информация о товарах в каталоге. 
 */
@ApiModel(description = "Информация о товарах в каталоге. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetMappingDTO   {
  @JsonProperty("marketSku")
  private Long marketSku;

  @JsonProperty("marketSkuName")
  private String marketSkuName;

  @JsonProperty("marketModelId")
  private Long marketModelId;

  @JsonProperty("marketModelName")
  private String marketModelName;

  @JsonProperty("marketCategoryId")
  private Long marketCategoryId;

  @JsonProperty("marketCategoryName")
  private String marketCategoryName;

  public GetMappingDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

   /**
   * SKU на Маркете.
   * @return marketSku
  **/
  @ApiModelProperty(value = "SKU на Маркете.")
  public Long getMarketSku() {
    return marketSku;
  }

  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  public GetMappingDTO marketSkuName(String marketSkuName) {
    this.marketSkuName = marketSkuName;
    return this;
  }

   /**
   * Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
   * @return marketSkuName
  **/
  @ApiModelProperty(value = "Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ")
  public String getMarketSkuName() {
    return marketSkuName;
  }

  public void setMarketSkuName(String marketSkuName) {
    this.marketSkuName = marketSkuName;
  }

  public GetMappingDTO marketModelId(Long marketModelId) {
    this.marketModelId = marketModelId;
    return this;
  }

   /**
   * Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
   * @return marketModelId
  **/
  @ApiModelProperty(value = "Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ")
  public Long getMarketModelId() {
    return marketModelId;
  }

  public void setMarketModelId(Long marketModelId) {
    this.marketModelId = marketModelId;
  }

  public GetMappingDTO marketModelName(String marketModelName) {
    this.marketModelName = marketModelName;
    return this;
  }

   /**
   * Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
   * @return marketModelName
  **/
  @ApiModelProperty(value = "Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ")
  public String getMarketModelName() {
    return marketModelName;
  }

  public void setMarketModelName(String marketModelName) {
    this.marketModelName = marketModelName;
  }

  public GetMappingDTO marketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
    return this;
  }

   /**
   * Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
   * @return marketCategoryId
  **/
  @ApiModelProperty(value = "Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. ")
  public Long getMarketCategoryId() {
    return marketCategoryId;
  }

  public void setMarketCategoryId(Long marketCategoryId) {
    this.marketCategoryId = marketCategoryId;
  }

  public GetMappingDTO marketCategoryName(String marketCategoryName) {
    this.marketCategoryName = marketCategoryName;
    return this;
  }

   /**
   * Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
   * @return marketCategoryName
  **/
  @ApiModelProperty(value = "Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. ")
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

