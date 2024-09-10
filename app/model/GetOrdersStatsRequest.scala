package model

import play.api.libs.json._
import java.time.LocalDate

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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class GetOrdersStatsRequest(
  dateFrom: Option[LocalDate],
  dateTo: Option[LocalDate],
  updateFrom: Option[LocalDate],
  updateTo: Option[LocalDate],
  orders: Option[List[Long]],
  statuses: Option[List[OrderStatsStatusType]],
  hasCis: Option[Boolean]
)

object GetOrdersStatsRequest {
  implicit lazy val getOrdersStatsRequestJsonFormat: Format[GetOrdersStatsRequest] = Json.format[GetOrdersStatsRequest]
}

