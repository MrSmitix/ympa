package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EnrichedMappingsOfferDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список рекомендованных карточек товара.
 **/
@ApiModel(description="Список рекомендованных карточек товара.")

public class OfferMappingSuggestionsListDTO  {
  
  @ApiModelProperty(required = true, value = "Список товаров.")
 /**
   * Список товаров.
  **/
  private List<EnrichedMappingsOfferDTO> offers = new ArrayList<>();
 /**
   * Список товаров.
   * @return offers
  **/
  @JsonProperty("offers")
  public List<EnrichedMappingsOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<EnrichedMappingsOfferDTO> offers) {
    this.offers = offers;
  }

  public OfferMappingSuggestionsListDTO offers(List<EnrichedMappingsOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public OfferMappingSuggestionsListDTO addOffersItem(EnrichedMappingsOfferDTO offersItem) {
    this.offers.add(offersItem);
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
    OfferMappingSuggestionsListDTO offerMappingSuggestionsListDTO = (OfferMappingSuggestionsListDTO) o;
    return Objects.equals(this.offers, offerMappingSuggestionsListDTO.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferMappingSuggestionsListDTO {\n");
    
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
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

