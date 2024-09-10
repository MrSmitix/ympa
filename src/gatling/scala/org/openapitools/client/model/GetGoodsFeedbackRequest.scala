
package org.openapitools.client.model

import java.time.OffsetDateTime

case class GetGoodsFeedbackRequest (
    /* Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты.  */
    _dateTimeFrom: Option[OffsetDateTime],
    /* Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  */
    _dateTimeTo: Option[OffsetDateTime],
    _reactionStatus: Option[FeedbackReactionStatusType],
    /* Оценка товара. */
    _ratingValues: Option[Set[Integer]],
    /* Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  */
    _modelIds: Option[Set[Long]],
    /* Фильтр отзывов за баллы Плюса. */
    _paid: Option[Boolean]
)
object GetGoodsFeedbackRequest {
    def toStringBody(var_dateTimeFrom: Object, var_dateTimeTo: Object, var_reactionStatus: Object, var_ratingValues: Object, var_modelIds: Object, var_paid: Object) =
        s"""
        | {
        | "dateTimeFrom":$var_dateTimeFrom,"dateTimeTo":$var_dateTimeTo,"reactionStatus":$var_reactionStatus,"ratingValues":$var_ratingValues,"modelIds":$var_modelIds,"paid":$var_paid
        | }
        """.stripMargin
}
