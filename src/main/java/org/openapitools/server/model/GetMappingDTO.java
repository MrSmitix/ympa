package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о товарах в каталоге. 
 */
public class GetMappingDTO   {

    private Long marketSku;
    private String marketSkuName;
    private Long marketModelId;
    private String marketModelName;
    private Long marketCategoryId;
    private String marketCategoryName;

    /**
     * Default constructor.
     */
    public GetMappingDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetMappingDTO.
     *
     * @param marketSku SKU на Маркете.
     * @param marketSkuName Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
     * @param marketModelId Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
     * @param marketModelName Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
     * @param marketCategoryId Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
     * @param marketCategoryName Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
     */
    public GetMappingDTO(
        Long marketSku, 
        String marketSkuName, 
        Long marketModelId, 
        String marketModelName, 
        Long marketCategoryId, 
        String marketCategoryName
    ) {
        this.marketSku = marketSku;
        this.marketSkuName = marketSkuName;
        this.marketModelId = marketModelId;
        this.marketModelName = marketModelName;
        this.marketCategoryId = marketCategoryId;
        this.marketCategoryName = marketCategoryName;
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
     * Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
     * @return marketSkuName
     */
    public String getMarketSkuName() {
        return marketSkuName;
    }

    public void setMarketSkuName(String marketSkuName) {
        this.marketSkuName = marketSkuName;
    }

    /**
     * Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
     * @return marketModelId
     */
    public Long getMarketModelId() {
        return marketModelId;
    }

    public void setMarketModelId(Long marketModelId) {
        this.marketModelId = marketModelId;
    }

    /**
     * Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
     * @return marketModelName
     */
    public String getMarketModelName() {
        return marketModelName;
    }

    public void setMarketModelName(String marketModelName) {
        this.marketModelName = marketModelName;
    }

    /**
     * Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
     * @return marketCategoryId
     */
    public Long getMarketCategoryId() {
        return marketCategoryId;
    }

    public void setMarketCategoryId(Long marketCategoryId) {
        this.marketCategoryId = marketCategoryId;
    }

    /**
     * Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
     * @return marketCategoryName
     */
    public String getMarketCategoryName() {
        return marketCategoryName;
    }

    public void setMarketCategoryName(String marketCategoryName) {
        this.marketCategoryName = marketCategoryName;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

