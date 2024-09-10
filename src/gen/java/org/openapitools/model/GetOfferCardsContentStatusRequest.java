package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferCardStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("GetOfferCardsContentStatusRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOfferCardsContentStatusRequest   {
  private @Valid Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds;
  private @Valid Set<OfferCardStatusType> cardStatuses;
  private @Valid Set<Integer> categoryIds;

  /**
   * Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
   **/
  public GetOfferCardsContentStatusRequest offerIds(Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. ")
  @JsonProperty("offerIds")
   @Size(max=200)public Set< @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)String> getOfferIds() {
    return offerIds;
  }

  @JsonProperty("offerIds")
  public void setOfferIds(Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
  }

  public GetOfferCardsContentStatusRequest addOfferIdsItem(String offerIdsItem) {
    if (this.offerIds == null) {
      this.offerIds = new LinkedHashSet<>();
    }

    this.offerIds.add(offerIdsItem);
    return this;
  }

  public GetOfferCardsContentStatusRequest removeOfferIdsItem(String offerIdsItem) {
    if (offerIdsItem != null && this.offerIds != null) {
      this.offerIds.remove(offerIdsItem);
    }

    return this;
  }
  /**
   * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
   **/
  public GetOfferCardsContentStatusRequest cardStatuses(Set<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) ")
  @JsonProperty("cardStatuses")
  public Set<OfferCardStatusType> getCardStatuses() {
    return cardStatuses;
  }

  @JsonProperty("cardStatuses")
  public void setCardStatuses(Set<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
  }

  public GetOfferCardsContentStatusRequest addCardStatusesItem(OfferCardStatusType cardStatusesItem) {
    if (this.cardStatuses == null) {
      this.cardStatuses = new LinkedHashSet<>();
    }

    this.cardStatuses.add(cardStatusesItem);
    return this;
  }

  public GetOfferCardsContentStatusRequest removeCardStatusesItem(OfferCardStatusType cardStatusesItem) {
    if (cardStatusesItem != null && this.cardStatuses != null) {
      this.cardStatuses.remove(cardStatusesItem);
    }

    return this;
  }
  /**
   * Фильтр по категориям на Маркете.
   **/
  public GetOfferCardsContentStatusRequest categoryIds(Set<Integer> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по категориям на Маркете.")
  @JsonProperty("categoryIds")
   @Size(max=200)public Set<Integer> getCategoryIds() {
    return categoryIds;
  }

  @JsonProperty("categoryIds")
  public void setCategoryIds(Set<Integer> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public GetOfferCardsContentStatusRequest addCategoryIdsItem(Integer categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new LinkedHashSet<>();
    }

    this.categoryIds.add(categoryIdsItem);
    return this;
  }

  public GetOfferCardsContentStatusRequest removeCategoryIdsItem(Integer categoryIdsItem) {
    if (categoryIdsItem != null && this.categoryIds != null) {
      this.categoryIds.remove(categoryIdsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

