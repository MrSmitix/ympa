package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.PriceSuggestDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Товар с ценами для продвижения.
 */
public class PriceSuggestOfferDTO   {

    private Long marketSku;
    private String offerId;
    private List<@Valid PriceSuggestDTO> priceSuggestion;

    /**
     * Default constructor.
     */
    public PriceSuggestOfferDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create PriceSuggestOfferDTO.
     *
     * @param marketSku SKU на Маркете.
     * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param priceSuggestion Цены для продвижения. 
     */
    public PriceSuggestOfferDTO(
        Long marketSku, 
        String offerId, 
        List<@Valid PriceSuggestDTO> priceSuggestion
    ) {
        this.marketSku = marketSku;
        this.offerId = offerId;
        this.priceSuggestion = priceSuggestion;
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
     * Цены для продвижения. 
     * @return priceSuggestion
     */
    public List<@Valid PriceSuggestDTO> getPriceSuggestion() {
        return priceSuggestion;
    }

    public void setPriceSuggestion(List<@Valid PriceSuggestDTO> priceSuggestion) {
        this.priceSuggestion = priceSuggestion;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PriceSuggestOfferDTO {\n");
        
        sb.append("    marketSku: ").append(toIndentedString(marketSku)).append("\n");
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    priceSuggestion: ").append(toIndentedString(priceSuggestion)).append("\n");
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

