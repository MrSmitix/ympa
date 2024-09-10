package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Найденные предложения магазина.
 */

@Schema(name = "OffersDTO", description = "Найденные предложения магазина.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OffersDTO {

  @Valid
  private List<@Valid OfferDTO> offers = new ArrayList<>();

  public OffersDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OffersDTO(List<@Valid OfferDTO> offers) {
    this.offers = offers;
  }

  public OffersDTO offers(List<@Valid OfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public OffersDTO addOffersItem(OfferDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Список предложений магазина.
   * @return offers
   */
  @NotNull @Valid 
  @Schema(name = "offers", description = "Список предложений магазина.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offers")
  public List<@Valid OfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid OfferDTO> offers) {
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
    OffersDTO offersDTO = (OffersDTO) o;
    return Objects.equals(this.offers, offersDTO.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OffersDTO {\n");
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

