package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.UpdateOfferMappingEntryDTO;

/**
 * Запрос на обновление товаров.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateOfferMappingEntryRequest   {
  
  private List<UpdateOfferMappingEntryDTO> offerMappingEntries = new ArrayList<>();

  public UpdateOfferMappingEntryRequest () {

  }

  public UpdateOfferMappingEntryRequest (List<UpdateOfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
  }

    
  @JsonProperty("offerMappingEntries")
  public List<UpdateOfferMappingEntryDTO> getOfferMappingEntries() {
    return offerMappingEntries;
  }
  public void setOfferMappingEntries(List<UpdateOfferMappingEntryDTO> offerMappingEntries) {
    this.offerMappingEntries = offerMappingEntries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest = (UpdateOfferMappingEntryRequest) o;
    return Objects.equals(offerMappingEntries, updateOfferMappingEntryRequest.offerMappingEntries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerMappingEntries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOfferMappingEntryRequest {\n");
    
    sb.append("    offerMappingEntries: ").append(toIndentedString(offerMappingEntries)).append("\n");
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
