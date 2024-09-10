package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import org.openapitools.models.OfferCardStatusType

/**
 * 
 * @param offerIds Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
 * @param cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
 * @param categoryIds Фильтр по категориям на Маркете.
 */
case class GetOfferCardsContentStatusRequest(offerIds: Option[Set[String]],
                cardStatuses: Option[Set[OfferCardStatusType]],
                categoryIds: Option[Set[Int]]
                )

object GetOfferCardsContentStatusRequest {
    /**
     * Creates the codec for converting GetOfferCardsContentStatusRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetOfferCardsContentStatusRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOfferCardsContentStatusRequest] = deriveEncoder
}
