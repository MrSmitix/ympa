package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferCampaignStatusType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 **/
@ApiModel(description="Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. ")

public class GetCampaignOffersRequest  {
  
  @ApiModelProperty(value = "Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    ")
 /**
   * Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
  **/
  private List<String> offerIds;

  @ApiModelProperty(value = "Фильтр по статусам товаров. ")
 /**
   * Фильтр по статусам товаров. 
  **/
  private List<OfferCampaignStatusType> statuses;

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
   * Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}    
   * @return offerIds
  **/
  @JsonProperty("offerIds")
  public List<String> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(List<String> offerIds) {
    this.offerIds = offerIds;
  }

  public GetCampaignOffersRequest offerIds(List<String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  public GetCampaignOffersRequest addOfferIdsItem(String offerIdsItem) {
    this.offerIds.add(offerIdsItem);
    return this;
  }

 /**
   * Фильтр по статусам товаров. 
   * @return statuses
  **/
  @JsonProperty("statuses")
  public List<OfferCampaignStatusType> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<OfferCampaignStatusType> statuses) {
    this.statuses = statuses;
  }

  public GetCampaignOffersRequest statuses(List<OfferCampaignStatusType> statuses) {
    this.statuses = statuses;
    return this;
  }

  public GetCampaignOffersRequest addStatusesItem(OfferCampaignStatusType statusesItem) {
    this.statuses.add(statusesItem);
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

  public GetCampaignOffersRequest categoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public GetCampaignOffersRequest addCategoryIdsItem(Integer categoryIdsItem) {
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

  public GetCampaignOffersRequest vendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
    return this;
  }

  public GetCampaignOffersRequest addVendorNamesItem(String vendorNamesItem) {
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

  public GetCampaignOffersRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GetCampaignOffersRequest addTagsItem(String tagsItem) {
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
    GetCampaignOffersRequest getCampaignOffersRequest = (GetCampaignOffersRequest) o;
    return Objects.equals(this.offerIds, getCampaignOffersRequest.offerIds) &&
        Objects.equals(this.statuses, getCampaignOffersRequest.statuses) &&
        Objects.equals(this.categoryIds, getCampaignOffersRequest.categoryIds) &&
        Objects.equals(this.vendorNames, getCampaignOffersRequest.vendorNames) &&
        Objects.equals(this.tags, getCampaignOffersRequest.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerIds, statuses, categoryIds, vendorNames, tags);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

