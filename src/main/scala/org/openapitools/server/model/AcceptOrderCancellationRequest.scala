package org.openapitools.server.model


/**
 * @param accepted Решение об отмене заказа:  * `true` — заказ отменяется, служба доставки узнала об отмене до передачи заказа покупателю. * `false` — заказ не отменяется, так как он уже доставлен покупателю курьером или передан в пункт выдачи заказов.  for example: ''null''
 * @param reason  for example: ''null''
*/
final case class AcceptOrderCancellationRequest (
  accepted: Boolean,
  reason: Option[OrderCancellationReasonType] = None
)

