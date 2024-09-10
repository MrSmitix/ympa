package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignQualityRatingDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация об индексе качества магазинов.
 **/
@ApiModel(description = "Информация об индексе качества магазинов.")
@JsonTypeName("CampaignsQualityRatingDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class CampaignsQualityRatingDTO   {
  private @Valid List<@Valid CampaignQualityRatingDTO> campaignRatings = new ArrayList<>();

  /**
   * Список магазинов c информацией об их индексе качества.
   **/
  public CampaignsQualityRatingDTO campaignRatings(List<@Valid CampaignQualityRatingDTO> campaignRatings) {
    this.campaignRatings = campaignRatings;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список магазинов c информацией об их индексе качества.")
  @JsonProperty("campaignRatings")
  @NotNull @Valid public List<@Valid CampaignQualityRatingDTO> getCampaignRatings() {
    return campaignRatings;
  }

  @JsonProperty("campaignRatings")
  public void setCampaignRatings(List<@Valid CampaignQualityRatingDTO> campaignRatings) {
    this.campaignRatings = campaignRatings;
  }

  public CampaignsQualityRatingDTO addCampaignRatingsItem(CampaignQualityRatingDTO campaignRatingsItem) {
    if (this.campaignRatings == null) {
      this.campaignRatings = new ArrayList<>();
    }

    this.campaignRatings.add(campaignRatingsItem);
    return this;
  }

  public CampaignsQualityRatingDTO removeCampaignRatingsItem(CampaignQualityRatingDTO campaignRatingsItem) {
    if (campaignRatingsItem != null && this.campaignRatings != null) {
      this.campaignRatings.remove(campaignRatingsItem);
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

