package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.CampaignDTO;
import org.openapitools.vertxweb.server.model.FlippingPagerDTO;

/**
 * Результаты поиска магазинов.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetCampaignsResponse   {
  
  private List<CampaignDTO> campaigns = new ArrayList<>();
  private FlippingPagerDTO pager;

  public GetCampaignsResponse () {

  }

  public GetCampaignsResponse (List<CampaignDTO> campaigns, FlippingPagerDTO pager) {
    this.campaigns = campaigns;
    this.pager = pager;
  }

    
  @JsonProperty("campaigns")
  public List<CampaignDTO> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<CampaignDTO> campaigns) {
    this.campaigns = campaigns;
  }

    
  @JsonProperty("pager")
  public FlippingPagerDTO getPager() {
    return pager;
  }
  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCampaignsResponse getCampaignsResponse = (GetCampaignsResponse) o;
    return Objects.equals(campaigns, getCampaignsResponse.campaigns) &&
        Objects.equals(pager, getCampaignsResponse.pager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaigns, pager);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCampaignsResponse {\n");
    
    sb.append("    campaigns: ").append(toIndentedString(campaigns)).append("\n");
    sb.append("    pager: ").append(toIndentedString(pager)).append("\n");
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
