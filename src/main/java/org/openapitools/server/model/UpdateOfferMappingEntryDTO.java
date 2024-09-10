package org.openapitools.server.model;

import org.openapitools.server.model.OfferMappingDTO;
import org.openapitools.server.model.UpdateMappingsOfferDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 
 */
public class UpdateOfferMappingEntryDTO   {

    private OfferMappingDTO mapping;
    private OfferMappingDTO awaitingModerationMapping;
    private OfferMappingDTO rejectedMapping;
    private UpdateMappingsOfferDTO offer;

    /**
     * Default constructor.
     */
    public UpdateOfferMappingEntryDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateOfferMappingEntryDTO.
     *
     * @param mapping mapping
     * @param awaitingModerationMapping awaitingModerationMapping
     * @param rejectedMapping rejectedMapping
     * @param offer offer
     */
    public UpdateOfferMappingEntryDTO(
        OfferMappingDTO mapping, 
        OfferMappingDTO awaitingModerationMapping, 
        OfferMappingDTO rejectedMapping, 
        UpdateMappingsOfferDTO offer
    ) {
        this.mapping = mapping;
        this.awaitingModerationMapping = awaitingModerationMapping;
        this.rejectedMapping = rejectedMapping;
        this.offer = offer;
    }



    /**
     * Get mapping
     * @return mapping
     */
    public OfferMappingDTO getMapping() {
        return mapping;
    }

    public void setMapping(OfferMappingDTO mapping) {
        this.mapping = mapping;
    }

    /**
     * Get awaitingModerationMapping
     * @return awaitingModerationMapping
     */
    public OfferMappingDTO getAwaitingModerationMapping() {
        return awaitingModerationMapping;
    }

    public void setAwaitingModerationMapping(OfferMappingDTO awaitingModerationMapping) {
        this.awaitingModerationMapping = awaitingModerationMapping;
    }

    /**
     * Get rejectedMapping
     * @return rejectedMapping
     */
    public OfferMappingDTO getRejectedMapping() {
        return rejectedMapping;
    }

    public void setRejectedMapping(OfferMappingDTO rejectedMapping) {
        this.rejectedMapping = rejectedMapping;
    }

    /**
     * Get offer
     * @return offer
     */
    public UpdateMappingsOfferDTO getOffer() {
        return offer;
    }

    public void setOffer(UpdateMappingsOfferDTO offer) {
        this.offer = offer;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOfferMappingEntryDTO {\n");
        
        sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
        sb.append("    awaitingModerationMapping: ").append(toIndentedString(awaitingModerationMapping)).append("\n");
        sb.append("    rejectedMapping: ").append(toIndentedString(rejectedMapping)).append("\n");
        sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
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

