package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.SkuBidItemDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * description.
 */
public class PutSkuBidsRequest   {

    private List<@Valid SkuBidItemDTO> bids = new ArrayList<>();

    /**
     * Default constructor.
     */
    public PutSkuBidsRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create PutSkuBidsRequest.
     *
     * @param bids Список товаров и ставки для продвижения, которые на них нужно установить.
     */
    public PutSkuBidsRequest(
        List<@Valid SkuBidItemDTO> bids
    ) {
        this.bids = bids;
    }



    /**
     * Список товаров и ставки для продвижения, которые на них нужно установить.
     * @return bids
     */
    public List<@Valid SkuBidItemDTO> getBids() {
        return bids;
    }

    public void setBids(List<@Valid SkuBidItemDTO> bids) {
        this.bids = bids;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutSkuBidsRequest {\n");
        
        sb.append("    bids: ").append(toIndentedString(bids)).append("\n");
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

