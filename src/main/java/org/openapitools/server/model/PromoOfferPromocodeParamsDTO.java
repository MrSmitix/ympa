package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Параметры товара в акции с типом `MARKET_PROMOCODE`.
 */
public class PromoOfferPromocodeParamsDTO   {

    private Long maxPrice;

    /**
     * Default constructor.
     */
    public PromoOfferPromocodeParamsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create PromoOfferPromocodeParamsDTO.
     *
     * @param maxPrice Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. 
     */
    public PromoOfferPromocodeParamsDTO(
        Long maxPrice
    ) {
        this.maxPrice = maxPrice;
    }



    /**
     * Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров. 
     * @return maxPrice
     */
    public Long getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(Long maxPrice) {
        this.maxPrice = maxPrice;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromoOfferPromocodeParamsDTO {\n");
        
        sb.append("    maxPrice: ").append(toIndentedString(maxPrice)).append("\n");
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

