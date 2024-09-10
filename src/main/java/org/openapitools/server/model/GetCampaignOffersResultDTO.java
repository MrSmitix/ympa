package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.GetCampaignOfferDTO;
import org.openapitools.server.model.ScrollingPagerDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список товаров в заданном магазине.
 */
public class GetCampaignOffersResultDTO   {

    private ScrollingPagerDTO paging;
    private List<@Valid GetCampaignOfferDTO> offers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GetCampaignOffersResultDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetCampaignOffersResultDTO.
     *
     * @param paging paging
     * @param offers Страница списка товаров.
     */
    public GetCampaignOffersResultDTO(
        ScrollingPagerDTO paging, 
        List<@Valid GetCampaignOfferDTO> offers
    ) {
        this.paging = paging;
        this.offers = offers;
    }



    /**
     * Get paging
     * @return paging
     */
    public ScrollingPagerDTO getPaging() {
        return paging;
    }

    public void setPaging(ScrollingPagerDTO paging) {
        this.paging = paging;
    }

    /**
     * Страница списка товаров.
     * @return offers
     */
    public List<@Valid GetCampaignOfferDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid GetCampaignOfferDTO> offers) {
        this.offers = offers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCampaignOffersResultDTO {\n");
        
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
        sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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

