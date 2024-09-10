package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderSubsidyDTO._

case class OrderSubsidyDTO (
  `type`: Option[OrderSubsidyType],
/* Сумма субсидии. */
  amount: Option[BigDecimal])

object OrderSubsidyDTO {
  import DateTimeCodecs._

  implicit val OrderSubsidyDTOCodecJson: CodecJson[OrderSubsidyDTO] = CodecJson.derive[OrderSubsidyDTO]
  implicit val OrderSubsidyDTODecoder: EntityDecoder[OrderSubsidyDTO] = jsonOf[OrderSubsidyDTO]
  implicit val OrderSubsidyDTOEncoder: EntityEncoder[OrderSubsidyDTO] = jsonEncoderOf[OrderSubsidyDTO]
}
