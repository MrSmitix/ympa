package org.openapitools.server.model


/**
 * Тип цены.
 *
 * @param `type`  for example: ''null''
 * @param price Цена в рублях. for example: ''null''
*/
final case class PriceSuggestDTO (
  `type`: Option[PriceSuggestType] = None,
  price: Option[Double] = None
)

