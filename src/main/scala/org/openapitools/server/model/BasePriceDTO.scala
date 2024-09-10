package org.openapitools.server.model


/**
 * Цена на товар.
 *
 * @param value Значение. for example: ''null''
 * @param currencyId  for example: ''null''
*/
final case class BasePriceDTO (
  value: Double,
  currencyId: CurrencyType
)

