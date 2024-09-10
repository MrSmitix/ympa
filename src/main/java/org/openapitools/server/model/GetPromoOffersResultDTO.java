package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ForwardScrollingPagerDTO;
import org.openapitools.server.model.GetPromoOfferDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список товаров, которые участвуют или могут участвовать в акции.
 */
public class GetPromoOffersResultDTO   {

    private List<@Valid GetPromoOfferDTO> offers = new ArrayList<>();
    private ForwardScrollingPagerDTO paging;

    /**
     * Default constructor.
     */
    public GetPromoOffersResultDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetPromoOffersResultDTO.
     *
     * @param offers Товары, которые участвуют или могут участвовать в акции.
     * @param paging paging
     */
    public GetPromoOffersResultDTO(
        List<@Valid GetPromoOfferDTO> offers, 
        ForwardScrollingPagerDTO paging
    ) {
        this.offers = offers;
        this.paging = paging;
    }



    /**
     * Товары, которые участвуют или могут участвовать в акции.
     * @return offers
     */
    public List<@Valid GetPromoOfferDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid GetPromoOfferDTO> offers) {
        this.offers = offers;
    }

    /**
     * Get paging
     * @return paging
     */
    public ForwardScrollingPagerDTO getPaging() {
        return paging;
    }

    public void setPaging(ForwardScrollingPagerDTO paging) {
        this.paging = paging;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPromoOffersResultDTO {\n");
        
        sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

