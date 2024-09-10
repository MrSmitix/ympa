package org.openapitools.server.model


/**
 * Параметры товара в акции с типом `DIRECT_DISCOUNT` или `BLUE_FLASH`.  Обязательный параметр для акций с этими типами. 
 *
 * @param price Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым.  for example: ''null''
 * @param promoPrice Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым.  for example: ''null''
*/
final case class UpdatePromoOfferDiscountParamsDTO (
  price: Option[Long] = None,
  promoPrice: Option[Long] = None
)

