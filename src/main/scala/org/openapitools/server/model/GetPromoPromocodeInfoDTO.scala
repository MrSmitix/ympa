package org.openapitools.server.model


/**
 * Информация для типа `MARKET_PROMOCODE`.  Параметр заполняется только для этого типа акции. 
 *
 * @param promocode Промокод. for example: ''null''
 * @param discount Процент скидки по промокоду. for example: ''null''
*/
final case class GetPromoPromocodeInfoDTO (
  promocode: String,
  discount: Int
)

