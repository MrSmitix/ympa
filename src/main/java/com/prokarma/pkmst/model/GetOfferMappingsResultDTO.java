package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.GetOfferMappingDTO;
import com.prokarma.pkmst.model.ScrollingPagerDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о товарах.
 */
@ApiModel(description = "Информация о товарах.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOfferMappingsResultDTO   {
  @JsonProperty("paging")
  private ScrollingPagerDTO paging;

  @JsonProperty("offerMappings")
  
  private List<GetOfferMappingDTO> offerMappings = new ArrayList<>();

  public GetOfferMappingsResultDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   */
  @ApiModelProperty(value = "")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public GetOfferMappingsResultDTO offerMappings(List<GetOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
    return this;
  }

  public GetOfferMappingsResultDTO addOfferMappingsItem(GetOfferMappingDTO offerMappingsItem) {
    if (this.offerMappings == null) {
      this.offerMappings = new ArrayList<>();
    }
    this.offerMappings.add(offerMappingsItem);
    return this;
  }

  /**
   * Информация о товарах.
   * @return offerMappings
   */
  @ApiModelProperty(required = true, value = "Информация о товарах.")
  public List<GetOfferMappingDTO> getOfferMappings() {
    return offerMappings;
  }

  public void setOfferMappings(List<GetOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

