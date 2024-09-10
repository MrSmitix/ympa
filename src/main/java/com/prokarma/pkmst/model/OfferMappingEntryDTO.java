package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.MappingsOfferDTO;
import com.prokarma.pkmst.model.OfferMappingDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Список товаров. 
 */
@ApiModel(description = "Список товаров. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferMappingEntryDTO   {
  @JsonProperty("mapping")
  private OfferMappingDTO mapping;

  @JsonProperty("awaitingModerationMapping")
  private OfferMappingDTO awaitingModerationMapping;

  @JsonProperty("rejectedMapping")
  private OfferMappingDTO rejectedMapping;

  @JsonProperty("offer")
  private MappingsOfferDTO offer;

  public OfferMappingEntryDTO mapping(OfferMappingDTO mapping) {
    this.mapping = mapping;
    return this;
  }

  /**
   * Get mapping
   * @return mapping
   */
  @ApiModelProperty(value = "")
  public OfferMappingDTO getMapping() {
    return mapping;
  }

  public void setMapping(OfferMappingDTO mapping) {
    this.mapping = mapping;
  }

  public OfferMappingEntryDTO awaitingModerationMapping(OfferMappingDTO awaitingModerationMapping) {
    this.awaitingModerationMapping = awaitingModerationMapping;
    return this;
  }

  /**
   * Get awaitingModerationMapping
   * @return awaitingModerationMapping
   */
  @ApiModelProperty(value = "")
  public OfferMappingDTO getAwaitingModerationMapping() {
    return awaitingModerationMapping;
  }

  public void setAwaitingModerationMapping(OfferMappingDTO awaitingModerationMapping) {
    this.awaitingModerationMapping = awaitingModerationMapping;
  }

  public OfferMappingEntryDTO rejectedMapping(OfferMappingDTO rejectedMapping) {
    this.rejectedMapping = rejectedMapping;
    return this;
  }

  /**
   * Get rejectedMapping
   * @return rejectedMapping
   */
  @ApiModelProperty(value = "")
  public OfferMappingDTO getRejectedMapping() {
    return rejectedMapping;
  }

  public void setRejectedMapping(OfferMappingDTO rejectedMapping) {
    this.rejectedMapping = rejectedMapping;
  }

  public OfferMappingEntryDTO offer(MappingsOfferDTO offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Get offer
   * @return offer
   */
  @ApiModelProperty(value = "")
  public MappingsOfferDTO getOffer() {
    return offer;
  }

  public void setOffer(MappingsOfferDTO offer) {
    this.offer = offer;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

