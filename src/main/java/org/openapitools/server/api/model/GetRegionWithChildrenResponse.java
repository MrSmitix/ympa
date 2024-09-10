package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.FlippingPagerDTO;
import org.openapitools.server.api.model.RegionDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetRegionWithChildrenResponse   {
  
  private FlippingPagerDTO pager;
  private RegionDTO regions;

  public GetRegionWithChildrenResponse () {

  }

  public GetRegionWithChildrenResponse (FlippingPagerDTO pager, RegionDTO regions) {
    this.pager = pager;
    this.regions = regions;
  }

    
  @JsonProperty("pager")
  public FlippingPagerDTO getPager() {
    return pager;
  }
  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }

    
  @JsonProperty("regions")
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
    return Objects.equals(pager, getRegionWithChildrenResponse.pager) &&
        Objects.equals(regions, getRegionWithChildrenResponse.regions);
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
