package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.UpdateCampaignOfferDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Запрос на обновление предложений товаров магазина.
 */

@Schema(name = "UpdateCampaignOffersRequest", description = "Запрос на обновление предложений товаров магазина.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class UpdateCampaignOffersRequest {

  @Valid
  private List<@Valid UpdateCampaignOfferDTO> offers = new ArrayList<>();

  public UpdateCampaignOffersRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateCampaignOffersRequest(List<@Valid UpdateCampaignOfferDTO> offers) {
    this.offers = offers;
  }

  public UpdateCampaignOffersRequest offers(List<@Valid UpdateCampaignOfferDTO> offers) {
    this.offers = offers;
    return this;
  }

  public UpdateCampaignOffersRequest addOffersItem(UpdateCampaignOfferDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Параметры размещения товаров в заданном магазине.
   * @return offers
   */
  @NotNull @Valid @Size(min = 1, max = 500) 
  @Schema(name = "offers", description = "Параметры размещения товаров в заданном магазине.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offers")
  public List<@Valid UpdateCampaignOfferDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid UpdateCampaignOfferDTO> offers) {
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
    UpdateCampaignOffersRequest updateCampaignOffersRequest = (UpdateCampaignOffersRequest) o;
    return Objects.equals(this.offers, updateCampaignOffersRequest.offers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCampaignOffersRequest {\n");
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

