package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.EnrichedMappingsOfferDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список рекомендованных карточек товара.
 */
public class OfferMappingSuggestionsListDTO   {

    private List<@Valid EnrichedMappingsOfferDTO> offers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public OfferMappingSuggestionsListDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferMappingSuggestionsListDTO.
     *
     * @param offers Список товаров.
     */
    public OfferMappingSuggestionsListDTO(
        List<@Valid EnrichedMappingsOfferDTO> offers
    ) {
        this.offers = offers;
    }



    /**
     * Список товаров.
     * @return offers
     */
    public List<@Valid EnrichedMappingsOfferDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid EnrichedMappingsOfferDTO> offers) {
        this.offers = offers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferMappingSuggestionsListDTO {\n");
        
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

