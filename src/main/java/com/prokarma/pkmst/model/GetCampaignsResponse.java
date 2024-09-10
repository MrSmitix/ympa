package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.CampaignDTO;
import com.prokarma.pkmst.model.FlippingPagerDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Результаты поиска магазинов.
 */
@ApiModel(description = "Результаты поиска магазинов.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignsResponse   {
  @JsonProperty("campaigns")
  
  private List<CampaignDTO> campaigns = new ArrayList<>();

  @JsonProperty("pager")
  private FlippingPagerDTO pager;

  public GetCampaignsResponse campaigns(List<CampaignDTO> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  public GetCampaignsResponse addCampaignsItem(CampaignDTO campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<>();
    }
    this.campaigns.add(campaignsItem);
    return this;
  }

  /**
   * Список с информацией по каждому магазину.
   * @return campaigns
   */
  @ApiModelProperty(required = true, value = "Список с информацией по каждому магазину.")
  public List<CampaignDTO> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<CampaignDTO> campaigns) {
    this.campaigns = campaigns;
  }

  public GetCampaignsResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

  /**
   * Get pager
   * @return pager
   */
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

