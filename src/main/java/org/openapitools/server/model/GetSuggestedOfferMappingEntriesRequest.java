package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.MappingsOfferDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос рекомендованных карточек товара.
 */
public class GetSuggestedOfferMappingEntriesRequest   {

    private List<@Valid MappingsOfferDTO> offers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GetSuggestedOfferMappingEntriesRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetSuggestedOfferMappingEntriesRequest.
     *
     * @param offers Список товаров.
     */
    public GetSuggestedOfferMappingEntriesRequest(
        List<@Valid MappingsOfferDTO> offers
    ) {
        this.offers = offers;
    }



    /**
     * Список товаров.
     * @return offers
     */
    public List<@Valid MappingsOfferDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid MappingsOfferDTO> offers) {
        this.offers = offers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSuggestedOfferMappingEntriesRequest {\n");
        
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

