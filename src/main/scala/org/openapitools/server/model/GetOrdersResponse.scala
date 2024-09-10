package org.openapitools.server.model


/**
 * Модель для ответа API списка информации по заказам.
 *
 * @param pager  for example: ''null''
 * @param orders Модель заказа.  for example: ''null''
 * @param paging  for example: ''null''
*/
final case class GetOrdersResponse (
  pager: Option[FlippingPagerDTO] = None,
  orders: Seq[OrderDTO],
  paging: Option[ForwardScrollingPagerDTO] = None
)

