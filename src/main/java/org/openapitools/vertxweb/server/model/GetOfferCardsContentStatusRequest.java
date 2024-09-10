package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.OfferCardStatusType;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOfferCardsContentStatusRequest   {
  
  private Set<String> offerIds;
  private Set<OfferCardStatusType> cardStatuses;
  private Set<Integer> categoryIds;

  public GetOfferCardsContentStatusRequest () {

  }

  public GetOfferCardsContentStatusRequest (Set<String> offerIds, Set<OfferCardStatusType> cardStatuses, Set<Integer> categoryIds) {
    this.offerIds = offerIds;
    this.cardStatuses = cardStatuses;
    this.categoryIds = categoryIds;
  }

    
  @JsonProperty("offerIds")
  public Set<String> getOfferIds() {
    return offerIds;
  }
  public void setOfferIds(Set<String> offerIds) {
    this.offerIds = offerIds;
  }

    
  @JsonProperty("cardStatuses")
  public Set<OfferCardStatusType> getCardStatuses() {
    return cardStatuses;
  }
  public void setCardStatuses(Set<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
  }

    
  @JsonProperty("categoryIds")
  public Set<Integer> getCategoryIds() {
    return categoryIds;
  }
  public void setCategoryIds(Set<Integer> categoryIds) {
    this.categoryIds = categoryIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest = (GetOfferCardsContentStatusRequest) o;
    return Objects.equals(offerIds, getOfferCardsContentStatusRequest.offerIds) &&
        Objects.equals(cardStatuses, getOfferCardsContentStatusRequest.cardStatuses) &&
        Objects.equals(categoryIds, getOfferCardsContentStatusRequest.categoryIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerIds, cardStatuses, categoryIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOfferCardsContentStatusRequest {\n");
    
    sb.append("    offerIds: ").append(toIndentedString(offerIds)).append("\n");
    sb.append("    cardStatuses: ").append(toIndentedString(cardStatuses)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
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
