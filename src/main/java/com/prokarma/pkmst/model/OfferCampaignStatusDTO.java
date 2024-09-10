package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.OfferCampaignStatusType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Статус товара в магазине.
 */
@ApiModel(description = "Статус товара в магазине.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferCampaignStatusDTO   {
  @JsonProperty("campaignId")
  private Long campaignId;

  @JsonProperty("status")
  private OfferCampaignStatusType status;

  public OfferCampaignStatusDTO campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * Идентификатор кампании. 
   * @return campaignId
   */
  @ApiModelProperty(required = true, value = "Идентификатор кампании. ")
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
   */
  @ApiModelProperty(required = true, value = "")
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
    return Objects.equals(this.campaignId, offerCampaignStatusDTO.campaignId) &&
        Objects.equals(this.status, offerCampaignStatusDTO.status);
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

