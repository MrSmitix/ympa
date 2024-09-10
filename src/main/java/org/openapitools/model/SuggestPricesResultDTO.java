package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.PriceSuggestOfferDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Результат запроса цен для продвижения.
 */

@Schema(name = "SuggestPricesResultDTO", description = "Результат запроса цен для продвижения.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SuggestPricesResultDTO {

  @Valid
  private List<@Valid PriceSuggestOfferDTO> offers = new ArrayList<>();

  public SuggestPricesResultDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SuggestPricesResultDTO(List<@Valid PriceSuggestOfferDTO> offers) {
    this.offers = offers;
  }

  public SuggestPricesResultDTO offers(List<@Valid PriceSuggestOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public SuggestPricesResultDTO addOffersItem(PriceSuggestOfferDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Список товаров с ценами для продвижения.
   * @return offers
   */
  @NotNull @Valid 
  @Schema(name = "offers", description = "Список товаров с ценами для продвижения.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offers")
  public List<@Valid PriceSuggestOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid PriceSuggestOfferDTO> offers) {
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
    SuggestPricesResultDTO suggestPricesResultDTO = (SuggestPricesResultDTO) o;
    return Objects.equals(this.offers, suggestPricesResultDTO.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestPricesResultDTO {\n");
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

