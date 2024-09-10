package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о текущей карточке товара на Маркете.
 */
public class OfferMappingDTO   {

    private Long marketSku;
    private Long modelId;
    private Long categoryId;

    /**
     * Default constructor.
     */
    public OfferMappingDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferMappingDTO.
     *
     * @param marketSku SKU на Маркете.
     * @param modelId Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр &#x60;marketSku&#x60;), но одинаковый идентификатор модели товара. 
     * @param categoryId Идентификатор категории для текущей карточки товара на Маркете.
     */
    public OfferMappingDTO(
        Long marketSku, 
        Long modelId, 
        Long categoryId
    ) {
        this.marketSku = marketSku;
        this.modelId = modelId;
        this.categoryId = categoryId;
    }



    /**
     * SKU на Маркете.
     * @return marketSku
     */
    public Long getMarketSku() {
        return marketSku;
    }

    public void setMarketSku(Long marketSku) {
        this.marketSku = marketSku;
    }

    /**
     * Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр `marketSku`), но одинаковый идентификатор модели товара. 
     * @return modelId
     */
    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    /**
     * Идентификатор категории для текущей карточки товара на Маркете.
     * @return categoryId
     */
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

