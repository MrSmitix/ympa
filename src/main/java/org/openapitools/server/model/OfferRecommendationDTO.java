package org.openapitools.server.model;

import org.openapitools.server.model.OfferForRecommendationDTO;
import org.openapitools.server.model.OfferRecommendationInfoDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о состоянии цен и рекомендации. 
 */
public class OfferRecommendationDTO   {

    private OfferForRecommendationDTO offer;
    private OfferRecommendationInfoDTO recommendation;

    /**
     * Default constructor.
     */
    public OfferRecommendationDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferRecommendationDTO.
     *
     * @param offer offer
     * @param recommendation recommendation
     */
    public OfferRecommendationDTO(
        OfferForRecommendationDTO offer, 
        OfferRecommendationInfoDTO recommendation
    ) {
        this.offer = offer;
        this.recommendation = recommendation;
    }



    /**
     * Get offer
     * @return offer
     */
    public OfferForRecommendationDTO getOffer() {
        return offer;
    }

    public void setOffer(OfferForRecommendationDTO offer) {
        this.offer = offer;
    }

    /**
     * Get recommendation
     * @return recommendation
     */
    public OfferRecommendationInfoDTO getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(OfferRecommendationInfoDTO recommendation) {
        this.recommendation = recommendation;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferRecommendationDTO {\n");
        
        sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
        sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
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

