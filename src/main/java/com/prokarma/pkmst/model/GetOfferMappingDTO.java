package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.GetMappingDTO;
import com.prokarma.pkmst.model.GetOfferDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о товаре.
 */
@ApiModel(description = "Информация о товаре.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOfferMappingDTO   {
  @JsonProperty("offer")
  private GetOfferDTO offer;

  @JsonProperty("mapping")
  private GetMappingDTO mapping;

  public GetOfferMappingDTO offer(GetOfferDTO offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
   */
  @ApiModelProperty(value = "")
  public GetOfferDTO getOffer() {
    return offer;
  }

  public void setOffer(GetOfferDTO offer) {
    this.offer = offer;
  }

  public GetOfferMappingDTO mapping(GetMappingDTO mapping) {
    this.mapping = mapping;
    return this;
  }

  /**
   * Get mapping
   * @return mapping
   */
  @ApiModelProperty(value = "")
  public GetMappingDTO getMapping() {
    return mapping;
  }

  public void setMapping(GetMappingDTO mapping) {
    this.mapping = mapping;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOfferMappingDTO getOfferMappingDTO = (GetOfferMappingDTO) o;
    return Objects.equals(this.offer, getOfferMappingDTO.offer) &&
        Objects.equals(this.mapping, getOfferMappingDTO.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer, mapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOfferMappingDTO {\n");
    
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
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

