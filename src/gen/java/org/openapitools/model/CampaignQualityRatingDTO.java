package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QualityRatingDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация об индексе качества магазина.
 **/
@ApiModel(description = "Информация об индексе качества магазина.")
@JsonTypeName("CampaignQualityRatingDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignQualityRatingDTO   {
  private Long campaignId;
  private @Valid List<@Valid QualityRatingDTO> ratings = new ArrayList<>();

  /**
   * Идентификатор магазина.
   **/
  public CampaignQualityRatingDTO campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор магазина.")
  @JsonProperty("campaignId")
  @NotNull public Long getCampaignId() {
    return campaignId;
  }

  @JsonProperty("campaignId")
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Список значений индекса качества.
   **/
  public CampaignQualityRatingDTO ratings(List<@Valid QualityRatingDTO> ratings) {
    this.ratings = ratings;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список значений индекса качества.")
  @JsonProperty("ratings")
  @NotNull @Valid public List<@Valid QualityRatingDTO> getRatings() {
    return ratings;
  }

  @JsonProperty("ratings")
  public void setRatings(List<@Valid QualityRatingDTO> ratings) {
    this.ratings = ratings;
  }

  public CampaignQualityRatingDTO addRatingsItem(QualityRatingDTO ratingsItem) {
    if (this.ratings == null) {
      this.ratings = new ArrayList<>();
    }

    this.ratings.add(ratingsItem);
    return this;
  }

  public CampaignQualityRatingDTO removeRatingsItem(QualityRatingDTO ratingsItem) {
    if (ratingsItem != null && this.ratings != null) {
      this.ratings.remove(ratingsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

