package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.OfferCardStatusType;

/**
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetQuarantineOffersRequest   {
  
  private List<String> offerIds;
  private List<OfferCardStatusType> cardStatuses;
  private List<Integer> categoryIds;
  private List<String> vendorNames;
  private List<String> tags;

  public GetQuarantineOffersRequest () {

  }

  public GetQuarantineOffersRequest (List<String> offerIds, List<OfferCardStatusType> cardStatuses, List<Integer> categoryIds, List<String> vendorNames, List<String> tags) {
    this.offerIds = offerIds;
    this.cardStatuses = cardStatuses;
    this.categoryIds = categoryIds;
    this.vendorNames = vendorNames;
    this.tags = tags;
  }

    
  @JsonProperty("offerIds")
  public List<String> getOfferIds() {
    return offerIds;
  }
  public void setOfferIds(List<String> offerIds) {
    this.offerIds = offerIds;
  }

    
  @JsonProperty("cardStatuses")
  public List<OfferCardStatusType> getCardStatuses() {
    return cardStatuses;
  }
  public void setCardStatuses(List<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
  }

    
  @JsonProperty("categoryIds")
  public List<Integer> getCategoryIds() {
    return categoryIds;
  }
  public void setCategoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
  }

    
  @JsonProperty("vendorNames")
  public List<String> getVendorNames() {
    return vendorNames;
  }
  public void setVendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
  }

    
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
    GetQuarantineOffersRequest getQuarantineOffersRequest = (GetQuarantineOffersRequest) o;
    return Objects.equals(offerIds, getQuarantineOffersRequest.offerIds) &&
        Objects.equals(cardStatuses, getQuarantineOffersRequest.cardStatuses) &&
        Objects.equals(categoryIds, getQuarantineOffersRequest.categoryIds) &&
        Objects.equals(vendorNames, getQuarantineOffersRequest.vendorNames) &&
        Objects.equals(tags, getQuarantineOffersRequest.tags);
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
