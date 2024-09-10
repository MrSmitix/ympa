package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Товары, которые нужно поместить в архив. 
 */
public class AddOffersToArchiveRequest   {

    private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds = new ArrayList<>();

    /**
     * Default constructor.
     */
    public AddOffersToArchiveRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create AddOffersToArchiveRequest.
     *
     * @param offerIds Список товаров, которые нужно поместить в архив.
     */
    public AddOffersToArchiveRequest(
        List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds
    ) {
        this.offerIds = offerIds;
    }



    /**
     * Список товаров, которые нужно поместить в архив.
     * @return offerIds
     */
    public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
        return offerIds;
    }

    public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
        this.offerIds = offerIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOffersToArchiveRequest {\n");
        
        sb.append("    offerIds: ").append(toIndentedString(offerIds)).append("\n");
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

