package org.openapitools.server.model


/**
 * Цена или скидки на товар.
 *
 * @param `type`  for example: ''null''
 * @param costPerItem Цена или скидка на единицу товара в заказе. Указана в рублях. Точность — два знака после запятой.  for example: ''null''
 * @param total Суммарная цена или скидка на все единицы товара в заказе. Указана в рублях. Точность — два знака после запятой.  for example: ''null''
*/
final case class OrdersStatsPriceDTO (
  `type`: Option[OrdersStatsPriceType] = None,
  costPerItem: Option[Double] = None,
  total: Option[Double] = None
)

