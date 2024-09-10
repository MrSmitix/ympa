package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.GetMappingDTO;
import org.openapitools.server.api.model.SuggestedOfferDTO;

/**
 * Товар с соответствующей карточкой на Маркете.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SuggestedOfferMappingDTO   {
  
  private SuggestedOfferDTO offer;
  private GetMappingDTO mapping;

  public SuggestedOfferMappingDTO () {

  }

  public SuggestedOfferMappingDTO (SuggestedOfferDTO offer, GetMappingDTO mapping) {
    this.offer = offer;
    this.mapping = mapping;
  }

    
  @JsonProperty("offer")
  public SuggestedOfferDTO getOffer() {
    return offer;
  }
  public void setOffer(SuggestedOfferDTO offer) {
    this.offer = offer;
  }

    
  @JsonProperty("mapping")
  public GetMappingDTO getMapping() {
    return mapping;
  }
  public void setMapping(GetMappingDTO mapping) {
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
    SuggestedOfferMappingDTO suggestedOfferMappingDTO = (SuggestedOfferMappingDTO) o;
    return Objects.equals(offer, suggestedOfferMappingDTO.offer) &&
        Objects.equals(mapping, suggestedOfferMappingDTO.mapping);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
