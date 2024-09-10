package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QualityRatingDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об индексе качества магазина.
 */

@Schema(name = "CampaignQualityRatingDTO", description = "Информация об индексе качества магазина.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignQualityRatingDTO {

  private Long campaignId;

  @Valid
  private List<@Valid QualityRatingDTO> ratings = new ArrayList<>();

  public CampaignQualityRatingDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CampaignQualityRatingDTO(Long campaignId, List<@Valid QualityRatingDTO> ratings) {
    this.campaignId = campaignId;
    this.ratings = ratings;
  }

  public CampaignQualityRatingDTO campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Идентификатор магазина.
   * @return campaignId
   */
  @NotNull 
  @Schema(name = "campaignId", description = "Идентификатор магазина.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public CampaignQualityRatingDTO ratings(List<@Valid QualityRatingDTO> ratings) {
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
  @NotNull @Valid 
  @Schema(name = "ratings", description = "Список значений индекса качества.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ratings")
  public List<@Valid QualityRatingDTO> getRatings() {
    return ratings;
  }

  public void setRatings(List<@Valid QualityRatingDTO> ratings) {
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

