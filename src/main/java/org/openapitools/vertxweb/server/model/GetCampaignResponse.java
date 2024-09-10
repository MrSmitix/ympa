package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.CampaignDTO;

/**
 * Информация о магазине к данным идентификатора кампании.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCampaignResponse   {
  
  private CampaignDTO campaign;

  public GetCampaignResponse () {

  }

  public GetCampaignResponse (CampaignDTO campaign) {
    this.campaign = campaign;
  }

    
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
    return Objects.equals(campaign, getCampaignResponse.campaign);
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
