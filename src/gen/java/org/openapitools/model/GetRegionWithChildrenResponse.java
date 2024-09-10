package org.openapitools.model;

import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.RegionDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetRegionWithChildrenResponse  {
  
  @ApiModelProperty(value = "")
  private FlippingPagerDTO pager;

  @ApiModelProperty(value = "")
  private RegionDTO regions;
 /**
   * Get pager
   * @return pager
  **/
  @JsonProperty("pager")
  public FlippingPagerDTO getPager() {
    return pager;
  }

  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }

  public GetRegionWithChildrenResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

 /**
   * Get regions
   * @return regions
  **/
  @JsonProperty("regions")
  public RegionDTO getRegions() {
    return regions;
  }

  public void setRegions(RegionDTO regions) {
    this.regions = regions;
  }

  public GetRegionWithChildrenResponse regions(RegionDTO regions) {
    this.regions = regions;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

