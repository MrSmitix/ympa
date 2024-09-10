package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.vertxweb.server.model.MappingsOfferDTO;
import org.openapitools.vertxweb.server.model.OfferMappingDTO;

/**
 * Список товаров. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferMappingEntryDTO   {
  
  private OfferMappingDTO mapping;
  private OfferMappingDTO awaitingModerationMapping;
  private OfferMappingDTO rejectedMapping;
  private MappingsOfferDTO offer;

  public OfferMappingEntryDTO () {

  }

  public OfferMappingEntryDTO (OfferMappingDTO mapping, OfferMappingDTO awaitingModerationMapping, OfferMappingDTO rejectedMapping, MappingsOfferDTO offer) {
    this.mapping = mapping;
    this.awaitingModerationMapping = awaitingModerationMapping;
    this.rejectedMapping = rejectedMapping;
    this.offer = offer;
  }

    
  @JsonProperty("mapping")
  public OfferMappingDTO getMapping() {
    return mapping;
  }
  public void setMapping(OfferMappingDTO mapping) {
    this.mapping = mapping;
  }

    
  @JsonProperty("awaitingModerationMapping")
  public OfferMappingDTO getAwaitingModerationMapping() {
    return awaitingModerationMapping;
  }
  public void setAwaitingModerationMapping(OfferMappingDTO awaitingModerationMapping) {
    this.awaitingModerationMapping = awaitingModerationMapping;
  }

    
  @JsonProperty("rejectedMapping")
  public OfferMappingDTO getRejectedMapping() {
    return rejectedMapping;
  }
  public void setRejectedMapping(OfferMappingDTO rejectedMapping) {
    this.rejectedMapping = rejectedMapping;
  }

    
  @JsonProperty("offer")
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
    return Objects.equals(mapping, offerMappingEntryDTO.mapping) &&
        Objects.equals(awaitingModerationMapping, offerMappingEntryDTO.awaitingModerationMapping) &&
        Objects.equals(rejectedMapping, offerMappingEntryDTO.rejectedMapping) &&
        Objects.equals(offer, offerMappingEntryDTO.offer);
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
