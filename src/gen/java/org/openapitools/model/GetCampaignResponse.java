package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о магазине к данным идентификатора кампании.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация о магазине к данным идентификатора кампании.")
public class GetCampaignResponse   {
  
  private CampaignDTO campaign;

  /**
   **/
  public GetCampaignResponse campaign(CampaignDTO campaign) {
    this.campaign = campaign;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("campaign")
  public CampaignDTO getCampaign() {
    return campaign;
  }
  public void setCampaign(CampaignDTO campaign) {
    this.campaign = campaign;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

