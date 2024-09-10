package apimodels;

import apimodels.OfferCardStatusType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * GetOfferMappingsRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetOfferMappingsRequest   {
  @JsonProperty("offerIds")
  @Size(min=1,max=200)

  private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds = null;

  @JsonProperty("cardStatuses")
  @Size(min=1)
@Valid

  private List<OfferCardStatusType> cardStatuses = null;

  @JsonProperty("categoryIds")
  @Size(min=1)

  private List<Integer> categoryIds = null;

  @JsonProperty("vendorNames")
  @Size(min=1)

  private List<String> vendorNames = null;

  @JsonProperty("tags")
  @Size(min=1)

  private List<String> tags = null;

  @JsonProperty("archived")
  
  private Boolean archived;

  public GetOfferMappingsRequest offerIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
    return this;
  }

  public GetOfferMappingsRequest addOfferIdsItem(String offerIdsItem) {
    if (this.offerIds == null) {
      this.offerIds = new ArrayList<>();
    }
    this.offerIds.add(offerIdsItem);
    return this;
  }

   /**
   * Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    
   * @return offerIds
  **/
  public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
    return offerIds;
  }

  public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
    this.offerIds = offerIds;
  }

  public GetOfferMappingsRequest cardStatuses(List<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
    return this;
  }

  public GetOfferMappingsRequest addCardStatusesItem(OfferCardStatusType cardStatusesItem) {
    if (this.cardStatuses == null) {
      this.cardStatuses = new ArrayList<>();
    }
    this.cardStatuses.add(cardStatusesItem);
    return this;
  }

   /**
   * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
   * @return cardStatuses
  **/
  public List<OfferCardStatusType> getCardStatuses() {
    return cardStatuses;
  }

  public void setCardStatuses(List<OfferCardStatusType> cardStatuses) {
    this.cardStatuses = cardStatuses;
  }

  public GetOfferMappingsRequest categoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }

  public GetOfferMappingsRequest addCategoryIdsItem(Integer categoryIdsItem) {
    if (this.categoryIds == null) {
      this.categoryIds = new ArrayList<>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

   /**
   * Фильтр по категориям на Маркете.
   * @return categoryIds
  **/
  public List<Integer> getCategoryIds() {
    return categoryIds;
  }

  public void setCategoryIds(List<Integer> categoryIds) {
    this.categoryIds = categoryIds;
  }

  public GetOfferMappingsRequest vendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
    return this;
  }

  public GetOfferMappingsRequest addVendorNamesItem(String vendorNamesItem) {
    if (this.vendorNames == null) {
      this.vendorNames = new ArrayList<>();
    }
    this.vendorNames.add(vendorNamesItem);
    return this;
  }

   /**
   * Фильтр по брендам.
   * @return vendorNames
  **/
  public List<String> getVendorNames() {
    return vendorNames;
  }

  public void setVendorNames(List<String> vendorNames) {
    this.vendorNames = vendorNames;
  }

  public GetOfferMappingsRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public GetOfferMappingsRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Фильтр по тегам.
   * @return tags
  **/
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public GetOfferMappingsRequest archived(Boolean archived) {
    this.archived = archived;
    return this;
  }

   /**
   * Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 
   * @return archived
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

