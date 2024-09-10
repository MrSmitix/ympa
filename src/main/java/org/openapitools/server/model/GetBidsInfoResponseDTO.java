package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ForwardScrollingPagerDTO;
import org.openapitools.server.model.SkuBidItemDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список товаров с указанными ставками.
 */
public class GetBidsInfoResponseDTO   {

    private List<@Valid SkuBidItemDTO> bids = new ArrayList<>();
    private ForwardScrollingPagerDTO paging;

    /**
     * Default constructor.
     */
    public GetBidsInfoResponseDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetBidsInfoResponseDTO.
     *
     * @param bids Страница списка товаров.
     * @param paging paging
     */
    public GetBidsInfoResponseDTO(
        List<@Valid SkuBidItemDTO> bids, 
        ForwardScrollingPagerDTO paging
    ) {
        this.bids = bids;
        this.paging = paging;
    }



    /**
     * Страница списка товаров.
     * @return bids
     */
    public List<@Valid SkuBidItemDTO> getBids() {
        return bids;
    }

    public void setBids(List<@Valid SkuBidItemDTO> bids) {
        this.bids = bids;
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
        sb.append("class GetBidsInfoResponseDTO {\n");
        
        sb.append("    bids: ").append(toIndentedString(bids)).append("\n");
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

