package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferCardStatusType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetOfferMappingsRequest  {
  
  @ApiModelProperty(value = "Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    ")
 /**
   * Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    
  **/
  private List<String> offerIds;

  @ApiModelProperty(value = "Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) ")
 /**
   * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
  **/
  private List<OfferCardStatusType> cardStatuses;

  @ApiModelProperty(value = "Фильтр по категориям на Маркете.")
 /**
   * Фильтр по категориям на Маркете.
  **/
  private List<Integer> categoryIds;

  @ApiModelProperty(value = "Фильтр по брендам.")
 /**
   * Фильтр по брендам.
  **/
  private List<String> vendorNames;

  @ApiModelProperty(value = "Фильтр по тегам.")
 /**
   * Фильтр по тегам.
  **/
  private List<String> tags;

  @ApiModelProperty(value = "Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. ")
 /**
   * Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 
  **/
  private Boolean archived;
 /**
   * Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * &#x60;page_token&#x60;; * &#x60;limit&#x60;; * &#x60;cardStatuses&#x60;; * &#x60;categoryIds&#x60;; * &#x60;vendorNames&#x60;; * &#x60;tags&#x60;; * &#x60;archived&#x60;.  {% endnote %}    
   * @return offerIds
  **/
  @JsonProperty("offerIds")
  public List<String> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(List<String> offerIds) {
    this.offerIds = offerIds;
  }

  public GetOfferMappingsRequest offerIds(List<String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  public GetOfferMappingsRequest addOfferIdsItem(String offerIdsItem) {
    this.offerIds.add(offerIdsItem);
    return this;
  }

 /**
   * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
   * @return cardStatuses
  **/
  @JsonProperty("cardStatuses")
  public List<OfferCardStatusType> getCardStatuses() {
    return cardStatuses;
  }

  public void setCardStatuses(List<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
  }

  public GetOfferMappingsRequest cardStatuses(List<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
    return this;
  }

  public GetOfferMappingsRequest addCardStatusesItem(OfferCardStatusType cardStatusesItem) {
    this.cardStatuses.add(cardStatusesItem);
    return this;
  }

 /**
   * Фильтр по категориям на Маркете.
   * @return categoryIds
  **/
  @JsonProperty("categoryIds")
  public List<Integer> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public GetOfferMappingsRequest categoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public GetOfferMappingsRequest addCategoryIdsItem(Integer categoryIdsItem) {
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

 /**
   * Фильтр по брендам.
   * @return vendorNames
  **/
  @JsonProperty("vendorNames")
  public List<String> getVendorNames() {
    return vendorNames;
  }

  public void setVendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
  }

  public GetOfferMappingsRequest vendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
    return this;
  }

  public GetOfferMappingsRequest addVendorNamesItem(String vendorNamesItem) {
    this.vendorNames.add(vendorNamesItem);
    return this;
  }

 /**
   * Фильтр по тегам.
   * @return tags
  **/
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public GetOfferMappingsRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GetOfferMappingsRequest addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

 /**
   * Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращаются товары, не находящиеся в архиве. 
   * @return archived
  **/
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }

  public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  public GetOfferMappingsRequest archived(Boolean archived) {
    this.archived = archived;
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
    GetOfferMappingsRequest getOfferMappingsRequest = (GetOfferMappingsRequest) o;
    return Objects.equals(this.offerIds, getOfferMappingsRequest.offerIds) &&
        Objects.equals(this.cardStatuses, getOfferMappingsRequest.cardStatuses) &&
        Objects.equals(this.categoryIds, getOfferMappingsRequest.categoryIds) &&
        Objects.equals(this.vendorNames, getOfferMappingsRequest.vendorNames) &&
        Objects.equals(this.tags, getOfferMappingsRequest.tags) &&
        Objects.equals(this.archived, getOfferMappingsRequest.archived);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerIds, cardStatuses, categoryIds, vendorNames, tags, archived);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOfferMappingsRequest {\n");
    
    sb.append("    offerIds: ").append(toIndentedString(offerIds)).append("\n");
    sb.append("    cardStatuses: ").append(toIndentedString(cardStatuses)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    vendorNames: ").append(toIndentedString(vendorNames)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
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

