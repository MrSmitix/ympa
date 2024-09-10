package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.OfferCampaignStatusType;

/**
 * Статус товара в магазине.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferCampaignStatusDTO   {
  
  private Long campaignId;
  private OfferCampaignStatusType status;

  public OfferCampaignStatusDTO () {

  }

  public OfferCampaignStatusDTO (Long campaignId, OfferCampaignStatusType status) {
    this.campaignId = campaignId;
    this.status = status;
  }

    
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

    
  @JsonProperty("status")
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
