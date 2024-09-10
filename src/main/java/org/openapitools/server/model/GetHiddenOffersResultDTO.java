package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.HiddenOfferDTO;
import org.openapitools.server.model.ScrollingPagerDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список скрытых вами товаров. 
 */
public class GetHiddenOffersResultDTO   {

    private ScrollingPagerDTO paging;
    private List<@Valid HiddenOfferDTO> hiddenOffers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GetHiddenOffersResultDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetHiddenOffersResultDTO.
     *
     * @param paging paging
     * @param hiddenOffers Список скрытых товаров.
     */
    public GetHiddenOffersResultDTO(
        ScrollingPagerDTO paging, 
        List<@Valid HiddenOfferDTO> hiddenOffers
    ) {
        this.paging = paging;
        this.hiddenOffers = hiddenOffers;
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
     * Список скрытых товаров.
     * @return hiddenOffers
     */
    public List<@Valid HiddenOfferDTO> getHiddenOffers() {
        return hiddenOffers;
    }

    public void setHiddenOffers(List<@Valid HiddenOfferDTO> hiddenOffers) {
        this.hiddenOffers = hiddenOffers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetHiddenOffersResultDTO {\n");
        
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
        sb.append("    hiddenOffers: ").append(toIndentedString(hiddenOffers)).append("\n");
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

