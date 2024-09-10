package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferCampaignStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 */
@ApiModel(description="Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. ")

public class GetCampaignOffersRequest  {
  
 /**
  * Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
  */
  @ApiModelProperty(value = "Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    ")
  private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds;

 /**
  * Фильтр по статусам товаров. 
  */
  @ApiModelProperty(value = "Фильтр по статусам товаров. ")
  @Valid
  private List<OfferCampaignStatusType> statuses;

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
  * Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}    
  * @return offerIds
  */
  @JsonProperty("offerIds")
 @Size(max=200)  public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
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
  public GetCampaignOffersRequest offerIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  /**
   * Adds a new item to the <code>offerIds</code> list.
   */
  public GetCampaignOffersRequest addOfferIdsItem(String offerIdsItem) {
    this.offerIds.add(offerIdsItem);
    return this;
  }

 /**
  * Фильтр по статусам товаров. 
  * @return statuses
  */
  @JsonProperty("statuses")
  public List<OfferCampaignStatusType> getStatuses() {
    return statuses;
  }

  /**
   * Sets the <code>statuses</code> property.
   */
 public void setStatuses(List<OfferCampaignStatusType> statuses) {
    this.statuses = statuses;
  }

  /**
   * Sets the <code>statuses</code> property.
   */
  public GetCampaignOffersRequest statuses(List<OfferCampaignStatusType> statuses) {
    this.statuses = statuses;
    return this;
  }

  /**
   * Adds a new item to the <code>statuses</code> list.
   */
  public GetCampaignOffersRequest addStatusesItem(OfferCampaignStatusType statusesItem) {
    this.statuses.add(statusesItem);
    return this;
  }

 /**
  * Фильтр по категориям на Маркете.
  * @return categoryIds
  */
  @JsonProperty("categoryIds")
  public List<Integer> getCategoryIds() {
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
  public GetCampaignOffersRequest categoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  /**
   * Adds a new item to the <code>categoryIds</code> list.
   */
  public GetCampaignOffersRequest addCategoryIdsItem(Integer categoryIdsItem) {
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

 /**
  * Фильтр по брендам.
  * @return vendorNames
  */
  @JsonProperty("vendorNames")
  public List<String> getVendorNames() {
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
  public GetCampaignOffersRequest vendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
    return this;
  }

  /**
   * Adds a new item to the <code>vendorNames</code> list.
   */
  public GetCampaignOffersRequest addVendorNamesItem(String vendorNamesItem) {
    this.vendorNames.add(vendorNamesItem);
    return this;
  }

 /**
  * Фильтр по тегам.
  * @return tags
  */
  @JsonProperty("tags")
  public List<String> getTags() {
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
  public GetCampaignOffersRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Adds a new item to the <code>tags</code> list.
   */
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

