package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.OfferCardDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Список товаров с информацией о состоянии карточек.
 **/
@ApiModel(description="Список товаров с информацией о состоянии карточек.")

public class OfferCardsContentStatusDTO  {
  
  @ApiModelProperty(required = true, value = "Страница списка товаров с информацией о состоянии карточек.")
 /**
   * Страница списка товаров с информацией о состоянии карточек.
  **/
  private List<OfferCardDTO> offerCards = new ArrayList<>();

  @ApiModelProperty(value = "")
  private ForwardScrollingPagerDTO paging;
 /**
   * Страница списка товаров с информацией о состоянии карточек.
   * @return offerCards
  **/
  @JsonProperty("offerCards")
  public List<OfferCardDTO> getOfferCards() {
    return offerCards;
  }

  public void setOfferCards(List<OfferCardDTO> offerCards) {
    this.offerCards = offerCards;
  }

  public OfferCardsContentStatusDTO offerCards(List<OfferCardDTO> offerCards) {
    this.offerCards = offerCards;
    return this;
  }

  public OfferCardsContentStatusDTO addOfferCardsItem(OfferCardDTO offerCardsItem) {
    this.offerCards.add(offerCardsItem);
    return this;
  }

 /**
   * Get paging
   * @return paging
  **/
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  public OfferCardsContentStatusDTO paging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

