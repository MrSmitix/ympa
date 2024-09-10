package org.openapitools.server.model;

import org.openapitools.server.model.OfferMappingDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о карточке товара.
 */
public class OfferMappingInfoDTO   {

    private OfferMappingDTO mapping;
    private OfferMappingDTO awaitingModerationMapping;
    private OfferMappingDTO rejectedMapping;

    /**
     * Default constructor.
     */
    public OfferMappingInfoDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferMappingInfoDTO.
     *
     * @param mapping mapping
     * @param awaitingModerationMapping awaitingModerationMapping
     * @param rejectedMapping rejectedMapping
     */
    public OfferMappingInfoDTO(
        OfferMappingDTO mapping, 
        OfferMappingDTO awaitingModerationMapping, 
        OfferMappingDTO rejectedMapping
    ) {
        this.mapping = mapping;
        this.awaitingModerationMapping = awaitingModerationMapping;
        this.rejectedMapping = rejectedMapping;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferMappingInfoDTO {\n");
        
        sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
        sb.append("    awaitingModerationMapping: ").append(toIndentedString(awaitingModerationMapping)).append("\n");
        sb.append("    rejectedMapping: ").append(toIndentedString(rejectedMapping)).append("\n");
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

