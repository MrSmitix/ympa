package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QualityRatingDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация об индексе качества магазина.
 **/
@ApiModel(description="Информация об индексе качества магазина.")

public class CampaignQualityRatingDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор магазина.")
 /**
   * Идентификатор магазина.
  **/
  private Long campaignId;

  @ApiModelProperty(required = true, value = "Список значений индекса качества.")
  @Valid
 /**
   * Список значений индекса качества.
  **/
  private List<@Valid QualityRatingDTO> ratings = new ArrayList<>();
 /**
   * Идентификатор магазина.
   * @return campaignId
  **/
  @JsonProperty("campaignId")
  @NotNull
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignQualityRatingDTO campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
   * Список значений индекса качества.
   * @return ratings
  **/
  @JsonProperty("ratings")
  @NotNull
  public List<@Valid QualityRatingDTO> getRatings() {
    return ratings;
  }

  public void setRatings(List<@Valid QualityRatingDTO> ratings) {
    this.ratings = ratings;
  }

  public CampaignQualityRatingDTO ratings(List<@Valid QualityRatingDTO> ratings) {
    this.ratings = ratings;
    return this;
  }

  public CampaignQualityRatingDTO addRatingsItem(QualityRatingDTO ratingsItem) {
    this.ratings.add(ratingsItem);
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

