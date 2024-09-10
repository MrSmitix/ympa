package apimodels;

import apimodels.ForwardScrollingPagerDTO;
import apimodels.OfferCardDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Список товаров с информацией о состоянии карточек.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferCardsContentStatusDTO   {
  @JsonProperty("offerCards")
  @NotNull
@Valid

  private List<@Valid OfferCardDTO> offerCards = new ArrayList<>();

  @JsonProperty("paging")
  @Valid

  private ForwardScrollingPagerDTO paging;

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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

