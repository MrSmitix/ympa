package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.RegionDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Ответ на запрос региона магазина.
 */

@Schema(name = "GetCampaignRegionResponse", description = "Ответ на запрос региона магазина.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignRegionResponse {

  private RegionDTO region;

  public GetCampaignRegionResponse region(RegionDTO region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
   */
  @Valid 
  @Schema(name = "region", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
  public RegionDTO getRegion() {
    return region;
  }

  public void setRegion(RegionDTO region) {
    this.region = region;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCampaignRegionResponse getCampaignRegionResponse = (GetCampaignRegionResponse) o;
    return Objects.equals(this.region, getCampaignRegionResponse.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCampaignRegionResponse {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

