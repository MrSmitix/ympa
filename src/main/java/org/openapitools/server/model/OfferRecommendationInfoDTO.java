package org.openapitools.server.model;

import org.openapitools.server.model.BasePriceDTO;
import org.openapitools.server.model.PriceCompetitivenessThresholdsDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Рекомендации, касающиеся цены на товар.
 */
public class OfferRecommendationInfoDTO   {

    private String offerId;
    private BasePriceDTO recommendedCofinancePrice;
    private PriceCompetitivenessThresholdsDTO competitivenessThresholds;

    /**
     * Default constructor.
     */
    public OfferRecommendationInfoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferRecommendationInfoDTO.
     *
     * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param recommendedCofinancePrice recommendedCofinancePrice
     * @param competitivenessThresholds competitivenessThresholds
     */
    public OfferRecommendationInfoDTO(
        String offerId, 
        BasePriceDTO recommendedCofinancePrice, 
        PriceCompetitivenessThresholdsDTO competitivenessThresholds
    ) {
        this.offerId = offerId;
        this.recommendedCofinancePrice = recommendedCofinancePrice;
        this.competitivenessThresholds = competitivenessThresholds;
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
     * Get recommendedCofinancePrice
     * @return recommendedCofinancePrice
     */
    public BasePriceDTO getRecommendedCofinancePrice() {
        return recommendedCofinancePrice;
    }

    public void setRecommendedCofinancePrice(BasePriceDTO recommendedCofinancePrice) {
        this.recommendedCofinancePrice = recommendedCofinancePrice;
    }

    /**
     * Get competitivenessThresholds
     * @return competitivenessThresholds
     */
    public PriceCompetitivenessThresholdsDTO getCompetitivenessThresholds() {
        return competitivenessThresholds;
    }

    public void setCompetitivenessThresholds(PriceCompetitivenessThresholdsDTO competitivenessThresholds) {
        this.competitivenessThresholds = competitivenessThresholds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferRecommendationInfoDTO {\n");
        
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    recommendedCofinancePrice: ").append(toIndentedString(recommendedCofinancePrice)).append("\n");
        sb.append("    competitivenessThresholds: ").append(toIndentedString(competitivenessThresholds)).append("\n");
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

