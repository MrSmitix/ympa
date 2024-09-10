package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.OfferMappingDTO;
import org.openapitools.model.UpdateMappingsOfferDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 
 **/
@ApiModel(description="Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. ")

public class UpdateOfferMappingEntryDTO  {
  
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
  private UpdateMappingsOfferDTO offer;
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

  public UpdateOfferMappingEntryDTO mapping(OfferMappingDTO mapping) {
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

  public UpdateOfferMappingEntryDTO awaitingModerationMapping(OfferMappingDTO awaitingModerationMapping) {
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

  public UpdateOfferMappingEntryDTO rejectedMapping(OfferMappingDTO rejectedMapping) {
    this.rejectedMapping = rejectedMapping;
    return this;
  }

 /**
   * Get offer
   * @return offer
  **/
  @JsonProperty("offer")
  public UpdateMappingsOfferDTO getOffer() {
    return offer;
  }

  public void setOffer(UpdateMappingsOfferDTO offer) {
    this.offer = offer;
  }

  public UpdateOfferMappingEntryDTO offer(UpdateMappingsOfferDTO offer) {
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
    UpdateOfferMappingEntryDTO updateOfferMappingEntryDTO = (UpdateOfferMappingEntryDTO) o;
    return Objects.equals(this.mapping, updateOfferMappingEntryDTO.mapping) &&
        Objects.equals(this.awaitingModerationMapping, updateOfferMappingEntryDTO.awaitingModerationMapping) &&
        Objects.equals(this.rejectedMapping, updateOfferMappingEntryDTO.rejectedMapping) &&
        Objects.equals(this.offer, updateOfferMappingEntryDTO.offer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mapping, awaitingModerationMapping, rejectedMapping, offer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferMappingEntryDTO {\n");
    
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

