package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об автоматическом добавлении товара в акцию.  Причины, по которым товар не был добавлен автоматически в других магазинах, можно узнать в кабинете продавца на Маркете на странице акции.  Об автоматическом и ручном добавлении товаров в акцию читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/index). 
 */
public class PromoOfferAutoParticipatingDetailsDTO   {

    private List<Long> campaignIds;

    /**
     * Default constructor.
     */
    public PromoOfferAutoParticipatingDetailsDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create PromoOfferAutoParticipatingDetailsDTO.
     *
     * @param campaignIds Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — &#x60;PARTIALLY_AUTO&#x60;. 
     */
    public PromoOfferAutoParticipatingDetailsDTO(
        List<Long> campaignIds
    ) {
        this.campaignIds = campaignIds;
    }



    /**
     * Магазины, в которых товар добавлен в акцию автоматически.  Возвращается, если статус товара в акции — `PARTIALLY_AUTO`. 
     * @return campaignIds
     */
    public List<Long> getCampaignIds() {
        return campaignIds;
    }

    public void setCampaignIds(List<Long> campaignIds) {
        this.campaignIds = campaignIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromoOfferAutoParticipatingDetailsDTO {\n");
        
        sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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

