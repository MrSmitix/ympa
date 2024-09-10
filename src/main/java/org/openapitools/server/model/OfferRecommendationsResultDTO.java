package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.OfferRecommendationDTO;
import org.openapitools.server.model.ScrollingPagerDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список товаров с рекомендациями.
 */
public class OfferRecommendationsResultDTO   {

    private ScrollingPagerDTO paging;
    private List<@Valid OfferRecommendationDTO> offerRecommendations = new ArrayList<>();

    /**
     * Default constructor.
     */
    public OfferRecommendationsResultDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferRecommendationsResultDTO.
     *
     * @param paging paging
     * @param offerRecommendations Страница списка товаров.
     */
    public OfferRecommendationsResultDTO(
        ScrollingPagerDTO paging, 
        List<@Valid OfferRecommendationDTO> offerRecommendations
    ) {
        this.paging = paging;
        this.offerRecommendations = offerRecommendations;
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
     * Страница списка товаров.
     * @return offerRecommendations
     */
    public List<@Valid OfferRecommendationDTO> getOfferRecommendations() {
        return offerRecommendations;
    }

    public void setOfferRecommendations(List<@Valid OfferRecommendationDTO> offerRecommendations) {
        this.offerRecommendations = offerRecommendations;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferRecommendationsResultDTO {\n");
        
        sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
        sb.append("    offerRecommendations: ").append(toIndentedString(offerRecommendations)).append("\n");
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

