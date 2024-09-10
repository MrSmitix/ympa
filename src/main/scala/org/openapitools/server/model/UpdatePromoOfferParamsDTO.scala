package org.openapitools.server.model


/**
 * Параметры товара, который участвует в акции.
 *
 * @param discountParams  for example: ''null''
*/
final case class UpdatePromoOfferParamsDTO (
  discountParams: Option[UpdatePromoOfferDiscountParamsDTO] = None
)

