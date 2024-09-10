package org.openapitools.server.model;

import org.openapitools.server.model.GetMappingDTO;
import org.openapitools.server.model.SuggestedOfferDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Товар с соответствующей карточкой на Маркете.
 */
public class SuggestedOfferMappingDTO   {

    private SuggestedOfferDTO offer;
    private GetMappingDTO mapping;

    /**
     * Default constructor.
     */
    public SuggestedOfferMappingDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create SuggestedOfferMappingDTO.
     *
     * @param offer offer
     * @param mapping mapping
     */
    public SuggestedOfferMappingDTO(
        SuggestedOfferDTO offer, 
        GetMappingDTO mapping
    ) {
        this.offer = offer;
        this.mapping = mapping;
    }



    /**
     * Get offer
     * @return offer
     */
    public SuggestedOfferDTO getOffer() {
        return offer;
    }

    public void setOffer(SuggestedOfferDTO offer) {
        this.offer = offer;
    }

    /**
     * Get mapping
     * @return mapping
     */
    public GetMappingDTO getMapping() {
        return mapping;
    }

    public void setMapping(GetMappingDTO mapping) {
        this.mapping = mapping;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SuggestedOfferMappingDTO {\n");
        
        sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
        sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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

