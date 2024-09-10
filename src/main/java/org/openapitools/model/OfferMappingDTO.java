/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Информация о текущей карточке товара на Маркете.
 */

@ApiModel(description = "Информация о текущей карточке товара на Маркете.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferMappingDTO   {
  
  private Long marketSku;
  private Long modelId;
  private Long categoryId;

  /**
   * SKU на Маркете.
   */
  public OfferMappingDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

  
  @ApiModelProperty(value = "SKU на Маркете.")
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }
  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

  /**
   * Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. 
   */
  public OfferMappingDTO modelId(Long modelId) {
    this.modelId = modelId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. ")
  @JsonProperty("modelId")
  public Long getModelId() {
    return modelId;
  }
  public void setModelId(Long modelId) {
    this.modelId = modelId;
  }

  /**
   * Идентификатор категории для текущей карточки товара на Маркете.
   */
  public OfferMappingDTO categoryId(Long categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификатор категории для текущей карточки товара на Маркете.")
  @JsonProperty("categoryId")
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
    return Objects.equals(marketSku, offerMappingDTO.marketSku) &&
        Objects.equals(modelId, offerMappingDTO.modelId) &&
        Objects.equals(categoryId, offerMappingDTO.categoryId);
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

