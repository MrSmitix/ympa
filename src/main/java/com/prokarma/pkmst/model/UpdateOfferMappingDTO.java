package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.UpdateMappingDTO;
import com.prokarma.pkmst.model.UpdateOfferDTO;
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
public class UpdateOfferMappingDTO   {
  @JsonProperty("offer")
  private UpdateOfferDTO offer;

  @JsonProperty("mapping")
  private UpdateMappingDTO mapping;

  public UpdateOfferMappingDTO offer(UpdateOfferDTO offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
   */
  @ApiModelProperty(required = true, value = "")
  public UpdateOfferDTO getOffer() {
    return offer;
  }

  public void setOffer(UpdateOfferDTO offer) {
    this.offer = offer;
  }

  public UpdateOfferMappingDTO mapping(UpdateMappingDTO mapping) {
    this.mapping = mapping;
    return this;
  }

  /**
   * Get mapping
   * @return mapping
   */
  @ApiModelProperty(value = "")
  public UpdateMappingDTO getMapping() {
    return mapping;
  }

  public void setMapping(UpdateMappingDTO mapping) {
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
    UpdateOfferMappingDTO updateOfferMappingDTO = (UpdateOfferMappingDTO) o;
    return Objects.equals(this.offer, updateOfferMappingDTO.offer) &&
        Objects.equals(this.mapping, updateOfferMappingDTO.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer, mapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferMappingDTO {\n");
    
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

