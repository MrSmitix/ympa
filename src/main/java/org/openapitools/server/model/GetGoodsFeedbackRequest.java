package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.FeedbackReactionStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Фильтр запроса отзывов в кабинете. 
 */
public class GetGoodsFeedbackRequest   {

    private OffsetDateTime dateTimeFrom;
    private OffsetDateTime dateTimeTo;
    private FeedbackReactionStatusType reactionStatus;
    private Set<Integer> ratingValues;
    private Set<Long> modelIds;
    private Boolean paid;

    /**
     * Default constructor.
     */
    public GetGoodsFeedbackRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create GetGoodsFeedbackRequest.
     *
     * @param dateTimeFrom Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в &#x60;dateTimeTo&#x60; даты. 
     * @param dateTimeTo Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
     * @param reactionStatus reactionStatus
     * @param ratingValues Оценка товара.
     * @param modelIds Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
     * @param paid Фильтр отзывов за баллы Плюса.
     */
    public GetGoodsFeedbackRequest(
        OffsetDateTime dateTimeFrom, 
        OffsetDateTime dateTimeTo, 
        FeedbackReactionStatusType reactionStatus, 
        Set<Integer> ratingValues, 
        Set<Long> modelIds, 
        Boolean paid
    ) {
        this.dateTimeFrom = dateTimeFrom;
        this.dateTimeTo = dateTimeTo;
        this.reactionStatus = reactionStatus;
        this.ratingValues = ratingValues;
        this.modelIds = modelIds;
        this.paid = paid;
    }



    /**
     * Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
     * @return dateTimeFrom
     */
    public OffsetDateTime getDateTimeFrom() {
        return dateTimeFrom;
    }

    public void setDateTimeFrom(OffsetDateTime dateTimeFrom) {
        this.dateTimeFrom = dateTimeFrom;
    }

    /**
     * Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
     * @return dateTimeTo
     */
    public OffsetDateTime getDateTimeTo() {
        return dateTimeTo;
    }

    public void setDateTimeTo(OffsetDateTime dateTimeTo) {
        this.dateTimeTo = dateTimeTo;
    }

    /**
     * Get reactionStatus
     * @return reactionStatus
     */
    public FeedbackReactionStatusType getReactionStatus() {
        return reactionStatus;
    }

    public void setReactionStatus(FeedbackReactionStatusType reactionStatus) {
        this.reactionStatus = reactionStatus;
    }

    /**
     * Оценка товара.
     * @return ratingValues
     */
    public Set<Integer> getRatingValues() {
        return ratingValues;
    }

    public void setRatingValues(Set<Integer> ratingValues) {
        this.ratingValues = ratingValues;
    }

    /**
     * Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
     * @return modelIds
     */
    public Set<Long> getModelIds() {
        return modelIds;
    }

    public void setModelIds(Set<Long> modelIds) {
        this.modelIds = modelIds;
    }

    /**
     * Фильтр отзывов за баллы Плюса.
     * @return paid
     */
    public Boolean getPaid() {
        return paid;
    }

    public void setPaid(Boolean paid) {
        this.paid = paid;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetGoodsFeedbackRequest {\n");
        
        sb.append("    dateTimeFrom: ").append(toIndentedString(dateTimeFrom)).append("\n");
        sb.append("    dateTimeTo: ").append(toIndentedString(dateTimeTo)).append("\n");
        sb.append("    reactionStatus: ").append(toIndentedString(reactionStatus)).append("\n");
        sb.append("    ratingValues: ").append(toIndentedString(ratingValues)).append("\n");
        sb.append("    modelIds: ").append(toIndentedString(modelIds)).append("\n");
        sb.append("    paid: ").append(toIndentedString(paid)).append("\n");
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

