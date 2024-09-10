package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferCardStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class GetOfferMappingsRequest  {
  
 /**
  * Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    
  */
  @ApiModelProperty(value = "Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    ")
  private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds;

 /**
  * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
  */
  @ApiModelProperty(value = "Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) ")
  @Valid
  private List<OfferCardStatusType> cardStatuses;

 /**
  * Фильтр по категориям на Маркете.
  */
  @ApiModelProperty(value = "Фильтр по категориям на Маркете.")
  private List<Integer> categoryIds;

 /**
  * Фильтр по брендам.
  */
  @ApiModelProperty(value = "Фильтр по брендам.")
  private List<String> vendorNames;

 /**
  * Фильтр по тегам.
  */
  @ApiModelProperty(value = "Фильтр по тегам.")
  private List<String> tags;

 /**
  * Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 
  */
  @ApiModelProperty(value = "Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. ")
  private Boolean archived;
 /**
  * Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * &#x60;page_token&#x60;; * &#x60;limit&#x60;; * &#x60;cardStatuses&#x60;; * &#x60;categoryIds&#x60;; * &#x60;vendorNames&#x60;; * &#x60;tags&#x60;; * &#x60;archived&#x60;.  {% endnote %}    
  * @return offerIds
  */
  @JsonProperty("offerIds")
 @Size(min=1,max=200)  public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
    return offerIds;
  }

  /**
   * Sets the <code>offerIds</code> property.
   */
 public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
  }

  /**
   * Sets the <code>offerIds</code> property.
   */
  public GetOfferMappingsRequest offerIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  /**
   * Adds a new item to the <code>offerIds</code> list.
   */
  public GetOfferMappingsRequest addOfferIdsItem(String offerIdsItem) {
    this.offerIds.add(offerIdsItem);
    return this;
  }

 /**
  * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
  * @return cardStatuses
  */
  @JsonProperty("cardStatuses")
 @Size(min=1)  public List<OfferCardStatusType> getCardStatuses() {
    return cardStatuses;
  }

  /**
   * Sets the <code>cardStatuses</code> property.
   */
 public void setCardStatuses(List<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
  }

  /**
   * Sets the <code>cardStatuses</code> property.
   */
  public GetOfferMappingsRequest cardStatuses(List<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
    return this;
  }

  /**
   * Adds a new item to the <code>cardStatuses</code> list.
   */
  public GetOfferMappingsRequest addCardStatusesItem(OfferCardStatusType cardStatusesItem) {
    this.cardStatuses.add(cardStatusesItem);
    return this;
  }

 /**
  * Фильтр по категориям на Маркете.
  * @return categoryIds
  */
  @JsonProperty("categoryIds")
 @Size(min=1)  public List<Integer> getCategoryIds() {
    return categoryIds;
  }

  /**
   * Sets the <code>categoryIds</code> property.
   */
 public void setCategoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
  }

  /**
   * Sets the <code>categoryIds</code> property.
   */
  public GetOfferMappingsRequest categoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  /**
   * Adds a new item to the <code>categoryIds</code> list.
   */
  public GetOfferMappingsRequest addCategoryIdsItem(Integer categoryIdsItem) {
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

 /**
  * Фильтр по брендам.
  * @return vendorNames
  */
  @JsonProperty("vendorNames")
 @Size(min=1)  public List<String> getVendorNames() {
    return vendorNames;
  }

  /**
   * Sets the <code>vendorNames</code> property.
   */
 public void setVendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
  }

  /**
   * Sets the <code>vendorNames</code> property.
   */
  public GetOfferMappingsRequest vendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
    return this;
  }

  /**
   * Adds a new item to the <code>vendorNames</code> list.
   */
  public GetOfferMappingsRequest addVendorNamesItem(String vendorNamesItem) {
    this.vendorNames.add(vendorNamesItem);
    return this;
  }

 /**
  * Фильтр по тегам.
  * @return tags
  */
  @JsonProperty("tags")
 @Size(min=1)  public List<String> getTags() {
    return tags;
  }

  /**
   * Sets the <code>tags</code> property.
   */
 public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * Sets the <code>tags</code> property.
   */
  public GetOfferMappingsRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Adds a new item to the <code>tags</code> list.
   */
  public GetOfferMappingsRequest addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

 /**
  * Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращаются товары, не находящиеся в архиве. 
  * @return archived
  */
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }

  /**
   * Sets the <code>archived</code> property.
   */
 public void setArchived(Boolean archived) {
    this.archived = archived;
  }

  /**
   * Sets the <code>archived</code> property.
   */
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

