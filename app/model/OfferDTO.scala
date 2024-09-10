package model

import play.api.libs.json._

/**
  * Предложение.
  * @param price Цена предложения.  До версии 2.0 партнерского API у параметра был тип String. 
  * @param feedId Идентификатор прайс-листа, содержащего предложение.  Параметр доступен начиная с версии 2.0 партнерского API. 
  * @param id Идентификатор предложения из прайс-листа.  Параметр выводится, если в прайс-листе задан уникальный идентификатор. Если в прайс-листе содержится несколько предложений с одинаковыми идентификаторами, параметр `id` указывается только для первого из них, для остальных параметры `id` и `feedId` не выводятся.  Параметр доступен начиная с версии 2.0 партнерского API. 
  * @param shopCategoryId Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. 
  * @param marketCategoryId Идентификатор категории предложения в дереве категорий Маркета. Параметр доступен начиная с версии 2.0 партнерского API. 
  * @param preDiscountPrice Цена предложения без скидки.
  * @param discount Скидка на предложение в процентах.
  * @param cutPrice Является ли предложение уцененным:  * `true` — да. * `false` — нет.  Параметр доступен начиная с версии 2.58 партнерского API. 
  * @param url URL-адрес предложения на сайте магазина.
  * @param modelId Идентификатор модели Маркета, с которой соотнесено предложение.  Если предложение не соотнесено ни с какой карточкой модели, то параметр `modelid` содержит значение `0`.  {% note info %}  Идентификатор модели присутствует в URL карточки модели в виде значения параметра `product`. Например: `https://market.yandex.ru/product/13584121`.  {% endnote %} 
  * @param name Наименование предложения.
  * @param bid {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
  * @param cbid {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Ставка на клик. 
  * @param fee {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Процент комиссии на товар при продаже по CPA. 
  * @param blocked Признак блокировки предложения. Возможные значения: * `false` — предложение активно, параметр не выводится. * `true` — предложение заблокировано. Параметр выводится, если предложение заблокировано и не попадает в выдачу Маркета. Это может произойти из-за отключения магазина. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class OfferDTO(
  price: Option[BigDecimal],
  feedId: Option[Long],
  id: Option[String],
  shopCategoryId: Option[String],
  marketCategoryId: Option[Int],
  preDiscountPrice: Option[BigDecimal],
  discount: Option[Int],
  cutPrice: Option[Boolean],
  url: Option[String],
  modelId: Long,
  name: Option[String],
  currency: Option[CurrencyType],
  bid: Option[BigDecimal],
  cbid: Option[BigDecimal],
  fee: Option[BigDecimal],
  blocked: Option[Boolean]
)

object OfferDTO {
  implicit lazy val offerDTOJsonFormat: Format[OfferDTO] = Json.format[OfferDTO]
}

