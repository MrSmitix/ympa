package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.GetMappingDTO;
import org.openapitools.model.SuggestedOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Товар с соответствующей карточкой на Маркете.
 **/
@ApiModel(description="Товар с соответствующей карточкой на Маркете.")

public class SuggestedOfferMappingDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private SuggestedOfferDTO offer;

  @ApiModelProperty(value = "")
  @Valid
  private GetMappingDTO mapping;
 /**
   * Get offer
   * @return offer
  **/
  @JsonProperty("offer")
  public SuggestedOfferDTO getOffer() {
    return offer;
  }

  public void setOffer(SuggestedOfferDTO offer) {
    this.offer = offer;
  }

  public SuggestedOfferMappingDTO offer(SuggestedOfferDTO offer) {
    this.offer = offer;
    return this;
  }

 /**
   * Get mapping
   * @return mapping
  **/
  @JsonProperty("mapping")
  public GetMappingDTO getMapping() {
    return mapping;
  }

  public void setMapping(GetMappingDTO mapping) {
    this.mapping = mapping;
  }

  public SuggestedOfferMappingDTO mapping(GetMappingDTO mapping) {
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
    SuggestedOfferMappingDTO suggestedOfferMappingDTO = (SuggestedOfferMappingDTO) o;
    return Objects.equals(this.offer, suggestedOfferMappingDTO.offer) &&
        Objects.equals(this.mapping, suggestedOfferMappingDTO.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer, mapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestedOfferMappingDTO {\n");
    
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

