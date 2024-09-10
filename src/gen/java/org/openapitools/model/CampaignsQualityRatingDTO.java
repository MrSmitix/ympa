package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignQualityRatingDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация об индексе качества магазинов.
 **/
@ApiModel(description="Информация об индексе качества магазинов.")

public class CampaignsQualityRatingDTO  {
  
  @ApiModelProperty(required = true, value = "Список магазинов c информацией об их индексе качества.")
  @Valid
 /**
   * Список магазинов c информацией об их индексе качества.
  **/
  private List<@Valid CampaignQualityRatingDTO> campaignRatings = new ArrayList<>();
 /**
   * Список магазинов c информацией об их индексе качества.
   * @return campaignRatings
  **/
  @JsonProperty("campaignRatings")
  @NotNull
  public List<@Valid CampaignQualityRatingDTO> getCampaignRatings() {
    return campaignRatings;
  }

  public void setCampaignRatings(List<@Valid CampaignQualityRatingDTO> campaignRatings) {
    this.campaignRatings = campaignRatings;
  }

  public CampaignsQualityRatingDTO campaignRatings(List<@Valid CampaignQualityRatingDTO> campaignRatings) {
    this.campaignRatings = campaignRatings;
    return this;
  }

  public CampaignsQualityRatingDTO addCampaignRatingsItem(CampaignQualityRatingDTO campaignRatingsItem) {
    this.campaignRatings.add(campaignRatingsItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

