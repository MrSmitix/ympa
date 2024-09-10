package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.GetOfferMappingDTO;
import org.openapitools.server.model.ScrollingPagerDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о товарах.
 */
public class GetOfferMappingsResultDTO   {

    private ScrollingPagerDTO paging;
    private List<@Valid GetOfferMappingDTO> offerMappings = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GetOfferMappingsResultDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetOfferMappingsResultDTO.
     *
     * @param paging paging
     * @param offerMappings Информация о товарах.
     */
    public GetOfferMappingsResultDTO(
        ScrollingPagerDTO paging, 
        List<@Valid GetOfferMappingDTO> offerMappings
    ) {
        this.paging = paging;
        this.offerMappings = offerMappings;
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
     * Информация о товарах.
     * @return offerMappings
     */
    public List<@Valid GetOfferMappingDTO> getOfferMappings() {
        return offerMappings;
    }

    public void setOfferMappings(List<@Valid GetOfferMappingDTO> offerMappings) {
        this.offerMappings = offerMappings;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOfferMappingsResultDTO {\n");
        
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
        sb.append("    offerMappings: ").append(toIndentedString(offerMappings)).append("\n");
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

