package org.openapitools.server.model;

import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.OfferCardStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class GetOfferCardsContentStatusRequest   {

    private Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds;
    private Set<OfferCardStatusType> cardStatuses;
    private Set<Integer> categoryIds;

    /**
     * Default constructor.
     */
    public GetOfferCardsContentStatusRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetOfferCardsContentStatusRequest.
     *
     * @param offerIds Идентификаторы товаров, информация о которых нужна. &lt;br&gt;&lt;br&gt; ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
     * @param cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
     * @param categoryIds Фильтр по категориям на Маркете.
     */
    public GetOfferCardsContentStatusRequest(
        Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds, 
        Set<OfferCardStatusType> cardStatuses, 
        Set<Integer> categoryIds
    ) {
        this.offerIds = offerIds;
        this.cardStatuses = cardStatuses;
        this.categoryIds = categoryIds;
    }



    /**
     * Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
     * @return offerIds
     */
    public Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> getOfferIds() {
        return offerIds;
    }

    public void setOfferIds(Set<@Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")@Size(min = 1, max = 255)String> offerIds) {
        this.offerIds = offerIds;
    }

    /**
     * Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
     * @return cardStatuses
     */
    public Set<OfferCardStatusType> getCardStatuses() {
        return cardStatuses;
    }

    public void setCardStatuses(Set<OfferCardStatusType> cardStatuses) {
        this.cardStatuses = cardStatuses;
    }

    /**
     * Фильтр по категориям на Маркете.
     * @return categoryIds
     */
    public Set<Integer> getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(Set<Integer> categoryIds) {
        this.categoryIds = categoryIds;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetOfferCardsContentStatusRequest {\n");
        
        sb.append("    offerIds: ").append(toIndentedString(offerIds)).append("\n");
        sb.append("    cardStatuses: ").append(toIndentedString(cardStatuses)).append("\n");
        sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
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

