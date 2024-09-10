package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о товарах в каталоге. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

