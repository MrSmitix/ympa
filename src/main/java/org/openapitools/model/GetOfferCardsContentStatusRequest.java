package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferCardStatusType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * GetOfferCardsContentStatusRequest
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOfferCardsContentStatusRequest {

  @Valid
  private JsonNullable<Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>> offerIds = JsonNullable.<Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>>undefined();

  @Valid
  private JsonNullable<Set<OfferCardStatusType>> cardStatuses = JsonNullable.<Set<OfferCardStatusType>>undefined();

  @Valid
  private JsonNullable<Set<Integer>> categoryIds = JsonNullable.<Set<Integer>>undefined();

  public GetOfferCardsContentStatusRequest offerIds(Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = JsonNullable.of(offerIds);
    return this;
  }

  public GetOfferCardsContentStatusRequest addOfferIdsItem(String offerIdsItem) {
    if (this.offerIds == null || !this.offerIds.isPresent()) {
      this.offerIds = JsonNullable.of(new LinkedHashSet<>());
    }
    this.offerIds.get().add(offerIdsItem);
    return this;
  }

  /**
   * Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
   * @return offerIds
   */
  @Size(max = 200) 
  @Schema(name = "offerIds", description = "Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerIds")
  public JsonNullable<Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(JsonNullable<Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>> offerIds) {
    this.offerIds = offerIds;
  }

  public GetOfferCardsContentStatusRequest cardStatuses(Set<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = JsonNullable.of(cardStatuses);
    return this;
  }

  public GetOfferCardsContentStatusRequest addCardStatusesItem(OfferCardStatusType cardStatusesItem) {
    if (this.cardStatuses == null || !this.cardStatuses.isPresent()) {
      this.cardStatuses = JsonNullable.of(new LinkedHashSet<>());
    }
    this.cardStatuses.get().add(cardStatusesItem);
    return this;
  }

  /**
   * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
   * @return cardStatuses
   */
  @Valid 
  @Schema(name = "cardStatuses", description = "Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cardStatuses")
  public JsonNullable<Set<OfferCardStatusType>> getCardStatuses() {
    return cardStatuses;
  }

  public void setCardStatuses(JsonNullable<Set<OfferCardStatusType>> cardStatuses) {
    this.cardStatuses = cardStatuses;
  }

  public GetOfferCardsContentStatusRequest categoryIds(Set<Integer> categoryIds) {
    this.categoryIds = JsonNullable.of(categoryIds);
    return this;
  }

  public GetOfferCardsContentStatusRequest addCategoryIdsItem(Integer categoryIdsItem) {
    if (this.categoryIds == null || !this.categoryIds.isPresent()) {
      this.categoryIds = JsonNullable.of(new LinkedHashSet<>());
    }
    this.categoryIds.get().add(categoryIdsItem);
    return this;
  }

  /**
   * Фильтр по категориям на Маркете.
   * @return categoryIds
   */
  @Size(max = 200) 
  @Schema(name = "categoryIds", description = "Фильтр по категориям на Маркете.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryIds")
  public JsonNullable<Set<Integer>> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(JsonNullable<Set<Integer>> categoryIds) {
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
    return equalsNullable(this.offerIds, getOfferCardsContentStatusRequest.offerIds) &&
        equalsNullable(this.cardStatuses, getOfferCardsContentStatusRequest.cardStatuses) &&
        equalsNullable(this.categoryIds, getOfferCardsContentStatusRequest.categoryIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(offerIds), hashCodeNullable(cardStatuses), hashCodeNullable(categoryIds));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

