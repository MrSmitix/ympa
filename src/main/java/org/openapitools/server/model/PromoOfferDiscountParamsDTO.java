package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.
 */
public class PromoOfferDiscountParamsDTO   {

    private Long price;
    private Long promoPrice;
    private Long maxPromoPrice;

    /**
     * Default constructor.
     */
    public PromoOfferDiscountParamsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create PromoOfferDiscountParamsDTO.
     *
     * @param price Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
     * @param promoPrice Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
     * @param maxPromoPrice Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
     */
    public PromoOfferDiscountParamsDTO(
        Long price, 
        Long promoPrice, 
        Long maxPromoPrice
    ) {
        this.price = price;
        this.promoPrice = promoPrice;
        this.maxPromoPrice = maxPromoPrice;
    }



    /**
     * Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
     * @return price
     */
    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции. 
     * @return promoPrice
     */
    public Long getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(Long promoPrice) {
        this.promoPrice = promoPrice;
    }

    /**
     * Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров. 
     * @return maxPromoPrice
     */
    public Long getMaxPromoPrice() {
        return maxPromoPrice;
    }

    public void setMaxPromoPrice(Long maxPromoPrice) {
        this.maxPromoPrice = maxPromoPrice;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromoOfferDiscountParamsDTO {\n");
        
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    promoPrice: ").append(toIndentedString(promoPrice)).append("\n");
        sb.append("    maxPromoPrice: ").append(toIndentedString(maxPromoPrice)).append("\n");
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

