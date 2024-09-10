package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 */

@Schema(name = "GetQuarantineOffersRequest", description = "Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetQuarantineOffersRequest {

  @Valid
  private JsonNullable<List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>> offerIds = JsonNullable.<List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>>undefined();

  @Valid
  private JsonNullable<List<OfferCardStatusType>> cardStatuses = JsonNullable.<List<OfferCardStatusType>>undefined();

  @Valid
  private JsonNullable<List<Integer>> categoryIds = JsonNullable.<List<Integer>>undefined();

  @Valid
  private JsonNullable<List<String>> vendorNames = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public GetQuarantineOffersRequest offerIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = JsonNullable.of(offerIds);
    return this;
  }

  public GetQuarantineOffersRequest addOfferIdsItem(String offerIdsItem) {
    if (this.offerIds == null || !this.offerIds.isPresent()) {
      this.offerIds = JsonNullable.of(new ArrayList<>());
    }
    this.offerIds.get().add(offerIdsItem);
    return this;
  }

  /**
   * Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
   * @return offerIds
   */
  @Size(min = 1, max = 500) 
  @Schema(name = "offerIds", description = "Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerIds")
  public JsonNullable<List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(JsonNullable<List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>> offerIds) {
    this.offerIds = offerIds;
  }

  public GetQuarantineOffersRequest cardStatuses(List<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = JsonNullable.of(cardStatuses);
    return this;
  }

  public GetQuarantineOffersRequest addCardStatusesItem(OfferCardStatusType cardStatusesItem) {
    if (this.cardStatuses == null || !this.cardStatuses.isPresent()) {
      this.cardStatuses = JsonNullable.of(new ArrayList<>());
    }
    this.cardStatuses.get().add(cardStatusesItem);
    return this;
  }

  /**
   * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
   * @return cardStatuses
   */
  @Valid @Size(min = 1) 
  @Schema(name = "cardStatuses", description = "Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cardStatuses")
  public JsonNullable<List<OfferCardStatusType>> getCardStatuses() {
    return cardStatuses;
  }

  public void setCardStatuses(JsonNullable<List<OfferCardStatusType>> cardStatuses) {
    this.cardStatuses = cardStatuses;
  }

  public GetQuarantineOffersRequest categoryIds(List<Integer> categoryIds) {
    this.categoryIds = JsonNullable.of(categoryIds);
    return this;
  }

  public GetQuarantineOffersRequest addCategoryIdsItem(Integer categoryIdsItem) {
    if (this.categoryIds == null || !this.categoryIds.isPresent()) {
      this.categoryIds = JsonNullable.of(new ArrayList<>());
    }
    this.categoryIds.get().add(categoryIdsItem);
    return this;
  }

  /**
   * Фильтр по категориям на Маркете.
   * @return categoryIds
   */
  @Size(min = 1) 
  @Schema(name = "categoryIds", description = "Фильтр по категориям на Маркете.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryIds")
  public JsonNullable<List<Integer>> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(JsonNullable<List<Integer>> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public GetQuarantineOffersRequest vendorNames(List<String> vendorNames) {
    this.vendorNames = JsonNullable.of(vendorNames);
    return this;
  }

  public GetQuarantineOffersRequest addVendorNamesItem(String vendorNamesItem) {
    if (this.vendorNames == null || !this.vendorNames.isPresent()) {
      this.vendorNames = JsonNullable.of(new ArrayList<>());
    }
    this.vendorNames.get().add(vendorNamesItem);
    return this;
  }

  /**
   * Фильтр по брендам.
   * @return vendorNames
   */
  @Size(min = 1) 
  @Schema(name = "vendorNames", description = "Фильтр по брендам.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vendorNames")
  public JsonNullable<List<String>> getVendorNames() {
    return vendorNames;
  }

  public void setVendorNames(JsonNullable<List<String>> vendorNames) {
    this.vendorNames = vendorNames;
  }

  public GetQuarantineOffersRequest tags(List<String> tags) {
    this.tags = JsonNullable.of(tags);
    return this;
  }

  public GetQuarantineOffersRequest addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.of(new ArrayList<>());
    }
    this.tags.get().add(tagsItem);
    return this;
  }

  /**
   * Фильтр по тегам.
   * @return tags
   */
  @Size(min = 1) 
  @Schema(name = "tags", description = "Фильтр по тегам.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tags")
  public JsonNullable<List<String>> getTags() {
    return tags;
  }

  public void setTags(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetQuarantineOffersRequest getQuarantineOffersRequest = (GetQuarantineOffersRequest) o;
    return equalsNullable(this.offerIds, getQuarantineOffersRequest.offerIds) &&
        equalsNullable(this.cardStatuses, getQuarantineOffersRequest.cardStatuses) &&
        equalsNullable(this.categoryIds, getQuarantineOffersRequest.categoryIds) &&
        equalsNullable(this.vendorNames, getQuarantineOffersRequest.vendorNames) &&
        equalsNullable(this.tags, getQuarantineOffersRequest.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(offerIds), hashCodeNullable(cardStatuses), hashCodeNullable(categoryIds), hashCodeNullable(vendorNames), hashCodeNullable(tags));
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
    sb.append("class GetQuarantineOffersRequest {\n");
    sb.append("    offerIds: ").append(toIndentedString(offerIds)).append("\n");
    sb.append("    cardStatuses: ").append(toIndentedString(cardStatuses)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    vendorNames: ").append(toIndentedString(vendorNames)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

