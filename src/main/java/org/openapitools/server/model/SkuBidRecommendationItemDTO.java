package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.BidRecommendationItemDTO;
import org.openapitools.server.model.PriceRecommendationItemDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список товаров с рекомендованными ставками.
 */
public class SkuBidRecommendationItemDTO   {

    private String sku;
    private Integer bid;
    private List<@Valid BidRecommendationItemDTO> bidRecommendations;
    private List<@Valid PriceRecommendationItemDTO> priceRecommendations;

    /**
     * Default constructor.
     */
    public SkuBidRecommendationItemDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create SkuBidRecommendationItemDTO.
     *
     * @param sku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param bid Значение ставки.
     * @param bidRecommendations Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
     * @param priceRecommendations Рекомендованные цены.
     */
    public SkuBidRecommendationItemDTO(
        String sku, 
        Integer bid, 
        List<@Valid BidRecommendationItemDTO> bidRecommendations, 
        List<@Valid PriceRecommendationItemDTO> priceRecommendations
    ) {
        this.sku = sku;
        this.bid = bid;
        this.bidRecommendations = bidRecommendations;
        this.priceRecommendations = priceRecommendations;
    }



    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @return sku
     */
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * Значение ставки.
     * minimum: 0
     * maximum: 9999
     * @return bid
     */
    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    /**
     * Список рекомендованных ставок с соответствующими долями показов. Чем больше ставка, тем большую долю показов она помогает получить. 
     * @return bidRecommendations
     */
    public List<@Valid BidRecommendationItemDTO> getBidRecommendations() {
        return bidRecommendations;
    }

    public void setBidRecommendations(List<@Valid BidRecommendationItemDTO> bidRecommendations) {
        this.bidRecommendations = bidRecommendations;
    }

    /**
     * Рекомендованные цены.
     * @return priceRecommendations
     */
    public List<@Valid PriceRecommendationItemDTO> getPriceRecommendations() {
        return priceRecommendations;
    }

    public void setPriceRecommendations(List<@Valid PriceRecommendationItemDTO> priceRecommendations) {
        this.priceRecommendations = priceRecommendations;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SkuBidRecommendationItemDTO {\n");
        
        sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
        sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
        sb.append("    bidRecommendations: ").append(toIndentedString(bidRecommendations)).append("\n");
        sb.append("    priceRecommendations: ").append(toIndentedString(priceRecommendations)).append("\n");
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

