package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.UpdateMappingDTO;
import org.openapitools.server.api.model.UpdateOfferDTO;

/**
 * Информация о товаре.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateOfferMappingDTO   {
  
  private UpdateOfferDTO offer;
  private UpdateMappingDTO mapping;

  public UpdateOfferMappingDTO () {

  }

  public UpdateOfferMappingDTO (UpdateOfferDTO offer, UpdateMappingDTO mapping) {
    this.offer = offer;
    this.mapping = mapping;
  }

    
  @JsonProperty("offer")
  public UpdateOfferDTO getOffer() {
    return offer;
  }
  public void setOffer(UpdateOfferDTO offer) {
    this.offer = offer;
  }

    
  @JsonProperty("mapping")
  public UpdateMappingDTO getMapping() {
    return mapping;
  }
  public void setMapping(UpdateMappingDTO mapping) {
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
    UpdateOfferMappingDTO updateOfferMappingDTO = (UpdateOfferMappingDTO) o;
    return Objects.equals(offer, updateOfferMappingDTO.offer) &&
        Objects.equals(mapping, updateOfferMappingDTO.mapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offer, mapping);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferMappingDTO {\n");
    
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
