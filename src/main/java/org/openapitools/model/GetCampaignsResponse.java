package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CampaignDTO;
import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Результаты поиска магазинов.
 */

@Schema(name = "GetCampaignsResponse", description = "Результаты поиска магазинов.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignsResponse {

  @Valid
  private List<@Valid CampaignDTO> campaigns = new ArrayList<>();

  private FlippingPagerDTO pager;

  public GetCampaignsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetCampaignsResponse(List<@Valid CampaignDTO> campaigns) {
    this.campaigns = campaigns;
  }

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
   */
  @NotNull @Valid 
  @Schema(name = "campaigns", description = "Список с информацией по каждому магазину.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("campaigns")
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
   */
  @Valid 
  @Schema(name = "pager", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

