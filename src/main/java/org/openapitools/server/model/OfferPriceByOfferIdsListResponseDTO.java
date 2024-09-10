package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OfferPriceByOfferIdsResponseDTO;
import org.openapitools.server.model.ScrollingPagerDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список цен.
 */
public class OfferPriceByOfferIdsListResponseDTO   {

    private List<@Valid OfferPriceByOfferIdsResponseDTO> offers = new ArrayList<>();
    private ScrollingPagerDTO paging;

    /**
     * Default constructor.
     */
    public OfferPriceByOfferIdsListResponseDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferPriceByOfferIdsListResponseDTO.
     *
     * @param offers Страница списка цен.
     * @param paging paging
     */
    public OfferPriceByOfferIdsListResponseDTO(
        List<@Valid OfferPriceByOfferIdsResponseDTO> offers, 
        ScrollingPagerDTO paging
    ) {
        this.offers = offers;
        this.paging = paging;
    }



    /**
     * Страница списка цен.
     * @return offers
     */
    public List<@Valid OfferPriceByOfferIdsResponseDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid OfferPriceByOfferIdsResponseDTO> offers) {
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferPriceByOfferIdsListResponseDTO {\n");
        
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

