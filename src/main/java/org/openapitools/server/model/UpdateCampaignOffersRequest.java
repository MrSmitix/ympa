package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.UpdateCampaignOfferDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос на обновление предложений товаров магазина.
 */
public class UpdateCampaignOffersRequest   {

    private List<@Valid UpdateCampaignOfferDTO> offers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UpdateCampaignOffersRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateCampaignOffersRequest.
     *
     * @param offers Параметры размещения товаров в заданном магазине.
     */
    public UpdateCampaignOffersRequest(
        List<@Valid UpdateCampaignOfferDTO> offers
    ) {
        this.offers = offers;
    }



    /**
     * Параметры размещения товаров в заданном магазине.
     * @return offers
     */
    public List<@Valid UpdateCampaignOfferDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid UpdateCampaignOfferDTO> offers) {
        this.offers = offers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCampaignOffersRequest {\n");
        
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

