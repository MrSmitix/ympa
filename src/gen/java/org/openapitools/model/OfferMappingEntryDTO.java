package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.MappingsOfferDTO;
import org.openapitools.model.OfferMappingDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список товаров. 
 */
@ApiModel(description="Список товаров. ")

public class OfferMappingEntryDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private OfferMappingDTO mapping;

  @ApiModelProperty(value = "")
  @Valid
  private OfferMappingDTO awaitingModerationMapping;

  @ApiModelProperty(value = "")
  @Valid
  private OfferMappingDTO rejectedMapping;

  @ApiModelProperty(value = "")
  @Valid
  private MappingsOfferDTO offer;
 /**
  * Get mapping
  * @return mapping
  */
  @JsonProperty("mapping")
  public OfferMappingDTO getMapping() {
    return mapping;
  }

  /**
   * Sets the <code>mapping</code> property.
   */
 public void setMapping(OfferMappingDTO mapping) {
    this.mapping = mapping;
  }

  /**
   * Sets the <code>mapping</code> property.
   */
  public OfferMappingEntryDTO mapping(OfferMappingDTO mapping) {
    this.mapping = mapping;
    return this;
  }

 /**
  * Get awaitingModerationMapping
  * @return awaitingModerationMapping
  */
  @JsonProperty("awaitingModerationMapping")
  public OfferMappingDTO getAwaitingModerationMapping() {
    return awaitingModerationMapping;
  }

  /**
   * Sets the <code>awaitingModerationMapping</code> property.
   */
 public void setAwaitingModerationMapping(OfferMappingDTO awaitingModerationMapping) {
    this.awaitingModerationMapping = awaitingModerationMapping;
  }

  /**
   * Sets the <code>awaitingModerationMapping</code> property.
   */
  public OfferMappingEntryDTO awaitingModerationMapping(OfferMappingDTO awaitingModerationMapping) {
    this.awaitingModerationMapping = awaitingModerationMapping;
    return this;
  }

 /**
  * Get rejectedMapping
  * @return rejectedMapping
  */
  @JsonProperty("rejectedMapping")
  public OfferMappingDTO getRejectedMapping() {
    return rejectedMapping;
  }

  /**
   * Sets the <code>rejectedMapping</code> property.
   */
 public void setRejectedMapping(OfferMappingDTO rejectedMapping) {
    this.rejectedMapping = rejectedMapping;
  }

  /**
   * Sets the <code>rejectedMapping</code> property.
   */
  public OfferMappingEntryDTO rejectedMapping(OfferMappingDTO rejectedMapping) {
    this.rejectedMapping = rejectedMapping;
    return this;
  }

 /**
  * Get offer
  * @return offer
  */
  @JsonProperty("offer")
  public MappingsOfferDTO getOffer() {
    return offer;
  }

  /**
   * Sets the <code>offer</code> property.
   */
 public void setOffer(MappingsOfferDTO offer) {
    this.offer = offer;
  }

  /**
   * Sets the <code>offer</code> property.
   */
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

