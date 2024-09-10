package org.openapitools.server.model;

import org.openapitools.server.model.GetMappingDTO;
import org.openapitools.server.model.GetOfferDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о товаре.
 */
public class GetOfferMappingDTO   {

    private GetOfferDTO offer;
    private GetMappingDTO mapping;

    /**
     * Default constructor.
     */
    public GetOfferMappingDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetOfferMappingDTO.
     *
     * @param offer offer
     * @param mapping mapping
     */
    public GetOfferMappingDTO(
        GetOfferDTO offer, 
        GetMappingDTO mapping
    ) {
        this.offer = offer;
        this.mapping = mapping;
    }



    /**
     * Get offer
     * @return offer
     */
    public GetOfferDTO getOffer() {
        return offer;
    }

    public void setOffer(GetOfferDTO offer) {
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
        sb.append("class GetOfferMappingDTO {\n");
        
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

