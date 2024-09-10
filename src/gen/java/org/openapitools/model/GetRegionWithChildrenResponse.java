package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.FlippingPagerDTO;
import org.openapitools.model.RegionDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetRegionWithChildrenResponse   {
  
  private FlippingPagerDTO pager;
  private RegionDTO regions;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("pager")
  @Valid
  public FlippingPagerDTO getPager() {
    return pager;
  }
  public void setPager(FlippingPagerDTO pager) {
    this.pager = pager;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("regions")
  @Valid
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

