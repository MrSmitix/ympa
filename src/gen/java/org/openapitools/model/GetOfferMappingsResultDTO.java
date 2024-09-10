package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GetOfferMappingDTO;
import org.openapitools.model.ScrollingPagerDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация о товарах.
 **/
@ApiModel(description = "Информация о товарах.")
@JsonTypeName("GetOfferMappingsResultDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOfferMappingsResultDTO   {
  private ScrollingPagerDTO paging;
  private @Valid List<@Valid GetOfferMappingDTO> offerMappings = new ArrayList<>();

  /**
   **/
  public GetOfferMappingsResultDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  @Valid public ScrollingPagerDTO getPaging() {
    return paging;
  }

  @JsonProperty("paging")
  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Информация о товарах.
   **/
  public GetOfferMappingsResultDTO offerMappings(List<@Valid GetOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Информация о товарах.")
  @JsonProperty("offerMappings")
  @NotNull @Valid public List<@Valid GetOfferMappingDTO> getOfferMappings() {
    return offerMappings;
  }

  @JsonProperty("offerMappings")
  public void setOfferMappings(List<@Valid GetOfferMappingDTO> offerMappings) {
    this.offerMappings = offerMappings;
  }

  public GetOfferMappingsResultDTO addOfferMappingsItem(GetOfferMappingDTO offerMappingsItem) {
    if (this.offerMappings == null) {
      this.offerMappings = new ArrayList<>();
    }

    this.offerMappings.add(offerMappingsItem);
    return this;
  }

  public GetOfferMappingsResultDTO removeOfferMappingsItem(GetOfferMappingDTO offerMappingsItem) {
    if (offerMappingsItem != null && this.offerMappings != null) {
      this.offerMappings.remove(offerMappingsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

