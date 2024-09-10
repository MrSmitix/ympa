package org.openapitools.model;

import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferCardStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetOfferCardsContentStatusRequest  {
  
  @ApiModelProperty(value = "Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. ")
 /**
   * Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
  **/
  private Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds;

  @ApiModelProperty(value = "Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) ")
  @Valid
 /**
   * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
  **/
  private Set<OfferCardStatusType> cardStatuses;

  @ApiModelProperty(value = "Фильтр по категориям на Маркете.")
 /**
   * Фильтр по категориям на Маркете.
  **/
  private Set<Integer> categoryIds;
 /**
   * Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
   * @return offerIds
  **/
  @JsonProperty("offerIds")
 @Size(max=200)  public Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
  }

  public GetOfferCardsContentStatusRequest offerIds(Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  public GetOfferCardsContentStatusRequest addOfferIdsItem(String offerIdsItem) {
    this.offerIds.add(offerIdsItem);
    return this;
  }

 /**
   * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
   * @return cardStatuses
  **/
  @JsonProperty("cardStatuses")
  public Set<OfferCardStatusType> getCardStatuses() {
    return cardStatuses;
  }

  public void setCardStatuses(Set<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
  }

  public GetOfferCardsContentStatusRequest cardStatuses(Set<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
    return this;
  }

  public GetOfferCardsContentStatusRequest addCardStatusesItem(OfferCardStatusType cardStatusesItem) {
    this.cardStatuses.add(cardStatusesItem);
    return this;
  }

 /**
   * Фильтр по категориям на Маркете.
   * @return categoryIds
  **/
  @JsonProperty("categoryIds")
 @Size(max=200)  public Set<Integer> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(Set<Integer> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public GetOfferCardsContentStatusRequest categoryIds(Set<Integer> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public GetOfferCardsContentStatusRequest addCategoryIdsItem(Integer categoryIdsItem) {
    this.categoryIds.add(categoryIdsItem);
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
    GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest = (GetOfferCardsContentStatusRequest) o;
    return Objects.equals(this.offerIds, getOfferCardsContentStatusRequest.offerIds) &&
        Objects.equals(this.cardStatuses, getOfferCardsContentStatusRequest.cardStatuses) &&
        Objects.equals(this.categoryIds, getOfferCardsContentStatusRequest.categoryIds);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

