package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.UpdateMappingDTO;
import org.openapitools.model.UpdateOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация о товаре.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация о товаре.")
public class UpdateOfferMappingDTO   {
  
  private UpdateOfferDTO offer;

  private UpdateMappingDTO mapping;

  /**
   **/
  public UpdateOfferMappingDTO offer(UpdateOfferDTO offer) {
    this.offer = offer;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("offer")
  @NotNull
  public UpdateOfferDTO getOffer() {
    return offer;
  }
  public void setOffer(UpdateOfferDTO offer) {
    this.offer = offer;
  }


  /**
   **/
  public UpdateOfferMappingDTO mapping(UpdateMappingDTO mapping) {
    this.mapping = mapping;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mapping")
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

