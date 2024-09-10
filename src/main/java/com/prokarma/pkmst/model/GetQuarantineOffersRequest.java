package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.OfferCardStatusType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 */
@ApiModel(description = "Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetQuarantineOffersRequest   {
  @JsonProperty("offerIds")
  
  private List<String> offerIds = null;

  @JsonProperty("cardStatuses")
  
  private List<OfferCardStatusType> cardStatuses = null;

  @JsonProperty("categoryIds")
  
  private List<Integer> categoryIds = null;

  @JsonProperty("vendorNames")
  
  private List<String> vendorNames = null;

  @JsonProperty("tags")
  
  private List<String> tags = null;

  public GetQuarantineOffersRequest offerIds(List<String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  public GetQuarantineOffersRequest addOfferIdsItem(String offerIdsItem) {
    if (this.offerIds == null) {
      this.offerIds = new ArrayList<>();
    }
    this.offerIds.add(offerIdsItem);
    return this;
  }

  /**
   * Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
   * @return offerIds
   */
  @ApiModelProperty(value = "Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. ")
  public List<String> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(List<String> offerIds) {
    this.offerIds = offerIds;
  }

  public GetQuarantineOffersRequest cardStatuses(List<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
    return this;
  }

  public GetQuarantineOffersRequest addCardStatusesItem(OfferCardStatusType cardStatusesItem) {
    if (this.cardStatuses == null) {
      this.cardStatuses = new ArrayList<>();
    }
    this.cardStatuses.add(cardStatusesItem);
    return this;
  }

  /**
   * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
   * @return cardStatuses
   */
  @ApiModelProperty(value = "Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) ")
  public List<OfferCardStatusType> getCardStatuses() {
    return cardStatuses;
  }

  public void setCardStatuses(List<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
  }

  public GetQuarantineOffersRequest categoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public GetQuarantineOffersRequest addCategoryIdsItem(Integer categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

  /**
   * Фильтр по категориям на Маркете.
   * @return categoryIds
   */
  @ApiModelProperty(value = "Фильтр по категориям на Маркете.")
  public List<Integer> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public GetQuarantineOffersRequest vendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
    return this;
  }

  public GetQuarantineOffersRequest addVendorNamesItem(String vendorNamesItem) {
    if (this.vendorNames == null) {
      this.vendorNames = new ArrayList<>();
    }
    this.vendorNames.add(vendorNamesItem);
    return this;
  }

  /**
   * Фильтр по брендам.
   * @return vendorNames
   */
  @ApiModelProperty(value = "Фильтр по брендам.")
  public List<String> getVendorNames() {
    return vendorNames;
  }

  public void setVendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
  }

  public GetQuarantineOffersRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GetQuarantineOffersRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Фильтр по тегам.
   * @return tags
   */
  @ApiModelProperty(value = "Фильтр по тегам.")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

