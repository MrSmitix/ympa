package org.openapitools.server.model


/**
 * Параметры товара в акции.  Возвращается параметр, который соответствует типу акции. 
 *
 * @param discountParams  for example: ''null''
 * @param promocodeParams  for example: ''null''
*/
final case class PromoOfferParamsDTO (
  discountParams: Option[PromoOfferDiscountParamsDTO] = None,
  promocodeParams: Option[PromoOfferPromocodeParamsDTO] = None
)

