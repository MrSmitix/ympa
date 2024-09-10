package org.openapitools.model;

import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.RegionDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetRegionWithChildrenResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private FlippingPagerDTO pager;

  @ApiModelProperty(value = "")
  @Valid
  private RegionDTO regions;
 /**
  * Get pager
  * @return pager
  */
  @JsonProperty("pager")
  public FlippingPagerDTO getPager() {
    return pager;
  }

  /**
   * Sets the <code>pager</code> property.
   */
 public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }

  /**
   * Sets the <code>pager</code> property.
   */
  public GetRegionWithChildrenResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

 /**
  * Get regions
  * @return regions
  */
  @JsonProperty("regions")
  public RegionDTO getRegions() {
    return regions;
  }

  /**
   * Sets the <code>regions</code> property.
   */
 public void setRegions(RegionDTO regions) {
    this.regions = regions;
  }

  /**
   * Sets the <code>regions</code> property.
   */
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

