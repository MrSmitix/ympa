package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.LocalDate

import GetOrdersStatsRequest._

case class GetOrdersStatsRequest (
  /* Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.  */
  dateFrom: Option[LocalDate],
/* Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.  */
  dateTo: Option[LocalDate],
/* Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.  */
  updateFrom: Option[LocalDate],
/* Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.  */
  updateTo: Option[LocalDate],
/* Список идентификаторов заказов. */
  orders: Option[List[Long]],
/* Список статусов заказов. */
  statuses: Option[List[OrderStatsStatusType]],
/* Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  */
  hasCis: Option[Boolean])

object GetOrdersStatsRequest {
  import DateTimeCodecs._

  implicit val GetOrdersStatsRequestCodecJson: CodecJson[GetOrdersStatsRequest] = CodecJson.derive[GetOrdersStatsRequest]
  implicit val GetOrdersStatsRequestDecoder: EntityDecoder[GetOrdersStatsRequest] = jsonOf[GetOrdersStatsRequest]
  implicit val GetOrdersStatsRequestEncoder: EntityEncoder[GetOrdersStatsRequest] = jsonEncoderOf[GetOrdersStatsRequest]
}
