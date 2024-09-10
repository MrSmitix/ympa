package org.openapitools.server.model


/**
 * Параметры товара в акции с типом `MARKET_PROMOCODE`.
 *
 * @param maxPrice Максимально возможная цена для участия в акции до применения промокода.  Указывается в рублях.  Возвращается для всех товаров.  for example: ''null''
*/
final case class PromoOfferPromocodeParamsDTO (
  maxPrice: Long
)

