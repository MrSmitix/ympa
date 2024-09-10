package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OfferPriceByOfferIdsResponseDTO;
import org.openapitools.model.ScrollingPagerDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список цен.
 */

@Schema(name = "OfferPriceByOfferIdsListResponseDTO", description = "Список цен.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferPriceByOfferIdsListResponseDTO {

  @Valid
  private List<@Valid OfferPriceByOfferIdsResponseDTO> offers = new ArrayList<>();

  private ScrollingPagerDTO paging;

  public OfferPriceByOfferIdsListResponseDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OfferPriceByOfferIdsListResponseDTO(List<@Valid OfferPriceByOfferIdsResponseDTO> offers) {
    this.offers = offers;
  }

  public OfferPriceByOfferIdsListResponseDTO offers(List<@Valid OfferPriceByOfferIdsResponseDTO> offers) {
    this.offers = offers;
    return this;
  }

  public OfferPriceByOfferIdsListResponseDTO addOffersItem(OfferPriceByOfferIdsResponseDTO offersItem) {
    if (this.offers == null) {
      this.offers = new ArrayList<>();
    }
    this.offers.add(offersItem);
    return this;
  }

  /**
   * Страница списка цен.
   * @return offers
   */
  @NotNull @Valid 
  @Schema(name = "offers", description = "Страница списка цен.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offers")
  public List<@Valid OfferPriceByOfferIdsResponseDTO> getOffers() {
    return offers;
  }

  public void setOffers(List<@Valid OfferPriceByOfferIdsResponseDTO> offers) {
    this.offers = offers;
  }

  public OfferPriceByOfferIdsListResponseDTO paging(ScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  /**
   * Get paging
   * @return paging
   */
  @Valid 
  @Schema(name = "paging", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("paging")
  public ScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ScrollingPagerDTO paging) {
    this.paging = paging;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferPriceByOfferIdsListResponseDTO offerPriceByOfferIdsListResponseDTO = (OfferPriceByOfferIdsListResponseDTO) o;
    return Objects.equals(this.offers, offerPriceByOfferIdsListResponseDTO.offers) &&
        Objects.equals(this.paging, offerPriceByOfferIdsListResponseDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offers, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferPriceByOfferIdsListResponseDTO {\n");
    sb.append("    offers: ").append(toIndentedString(offers)).append("\n");
    sb.append("    paging: ").append(toIndentedString(paging)).append("\n");
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

