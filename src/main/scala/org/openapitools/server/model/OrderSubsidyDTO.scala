package org.openapitools.server.model


/**
 * Общее вознаграждение партнеру за DBS-доставку и все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса; * по доставке (DBS).  Передается в валюте заказа. 
 *
 * @param `type`  for example: ''null''
 * @param amount Сумма субсидии. for example: ''null''
*/
final case class OrderSubsidyDTO (
  `type`: Option[OrderSubsidyType] = None,
  amount: Option[Double] = None
)

