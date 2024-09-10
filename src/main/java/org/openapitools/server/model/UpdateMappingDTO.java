package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 
 */
public class UpdateMappingDTO   {

    private Long marketSku;

    /**
     * Default constructor.
     */
    public UpdateMappingDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateMappingDTO.
     *
     * @param marketSku SKU на Маркете.
     */
    public UpdateMappingDTO(
        Long marketSku
    ) {
        this.marketSku = marketSku;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateMappingDTO {\n");
        
        sb.append("    marketSku: ").append(toIndentedString(marketSku)).append("\n");
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

