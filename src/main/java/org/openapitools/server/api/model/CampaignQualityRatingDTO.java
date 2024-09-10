package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.QualityRatingDTO;

/**
 * Информация об индексе качества магазина.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignQualityRatingDTO   {
  
  private Long campaignId;
  private List<QualityRatingDTO> ratings = new ArrayList<>();

  public CampaignQualityRatingDTO () {

  }

  public CampaignQualityRatingDTO (Long campaignId, List<QualityRatingDTO> ratings) {
    this.campaignId = campaignId;
    this.ratings = ratings;
  }

    
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

    
  @JsonProperty("ratings")
  public List<QualityRatingDTO> getRatings() {
    return ratings;
  }
  public void setRatings(List<QualityRatingDTO> ratings) {
    this.ratings = ratings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignQualityRatingDTO campaignQualityRatingDTO = (CampaignQualityRatingDTO) o;
    return Objects.equals(campaignId, campaignQualityRatingDTO.campaignId) &&
        Objects.equals(ratings, campaignQualityRatingDTO.ratings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, ratings);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
