package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.SuggestedOfferMappingDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Подобранные карточки на Маркете.
 */
public class GetSuggestedOfferMappingsResultDTO   {

    private List<@Valid SuggestedOfferMappingDTO> offers = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GetSuggestedOfferMappingsResultDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetSuggestedOfferMappingsResultDTO.
     *
     * @param offers Список товаров.
     */
    public GetSuggestedOfferMappingsResultDTO(
        List<@Valid SuggestedOfferMappingDTO> offers
    ) {
        this.offers = offers;
    }



    /**
     * Список товаров.
     * @return offers
     */
    public List<@Valid SuggestedOfferMappingDTO> getOffers() {
        return offers;
    }

    public void setOffers(List<@Valid SuggestedOfferMappingDTO> offers) {
        this.offers = offers;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSuggestedOfferMappingsResultDTO {\n");
        
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

