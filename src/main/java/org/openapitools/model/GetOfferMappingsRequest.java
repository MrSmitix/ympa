/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferCardStatusType;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOfferMappingsRequest   {
  
  private List<String> offerIds;
  private List<OfferCardStatusType> cardStatuses;
  private List<Integer> categoryIds;
  private List<String> vendorNames;
  private List<String> tags;
  private Boolean archived;

  /**
   * Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    
   */
  public GetOfferMappingsRequest offerIds(List<String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    ")
  @JsonProperty("offerIds")
  public List<String> getOfferIds() {
    return offerIds;
  }
  public void setOfferIds(List<String> offerIds) {
    this.offerIds = offerIds;
  }

  /**
   * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
   */
  public GetOfferMappingsRequest cardStatuses(List<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) ")
  @JsonProperty("cardStatuses")
  public List<OfferCardStatusType> getCardStatuses() {
    return cardStatuses;
  }
  public void setCardStatuses(List<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
  }

  /**
   * Фильтр по категориям на Маркете.
   */
  public GetOfferMappingsRequest categoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по категориям на Маркете.")
  @JsonProperty("categoryIds")
  public List<Integer> getCategoryIds() {
    return categoryIds;
  }
  public void setCategoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
  }

  /**
   * Фильтр по брендам.
   */
  public GetOfferMappingsRequest vendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по брендам.")
  @JsonProperty("vendorNames")
  public List<String> getVendorNames() {
    return vendorNames;
  }
  public void setVendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
  }

  /**
   * Фильтр по тегам.
   */
  public GetOfferMappingsRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по тегам.")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 
   */
  public GetOfferMappingsRequest archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. ")
  @JsonProperty("archived")
  public Boolean getArchived() {
    return archived;
  }
  public void setArchived(Boolean archived) {
    this.archived = archived;
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
    return Objects.equals(offerIds, getOfferMappingsRequest.offerIds) &&
        Objects.equals(cardStatuses, getOfferMappingsRequest.cardStatuses) &&
        Objects.equals(categoryIds, getOfferMappingsRequest.categoryIds) &&
        Objects.equals(vendorNames, getOfferMappingsRequest.vendorNames) &&
        Objects.equals(tags, getOfferMappingsRequest.tags) &&
        Objects.equals(archived, getOfferMappingsRequest.archived);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

