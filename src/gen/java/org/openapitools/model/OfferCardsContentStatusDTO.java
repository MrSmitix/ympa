package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.OfferCardDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Список товаров с информацией о состоянии карточек.
 **/
@ApiModel(description = "Список товаров с информацией о состоянии карточек.")
@JsonTypeName("OfferCardsContentStatusDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferCardsContentStatusDTO   {
  private @Valid List<@Valid OfferCardDTO> offerCards = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  /**
   * Страница списка товаров с информацией о состоянии карточек.
   **/
  public OfferCardsContentStatusDTO offerCards(List<@Valid OfferCardDTO> offerCards) {
    this.offerCards = offerCards;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Страница списка товаров с информацией о состоянии карточек.")
  @JsonProperty("offerCards")
  @NotNull @Valid public List<@Valid OfferCardDTO> getOfferCards() {
    return offerCards;
  }

  @JsonProperty("offerCards")
  public void setOfferCards(List<@Valid OfferCardDTO> offerCards) {
    this.offerCards = offerCards;
  }

  public OfferCardsContentStatusDTO addOfferCardsItem(OfferCardDTO offerCardsItem) {
    if (this.offerCards == null) {
      this.offerCards = new ArrayList<>();
    }

    this.offerCards.add(offerCardsItem);
    return this;
  }

  public OfferCardsContentStatusDTO removeOfferCardsItem(OfferCardDTO offerCardsItem) {
    if (offerCardsItem != null && this.offerCards != null) {
      this.offerCards.remove(offerCardsItem);
    }

    return this;
  }
  /**
   **/
  public OfferCardsContentStatusDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("paging")
  @Valid public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  @JsonProperty("paging")
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

