package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о текущей карточке товара на Маркете.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferMappingDTO   {
  @JsonProperty("marketSku")
  
  private Long marketSku;

  @JsonProperty("modelId")
  
  private Long modelId;

  @JsonProperty("categoryId")
  
  private Long categoryId;

  public OfferMappingDTO marketSku(Long marketSku) {
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

  public OfferMappingDTO modelId(Long modelId) {
    this.modelId = modelId;
    return this;
  }

   /**
   * Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. 
   * @return modelId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

