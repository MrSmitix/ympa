package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.CampaignQualityRatingDTO;

/**
 * Информация об индексе качества магазинов.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignsQualityRatingDTO   {
  
  private List<CampaignQualityRatingDTO> campaignRatings = new ArrayList<>();

  public CampaignsQualityRatingDTO () {

  }

  public CampaignsQualityRatingDTO (List<CampaignQualityRatingDTO> campaignRatings) {
    this.campaignRatings = campaignRatings;
  }

    
  @JsonProperty("campaignRatings")
  public List<CampaignQualityRatingDTO> getCampaignRatings() {
    return campaignRatings;
  }
  public void setCampaignRatings(List<CampaignQualityRatingDTO> campaignRatings) {
    this.campaignRatings = campaignRatings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignsQualityRatingDTO campaignsQualityRatingDTO = (CampaignsQualityRatingDTO) o;
    return Objects.equals(campaignRatings, campaignsQualityRatingDTO.campaignRatings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignRatings);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
