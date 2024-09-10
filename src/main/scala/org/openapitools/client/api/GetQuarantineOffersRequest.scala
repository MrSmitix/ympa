package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetQuarantineOffersRequest._

case class GetQuarantineOffersRequest (
  /* Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  */
  offerIds: Option[List[String]],
/* Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  */
  cardStatuses: Option[List[OfferCardStatusType]],
/* Фильтр по категориям на Маркете. */
  categoryIds: Option[List[Integer]],
/* Фильтр по брендам. */
  vendorNames: Option[List[String]],
/* Фильтр по тегам. */
  tags: Option[List[String]])

object GetQuarantineOffersRequest {
  import DateTimeCodecs._

  implicit val GetQuarantineOffersRequestCodecJson: CodecJson[GetQuarantineOffersRequest] = CodecJson.derive[GetQuarantineOffersRequest]
  implicit val GetQuarantineOffersRequestDecoder: EntityDecoder[GetQuarantineOffersRequest] = jsonOf[GetQuarantineOffersRequest]
  implicit val GetQuarantineOffersRequestEncoder: EntityEncoder[GetQuarantineOffersRequest] = jsonEncoderOf[GetQuarantineOffersRequest]
}
