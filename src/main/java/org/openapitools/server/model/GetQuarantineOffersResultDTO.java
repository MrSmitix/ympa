package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.QuarantineOfferDTO;
import org.openapitools.server.model.ScrollingPagerDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список товаров в карантине.
 */
public class GetQuarantineOffersResultDTO   {

    private ScrollingPagerDTO paging;
    private List<@Valid QuarantineOfferDTO> offers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GetQuarantineOffersResultDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetQuarantineOffersResultDTO.
     *
     * @param paging paging
     * @param offers Страница списка товаров в карантине.
     */
    public GetQuarantineOffersResultDTO(
        ScrollingPagerDTO paging, 
        List<@Valid QuarantineOfferDTO> offers
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
     * Страница списка товаров в карантине.
     * @return offers
     */
    public List<@Valid QuarantineOfferDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid QuarantineOfferDTO> offers) {
        this.offers = offers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetQuarantineOffersResultDTO {\n");
        
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

