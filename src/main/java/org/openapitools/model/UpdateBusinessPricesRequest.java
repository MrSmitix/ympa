package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateBusinessOfferPriceDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Запрос на установку базовых цен на товары.
 */

@Schema(name = "UpdateBusinessPricesRequest", description = "Запрос на установку базовых цен на товары.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateBusinessPricesRequest {

  @Valid
  private List<@Valid UpdateBusinessOfferPriceDTO> offers = new ArrayList<>();

  public UpdateBusinessPricesRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateBusinessPricesRequest(List<@Valid UpdateBusinessOfferPriceDTO> offers) {
    this.offers = offers;
  }

  public UpdateBusinessPricesRequest offers(List<@Valid UpdateBusinessOfferPriceDTO> offers) {
    this.offers = offers;
    return this;
  }

  public UpdateBusinessPricesRequest addOffersItem(UpdateBusinessOfferPriceDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Список товаров с ценами.
   * @return offers
   */
  @NotNull @Valid @Size(min = 1, max = 500) 
  @Schema(name = "offers", description = "Список товаров с ценами.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offers")
  public List<@Valid UpdateBusinessOfferPriceDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid UpdateBusinessOfferPriceDTO> offers) {
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
    UpdateBusinessPricesRequest updateBusinessPricesRequest = (UpdateBusinessPricesRequest) o;
    return Objects.equals(this.offers, updateBusinessPricesRequest.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateBusinessPricesRequest {\n");
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

