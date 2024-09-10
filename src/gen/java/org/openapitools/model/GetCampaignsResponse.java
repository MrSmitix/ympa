package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignDTO;
import org.openapitools.model.FlippingPagerDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Результаты поиска магазинов.
 **/
@ApiModel(description="Результаты поиска магазинов.")

public class GetCampaignsResponse  {
  
  @ApiModelProperty(required = true, value = "Список с информацией по каждому магазину.")
 /**
   * Список с информацией по каждому магазину.
  **/
  private List<CampaignDTO> campaigns = new ArrayList<>();

  @ApiModelProperty(value = "")
  private FlippingPagerDTO pager;
 /**
   * Список с информацией по каждому магазину.
   * @return campaigns
  **/
  @JsonProperty("campaigns")
  public List<CampaignDTO> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<CampaignDTO> campaigns) {
    this.campaigns = campaigns;
  }

  public GetCampaignsResponse campaigns(List<CampaignDTO> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  public GetCampaignsResponse addCampaignsItem(CampaignDTO campaignsItem) {
    this.campaigns.add(campaignsItem);
    return this;
  }

 /**
   * Get pager
   * @return pager
  **/
  @JsonProperty("pager")
  public FlippingPagerDTO getPager() {
    return pager;
  }

  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }

  public GetCampaignsResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
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
    GetCampaignsResponse getCampaignsResponse = (GetCampaignsResponse) o;
    return Objects.equals(this.campaigns, getCampaignsResponse.campaigns) &&
        Objects.equals(this.pager, getCampaignsResponse.pager);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

