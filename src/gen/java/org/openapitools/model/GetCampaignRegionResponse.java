package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.RegionDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ответ на запрос региона магазина.
 */
@ApiModel(description="Ответ на запрос региона магазина.")

public class GetCampaignRegionResponse  {
  
  @ApiModelProperty(value = "")
  @Valid
  private RegionDTO region;
 /**
  * Get region
  * @return region
  */
  @JsonProperty("region")
  public RegionDTO getRegion() {
    return region;
  }

  /**
   * Sets the <code>region</code> property.
   */
 public void setRegion(RegionDTO region) {
    this.region = region;
  }

  /**
   * Sets the <code>region</code> property.
   */
  public GetCampaignRegionResponse region(RegionDTO region) {
    this.region = region;
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
    GetCampaignRegionResponse getCampaignRegionResponse = (GetCampaignRegionResponse) o;
    return Objects.equals(this.region, getCampaignRegionResponse.region);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCampaignRegionResponse {\n");
    
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

