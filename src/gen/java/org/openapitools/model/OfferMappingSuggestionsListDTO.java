package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EnrichedMappingsOfferDTO;

/**
 * Список рекомендованных карточек товара.
 */
@ApiModel(description = "Список рекомендованных карточек товара.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferMappingSuggestionsListDTO   {
  @JsonProperty("offers")
  private List<@Valid EnrichedMappingsOfferDTO> offers = new ArrayList<>();

  public OfferMappingSuggestionsListDTO offers(List<@Valid EnrichedMappingsOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public OfferMappingSuggestionsListDTO addOffersItem(EnrichedMappingsOfferDTO offersItem) {
    this.offers.add(offersItem);
    return this;
  }

   /**
   * Список товаров.
   * @return offers
  **/
  @ApiModelProperty(required = true, value = "Список товаров.")
  public List<@Valid EnrichedMappingsOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid EnrichedMappingsOfferDTO> offers) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

