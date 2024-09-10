package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.OfferCardStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GetOfferMappingsRequest   {

    private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds;
    private List<OfferCardStatusType> cardStatuses;
    private List<Integer> categoryIds;
    private List<String> vendorNames;
    private List<String> tags;
    private Boolean archived;

    /**
     * Default constructor.
     */
    public GetOfferMappingsRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetOfferMappingsRequest.
     *
     * @param offerIds Идентификаторы товаров, информация о которых нужна.  {% note warning \&quot;Такой список возвращается только целиком\&quot; %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * &#x60;page_token&#x60;; * &#x60;limit&#x60;; * &#x60;cardStatuses&#x60;; * &#x60;categoryIds&#x60;; * &#x60;vendorNames&#x60;; * &#x60;tags&#x60;; * &#x60;archived&#x60;.  {% endnote %}    
     * @param cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
     * @param categoryIds Фильтр по категориям на Маркете.
     * @param vendorNames Фильтр по брендам.
     * @param tags Фильтр по тегам.
     * @param archived Фильтр по нахождению в архиве.  Передайте &#x60;true&#x60;, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано &#x60;false&#x60;, в ответе возвращаются товары, не находящиеся в архиве. 
     */
    public GetOfferMappingsRequest(
        List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds, 
        List<OfferCardStatusType> cardStatuses, 
        List<Integer> categoryIds, 
        List<String> vendorNames, 
        List<String> tags, 
        Boolean archived
    ) {
        this.offerIds = offerIds;
        this.cardStatuses = cardStatuses;
        this.categoryIds = categoryIds;
        this.vendorNames = vendorNames;
        this.tags = tags;
        this.archived = archived;
    }



    /**
     * Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}    
     * @return offerIds
     */
    public List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
        return offerIds;
    }

    public void setOfferIds(List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
        this.offerIds = offerIds;
    }

    /**
     * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
     * @return cardStatuses
     */
    public List<OfferCardStatusType> getCardStatuses() {
        return cardStatuses;
    }

    public void setCardStatuses(List<OfferCardStatusType> cardStatuses) {
        this.cardStatuses = cardStatuses;
    }

    /**
     * Фильтр по категориям на Маркете.
     * @return categoryIds
     */
    public List<Integer> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(List<Integer> categoryIds) {
        this.categoryIds = categoryIds;
    }

    /**
     * Фильтр по брендам.
     * @return vendorNames
     */
    public List<String> getVendorNames() {
        return vendorNames;
    }

    public void setVendorNames(List<String> vendorNames) {
        this.vendorNames = vendorNames;
    }

    /**
     * Фильтр по тегам.
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве. 
     * @return archived
     */
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

