package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.RegionDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("GetRegionsResponse")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetRegionsResponse   {
  private @Valid List<@Valid RegionDTO> regions = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  /**
   * Регион доставки.
   **/
  public GetRegionsResponse regions(List<@Valid RegionDTO> regions) {
    this.regions = regions;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Регион доставки.")
  @JsonProperty("regions")
  @NotNull @Valid public List<@Valid RegionDTO> getRegions() {
    return regions;
  }

  @JsonProperty("regions")
  public void setRegions(List<@Valid RegionDTO> regions) {
    this.regions = regions;
  }

  public GetRegionsResponse addRegionsItem(RegionDTO regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<>();
    }

    this.regions.add(regionsItem);
    return this;
  }

  public GetRegionsResponse removeRegionsItem(RegionDTO regionsItem) {
    if (regionsItem != null && this.regions != null) {
      this.regions.remove(regionsItem);
    }

    return this;
  }
  /**
   **/
  public GetRegionsResponse paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  @Valid public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  @JsonProperty("paging")
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

