package org.openapitools.server.model


/**
 * Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.
 *
 * @param price Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  for example: ''null''
 * @param promoPrice Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Возвращается, только если товар участвует в акции.  for example: ''null''
 * @param maxPromoPrice Максимально возможная цена для участия в акции.  Указывается в рублях.  Возвращается для всех товаров.  for example: ''null''
*/
final case class PromoOfferDiscountParamsDTO (
  price: Option[Long] = None,
  promoPrice: Option[Long] = None,
  maxPromoPrice: Long
)

