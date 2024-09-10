package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.FlippingPagerDTO;
import org.openapitools.server.model.OfferDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список предложений с пагинатором.
 */
public class GetOffersResponse   {

    private List<@Valid OfferDTO> offers = new ArrayList<>();
    private FlippingPagerDTO pager;

    /**
     * Default constructor.
     */
    public GetOffersResponse() {
    // JSON-B / Jackson
    }

    /**
     * Create GetOffersResponse.
     *
     * @param offers Список предложений магазина.
     * @param pager pager
     */
    public GetOffersResponse(
        List<@Valid OfferDTO> offers, 
        FlippingPagerDTO pager
    ) {
        this.offers = offers;
        this.pager = pager;
    }



    /**
     * Список предложений магазина.
     * @return offers
     */
    public List<@Valid OfferDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid OfferDTO> offers) {
        this.offers = offers;
    }

    /**
     * Get pager
     * @return pager
     */
    public FlippingPagerDTO getPager() {
        return pager;
    }

    public void setPager(FlippingPagerDTO pager) {
        this.pager = pager;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOffersResponse {\n");
        
        sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
        sb.append("    pager: ").append(toIndentedString(pager)).append("\n");
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

