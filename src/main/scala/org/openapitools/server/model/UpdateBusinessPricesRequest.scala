package org.openapitools.server.model


/**
 * Запрос на установку базовых цен на товары.
 *
 * @param offers Список товаров с ценами. for example: ''null''
*/
final case class UpdateBusinessPricesRequest (
  offers: Seq[UpdateBusinessOfferPriceDTO]
)

