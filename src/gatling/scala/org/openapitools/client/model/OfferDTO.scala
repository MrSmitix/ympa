
package org.openapitools.client.model


case class OfferDTO (
    /* Цена предложения.  До версии 2.0 партнерского API у параметра был тип String.  */
    _price: Option[Number],
    /* Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API.  */
    _feedId: Option[Long],
    /* Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API.  */
    _id: Option[String],
    /* Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  */
    _shopCategoryId: Option[String],
    /* Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API.  */
    _marketCategoryId: Option[Integer],
    /* Цена предложения без скидки. */
    _preDiscountPrice: Option[Number],
    /* Скидка на предложение в процентах. */
    _discount: Option[Integer],
    /* Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API.  */
    _cutPrice: Option[Boolean],
    /* URL-адрес предложения на сайте магазина. */
    _url: Option[String],
    /* Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %}  */
    _modelId: Long,
    /* Наименование предложения. */
    _name: Option[String],
    _currency: Option[CurrencyType],
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  */
    _bid: Option[Number],
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  */
    _cbid: Option[Number],
    /* {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA.  */
    _fee: Option[Number],
    /* Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина.  */
    _blocked: Option[Boolean]
)
object OfferDTO {
    def toStringBody(var_price: Object, var_feedId: Object, var_id: Object, var_shopCategoryId: Object, var_marketCategoryId: Object, var_preDiscountPrice: Object, var_discount: Object, var_cutPrice: Object, var_url: Object, var_modelId: Object, var_name: Object, var_currency: Object, var_bid: Object, var_cbid: Object, var_fee: Object, var_blocked: Object) =
        s"""
        | {
        | "price":$var_price,"feedId":$var_feedId,"id":$var_id,"shopCategoryId":$var_shopCategoryId,"marketCategoryId":$var_marketCategoryId,"preDiscountPrice":$var_preDiscountPrice,"discount":$var_discount,"cutPrice":$var_cutPrice,"url":$var_url,"modelId":$var_modelId,"name":$var_name,"currency":$var_currency,"bid":$var_bid,"cbid":$var_cbid,"fee":$var_fee,"blocked":$var_blocked
        | }
        """.stripMargin
}
