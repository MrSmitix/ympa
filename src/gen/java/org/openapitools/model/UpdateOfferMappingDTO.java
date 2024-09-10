package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.UpdateMappingDTO;
import org.openapitools.model.UpdateOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация о товаре.
 **/
@ApiModel(description = "Информация о товаре.")
@JsonTypeName("UpdateOfferMappingDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
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
  @NotNull @Valid public UpdateOfferDTO getOffer() {
    return offer;
  }

  @JsonProperty("offer")
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
  @Valid public UpdateMappingDTO getMapping() {
    return mapping;
  }

  @JsonProperty("mapping")
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

