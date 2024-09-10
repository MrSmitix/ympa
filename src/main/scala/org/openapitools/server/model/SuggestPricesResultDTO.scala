package org.openapitools.server.model


/**
 * Результат запроса цен для продвижения.
 *
 * @param offers Список товаров с ценами для продвижения. for example: ''null''
*/
final case class SuggestPricesResultDTO (
  offers: Seq[PriceSuggestOfferDTO]
)

