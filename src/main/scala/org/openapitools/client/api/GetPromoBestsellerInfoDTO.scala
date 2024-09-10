package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import GetPromoBestsellerInfoDTO._

case class GetPromoBestsellerInfoDTO (
  /* Является ли акция «Бестселлером Маркета». Подробнее об этой акции читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/promos/market/bestsellers). */
  bestseller: Boolean,
/* До какой даты можно добавить товар в акцию «Бестселлеры Маркета».  Параметр возвращается только для текущих и будущих акций «Бестселлеры Маркета».  */
  entryDeadline: Option[OffsetDateTime])

object GetPromoBestsellerInfoDTO {
  import DateTimeCodecs._

  implicit val GetPromoBestsellerInfoDTOCodecJson: CodecJson[GetPromoBestsellerInfoDTO] = CodecJson.derive[GetPromoBestsellerInfoDTO]
  implicit val GetPromoBestsellerInfoDTODecoder: EntityDecoder[GetPromoBestsellerInfoDTO] = jsonOf[GetPromoBestsellerInfoDTO]
  implicit val GetPromoBestsellerInfoDTOEncoder: EntityEncoder[GetPromoBestsellerInfoDTO] = jsonEncoderOf[GetPromoBestsellerInfoDTO]
}
