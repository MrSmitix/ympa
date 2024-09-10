package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Фильтр запроса отзывов в кабинете. 
 *
 * @param dateTimeFrom Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты.  for example: ''null''
 * @param dateTimeTo Конец периода. Не включительно.  Если параметр не указан, используется текущая дата.  for example: ''null''
 * @param reactionStatus  for example: ''null''
 * @param ratingValues Оценка товара. for example: ''null''
 * @param modelIds Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md).  for example: ''null''
 * @param paid Фильтр отзывов за баллы Плюса. for example: ''null''
*/
final case class GetGoodsFeedbackRequest (
  dateTimeFrom: Option[OffsetDateTime] = None,
  dateTimeTo: Option[OffsetDateTime] = None,
  reactionStatus: Option[FeedbackReactionStatusType] = None,
  ratingValues: Option[Set[Int]] = None,
  modelIds: Option[Set[Long]] = None,
  paid: Option[Boolean] = None
)

