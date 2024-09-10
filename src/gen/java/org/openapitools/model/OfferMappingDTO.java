/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о текущей карточке товара на Маркете.
 */
@ApiModel(description = "Информация о текущей карточке товара на Маркете.")
@JsonPropertyOrder({
  OfferMappingDTO.JSON_PROPERTY_MARKET_SKU,
  OfferMappingDTO.JSON_PROPERTY_MODEL_ID,
  OfferMappingDTO.JSON_PROPERTY_CATEGORY_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferMappingDTO   {
  public static final String JSON_PROPERTY_MARKET_SKU = "marketSku";
  @JsonProperty(JSON_PROPERTY_MARKET_SKU)
  private Long marketSku;

  public static final String JSON_PROPERTY_MODEL_ID = "modelId";
  @JsonProperty(JSON_PROPERTY_MODEL_ID)
  private Long modelId;

  public static final String JSON_PROPERTY_CATEGORY_ID = "categoryId";
  @JsonProperty(JSON_PROPERTY_CATEGORY_ID)
  private Long categoryId;

  public OfferMappingDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

  /**
   * SKU на Маркете.
   * @return marketSku
   **/
  @JsonProperty(value = "marketSku")
  @ApiModelProperty(value = "SKU на Маркете.")
  
  public Long getMarketSku() {
    return marketSku;
  }

  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  public OfferMappingDTO modelId(Long modelId) {
    this.modelId = modelId;
    return this;
  }

  /**
   * Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр &#x60;marketSku&#x60;), но одинаковый идентификатор модели товара. 
   * @return modelId
   **/
  @JsonProperty(value = "modelId")
  @ApiModelProperty(value = "Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. ")
  
  public Long getModelId() {
    return modelId;
  }

  public void setModelId(Long modelId) {
    this.modelId = modelId;
  }

  public OfferMappingDTO categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * Идентификатор категории для текущей карточки товара на Маркете.
   * @return categoryId
   **/
  @JsonProperty(value = "categoryId")
  @ApiModelProperty(value = "Идентификатор категории для текущей карточки товара на Маркете.")
  
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferMappingDTO offerMappingDTO = (OfferMappingDTO) o;
    return Objects.equals(this.marketSku, offerMappingDTO.marketSku) &&
        Objects.equals(this.modelId, offerMappingDTO.modelId) &&
        Objects.equals(this.categoryId, offerMappingDTO.categoryId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marketSku, modelId, categoryId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferMappingDTO {\n");
    
    sb.append("    marketSku: ").append(toIndentedString(marketSku)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
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

