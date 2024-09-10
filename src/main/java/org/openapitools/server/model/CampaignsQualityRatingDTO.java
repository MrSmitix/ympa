package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CampaignQualityRatingDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об индексе качества магазинов.
 */
public class CampaignsQualityRatingDTO   {

    private List<@Valid CampaignQualityRatingDTO> campaignRatings = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CampaignsQualityRatingDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create CampaignsQualityRatingDTO.
     *
     * @param campaignRatings Список магазинов c информацией об их индексе качества.
     */
    public CampaignsQualityRatingDTO(
        List<@Valid CampaignQualityRatingDTO> campaignRatings
    ) {
        this.campaignRatings = campaignRatings;
    }



    /**
     * Список магазинов c информацией об их индексе качества.
     * @return campaignRatings
     */
    public List<@Valid CampaignQualityRatingDTO> getCampaignRatings() {
        return campaignRatings;
    }

    public void setCampaignRatings(List<@Valid CampaignQualityRatingDTO> campaignRatings) {
        this.campaignRatings = campaignRatings;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignsQualityRatingDTO {\n");
        
        sb.append("    campaignRatings: ").append(toIndentedString(campaignRatings)).append("\n");
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

