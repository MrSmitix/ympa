package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.ZonedDateTime
import org.openapitools.models.FeedbackReactionStatusType

/**
 * Фильтр запроса отзывов в кабинете. 
 * @param dateTimeFrom Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
 * @param dateTimeTo Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
 * @param reactionStatus 
 * @param ratingValues Оценка товара.
 * @param modelIds Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
 * @param paid Фильтр отзывов за баллы Плюса.
 */
case class GetGoodsFeedbackRequest(dateTimeFrom: Option[ZonedDateTime],
                dateTimeTo: Option[ZonedDateTime],
                reactionStatus: Option[FeedbackReactionStatusType],
                ratingValues: Option[Set[Int]],
                modelIds: Option[Set[Long]],
                paid: Option[Boolean]
                )

object GetGoodsFeedbackRequest {
    /**
     * Creates the codec for converting GetGoodsFeedbackRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetGoodsFeedbackRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetGoodsFeedbackRequest] = deriveEncoder
}
