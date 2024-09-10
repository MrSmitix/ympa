package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.  Обязательный параметр для акций с этими типами. 
 */
public class UpdatePromoOfferDiscountParamsDTO   {

    private Long price;
    private Long promoPrice;

    /**
     * Default constructor.
     */
    public UpdatePromoOfferDiscountParamsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdatePromoOfferDiscountParamsDTO.
     *
     * @param price Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. 
     * @param promoPrice Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. 
     */
    public UpdatePromoOfferDiscountParamsDTO(
        Long price, 
        Long promoPrice
    ) {
        this.price = price;
        this.promoPrice = promoPrice;
    }



    /**
     * Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. 
     * minimum: 1
     * @return price
     */
    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    /**
     * Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. 
     * minimum: 1
     * @return promoPrice
     */
    public Long getPromoPrice() {
        return promoPrice;
    }

    public void setPromoPrice(Long promoPrice) {
        this.promoPrice = promoPrice;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePromoOfferDiscountParamsDTO {\n");
        
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    promoPrice: ").append(toIndentedString(promoPrice)).append("\n");
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

