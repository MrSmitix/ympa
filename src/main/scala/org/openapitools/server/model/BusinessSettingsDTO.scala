package org.openapitools.server.model


/**
 * Настройки кабинета.
 *
 * @param onlyDefaultPrice Можно ли установить только [базовую цену](*rule): * `false` — можно задать и базовую цену, и цены в конкретных магазинах. * `true` — можно задать только базовую цену.  for example: ''null''
 * @param currency  for example: ''null''
*/
final case class BusinessSettingsDTO (
  onlyDefaultPrice: Option[Boolean] = None,
  currency: Option[CurrencyType] = None
)

