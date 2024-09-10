package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.SuggestedOfferMappingDTO;

/**
 * Подобранные карточки на Маркете.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetSuggestedOfferMappingsResultDTO   {
  
  private List<SuggestedOfferMappingDTO> offers = new ArrayList<>();

  public GetSuggestedOfferMappingsResultDTO () {

  }

  public GetSuggestedOfferMappingsResultDTO (List<SuggestedOfferMappingDTO> offers) {
    this.offers = offers;
  }

    
  @JsonProperty("offers")
  public List<SuggestedOfferMappingDTO> getOffers() {
    return offers;
  }
  public void setOffers(List<SuggestedOfferMappingDTO> offers) {
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
    GetSuggestedOfferMappingsResultDTO getSuggestedOfferMappingsResultDTO = (GetSuggestedOfferMappingsResultDTO) o;
    return Objects.equals(offers, getSuggestedOfferMappingsResultDTO.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSuggestedOfferMappingsResultDTO {\n");
    
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
