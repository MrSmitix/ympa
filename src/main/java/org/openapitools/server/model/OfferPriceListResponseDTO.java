package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OfferPriceResponseDTO;
import org.openapitools.server.model.ScrollingPagerDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список цен на товары.
 */
public class OfferPriceListResponseDTO   {

    private List<@Valid OfferPriceResponseDTO> offers = new ArrayList<>();
    private ScrollingPagerDTO paging;
    private Integer total;

    /**
     * Default constructor.
     */
    public OfferPriceListResponseDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferPriceListResponseDTO.
     *
     * @param offers Страница списка.
     * @param paging paging
     * @param total Количество всех цен магазина, измененных через API.
     */
    public OfferPriceListResponseDTO(
        List<@Valid OfferPriceResponseDTO> offers, 
        ScrollingPagerDTO paging, 
        Integer total
    ) {
        this.offers = offers;
        this.paging = paging;
        this.total = total;
    }



    /**
     * Страница списка.
     * @return offers
     */
    public List<@Valid OfferPriceResponseDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid OfferPriceResponseDTO> offers) {
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
     * Количество всех цен магазина, измененных через API.
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferPriceListResponseDTO {\n");
        
        sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

