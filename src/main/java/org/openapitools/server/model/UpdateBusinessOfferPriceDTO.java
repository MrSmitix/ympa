package org.openapitools.server.model;

import org.openapitools.server.model.UpdatePriceWithDiscountDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Товар с новой ценой.
 */
public class UpdateBusinessOfferPriceDTO   {

    private String offerId;
    private UpdatePriceWithDiscountDTO price;

    /**
     * Default constructor.
     */
    public UpdateBusinessOfferPriceDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateBusinessOfferPriceDTO.
     *
     * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param price price
     */
    public UpdateBusinessOfferPriceDTO(
        String offerId, 
        UpdatePriceWithDiscountDTO price
    ) {
        this.offerId = offerId;
        this.price = price;
    }



    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @return offerId
     */
    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    /**
     * Get price
     * @return price
     */
    public UpdatePriceWithDiscountDTO getPrice() {
        return price;
    }

    public void setPrice(UpdatePriceWithDiscountDTO price) {
        this.price = price;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBusinessOfferPriceDTO {\n");
        
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

