package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.FeedbackReactionStatusType;

@Canonical
class GetGoodsFeedbackRequest {
    /* Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты.  */
    Date dateTimeFrom
    /* Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  */
    Date dateTimeTo
    
    FeedbackReactionStatusType reactionStatus
    /* Оценка товара. */
    Set<Integer> ratingValues
    /* Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  */
    Set<Long> modelIds
    /* Фильтр отзывов за баллы Плюса. */
    Boolean paid
}
