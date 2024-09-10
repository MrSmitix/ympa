package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.RegionDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetRegionsResponse  {
  
 /**
  * Регион доставки.
  */
  @ApiModelProperty(required = true, value = "Регион доставки.")
  @Valid
  private List<@Valid RegionDTO> regions = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private ForwardScrollingPagerDTO paging;
 /**
  * Регион доставки.
  * @return regions
  */
  @JsonProperty("regions")
  @NotNull
  public List<@Valid RegionDTO> getRegions() {
    return regions;
  }

  /**
   * Sets the <code>regions</code> property.
   */
 public void setRegions(List<@Valid RegionDTO> regions) {
    this.regions = regions;
  }

  /**
   * Sets the <code>regions</code> property.
   */
  public GetRegionsResponse regions(List<@Valid RegionDTO> regions) {
    this.regions = regions;
    return this;
  }

  /**
   * Adds a new item to the <code>regions</code> list.
   */
  public GetRegionsResponse addRegionsItem(RegionDTO regionsItem) {
    this.regions.add(regionsItem);
    return this;
  }

 /**
  * Get paging
  * @return paging
  */
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
 public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
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

