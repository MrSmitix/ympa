package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Цена с указанием скидки и времени последнего обновления.
 *
 * @param value Значение. for example: ''null''
 * @param currencyId  for example: ''null''
 * @param discountBase Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  for example: ''null''
 * @param updatedAt Время последнего обновления. for example: ''null''
*/
final case class GetPriceWithDiscountDTO (
  value: Double,
  currencyId: CurrencyType,
  discountBase: Option[Double] = None,
  updatedAt: OffsetDateTime
)

