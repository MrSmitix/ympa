package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.GetMappingDTO;
import org.openapitools.model.GetOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о товаре.
 */
@ApiModel(description="Информация о товаре.")

public class GetOfferMappingDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private GetOfferDTO offer;

  @ApiModelProperty(value = "")
  @Valid
  private GetMappingDTO mapping;
 /**
  * Get offer
  * @return offer
  */
  @JsonProperty("offer")
  public GetOfferDTO getOffer() {
    return offer;
  }

  /**
   * Sets the <code>offer</code> property.
   */
 public void setOffer(GetOfferDTO offer) {
    this.offer = offer;
  }

  /**
   * Sets the <code>offer</code> property.
   */
  public GetOfferMappingDTO offer(GetOfferDTO offer) {
    this.offer = offer;
    return this;
  }

 /**
  * Get mapping
  * @return mapping
  */
  @JsonProperty("mapping")
  public GetMappingDTO getMapping() {
    return mapping;
  }

  /**
   * Sets the <code>mapping</code> property.
   */
 public void setMapping(GetMappingDTO mapping) {
    this.mapping = mapping;
  }

  /**
   * Sets the <code>mapping</code> property.
   */
  public GetOfferMappingDTO mapping(GetMappingDTO mapping) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

