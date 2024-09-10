package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOfferCardsContentStatusRequest._

case class GetOfferCardsContentStatusRequest (
  /* Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  */
  offerIds: Option[Set[String]],
/* Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  */
  cardStatuses: Option[Set[OfferCardStatusType]],
/* Фильтр по категориям на Маркете. */
  categoryIds: Option[Set[Integer]])

object GetOfferCardsContentStatusRequest {
  import DateTimeCodecs._

  implicit val GetOfferCardsContentStatusRequestCodecJson: CodecJson[GetOfferCardsContentStatusRequest] = CodecJson.derive[GetOfferCardsContentStatusRequest]
  implicit val GetOfferCardsContentStatusRequestDecoder: EntityDecoder[GetOfferCardsContentStatusRequest] = jsonOf[GetOfferCardsContentStatusRequest]
  implicit val GetOfferCardsContentStatusRequestEncoder: EntityEncoder[GetOfferCardsContentStatusRequest] = jsonEncoderOf[GetOfferCardsContentStatusRequest]
}
