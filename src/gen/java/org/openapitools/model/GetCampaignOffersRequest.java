package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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

@ApiModel(description="Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetCampaignOffersRequest   {
  
  private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds;
  private List<OfferCampaignStatusType> statuses;
  private List<Integer> categoryIds;
  private List<String> vendorNames;
  private List<String> tags;

  /**
   * Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * &#x60;page_token&#x60; * &#x60;limit&#x60;  {% endnote %}    
   **/
  
  @ApiModelProperty(value = "Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    ")
  @JsonProperty("offerIds")
 @Size(max=200)  public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
    return offerIds;
  }
  public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
  }

  /**
   * Фильтр по статусам товаров. 
   **/
  
  @ApiModelProperty(value = "Фильтр по статусам товаров. ")
  @JsonProperty("statuses")
  @Valid
  public List<OfferCampaignStatusType> getStatuses() {
    return statuses;
  }
  public void setStatuses(List<OfferCampaignStatusType> statuses) {
    this.statuses = statuses;
  }

  /**
   * Фильтр по категориям на Маркете.
   **/
  
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
   **/
  
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
   **/
  
  @ApiModelProperty(value = "Фильтр по тегам.")
  @JsonProperty("tags")
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

