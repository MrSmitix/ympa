package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.RegionDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetRegionsResponse  {
  
  @ApiModelProperty(required = true, value = "Регион доставки.")
 /**
   * Регион доставки.
  **/
  private List<RegionDTO> regions = new ArrayList<>();

  @ApiModelProperty(value = "")
  private ForwardScrollingPagerDTO paging;
 /**
   * Регион доставки.
   * @return regions
  **/
  @JsonProperty("regions")
  public List<RegionDTO> getRegions() {
    return regions;
  }

  public void setRegions(List<RegionDTO> regions) {
    this.regions = regions;
  }

  public GetRegionsResponse regions(List<RegionDTO> regions) {
    this.regions = regions;
    return this;
  }

  public GetRegionsResponse addRegionsItem(RegionDTO regionsItem) {
    this.regions.add(regionsItem);
    return this;
  }

 /**
   * Get paging
   * @return paging
  **/
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public GetRegionsResponse paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

