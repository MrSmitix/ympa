package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.GetMappingDTO;
import org.openapitools.server.api.model.GetOfferDTO;

/**
 * Информация о товаре.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOfferMappingDTO   {
  
  private GetOfferDTO offer;
  private GetMappingDTO mapping;

  public GetOfferMappingDTO () {

  }

  public GetOfferMappingDTO (GetOfferDTO offer, GetMappingDTO mapping) {
    this.offer = offer;
    this.mapping = mapping;
  }

    
  @JsonProperty("offer")
  public GetOfferDTO getOffer() {
    return offer;
  }
  public void setOffer(GetOfferDTO offer) {
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
    GetOfferMappingDTO getOfferMappingDTO = (GetOfferMappingDTO) o;
    return Objects.equals(offer, getOfferMappingDTO.offer) &&
        Objects.equals(mapping, getOfferMappingDTO.mapping);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
