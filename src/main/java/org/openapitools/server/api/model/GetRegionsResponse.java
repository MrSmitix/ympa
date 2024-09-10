package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.ForwardScrollingPagerDTO;
import org.openapitools.server.api.model.RegionDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetRegionsResponse   {
  
  private List<RegionDTO> regions = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  public GetRegionsResponse () {

  }

  public GetRegionsResponse (List<RegionDTO> regions, ForwardScrollingPagerDTO paging) {
    this.regions = regions;
    this.paging = paging;
  }

    
  @JsonProperty("regions")
  public List<RegionDTO> getRegions() {
    return regions;
  }
  public void setRegions(List<RegionDTO> regions) {
    this.regions = regions;
  }

    
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
    return Objects.equals(regions, getRegionsResponse.regions) &&
        Objects.equals(paging, getRegionsResponse.paging);
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
