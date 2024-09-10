package org.openapitools.server.model


/**
 * Предложение.
 *
 * @param price Цена предложения.  До версии 2.0 партнерского API у параметра был тип String.  for example: ''null''
 * @param feedId Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API.  for example: ''null''
 * @param id Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API.  for example: ''null''
 * @param shopCategoryId Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API.  for example: ''null''
 * @param marketCategoryId Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API.  for example: ''null''
 * @param preDiscountPrice Цена предложения без скидки. for example: ''null''
 * @param discount Скидка на предложение в процентах. for example: ''null''
 * @param cutPrice Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API.  for example: ''null''
 * @param url URL-адрес предложения на сайте магазина. for example: ''null''
 * @param modelId Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %}  for example: ''null''
 * @param name Наименование предложения. for example: ''null''
 * @param currency  for example: ''null''
 * @param bid {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  for example: ''null''
 * @param cbid {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик.  for example: ''null''
 * @param fee {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA.  for example: ''null''
 * @param blocked Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина.  for example: ''null''
*/
final case class OfferDTO (
  price: Option[Double] = None,
  feedId: Option[Long] = None,
  id: Option[String] = None,
  shopCategoryId: Option[String] = None,
  marketCategoryId: Option[Int] = None,
  preDiscountPrice: Option[Double] = None,
  discount: Option[Int] = None,
  cutPrice: Option[Boolean] = None,
  url: Option[String] = None,
  modelId: Long,
  name: Option[String] = None,
  currency: Option[CurrencyType] = None,
  bid: Option[Double] = None,
  cbid: Option[Double] = None,
  fee: Option[Double] = None,
  blocked: Option[Boolean] = None
)

