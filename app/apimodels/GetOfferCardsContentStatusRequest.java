package apimodels;

import apimodels.OfferCardStatusType;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetOfferCardsContentStatusRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetOfferCardsContentStatusRequest   {
  @JsonProperty("offerIds")
  @Size(max=200)

  private Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds = null;

  @JsonProperty("cardStatuses")
  @Valid

  private Set<OfferCardStatusType> cardStatuses = null;

  @JsonProperty("categoryIds")
  @Size(max=200)

  private Set<Integer> categoryIds = null;

  public GetOfferCardsContentStatusRequest offerIds(Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  public GetOfferCardsContentStatusRequest addOfferIdsItem(String offerIdsItem) {
    if (this.offerIds == null) {
      this.offerIds = new LinkedHashSet<>();
    }
    this.offerIds.add(offerIdsItem);
    return this;
  }

   /**
   * Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
   * @return offerIds
  **/
  public Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
  }

  public GetOfferCardsContentStatusRequest cardStatuses(Set<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
    return this;
  }

  public GetOfferCardsContentStatusRequest addCardStatusesItem(OfferCardStatusType cardStatusesItem) {
    if (this.cardStatuses == null) {
      this.cardStatuses = new LinkedHashSet<>();
    }
    this.cardStatuses.add(cardStatusesItem);
    return this;
  }

   /**
   * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
   * @return cardStatuses
  **/
  public Set<OfferCardStatusType> getCardStatuses() {
    return cardStatuses;
  }

  public void setCardStatuses(Set<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
  }

  public GetOfferCardsContentStatusRequest categoryIds(Set<Integer> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public GetOfferCardsContentStatusRequest addCategoryIdsItem(Integer categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new LinkedHashSet<>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

   /**
   * Фильтр по категориям на Маркете.
   * @return categoryIds
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

