package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignDTO;
import org.openapitools.model.FlippingPagerDTO;



/**
 * Результаты поиска магазинов.
 **/

@ApiModel(description = "Результаты поиска магазинов.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignsResponse   {
  @JsonProperty("campaigns")
  private List<CampaignDTO> campaigns = new ArrayList<>();

  @JsonProperty("pager")
  private FlippingPagerDTO pager;

  /**
   * Список с информацией по каждому магазину.
   **/
  public GetCampaignsResponse campaigns(List<CampaignDTO> campaigns) {
    this.campaigns = campaigns;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список с информацией по каждому магазину.")
  @JsonProperty("campaigns")
  public List<CampaignDTO> getCampaigns() {
    return campaigns;
  }
  public void setCampaigns(List<CampaignDTO> campaigns) {
    this.campaigns = campaigns;
  }

  /**
   **/
  public GetCampaignsResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

  
  @ApiModelProperty(value = "")
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

