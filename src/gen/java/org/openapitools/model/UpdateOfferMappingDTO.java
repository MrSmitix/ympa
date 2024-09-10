package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.UpdateMappingDTO;
import org.openapitools.model.UpdateOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о товаре.
 **/
@ApiModel(description="Информация о товаре.")

public class UpdateOfferMappingDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private UpdateOfferDTO offer;

  @ApiModelProperty(value = "")
  @Valid
  private UpdateMappingDTO mapping;
 /**
   * Get offer
   * @return offer
  **/
  @JsonProperty("offer")
  @NotNull
  public UpdateOfferDTO getOffer() {
    return offer;
  }

  public void setOffer(UpdateOfferDTO offer) {
    this.offer = offer;
  }

  public UpdateOfferMappingDTO offer(UpdateOfferDTO offer) {
    this.offer = offer;
    return this;
  }

 /**
   * Get mapping
   * @return mapping
  **/
  @JsonProperty("mapping")
  public UpdateMappingDTO getMapping() {
    return mapping;
  }

  public void setMapping(UpdateMappingDTO mapping) {
    this.mapping = mapping;
  }

  public UpdateOfferMappingDTO mapping(UpdateMappingDTO mapping) {
    this.mapping = mapping;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

