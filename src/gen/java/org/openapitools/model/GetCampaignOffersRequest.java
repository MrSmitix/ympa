package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.OfferCampaignStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 **/
@ApiModel(description = "Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. ")
@JsonTypeName("GetCampaignOffersRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignOffersRequest   {
  private @Valid List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds;
  private @Valid List<OfferCampaignStatusType> statuses;
  private @Valid List<Integer> categoryIds;
  private @Valid List<String> vendorNames;
  private @Valid List<String> tags;

  /**
   * Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}    
   **/
  public GetCampaignOffersRequest offerIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  
  @ApiModelProperty(value = "Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    ")
  @JsonProperty("offerIds")
   @Size(max=200)public List< @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)String> getOfferIds() {
    return offerIds;
  }

  @JsonProperty("offerIds")
  public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
  }

  public GetCampaignOffersRequest addOfferIdsItem(String offerIdsItem) {
    if (this.offerIds == null) {
      this.offerIds = new ArrayList<>();
    }

    this.offerIds.add(offerIdsItem);
    return this;
  }

  public GetCampaignOffersRequest removeOfferIdsItem(String offerIdsItem) {
    if (offerIdsItem != null && this.offerIds != null) {
      this.offerIds.remove(offerIdsItem);
    }

    return this;
  }
  /**
   * Фильтр по статусам товаров. 
   **/
  public GetCampaignOffersRequest statuses(List<OfferCampaignStatusType> statuses) {
    this.statuses = statuses;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по статусам товаров. ")
  @JsonProperty("statuses")
  public List<OfferCampaignStatusType> getStatuses() {
    return statuses;
  }

  @JsonProperty("statuses")
  public void setStatuses(List<OfferCampaignStatusType> statuses) {
    this.statuses = statuses;
  }

  public GetCampaignOffersRequest addStatusesItem(OfferCampaignStatusType statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }

    this.statuses.add(statusesItem);
    return this;
  }

  public GetCampaignOffersRequest removeStatusesItem(OfferCampaignStatusType statusesItem) {
    if (statusesItem != null && this.statuses != null) {
      this.statuses.remove(statusesItem);
    }

    return this;
  }
  /**
   * Фильтр по категориям на Маркете.
   **/
  public GetCampaignOffersRequest categoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по категориям на Маркете.")
  @JsonProperty("categoryIds")
  public List<Integer> getCategoryIds() {
    return categoryIds;
  }

  @JsonProperty("categoryIds")
  public void setCategoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public GetCampaignOffersRequest addCategoryIdsItem(Integer categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }

    this.categoryIds.add(categoryIdsItem);
    return this;
  }

  public GetCampaignOffersRequest removeCategoryIdsItem(Integer categoryIdsItem) {
    if (categoryIdsItem != null && this.categoryIds != null) {
      this.categoryIds.remove(categoryIdsItem);
    }

    return this;
  }
  /**
   * Фильтр по брендам.
   **/
  public GetCampaignOffersRequest vendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по брендам.")
  @JsonProperty("vendorNames")
  public List<String> getVendorNames() {
    return vendorNames;
  }

  @JsonProperty("vendorNames")
  public void setVendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
  }

  public GetCampaignOffersRequest addVendorNamesItem(String vendorNamesItem) {
    if (this.vendorNames == null) {
      this.vendorNames = new ArrayList<>();
    }

    this.vendorNames.add(vendorNamesItem);
    return this;
  }

  public GetCampaignOffersRequest removeVendorNamesItem(String vendorNamesItem) {
    if (vendorNamesItem != null && this.vendorNames != null) {
      this.vendorNames.remove(vendorNamesItem);
    }

    return this;
  }
  /**
   * Фильтр по тегам.
   **/
  public GetCampaignOffersRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  
  @ApiModelProperty(value = "Фильтр по тегам.")
  @JsonProperty("tags")
  public List<String> getTags() {
    return tags;
  }

  @JsonProperty("tags")
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public GetCampaignOffersRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }

    this.tags.add(tagsItem);
    return this;
  }

  public GetCampaignOffersRequest removeTagsItem(String tagsItem) {
    if (tagsItem != null && this.tags != null) {
      this.tags.remove(tagsItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

