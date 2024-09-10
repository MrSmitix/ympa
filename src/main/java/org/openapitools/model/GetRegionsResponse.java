package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.RegionDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetRegionsResponse
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetRegionsResponse {

  @Valid
  private List<@Valid RegionDTO> regions = new ArrayList<>();

  private ForwardScrollingPagerDTO paging;

  public GetRegionsResponse() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetRegionsResponse(List<@Valid RegionDTO> regions) {
    this.regions = regions;
  }

  public GetRegionsResponse regions(List<@Valid RegionDTO> regions) {
    this.regions = regions;
    return this;
  }

  public GetRegionsResponse addRegionsItem(RegionDTO regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

  /**
   * Регион доставки.
   * @return regions
   */
  @NotNull @Valid 
  @Schema(name = "regions", description = "Регион доставки.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("regions")
  public List<@Valid RegionDTO> getRegions() {
    return regions;
  }

  public void setRegions(List<@Valid RegionDTO> regions) {
    this.regions = regions;
  }

  public GetRegionsResponse paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   */
  @Valid 
  @Schema(name = "paging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRegionsResponse getRegionsResponse = (GetRegionsResponse) o;
    return Objects.equals(this.regions, getRegionsResponse.regions) &&
        Objects.equals(this.paging, getRegionsResponse.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regions, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRegionsResponse {\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

