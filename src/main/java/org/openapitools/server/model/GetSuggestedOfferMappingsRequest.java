package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.SuggestedOfferDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GetSuggestedOfferMappingsRequest   {

    private List<@Valid SuggestedOfferDTO> offers;

    /**
     * Default constructor.
     */
    public GetSuggestedOfferMappingsRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetSuggestedOfferMappingsRequest.
     *
     * @param offers Список товаров.
     */
    public GetSuggestedOfferMappingsRequest(
        List<@Valid SuggestedOfferDTO> offers
    ) {
        this.offers = offers;
    }



    /**
     * Список товаров.
     * @return offers
     */
    public List<@Valid SuggestedOfferDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid SuggestedOfferDTO> offers) {
        this.offers = offers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSuggestedOfferMappingsRequest {\n");
        
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

