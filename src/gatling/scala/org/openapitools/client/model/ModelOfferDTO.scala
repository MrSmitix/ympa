
package org.openapitools.client.model


case class ModelOfferDTO (
    /* Скидка на предложение в процентах. */
    _discount: Option[Integer],
    /* Наименование предложения. */
    _name: Option[String],
    /* Позиция предложения в выдаче Маркета на карточке модели. */
    _pos: Option[Integer],
    /* Цена предложения без скидки магазина. */
    _preDiscountPrice: Option[Number],
    /* Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay. */
    _price: Option[Number],
    /* Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них.  */
    _regionId: Option[Long],
    /* Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится.  */
    _shippingCost: Option[Number],
    /* Название магазина (в том виде, в котором отображается на Маркете). */
    _shopName: Option[String],
    /* Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`.  */
    _shopRating: Option[Integer],
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  */
    _inStock: Option[Integer]
)
object ModelOfferDTO {
    def toStringBody(var_discount: Object, var_name: Object, var_pos: Object, var_preDiscountPrice: Object, var_price: Object, var_regionId: Object, var_shippingCost: Object, var_shopName: Object, var_shopRating: Object, var_inStock: Object) =
        s"""
        | {
        | "discount":$var_discount,"name":$var_name,"pos":$var_pos,"preDiscountPrice":$var_preDiscountPrice,"price":$var_price,"regionId":$var_regionId,"shippingCost":$var_shippingCost,"shopName":$var_shopName,"shopRating":$var_shopRating,"inStock":$var_inStock
        | }
        """.stripMargin
}
