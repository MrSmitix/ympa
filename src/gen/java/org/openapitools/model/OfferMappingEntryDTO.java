package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.MappingsOfferDTO;
import org.openapitools.model.OfferMappingDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список товаров. 
 **/
@ApiModel(description="Список товаров. ")

public class OfferMappingEntryDTO  {
  
  @ApiModelProperty(value = "")
  private OfferMappingDTO mapping;

  @ApiModelProperty(value = "")
  private OfferMappingDTO awaitingModerationMapping;

  @ApiModelProperty(value = "")
  private OfferMappingDTO rejectedMapping;

  @ApiModelProperty(value = "")
  private MappingsOfferDTO offer;
 /**
   * Get mapping
   * @return mapping
  **/
  @JsonProperty("mapping")
  public OfferMappingDTO getMapping() {
    return mapping;
  }

  public void setMapping(OfferMappingDTO mapping) {
    this.mapping = mapping;
  }

  public OfferMappingEntryDTO mapping(OfferMappingDTO mapping) {
    this.mapping = mapping;
    return this;
  }

 /**
   * Get awaitingModerationMapping
   * @return awaitingModerationMapping
  **/
  @JsonProperty("awaitingModerationMapping")
  public OfferMappingDTO getAwaitingModerationMapping() {
    return awaitingModerationMapping;
  }

  public void setAwaitingModerationMapping(OfferMappingDTO awaitingModerationMapping) {
    this.awaitingModerationMapping = awaitingModerationMapping;
  }

  public OfferMappingEntryDTO awaitingModerationMapping(OfferMappingDTO awaitingModerationMapping) {
    this.awaitingModerationMapping = awaitingModerationMapping;
    return this;
  }

 /**
   * Get rejectedMapping
   * @return rejectedMapping
  **/
  @JsonProperty("rejectedMapping")
  public OfferMappingDTO getRejectedMapping() {
    return rejectedMapping;
  }

  public void setRejectedMapping(OfferMappingDTO rejectedMapping) {
    this.rejectedMapping = rejectedMapping;
  }

  public OfferMappingEntryDTO rejectedMapping(OfferMappingDTO rejectedMapping) {
    this.rejectedMapping = rejectedMapping;
    return this;
  }

 /**
   * Get offer
   * @return offer
  **/
  @JsonProperty("offer")
  public MappingsOfferDTO getOffer() {
    return offer;
  }

  public void setOffer(MappingsOfferDTO offer) {
    this.offer = offer;
  }

  public OfferMappingEntryDTO offer(MappingsOfferDTO offer) {
    this.offer = offer;
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
    OfferMappingEntryDTO offerMappingEntryDTO = (OfferMappingEntryDTO) o;
    return Objects.equals(this.mapping, offerMappingEntryDTO.mapping) &&
        Objects.equals(this.awaitingModerationMapping, offerMappingEntryDTO.awaitingModerationMapping) &&
        Objects.equals(this.rejectedMapping, offerMappingEntryDTO.rejectedMapping) &&
        Objects.equals(this.offer, offerMappingEntryDTO.offer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapping, awaitingModerationMapping, rejectedMapping, offer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferMappingEntryDTO {\n");
    
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    awaitingModerationMapping: ").append(toIndentedString(awaitingModerationMapping)).append("\n");
    sb.append("    rejectedMapping: ").append(toIndentedString(rejectedMapping)).append("\n");
    sb.append("    offer: ").append(toIndentedString(offer)).append("\n");
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

