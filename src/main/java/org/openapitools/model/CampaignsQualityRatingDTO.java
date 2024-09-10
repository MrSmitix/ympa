package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignQualityRatingDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об индексе качества магазинов.
 */

@Schema(name = "CampaignsQualityRatingDTO", description = "Информация об индексе качества магазинов.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignsQualityRatingDTO {

  @Valid
  private List<@Valid CampaignQualityRatingDTO> campaignRatings = new ArrayList<>();

  public CampaignsQualityRatingDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CampaignsQualityRatingDTO(List<@Valid CampaignQualityRatingDTO> campaignRatings) {
    this.campaignRatings = campaignRatings;
  }

  public CampaignsQualityRatingDTO campaignRatings(List<@Valid CampaignQualityRatingDTO> campaignRatings) {
    this.campaignRatings = campaignRatings;
    return this;
  }

  public CampaignsQualityRatingDTO addCampaignRatingsItem(CampaignQualityRatingDTO campaignRatingsItem) {
    if (this.campaignRatings == null) {
      this.campaignRatings = new ArrayList<>();
    }
    this.campaignRatings.add(campaignRatingsItem);
    return this;
  }

  /**
   * Список магазинов c информацией об их индексе качества.
   * @return campaignRatings
   */
  @NotNull @Valid 
  @Schema(name = "campaignRatings", description = "Список магазинов c информацией об их индексе качества.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("campaignRatings")
  public List<@Valid CampaignQualityRatingDTO> getCampaignRatings() {
    return campaignRatings;
  }

  public void setCampaignRatings(List<@Valid CampaignQualityRatingDTO> campaignRatings) {
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
    return Objects.equals(this.campaignRatings, campaignsQualityRatingDTO.campaignRatings);
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

