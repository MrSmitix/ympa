package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderBuyerBasicInfoDTO._

case class OrderBuyerBasicInfoDTO (
  /* Идентификатор покупателя. */
  id: Option[String],
/* Фамилия покупателя. */
  lastName: Option[String],
/* Имя покупателя. */
  firstName: Option[String],
/* Отчество покупателя. */
  middleName: Option[String],
`type`: Option[OrderBuyerType])

object OrderBuyerBasicInfoDTO {
  import DateTimeCodecs._

  implicit val OrderBuyerBasicInfoDTOCodecJson: CodecJson[OrderBuyerBasicInfoDTO] = CodecJson.derive[OrderBuyerBasicInfoDTO]
  implicit val OrderBuyerBasicInfoDTODecoder: EntityDecoder[OrderBuyerBasicInfoDTO] = jsonOf[OrderBuyerBasicInfoDTO]
  implicit val OrderBuyerBasicInfoDTOEncoder: EntityEncoder[OrderBuyerBasicInfoDTO] = jsonEncoderOf[OrderBuyerBasicInfoDTO]
}
