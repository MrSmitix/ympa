package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.QualityRatingDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация об индексе качества магазина.
 */
@ApiModel(description = "Информация об индексе качества магазина.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignQualityRatingDTO   {
  @JsonProperty("campaignId")
  private Long campaignId;

  @JsonProperty("ratings")
  
  private List<QualityRatingDTO> ratings = new ArrayList<>();

  public CampaignQualityRatingDTO campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Идентификатор магазина.
   * @return campaignId
   */
  @ApiModelProperty(required = true, value = "Идентификатор магазина.")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignQualityRatingDTO ratings(List<QualityRatingDTO> ratings) {
    this.ratings = ratings;
    return this;
  }

  public CampaignQualityRatingDTO addRatingsItem(QualityRatingDTO ratingsItem) {
    if (this.ratings == null) {
      this.ratings = new ArrayList<>();
    }
    this.ratings.add(ratingsItem);
    return this;
  }

  /**
   * Список значений индекса качества.
   * @return ratings
   */
  @ApiModelProperty(required = true, value = "Список значений индекса качества.")
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
    return Objects.equals(this.campaignId, campaignQualityRatingDTO.campaignId) &&
        Objects.equals(this.ratings, campaignQualityRatingDTO.ratings);
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

