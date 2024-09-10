package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ForwardScrollingPagerDTO;
import com.prokarma.pkmst.model.OfferCardDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Список товаров с информацией о состоянии карточек.
 */
@ApiModel(description = "Список товаров с информацией о состоянии карточек.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferCardsContentStatusDTO   {
  @JsonProperty("offerCards")
  
  private List<OfferCardDTO> offerCards = new ArrayList<>();

  @JsonProperty("paging")
  private ForwardScrollingPagerDTO paging;

  public OfferCardsContentStatusDTO offerCards(List<OfferCardDTO> offerCards) {
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
  @ApiModelProperty(required = true, value = "Страница списка товаров с информацией о состоянии карточек.")
  public List<OfferCardDTO> getOfferCards() {
    return offerCards;
  }

  public void setOfferCards(List<OfferCardDTO> offerCards) {
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
  @ApiModelProperty(value = "")
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

