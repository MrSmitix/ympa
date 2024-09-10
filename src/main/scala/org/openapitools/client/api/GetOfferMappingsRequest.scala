package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetOfferMappingsRequest._

case class GetOfferMappingsRequest (
  /* Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Если вы запрашиваете информацию по конкретным SKU, не заполняйте: * `page_token`; * `limit`; * `cardStatuses`; * `categoryIds`; * `vendorNames`; * `tags`; * `archived`.  {% endnote %}     */
  offerIds: Option[List[String]],
/* Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html)  */
  cardStatuses: Option[List[OfferCardStatusType]],
/* Фильтр по категориям на Маркете. */
  categoryIds: Option[List[Integer]],
/* Фильтр по брендам. */
  vendorNames: Option[List[String]],
/* Фильтр по тегам. */
  tags: Option[List[String]],
/* Фильтр по нахождению в архиве.  Передайте `true`, чтобы получить товары, находящиеся в архиве. Если фильтр не заполнен или передано `false`, в ответе возвращаются товары, не находящиеся в архиве.  */
  archived: Option[Boolean])

object GetOfferMappingsRequest {
  import DateTimeCodecs._

  implicit val GetOfferMappingsRequestCodecJson: CodecJson[GetOfferMappingsRequest] = CodecJson.derive[GetOfferMappingsRequest]
  implicit val GetOfferMappingsRequestDecoder: EntityDecoder[GetOfferMappingsRequest] = jsonOf[GetOfferMappingsRequest]
  implicit val GetOfferMappingsRequestEncoder: EntityEncoder[GetOfferMappingsRequest] = jsonEncoderOf[GetOfferMappingsRequest]
}
