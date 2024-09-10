package apimodels;

import apimodels.OfferCampaignStatusType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Статус товара в магазине.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferCampaignStatusDTO   {
  @JsonProperty("campaignId")
  @NotNull

  private Long campaignId;

  @JsonProperty("status")
  @NotNull
@Valid

  private OfferCampaignStatusType status;

  public OfferCampaignStatusDTO campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

   /**
   * Идентификатор кампании. 
   * @return campaignId
  **/
  public Long getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  public OfferCampaignStatusDTO status(OfferCampaignStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public OfferCampaignStatusType getStatus() {
    return status;
  }

  public void setStatus(OfferCampaignStatusType status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferCampaignStatusDTO offerCampaignStatusDTO = (OfferCampaignStatusDTO) o;
    return Objects.equals(campaignId, offerCampaignStatusDTO.campaignId) &&
        Objects.equals(status, offerCampaignStatusDTO.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, status);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferCampaignStatusDTO {\n");
    
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

