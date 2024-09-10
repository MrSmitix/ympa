package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.OfferCardDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Список товаров с информацией о состоянии карточек.
 */

@Schema(name = "OfferCardsContentStatusDTO", description = "Список товаров с информацией о состоянии карточек.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferCardsContentStatusDTO {

  @Valid
  private List<@Valid OfferCardDTO> offerCards = new ArrayList<>();

  private ForwardScrollingPagerDTO paging;

  public OfferCardsContentStatusDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OfferCardsContentStatusDTO(List<@Valid OfferCardDTO> offerCards) {
    this.offerCards = offerCards;
  }

  public OfferCardsContentStatusDTO offerCards(List<@Valid OfferCardDTO> offerCards) {
    this.offerCards = offerCards;
    return this;
  }

  public OfferCardsContentStatusDTO addOfferCardsItem(OfferCardDTO offerCardsItem) {
    if (this.offerCards == null) {
      this.offerCards = new ArrayList<>();
    }
    this.offerCards.add(offerCardsItem);
    return this;
  }

  /**
   * Страница списка товаров с информацией о состоянии карточек.
   * @return offerCards
   */
  @NotNull @Valid 
  @Schema(name = "offerCards", description = "Страница списка товаров с информацией о состоянии карточек.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offerCards")
  public List<@Valid OfferCardDTO> getOfferCards() {
    return offerCards;
  }

  public void setOfferCards(List<@Valid OfferCardDTO> offerCards) {
    this.offerCards = offerCards;
  }

  public OfferCardsContentStatusDTO paging(ForwardScrollingPagerDTO paging) {
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
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ForwardScrollingPagerDTO paging) {
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
    OfferCardsContentStatusDTO offerCardsContentStatusDTO = (OfferCardsContentStatusDTO) o;
    return Objects.equals(this.offerCards, offerCardsContentStatusDTO.offerCards) &&
        Objects.equals(this.paging, offerCardsContentStatusDTO.paging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerCards, paging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferCardsContentStatusDTO {\n");
    sb.append("    offerCards: ").append(toIndentedString(offerCards)).append("\n");
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

