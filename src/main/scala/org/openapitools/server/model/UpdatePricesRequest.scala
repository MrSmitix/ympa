package org.openapitools.server.model


/**
 * Запрос на установку цен на товары.
 *
 * @param offers Список товаров. for example: ''null''
*/
final case class UpdatePricesRequest (
  offers: Seq[OfferPriceDTO]
)

