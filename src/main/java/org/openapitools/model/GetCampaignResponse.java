package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.CampaignDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о магазине к данным идентификатора кампании.
 */

@Schema(name = "GetCampaignResponse", description = "Информация о магазине к данным идентификатора кампании.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignResponse {

  private CampaignDTO campaign;

  public GetCampaignResponse campaign(CampaignDTO campaign) {
    this.campaign = campaign;
    return this;
  }

  /**
   * Get campaign
   * @return campaign
   */
  @Valid 
  @Schema(name = "campaign", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
