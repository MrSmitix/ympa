package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignDTO;
import org.openapitools.model.FlippingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Результаты поиска магазинов.
 **/
@ApiModel(description = "Результаты поиска магазинов.")
@JsonTypeName("GetCampaignsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignsResponse   {
  private @Valid List<@Valid CampaignDTO> campaigns = new ArrayList<>();
  private FlippingPagerDTO pager;

  /**
   * Список с информацией по каждому магазину.
   **/
  public GetCampaignsResponse campaigns(List<@Valid CampaignDTO> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список с информацией по каждому магазину.")
  @JsonProperty("campaigns")
  @NotNull @Valid public List<@Valid CampaignDTO> getCampaigns() {
    return campaigns;
  }

  @JsonProperty("campaigns")
  public void setCampaigns(List<@Valid CampaignDTO> campaigns) {
    this.campaigns = campaigns;
  }

  public GetCampaignsResponse addCampaignsItem(CampaignDTO campaignsItem) {
    if (this.campaigns == null) {
      this.campaigns = new ArrayList<>();
    }

    this.campaigns.add(campaignsItem);
    return this;
  }

  public GetCampaignsResponse removeCampaignsItem(CampaignDTO campaignsItem) {
    if (campaignsItem != null && this.campaigns != null) {
      this.campaigns.remove(campaignsItem);
    }

    return this;
  }
  /**
   **/
  public GetCampaignsResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("pager")
  @Valid public FlippingPagerDTO getPager() {
    return pager;
  }

  @JsonProperty("pager")
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

