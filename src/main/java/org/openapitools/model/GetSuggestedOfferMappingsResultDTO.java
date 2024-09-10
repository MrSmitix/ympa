package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.SuggestedOfferMappingDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Подобранные карточки на Маркете.
 */

@Schema(name = "GetSuggestedOfferMappingsResultDTO", description = "Подобранные карточки на Маркете.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetSuggestedOfferMappingsResultDTO {

  @Valid
  private List<@Valid SuggestedOfferMappingDTO> offers = new ArrayList<>();

  public GetSuggestedOfferMappingsResultDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetSuggestedOfferMappingsResultDTO(List<@Valid SuggestedOfferMappingDTO> offers) {
    this.offers = offers;
  }

  public GetSuggestedOfferMappingsResultDTO offers(List<@Valid SuggestedOfferMappingDTO> offers) {
    this.offers = offers;
    return this;
  }

  public GetSuggestedOfferMappingsResultDTO addOffersItem(SuggestedOfferMappingDTO offersItem) {
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
  public List<@Valid SuggestedOfferMappingDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid SuggestedOfferMappingDTO> offers) {
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
    return Objects.equals(this.offers, getSuggestedOfferMappingsResultDTO.offers);
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

