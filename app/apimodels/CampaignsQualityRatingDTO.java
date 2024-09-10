package apimodels;

import apimodels.CampaignQualityRatingDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об индексе качества магазинов.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignsQualityRatingDTO   {
  @JsonProperty("campaignRatings")
  @NotNull
@Valid

  private List<@Valid CampaignQualityRatingDTO> campaignRatings = new ArrayList<>();

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
  **/
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
    return Objects.equals(campaignRatings, campaignsQualityRatingDTO.campaignRatings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignRatings);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

