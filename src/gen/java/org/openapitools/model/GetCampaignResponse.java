package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.CampaignDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о магазине к данным идентификатора кампании.
 **/
@ApiModel(description="Информация о магазине к данным идентификатора кампании.")

public class GetCampaignResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private CampaignDTO campaign;
 /**
   * Get campaign
   * @return campaign
  **/
  @JsonProperty("campaign")
  public CampaignDTO getCampaign() {
    return campaign;
  }

  public void setCampaign(CampaignDTO campaign) {
    this.campaign = campaign;
  }

  public GetCampaignResponse campaign(CampaignDTO campaign) {
    this.campaign = campaign;
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
    GetCampaignResponse getCampaignResponse = (GetCampaignResponse) o;
    return Objects.equals(this.campaign, getCampaignResponse.campaign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCampaignResponse {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
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

