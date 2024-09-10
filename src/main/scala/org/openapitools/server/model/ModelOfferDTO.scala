package org.openapitools.server.model


/**
 * Информация о предложении.
 *
 * @param discount Скидка на предложение в процентах. for example: ''null''
 * @param name Наименование предложения. for example: ''null''
 * @param pos Позиция предложения в выдаче Маркета на карточке модели. for example: ''null''
 * @param preDiscountPrice Цена предложения без скидки магазина. for example: ''null''
 * @param price Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay. for example: ''null''
 * @param regionId Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них.  for example: ''null''
 * @param shippingCost Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится.  for example: ''null''
 * @param shopName Название магазина (в том виде, в котором отображается на Маркете). for example: ''null''
 * @param shopRating Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`.  for example: ''null''
 * @param inStock {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  for example: ''null''
*/
final case class ModelOfferDTO (
  discount: Option[Int] = None,
  name: Option[String] = None,
  pos: Option[Int] = None,
  preDiscountPrice: Option[Double] = None,
  price: Option[Double] = None,
  regionId: Option[Long] = None,
  shippingCost: Option[Double] = None,
  shopName: Option[String] = None,
  shopRating: Option[Int] = None,
  inStock: Option[Int] = None
)

