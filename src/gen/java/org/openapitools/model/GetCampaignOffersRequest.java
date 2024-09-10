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
import org.openapitools.model.OfferCampaignStatusType;

/**
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 */
@ApiModel(description = "Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignOffersRequest   {
  @JsonProperty("offerIds")
  private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds = null;

  @JsonProperty("statuses")
  private List<OfferCampaignStatusType> statuses = null;

  @JsonProperty("categoryIds")
  private List<Integer> categoryIds = null;

  @JsonProperty("vendorNames")
  private List<String> vendorNames = null;

  @JsonProperty("tags")
  private List<String> tags = null;

  public GetCampaignOffersRequest offerIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  public GetCampaignOffersRequest addOfferIdsItem(String offerIdsItem) {
    if (this.offerIds == null) {
      this.offerIds = ;
    }
    this.offerIds.add(offerIdsItem);
    return this;
  }

   /**
   * Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
   * @return offerIds
  **/
  @ApiModelProperty(value = "Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    ")
  public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
  }

  public GetCampaignOffersRequest statuses(List<OfferCampaignStatusType> statuses) {
    this.statuses = statuses;
    return this;
  }

  public GetCampaignOffersRequest addStatusesItem(OfferCampaignStatusType statusesItem) {
    if (this.statuses == null) {
      this.statuses = ;
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * Фильтр по статусам товаров. 
   * @return statuses
  **/
  @ApiModelProperty(value = "Фильтр по статусам товаров. ")
  public List<OfferCampaignStatusType> getStatuses() {
    return statuses;
  }

  public void setStatuses(List<OfferCampaignStatusType> statuses) {
    this.statuses = statuses;
  }

  public GetCampaignOffersRequest categoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public GetCampaignOffersRequest addCategoryIdsItem(Integer categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = ;
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

   /**
   * Фильтр по категориям на Маркете.
   * @return categoryIds
  **/
  @ApiModelProperty(value = "Фильтр по категориям на Маркете.")
  public List<Integer> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public GetCampaignOffersRequest vendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
    return this;
  }

  public GetCampaignOffersRequest addVendorNamesItem(String vendorNamesItem) {
    if (this.vendorNames == null) {
      this.vendorNames = ;
    }
    this.vendorNames.add(vendorNamesItem);
    return this;
  }

   /**
   * Фильтр по брендам.
   * @return vendorNames
  **/
  @ApiModelProperty(value = "Фильтр по брендам.")
  public List<String> getVendorNames() {
    return vendorNames;
  }

  public void setVendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
  }

  public GetCampaignOffersRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GetCampaignOffersRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = ;
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Фильтр по тегам.
   * @return tags
  **/
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

