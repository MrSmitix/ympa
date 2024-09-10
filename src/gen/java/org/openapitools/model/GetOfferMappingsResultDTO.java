package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GetOfferMappingDTO;
import org.openapitools.model.ScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о товарах.
 **/
@ApiModel(description="Информация о товарах.")

public class GetOfferMappingsResultDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ScrollingPagerDTO paging;

  @ApiModelProperty(required = true, value = "Информация о товарах.")
  @Valid
 /**
   * Информация о товарах.
  **/
  private List<@Valid GetOfferMappingDTO> offerMappings = new ArrayList<>();
 /**
   * Get paging
   * @return paging
  **/
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public GetOfferMappingsResultDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

 /**
   * Информация о товарах.
   * @return offerMappings
  **/
  @JsonProperty("offerMappings")
  @NotNull
  public List<@Valid GetOfferMappingDTO> getOfferMappings() {
    return offerMappings;
  }

  public void setOfferMappings(List<@Valid GetOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
  }

  public GetOfferMappingsResultDTO offerMappings(List<@Valid GetOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
    return this;
  }

  public GetOfferMappingsResultDTO addOfferMappingsItem(GetOfferMappingDTO offerMappingsItem) {
    this.offerMappings.add(offerMappingsItem);
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
    GetOfferMappingsResultDTO getOfferMappingsResultDTO = (GetOfferMappingsResultDTO) o;
    return Objects.equals(this.paging, getOfferMappingsResultDTO.paging) &&
        Objects.equals(this.offerMappings, getOfferMappingsResultDTO.offerMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paging, offerMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOfferMappingsResultDTO {\n");
    
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
    sb.append("    offerMappings: ").append(toIndentedString(offerMappings)).append("\n");
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

