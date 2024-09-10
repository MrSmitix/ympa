package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.UpdateOfferMappingEntryDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос на обновление товаров.
 */
public class UpdateOfferMappingEntryRequest   {

    private List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries = new ArrayList<>();

    /**
     * Default constructor.
     */
    public UpdateOfferMappingEntryRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateOfferMappingEntryRequest.
     *
     * @param offerMappingEntries Информация о товарах в каталоге.
     */
    public UpdateOfferMappingEntryRequest(
        List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries
    ) {
        this.offerMappingEntries = offerMappingEntries;
    }



    /**
     * Информация о товарах в каталоге.
     * @return offerMappingEntries
     */
    public List<@Valid UpdateOfferMappingEntryDTO> getOfferMappingEntries() {
        return offerMappingEntries;
    }

    public void setOfferMappingEntries(List<@Valid UpdateOfferMappingEntryDTO> offerMappingEntries) {
        this.offerMappingEntries = offerMappingEntries;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOfferMappingEntryRequest {\n");
        
        sb.append("    offerMappingEntries: ").append(toIndentedString(offerMappingEntries)).append("\n");
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

