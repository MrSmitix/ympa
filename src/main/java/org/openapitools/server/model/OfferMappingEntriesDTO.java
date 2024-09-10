package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OfferMappingEntryDTO;
import org.openapitools.server.model.ScrollingPagerDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о товарах в каталоге.
 */
public class OfferMappingEntriesDTO   {

    private ScrollingPagerDTO paging;
    private List<@Valid OfferMappingEntryDTO> offerMappingEntries = new ArrayList<>();

    /**
     * Default constructor.
     */
    public OfferMappingEntriesDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferMappingEntriesDTO.
     *
     * @param paging paging
     * @param offerMappingEntries Информация о товарах в каталоге.
     */
    public OfferMappingEntriesDTO(
        ScrollingPagerDTO paging, 
        List<@Valid OfferMappingEntryDTO> offerMappingEntries
    ) {
        this.paging = paging;
        this.offerMappingEntries = offerMappingEntries;
    }



    /**
     * Get paging
     * @return paging
     */
    public ScrollingPagerDTO getPaging() {
        return paging;
    }

    public void setPaging(ScrollingPagerDTO paging) {
        this.paging = paging;
    }

    /**
     * Информация о товарах в каталоге.
     * @return offerMappingEntries
     */
    public List<@Valid OfferMappingEntryDTO> getOfferMappingEntries() {
        return offerMappingEntries;
    }

    public void setOfferMappingEntries(List<@Valid OfferMappingEntryDTO> offerMappingEntries) {
        this.offerMappingEntries = offerMappingEntries;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferMappingEntriesDTO {\n");
        
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

