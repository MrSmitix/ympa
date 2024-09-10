package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.QualityRatingDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об индексе качества магазина.
 */
public class CampaignQualityRatingDTO   {

    private Long campaignId;
    private List<@Valid QualityRatingDTO> ratings = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CampaignQualityRatingDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignQualityRatingDTO.
     *
     * @param campaignId Идентификатор магазина.
     * @param ratings Список значений индекса качества.
     */
    public CampaignQualityRatingDTO(
        Long campaignId, 
        List<@Valid QualityRatingDTO> ratings
    ) {
        this.campaignId = campaignId;
        this.ratings = ratings;
    }



    /**
     * Идентификатор магазина.
     * @return campaignId
     */
    public Long getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    /**
     * Список значений индекса качества.
     * @return ratings
     */
    public List<@Valid QualityRatingDTO> getRatings() {
        return ratings;
    }

    public void setRatings(List<@Valid QualityRatingDTO> ratings) {
        this.ratings = ratings;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignQualityRatingDTO {\n");
        
        sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
        sb.append("    ratings: ").append(toIndentedString(ratings)).append("\n");
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

