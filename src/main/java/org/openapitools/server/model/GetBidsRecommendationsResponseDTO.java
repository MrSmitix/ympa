package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.SkuBidRecommendationItemDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Список товаров с рекомендованными ставками.
 */
public class GetBidsRecommendationsResponseDTO   {

    private List<@Valid SkuBidRecommendationItemDTO> recommendations = new ArrayList<>();

    /**
     * Default constructor.
     */
    public GetBidsRecommendationsResponseDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetBidsRecommendationsResponseDTO.
     *
     * @param recommendations Список товаров с рекомендованными ставками.
     */
    public GetBidsRecommendationsResponseDTO(
        List<@Valid SkuBidRecommendationItemDTO> recommendations
    ) {
        this.recommendations = recommendations;
    }



    /**
     * Список товаров с рекомендованными ставками.
     * @return recommendations
     */
    public List<@Valid SkuBidRecommendationItemDTO> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<@Valid SkuBidRecommendationItemDTO> recommendations) {
        this.recommendations = recommendations;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetBidsRecommendationsResponseDTO {\n");
        
        sb.append("    recommendations: ").append(toIndentedString(recommendations)).append("\n");
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

