package org.openapitools.server.model


/**
 * Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
 *
 * @param `type`  for example: ''null''
 * @param amount Сумма субсидии. for example: ''null''
*/
final case class OrderItemSubsidyDTO (
  `type`: Option[OrderItemSubsidyType] = None,
  amount: Option[Double] = None
)

