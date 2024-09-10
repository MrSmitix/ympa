package org.openapitools.server.model;

import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Рекомендованная цена.
 */
public class PriceRecommendationItemDTO   {

    private Long campaignId;
    private BigDecimal price;

    /**
     * Default constructor.
     */
    public PriceRecommendationItemDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create PriceRecommendationItemDTO.
     *
     * @param campaignId Идентификатор кампании.
     * @param price Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
     */
    public PriceRecommendationItemDTO(
        Long campaignId, 
        BigDecimal price
    ) {
        this.campaignId = campaignId;
        this.price = price;
    }



    /**
     * Идентификатор кампании.
     * @return campaignId
     */
    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Рекомендованная цена на товар. Чтобы продвижение хорошо работало, цена на товар должна быть не выше этого значения. [Подробно о рекомендованных ценах](https://yandex.ru/support/marketplace/marketing/campaigns.html#prices) 
     * minimum: 1
     * @return price
     */
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PriceRecommendationItemDTO {\n");
        
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
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

