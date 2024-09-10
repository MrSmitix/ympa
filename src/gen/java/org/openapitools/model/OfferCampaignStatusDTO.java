package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.OfferCampaignStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Статус товара в магазине.
 */
@ApiModel(description="Статус товара в магазине.")

public class OfferCampaignStatusDTO  {
  
 /**
  * Идентификатор кампании. 
  */
  @ApiModelProperty(required = true, value = "Идентификатор кампании. ")
  private Long campaignId;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private OfferCampaignStatusType status;
 /**
  * Идентификатор кампании. 
  * @return campaignId
  */
  @JsonProperty("campaignId")
  @NotNull
  public Long getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
 public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
  public OfferCampaignStatusDTO campaignId(Long campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  @NotNull
  public OfferCampaignStatusType getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(OfferCampaignStatusType status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public OfferCampaignStatusDTO status(OfferCampaignStatusType status) {
    this.status = status;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

