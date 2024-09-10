package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Информация о текущей карточке товара на Маркете.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferMappingDTO   {
  
  private Long marketSku;
  private Long modelId;
  private Long categoryId;

  public OfferMappingDTO () {

  }

  public OfferMappingDTO (Long marketSku, Long modelId, Long categoryId) {
    this.marketSku = marketSku;
    this.modelId = modelId;
    this.categoryId = categoryId;
  }

    
  @JsonProperty("marketSku")
  public Long getMarketSku() {
    return marketSku;
  }
  public void setMarketSku(Long marketSku) {
    this.marketSku = marketSku;
  }

    
  @JsonProperty("modelId")
  public Long getModelId() {
    return modelId;
  }
  public void setModelId(Long modelId) {
    this.modelId = modelId;
  }

    
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
