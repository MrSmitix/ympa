package apimodels;

import apimodels.FlippingPagerDTO;
import apimodels.RegionDTO;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetRegionWithChildrenResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetRegionWithChildrenResponse   {
  @JsonProperty("pager")
  @Valid

  private FlippingPagerDTO pager;

  @JsonProperty("regions")
  @Valid

  private RegionDTO regions;

  public GetRegionWithChildrenResponse pager(FlippingPagerDTO pager) {
    this.pager = pager;
    return this;
  }

   /**
   * Get pager
   * @return pager
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

