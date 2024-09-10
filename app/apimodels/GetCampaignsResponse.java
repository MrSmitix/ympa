package apimodels;

import apimodels.CampaignDTO;
import apimodels.FlippingPagerDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Результаты поиска магазинов.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetCampaignsResponse   {
  @JsonProperty("campaigns")
  @NotNull
@Valid

  private List<@Valid CampaignDTO> campaigns = new ArrayList<>();

  @JsonProperty("pager")
  @Valid

  private FlippingPagerDTO pager;

  public GetCampaignsResponse campaigns(List<@Valid CampaignDTO> campaigns) {
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
  **/
  public List<@Valid CampaignDTO> getCampaigns() {
    return campaigns;
  }

  public void setCampaigns(List<@Valid CampaignDTO> campaigns) {
    this.campaigns = campaigns;
  }

  public GetCampaignsResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

   /**
   * Get pager
   * @return pager
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

