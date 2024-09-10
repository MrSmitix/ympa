package org.openapitools.server.model


/**
 * Информация по заказам.
 *
 * @param orders Список заказов. for example: ''null''
 * @param paging  for example: ''null''
*/
final case class OrdersStatsDTO (
  orders: Seq[OrdersStatsOrderDTO],
  paging: Option[ForwardScrollingPagerDTO] = None
)

