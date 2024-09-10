package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Цена с указанием времени последнего обновления.
 *
 * @param value Значение. for example: ''null''
 * @param currencyId  for example: ''null''
 * @param updatedAt Время последнего обновления. for example: ''null''
*/
final case class GetPriceDTO (
  value: Double,
  currencyId: CurrencyType,
  updatedAt: OffsetDateTime
)

