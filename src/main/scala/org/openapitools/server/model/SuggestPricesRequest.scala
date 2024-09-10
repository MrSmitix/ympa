package org.openapitools.server.model


/**
 * Запрос на получение списка цен для продвижения.
 *
 * @param offers Список товаров. for example: ''null''
*/
final case class SuggestPricesRequest (
  offers: Seq[SuggestOfferPriceDTO]
)

