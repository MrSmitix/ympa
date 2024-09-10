package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.ForwardScrollingPagerDTO;
import org.openapitools.server.api.model.OfferCardDTO;

/**
 * Список товаров с информацией о состоянии карточек.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferCardsContentStatusDTO   {
  
  private List<OfferCardDTO> offerCards = new ArrayList<>();
  private ForwardScrollingPagerDTO paging;

  public OfferCardsContentStatusDTO () {

  }

  public OfferCardsContentStatusDTO (List<OfferCardDTO> offerCards, ForwardScrollingPagerDTO paging) {
    this.offerCards = offerCards;
    this.paging = paging;
  }

    
  @JsonProperty("offerCards")
  public List<OfferCardDTO> getOfferCards() {
    return offerCards;
  }
  public void setOfferCards(List<OfferCardDTO> offerCards) {
    this.offerCards = offerCards;
  }

    
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
    return Objects.equals(offerCards, offerCardsContentStatusDTO.offerCards) &&
        Objects.equals(paging, offerCardsContentStatusDTO.paging);
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
