package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ForwardScrollingPagerDTO;
import org.openapitools.model.OfferCardDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Список товаров с информацией о состоянии карточек.
 */
@ApiModel(description="Список товаров с информацией о состоянии карточек.")

public class OfferCardsContentStatusDTO  {
  
 /**
  * Страница списка товаров с информацией о состоянии карточек.
  */
  @ApiModelProperty(required = true, value = "Страница списка товаров с информацией о состоянии карточек.")
  @Valid
  private List<@Valid OfferCardDTO> offerCards = new ArrayList<>();

  @ApiModelProperty(value = "")
  @Valid
  private ForwardScrollingPagerDTO paging;
 /**
  * Страница списка товаров с информацией о состоянии карточек.
  * @return offerCards
  */
  @JsonProperty("offerCards")
  @NotNull
  public List<@Valid OfferCardDTO> getOfferCards() {
    return offerCards;
  }

  /**
   * Sets the <code>offerCards</code> property.
   */
 public void setOfferCards(List<@Valid OfferCardDTO> offerCards) {
    this.offerCards = offerCards;
  }

  /**
   * Sets the <code>offerCards</code> property.
   */
  public OfferCardsContentStatusDTO offerCards(List<@Valid OfferCardDTO> offerCards) {
    this.offerCards = offerCards;
    return this;
  }

  /**
   * Adds a new item to the <code>offerCards</code> list.
   */
  public OfferCardsContentStatusDTO addOfferCardsItem(OfferCardDTO offerCardsItem) {
    this.offerCards.add(offerCardsItem);
    return this;
  }

 /**
  * Get paging
  * @return paging
  */
  @JsonProperty("paging")
  public ForwardScrollingPagerDTO getPaging() {
    return paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
 public void setPaging(ForwardScrollingPagerDTO paging) {
    this.paging = paging;
  }

  /**
   * Sets the <code>paging</code> property.
   */
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

