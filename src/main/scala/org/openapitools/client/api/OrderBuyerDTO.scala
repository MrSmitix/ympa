package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderBuyerDTO._

case class OrderBuyerDTO (
  /* Идентификатор покупателя. */
  id: Option[String],
/* Фамилия покупателя. */
  lastName: Option[String],
/* Имя покупателя. */
  firstName: Option[String],
/* Отчество покупателя. */
  middleName: Option[String],
`type`: Option[OrderBuyerType])

object OrderBuyerDTO {
  import DateTimeCodecs._

  implicit val OrderBuyerDTOCodecJson: CodecJson[OrderBuyerDTO] = CodecJson.derive[OrderBuyerDTO]
  implicit val OrderBuyerDTODecoder: EntityDecoder[OrderBuyerDTO] = jsonOf[OrderBuyerDTO]
  implicit val OrderBuyerDTOEncoder: EntityEncoder[OrderBuyerDTO] = jsonEncoderOf[OrderBuyerDTO]
}
