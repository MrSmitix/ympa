package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import ympa_scala_finch_server._
import java.time.LocalDateTime
import org.openapitools.models.OrderStatsStatusType
import scala.collection.immutable.Seq

/**
 * Запрос информации по заказам.
 * @param dateFrom Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
 * @param dateTo Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
 * @param updateFrom Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
 * @param updateTo Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
 * @param orders Список идентификаторов заказов.
 * @param statuses Список статусов заказов.
 * @param hasCis Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
 */
case class GetOrdersStatsRequest(dateFrom: Option[LocalDateTime],
                dateTo: Option[LocalDateTime],
                updateFrom: Option[LocalDateTime],
                updateTo: Option[LocalDateTime],
                orders: Option[Seq[Long]],
                statuses: Option[Seq[OrderStatsStatusType]],
                hasCis: Option[Boolean]
                )

object GetOrdersStatsRequest {
    /**
     * Creates the codec for converting GetOrdersStatsRequest from and to JSON.
     */
    implicit val decoder: Decoder[GetOrdersStatsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetOrdersStatsRequest] = deriveEncoder
}
