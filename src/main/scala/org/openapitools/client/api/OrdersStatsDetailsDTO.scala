package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import OrdersStatsDetailsDTO._

case class OrdersStatsDetailsDTO (
  itemStatus: Option[OrdersStatsItemStatusType],
/* Количество товара со статусом, указанном в параметре `itemStatus`. */
  itemCount: Option[Long],
/* Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`.  */
  updateDate: Option[LocalDate],
stockType: Option[OrdersStatsStockType])

object OrdersStatsDetailsDTO {
  import DateTimeCodecs._

  implicit val OrdersStatsDetailsDTOCodecJson: CodecJson[OrdersStatsDetailsDTO] = CodecJson.derive[OrdersStatsDetailsDTO]
  implicit val OrdersStatsDetailsDTODecoder: EntityDecoder[OrdersStatsDetailsDTO] = jsonOf[OrdersStatsDetailsDTO]
  implicit val OrdersStatsDetailsDTOEncoder: EntityEncoder[OrdersStatsDetailsDTO] = jsonEncoderOf[OrdersStatsDetailsDTO]
}
