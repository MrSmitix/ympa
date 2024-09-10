package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OrderItemSubsidyDTO._

case class OrderItemSubsidyDTO (
  `type`: Option[OrderItemSubsidyType],
/* Сумма субсидии. */
  amount: Option[BigDecimal])

object OrderItemSubsidyDTO {
  import DateTimeCodecs._

  implicit val OrderItemSubsidyDTOCodecJson: CodecJson[OrderItemSubsidyDTO] = CodecJson.derive[OrderItemSubsidyDTO]
  implicit val OrderItemSubsidyDTODecoder: EntityDecoder[OrderItemSubsidyDTO] = jsonOf[OrderItemSubsidyDTO]
  implicit val OrderItemSubsidyDTOEncoder: EntityEncoder[OrderItemSubsidyDTO] = jsonEncoderOf[OrderItemSubsidyDTO]
}
