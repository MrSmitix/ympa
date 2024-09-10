package org.openapitools.server.model

import java.time.LocalDate

/**
 * Информация об удалении товара из заказа.
 *
 * @param itemStatus  for example: ''null''
 * @param itemCount Количество товара со статусом, указанном в параметре `itemStatus`. for example: ''null''
 * @param updateDate Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`.  for example: ''null''
 * @param stockType  for example: ''null''
*/
final case class OrdersStatsDetailsDTO (
  itemStatus: Option[OrdersStatsItemStatusType] = None,
  itemCount: Option[Long] = None,
  updateDate: Option[LocalDate] = None,
  stockType: Option[OrdersStatsStockType] = None
)

