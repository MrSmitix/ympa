package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.BasePriceDTO;
import org.openapitools.server.model.GetPriceDTO;
import org.openapitools.server.model.PriceCompetitivenessType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о состоянии цены на товар.
 */
public class OfferForRecommendationDTO   {

    private String offerId;
    private BasePriceDTO price;
    private GetPriceDTO cofinancePrice;
    private PriceCompetitivenessType competitiveness;
    private Long shows;

    /**
     * Default constructor.
     */
    public OfferForRecommendationDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferForRecommendationDTO.
     *
     * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param price price
     * @param cofinancePrice cofinancePrice
     * @param competitiveness competitiveness
     * @param shows Количество показов карточки товара за последние 7 дней.
     */
    public OfferForRecommendationDTO(
        String offerId, 
        BasePriceDTO price, 
        GetPriceDTO cofinancePrice, 
        PriceCompetitivenessType competitiveness, 
        Long shows
    ) {
        this.offerId = offerId;
        this.price = price;
        this.cofinancePrice = cofinancePrice;
        this.competitiveness = competitiveness;
        this.shows = shows;
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
    public BasePriceDTO getPrice() {
        return price;
    }

    public void setPrice(BasePriceDTO price) {
        this.price = price;
    }

    /**
     * Get cofinancePrice
     * @return cofinancePrice
     */
    public GetPriceDTO getCofinancePrice() {
        return cofinancePrice;
    }

    public void setCofinancePrice(GetPriceDTO cofinancePrice) {
        this.cofinancePrice = cofinancePrice;
    }

    /**
     * Get competitiveness
     * @return competitiveness
     */
    public PriceCompetitivenessType getCompetitiveness() {
        return competitiveness;
    }

    public void setCompetitiveness(PriceCompetitivenessType competitiveness) {
        this.competitiveness = competitiveness;
    }

    /**
     * Количество показов карточки товара за последние 7 дней.
     * @return shows
     */
    public Long getShows() {
        return shows;
    }

    public void setShows(Long shows) {
        this.shows = shows;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferForRecommendationDTO {\n");
        
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    cofinancePrice: ").append(toIndentedString(cofinancePrice)).append("\n");
        sb.append("    competitiveness: ").append(toIndentedString(competitiveness)).append("\n");
        sb.append("    shows: ").append(toIndentedString(shows)).append("\n");
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

