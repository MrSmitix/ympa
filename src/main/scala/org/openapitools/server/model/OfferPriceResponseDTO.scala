package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * Информация об установленной цене на товар.
 *
 * @param id Идентификатор предложения из прайс-листа. for example: ''null''
 * @param price  for example: ''null''
 * @param marketSku SKU на Маркете. for example: ''null''
 * @param updatedAt Дата и время последнего обновления цены на товар. for example: ''null''
*/
final case class OfferPriceResponseDTO (
  id: Option[String] = None,
  price: Option[PriceDTO] = None,
  marketSku: Option[Long] = None,
  updatedAt: Option[OffsetDateTime] = None
)

