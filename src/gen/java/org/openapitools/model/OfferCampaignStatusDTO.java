package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferCampaignStatusType;



/**
 * Статус товара в магазине.
 **/

@ApiModel(description = "Статус товара в магазине.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferCampaignStatusDTO   {
  @JsonProperty("campaignId")
  private Long campaignId;

  @JsonProperty("status")
  private OfferCampaignStatusType status;

  /**
   * Идентификатор кампании. 
   **/
  public OfferCampaignStatusDTO campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор кампании. ")
  @JsonProperty("campaignId")
  public Long getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   **/
  public OfferCampaignStatusDTO status(OfferCampaignStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
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

