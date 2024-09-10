package org.openapitools.server.model

import java.time.LocalDate

/**
 * Запрос информации по заказам.
 *
 * @param dateFrom Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.  for example: ''null''
 * @param dateTo Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`.  for example: ''null''
 * @param updateFrom Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.  for example: ''null''
 * @param updateTo Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`.  for example: ''null''
 * @param orders Список идентификаторов заказов. for example: ''null''
 * @param statuses Список статусов заказов. for example: ''null''
 * @param hasCis Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям.  for example: ''null''
*/
final case class GetOrdersStatsRequest (
  dateFrom: Option[LocalDate] = None,
  dateTo: Option[LocalDate] = None,
  updateFrom: Option[LocalDate] = None,
  updateTo: Option[LocalDate] = None,
  orders: Option[Seq[Long]] = None,
  statuses: Option[Seq[OrderStatsStatusType]] = None,
  hasCis: Option[Boolean] = None
)

