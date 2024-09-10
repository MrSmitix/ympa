package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EnrichedMappingsOfferDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список рекомендованных карточек товара.
 */

@Schema(name = "OfferMappingSuggestionsListDTO", description = "Список рекомендованных карточек товара.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferMappingSuggestionsListDTO {

  @Valid
  private List<@Valid EnrichedMappingsOfferDTO> offers = new ArrayList<>();

  public OfferMappingSuggestionsListDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OfferMappingSuggestionsListDTO(List<@Valid EnrichedMappingsOfferDTO> offers) {
    this.offers = offers;
  }

  public OfferMappingSuggestionsListDTO offers(List<@Valid EnrichedMappingsOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public OfferMappingSuggestionsListDTO addOffersItem(EnrichedMappingsOfferDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Список товаров.
   * @return offers
   */
  @NotNull @Valid 
  @Schema(name = "offers", description = "Список товаров.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offers")
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

