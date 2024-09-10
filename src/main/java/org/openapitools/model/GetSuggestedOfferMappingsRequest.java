package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SuggestedOfferDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetSuggestedOfferMappingsRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetSuggestedOfferMappingsRequest {

  @Valid
  private JsonNullable<List<@Valid SuggestedOfferDTO>> offers = JsonNullable.<List<@Valid SuggestedOfferDTO>>undefined();

  public GetSuggestedOfferMappingsRequest offers(List<@Valid SuggestedOfferDTO> offers) {
    this.offers = JsonNullable.of(offers);
    return this;
  }

  public GetSuggestedOfferMappingsRequest addOffersItem(SuggestedOfferDTO offersItem) {
    if (this.offers == null || !this.offers.isPresent()) {
      this.offers = JsonNullable.of(new ArrayList<>());
    }
    this.offers.get().add(offersItem);
    return this;
  }

  /**
   * Список товаров.
   * @return offers
   */
  @Valid @Size(min = 1, max = 500) 
  @Schema(name = "offers", description = "Список товаров.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offers")
  public JsonNullable<List<@Valid SuggestedOfferDTO>> getOffers() {
    return offers;
  }

  public void setOffers(JsonNullable<List<@Valid SuggestedOfferDTO>> offers) {
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
    GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest = (GetSuggestedOfferMappingsRequest) o;
    return equalsNullable(this.offers, getSuggestedOfferMappingsRequest.offers);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(offers));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSuggestedOfferMappingsRequest {\n");
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

