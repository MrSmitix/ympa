package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.OfferCardStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 */
public class GetQuarantineOffersRequest   {

    private List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds;
    private List<OfferCardStatusType> cardStatuses;
    private List<Integer> categoryIds;
    private List<String> vendorNames;
    private List<String> tags;

    /**
     * Default constructor.
     */
    public GetQuarantineOffersRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetQuarantineOffersRequest.
     *
     * @param offerIds Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
     * @param cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
     * @param categoryIds Фильтр по категориям на Маркете.
     * @param vendorNames Фильтр по брендам.
     * @param tags Фильтр по тегам.
     */
    public GetQuarantineOffersRequest(
        List<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds, 
        List<OfferCardStatusType> cardStatuses, 
        List<Integer> categoryIds, 
        List<String> vendorNames, 
        List<String> tags
    ) {
        this.offerIds = offerIds;
        this.cardStatuses = cardStatuses;
        this.categoryIds = categoryIds;
        this.vendorNames = vendorNames;
        this.tags = tags;
    }



    /**
     * Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
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
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

