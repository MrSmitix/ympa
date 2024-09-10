package apimodels;

import apimodels.QualityRatingDTO;
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
 * Информация об индексе качества магазина.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignQualityRatingDTO   {
  @JsonProperty("campaignId")
  @NotNull

  private Long campaignId;

  @JsonProperty("ratings")
  @NotNull
@Valid

  private List<@Valid QualityRatingDTO> ratings = new ArrayList<>();

  public CampaignQualityRatingDTO campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Идентификатор магазина.
   * @return campaignId
  **/
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
  **/
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
    return Objects.equals(campaignId, campaignQualityRatingDTO.campaignId) &&
        Objects.equals(ratings, campaignQualityRatingDTO.ratings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, ratings);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

