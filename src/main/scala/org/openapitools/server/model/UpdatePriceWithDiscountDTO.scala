package org.openapitools.server.model


/**
 * Цена с указанием скидки.
 *
 * @param value Значение. for example: ''null''
 * @param currencyId  for example: ''null''
 * @param discountBase Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  for example: ''null''
*/
final case class UpdatePriceWithDiscountDTO (
  value: Double,
  currencyId: CurrencyType,
  discountBase: Option[Double] = None
)

