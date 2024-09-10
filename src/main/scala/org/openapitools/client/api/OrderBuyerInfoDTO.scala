package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderBuyerInfoDTO._

case class OrderBuyerInfoDTO (
  /* Идентификатор покупателя. */
  id: Option[String],
/* Фамилия покупателя. */
  lastName: Option[String],
/* Имя покупателя. */
  firstName: Option[String],
/* Отчество покупателя. */
  middleName: Option[String],
`type`: Option[OrderBuyerType],
/* Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`.  */
  phone: Option[String])

object OrderBuyerInfoDTO {
  import DateTimeCodecs._

  implicit val OrderBuyerInfoDTOCodecJson: CodecJson[OrderBuyerInfoDTO] = CodecJson.derive[OrderBuyerInfoDTO]
  implicit val OrderBuyerInfoDTODecoder: EntityDecoder[OrderBuyerInfoDTO] = jsonOf[OrderBuyerInfoDTO]
  implicit val OrderBuyerInfoDTOEncoder: EntityEncoder[OrderBuyerInfoDTO] = jsonEncoderOf[OrderBuyerInfoDTO]
}
