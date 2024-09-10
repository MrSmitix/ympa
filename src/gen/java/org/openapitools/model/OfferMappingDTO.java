package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о текущей карточке товара на Маркете.
 **/
@ApiModel(description="Информация о текущей карточке товара на Маркете.")

public class OfferMappingDTO  {
  
  @ApiModelProperty(value = "SKU на Маркете.")
 /**
   * SKU на Маркете.
  **/
  private Long marketSku;

  @ApiModelProperty(value = "Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. ")
 /**
   * Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. 
  **/
  private Long modelId;

  @ApiModelProperty(value = "Идентификатор категории для текущей карточки товара на Маркете.")
 /**
   * Идентификатор категории для текущей карточки товара на Маркете.
  **/
  private Long categoryId;
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

  public OfferMappingDTO marketSku(Long marketSku) {
    this.marketSku = marketSku;
    return this;
  }

 /**
   * Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр &#x60;marketSku&#x60;), но одинаковый идентификатор модели товара. 
   * @return modelId
  **/
  @JsonProperty("modelId")
  public Long getModelId() {
    return modelId;
  }

  public void setModelId(Long modelId) {
    this.modelId = modelId;
  }

  public OfferMappingDTO modelId(Long modelId) {
    this.modelId = modelId;
    return this;
  }

 /**
   * Идентификатор категории для текущей карточки товара на Маркете.
   * @return categoryId
  **/
  @JsonProperty("categoryId")
  public Long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Long categoryId) {
    this.categoryId = categoryId;
  }

  public OfferMappingDTO categoryId(Long categoryId) {
    this.categoryId = categoryId;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

