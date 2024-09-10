package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignDTO;
import org.openapitools.model.FlippingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Результаты поиска магазинов.
 */
@ApiModel(description="Результаты поиска магазинов.")

public class GetCampaignsResponse  {
  
 /**
  * Список с информацией по каждому магазину.
  */
  @ApiModelProperty(required = true, value = "Список с информацией по каждому магазину.")
  @Valid
  private List<@Valid CampaignDTO> campaigns = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private FlippingPagerDTO pager;
 /**
  * Список с информацией по каждому магазину.
  * @return campaigns
  */
  @JsonProperty("campaigns")
  @NotNull
  public List<@Valid CampaignDTO> getCampaigns() {
    return campaigns;
  }

  /**
   * Sets the <code>campaigns</code> property.
   */
 public void setCampaigns(List<@Valid CampaignDTO> campaigns) {
    this.campaigns = campaigns;
  }

  /**
   * Sets the <code>campaigns</code> property.
   */
  public GetCampaignsResponse campaigns(List<@Valid CampaignDTO> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  /**
   * Adds a new item to the <code>campaigns</code> list.
   */
  public GetCampaignsResponse addCampaignsItem(CampaignDTO campaignsItem) {
    this.campaigns.add(campaignsItem);
    return this;
  }

 /**
  * Get pager
  * @return pager
  */
  @JsonProperty("pager")
  public FlippingPagerDTO getPager() {
    return pager;
  }

  /**
   * Sets the <code>pager</code> property.
   */
 public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }

  /**
   * Sets the <code>pager</code> property.
   */
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

