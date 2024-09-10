package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import OrdersStatsPaymentDTO._

case class OrdersStatsPaymentDTO (
  /* Идентификатор денежного перевода. */
  id: Option[String],
/* Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`.  */
  date: Option[LocalDate],
`type`: Option[OrdersStatsPaymentType],
source: Option[OrdersStatsPaymentSourceType],
/* Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой.  */
  total: Option[BigDecimal],
paymentOrder: Option[OrdersStatsPaymentOrderDTO])

object OrdersStatsPaymentDTO {
  import DateTimeCodecs._

  implicit val OrdersStatsPaymentDTOCodecJson: CodecJson[OrdersStatsPaymentDTO] = CodecJson.derive[OrdersStatsPaymentDTO]
  implicit val OrdersStatsPaymentDTODecoder: EntityDecoder[OrdersStatsPaymentDTO] = jsonOf[OrdersStatsPaymentDTO]
  implicit val OrdersStatsPaymentDTOEncoder: EntityEncoder[OrdersStatsPaymentDTO] = jsonEncoderOf[OrdersStatsPaymentDTO]
}
