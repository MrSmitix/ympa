package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferCardStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 **/
@ApiModel(description="Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. ")

public class GetQuarantineOffersRequest  {
  
  @ApiModelProperty(value = "Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. ")
 /**
   * Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
  **/
  private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds;

  @ApiModelProperty(value = "Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) ")
  @Valid
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
 /**
   * Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
   * @return offerIds
  **/
  @JsonProperty("offerIds")
 @Size(min=1,max=500)  public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
  }

  public GetQuarantineOffersRequest offerIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  public GetQuarantineOffersRequest addOfferIdsItem(String offerIdsItem) {
    this.offerIds.add(offerIdsItem);
    return this;
  }

 /**
   * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
   * @return cardStatuses
  **/
  @JsonProperty("cardStatuses")
 @Size(min=1)  public List<OfferCardStatusType> getCardStatuses() {
    return cardStatuses;
  }

  public void setCardStatuses(List<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
  }

  public GetQuarantineOffersRequest cardStatuses(List<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
    return this;
  }

  public GetQuarantineOffersRequest addCardStatusesItem(OfferCardStatusType cardStatusesItem) {
    this.cardStatuses.add(cardStatusesItem);
    return this;
  }

 /**
   * Фильтр по категориям на Маркете.
   * @return categoryIds
  **/
  @JsonProperty("categoryIds")
 @Size(min=1)  public List<Integer> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public GetQuarantineOffersRequest categoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public GetQuarantineOffersRequest addCategoryIdsItem(Integer categoryIdsItem) {
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

 /**
   * Фильтр по брендам.
   * @return vendorNames
  **/
  @JsonProperty("vendorNames")
 @Size(min=1)  public List<String> getVendorNames() {
    return vendorNames;
  }

  public void setVendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
  }

  public GetQuarantineOffersRequest vendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
    return this;
  }

  public GetQuarantineOffersRequest addVendorNamesItem(String vendorNamesItem) {
    this.vendorNames.add(vendorNamesItem);
    return this;
  }

 /**
   * Фильтр по тегам.
   * @return tags
  **/
  @JsonProperty("tags")
 @Size(min=1)  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public GetQuarantineOffersRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GetQuarantineOffersRequest addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
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
    GetQuarantineOffersRequest getQuarantineOffersRequest = (GetQuarantineOffersRequest) o;
    return Objects.equals(this.offerIds, getQuarantineOffersRequest.offerIds) &&
        Objects.equals(this.cardStatuses, getQuarantineOffersRequest.cardStatuses) &&
        Objects.equals(this.categoryIds, getQuarantineOffersRequest.categoryIds) &&
        Objects.equals(this.vendorNames, getQuarantineOffersRequest.vendorNames) &&
        Objects.equals(this.tags, getQuarantineOffersRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerIds, cardStatuses, categoryIds, vendorNames, tags);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

