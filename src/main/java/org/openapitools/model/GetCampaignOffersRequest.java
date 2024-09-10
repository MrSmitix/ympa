package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferCampaignStatusType;
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

@Schema(name = "GetCampaignOffersRequest", description = "Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. ")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignOffersRequest {

  @Valid
  private JsonNullable<List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>> offerIds = JsonNullable.<List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>>undefined();

  @Valid
  private JsonNullable<List<OfferCampaignStatusType>> statuses = JsonNullable.<List<OfferCampaignStatusType>>undefined();

  @Valid
  private JsonNullable<List<Integer>> categoryIds = JsonNullable.<List<Integer>>undefined();

  @Valid
  private JsonNullable<List<String>> vendorNames = JsonNullable.<List<String>>undefined();

  @Valid
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public GetCampaignOffersRequest offerIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = JsonNullable.of(offerIds);
    return this;
  }

  public GetCampaignOffersRequest addOfferIdsItem(String offerIdsItem) {
    if (this.offerIds == null || !this.offerIds.isPresent()) {
      this.offerIds = JsonNullable.of(new ArrayList<>());
    }
    this.offerIds.get().add(offerIdsItem);
    return this;
  }

  /**
   * Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
   * @return offerIds
   */
  @Size(max = 200) 
  @Schema(name = "offerIds", description = "Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("offerIds")
  public JsonNullable<List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(JsonNullable<List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String>> offerIds) {
    this.offerIds = offerIds;
  }

  public GetCampaignOffersRequest statuses(List<OfferCampaignStatusType> statuses) {
    this.statuses = JsonNullable.of(statuses);
    return this;
  }

  public GetCampaignOffersRequest addStatusesItem(OfferCampaignStatusType statusesItem) {
    if (this.statuses == null || !this.statuses.isPresent()) {
      this.statuses = JsonNullable.of(new ArrayList<>());
    }
    this.statuses.get().add(statusesItem);
    return this;
  }

  /**
   * Фильтр по статусам товаров. 
   * @return statuses
   */
  @Valid 
  @Schema(name = "statuses", description = "Фильтр по статусам товаров. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("statuses")
  public JsonNullable<List<OfferCampaignStatusType>> getStatuses() {
    return statuses;
  }

  public void setStatuses(JsonNullable<List<OfferCampaignStatusType>> statuses) {
    this.statuses = statuses;
  }

  public GetCampaignOffersRequest categoryIds(List<Integer> categoryIds) {
    this.categoryIds = JsonNullable.of(categoryIds);
    return this;
  }

  public GetCampaignOffersRequest addCategoryIdsItem(Integer categoryIdsItem) {
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
  
  @Schema(name = "categoryIds", description = "Фильтр по категориям на Маркете.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("categoryIds")
  public JsonNullable<List<Integer>> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(JsonNullable<List<Integer>> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public GetCampaignOffersRequest vendorNames(List<String> vendorNames) {
    this.vendorNames = JsonNullable.of(vendorNames);
    return this;
  }

  public GetCampaignOffersRequest addVendorNamesItem(String vendorNamesItem) {
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
  
  @Schema(name = "vendorNames", description = "Фильтр по брендам.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("vendorNames")
  public JsonNullable<List<String>> getVendorNames() {
    return vendorNames;
  }

  public void setVendorNames(JsonNullable<List<String>> vendorNames) {
    this.vendorNames = vendorNames;
  }

  public GetCampaignOffersRequest tags(List<String> tags) {
    this.tags = JsonNullable.of(tags);
    return this;
  }

  public GetCampaignOffersRequest addTagsItem(String tagsItem) {
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
    GetCampaignOffersRequest getCampaignOffersRequest = (GetCampaignOffersRequest) o;
    return equalsNullable(this.offerIds, getCampaignOffersRequest.offerIds) &&
        equalsNullable(this.statuses, getCampaignOffersRequest.statuses) &&
        equalsNullable(this.categoryIds, getCampaignOffersRequest.categoryIds) &&
        equalsNullable(this.vendorNames, getCampaignOffersRequest.vendorNames) &&
        equalsNullable(this.tags, getCampaignOffersRequest.tags);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(offerIds), hashCodeNullable(statuses), hashCodeNullable(categoryIds), hashCodeNullable(vendorNames), hashCodeNullable(tags));
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
    sb.append("class GetCampaignOffersRequest {\n");
    sb.append("    offerIds: ").append(toIndentedString(offerIds)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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

