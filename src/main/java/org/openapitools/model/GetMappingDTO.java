package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о товарах в каталоге. 
 */

@Schema(name = "GetMappingDTO", description = "Информация о товарах в каталоге. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetMappingDTO {

  private Long marketSku;

  private String marketSkuName;

  private Long marketModelId;

  private String marketModelName;

  private Long marketCategoryId;

  private String marketCategoryName;

  public GetMappingDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

  /**
   * SKU на Маркете.
   * @return marketSku
   */
  
  @Schema(name = "marketSku", description = "SKU на Маркете.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketSku")
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
   */
  
  @Schema(name = "marketSkuName", description = "Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketSkuName")
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
   */
  
  @Schema(name = "marketModelId", description = "Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketModelId")
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
   */
  
  @Schema(name = "marketModelName", description = "Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketModelName")
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
   */
  
  @Schema(name = "marketCategoryId", description = "Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("marketCategoryId")
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
   */
  
  @Schema(name = "marketCategoryName", description = "Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

