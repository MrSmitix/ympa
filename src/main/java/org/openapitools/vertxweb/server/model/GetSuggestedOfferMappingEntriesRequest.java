package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.MappingsOfferDTO;

/**
 * Запрос рекомендованных карточек товара.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSuggestedOfferMappingEntriesRequest   {
  
  private List<MappingsOfferDTO> offers = new ArrayList<>();

  public GetSuggestedOfferMappingEntriesRequest () {

  }

  public GetSuggestedOfferMappingEntriesRequest (List<MappingsOfferDTO> offers) {
    this.offers = offers;
  }

    
  @JsonProperty("offers")
  public List<MappingsOfferDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<MappingsOfferDTO> offers) {
    this.offers = offers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest = (GetSuggestedOfferMappingEntriesRequest) o;
    return Objects.equals(offers, getSuggestedOfferMappingEntriesRequest.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSuggestedOfferMappingEntriesRequest {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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
