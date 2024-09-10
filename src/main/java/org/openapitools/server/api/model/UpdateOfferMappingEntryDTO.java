package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.OfferMappingDTO;
import org.openapitools.server.api.model.UpdateMappingsOfferDTO;

/**
 * Список товаров.  В теле запроса можно передать от одного до 500 товаров.  Обязательный параметр. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateOfferMappingEntryDTO   {
  
  private OfferMappingDTO mapping;
  private OfferMappingDTO awaitingModerationMapping;
  private OfferMappingDTO rejectedMapping;
  private UpdateMappingsOfferDTO offer;

  public UpdateOfferMappingEntryDTO () {

  }

  public UpdateOfferMappingEntryDTO (OfferMappingDTO mapping, OfferMappingDTO awaitingModerationMapping, OfferMappingDTO rejectedMapping, UpdateMappingsOfferDTO offer) {
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
  public UpdateMappingsOfferDTO getOffer() {
    return offer;
  }
  public void setOffer(UpdateMappingsOfferDTO offer) {
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
    UpdateOfferMappingEntryDTO updateOfferMappingEntryDTO = (UpdateOfferMappingEntryDTO) o;
    return Objects.equals(mapping, updateOfferMappingEntryDTO.mapping) &&
        Objects.equals(awaitingModerationMapping, updateOfferMappingEntryDTO.awaitingModerationMapping) &&
        Objects.equals(rejectedMapping, updateOfferMappingEntryDTO.rejectedMapping) &&
        Objects.equals(offer, updateOfferMappingEntryDTO.offer);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
