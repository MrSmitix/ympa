package org.openapitools.server.model;

import org.openapitools.server.model.UpdateMappingDTO;
import org.openapitools.server.model.UpdateOfferDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о товаре.
 */
public class UpdateOfferMappingDTO   {

    private UpdateOfferDTO offer;
    private UpdateMappingDTO mapping;

    /**
     * Default constructor.
     */
    public UpdateOfferMappingDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateOfferMappingDTO.
     *
     * @param offer offer
     * @param mapping mapping
     */
    public UpdateOfferMappingDTO(
        UpdateOfferDTO offer, 
        UpdateMappingDTO mapping
    ) {
        this.offer = offer;
        this.mapping = mapping;
    }



    /**
     * Get offer
     * @return offer
     */
    public UpdateOfferDTO getOffer() {
        return offer;
    }

    public void setOffer(UpdateOfferDTO offer) {
        this.offer = offer;
    }

    /**
     * Get mapping
     * @return mapping
     */
    public UpdateMappingDTO getMapping() {
        return mapping;
    }

    public void setMapping(UpdateMappingDTO mapping) {
        this.mapping = mapping;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOfferMappingDTO {\n");
        
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

