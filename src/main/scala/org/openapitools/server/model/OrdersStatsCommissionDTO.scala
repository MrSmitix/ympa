package org.openapitools.server.model


/**
 * Информация о стоимости услуг.
 *
 * @param `type`  for example: ''null''
 * @param actual Сумма в рублях, которая была выставлена в момент создания заказа и которую нужно оплатить. Точность — два знака после запятой.  for example: ''null''
*/
final case class OrdersStatsCommissionDTO (
  `type`: Option[OrdersStatsCommissionType] = None,
  actual: Option[Double] = None
)

