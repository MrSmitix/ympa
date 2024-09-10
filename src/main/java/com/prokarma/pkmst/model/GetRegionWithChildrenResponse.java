package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.FlippingPagerDTO;
import com.prokarma.pkmst.model.RegionDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * GetRegionWithChildrenResponse
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetRegionWithChildrenResponse   {
  @JsonProperty("pager")
  private FlippingPagerDTO pager;

  @JsonProperty("regions")
  private RegionDTO regions;

  public GetRegionWithChildrenResponse pager(FlippingPagerDTO pager) {
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

  public GetRegionWithChildrenResponse regions(RegionDTO regions) {
    this.regions = regions;
    return this;
  }

  /**
   * Get regions
   * @return regions
   */
  @ApiModelProperty(value = "")
  public RegionDTO getRegions() {
    return regions;
  }

  public void setRegions(RegionDTO regions) {
    this.regions = regions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRegionWithChildrenResponse getRegionWithChildrenResponse = (GetRegionWithChildrenResponse) o;
    return Objects.equals(this.pager, getRegionWithChildrenResponse.pager) &&
        Objects.equals(this.regions, getRegionWithChildrenResponse.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pager, regions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRegionWithChildrenResponse {\n");
    
    sb.append("    pager: ").append(toIndentedString(pager)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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

