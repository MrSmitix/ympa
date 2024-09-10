package model

import play.api.libs.json._

/**
  * Информация о предложении.
  * @param discount Скидка на предложение в процентах.
  * @param name Наименование предложения.
  * @param pos Позиция предложения в выдаче Маркета на карточке модели.
  * @param preDiscountPrice Цена предложения без скидки магазина.
  * @param price Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay.
  * @param regionId Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них. 
  * @param shippingCost Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится. 
  * @param shopName Название магазина (в том виде, в котором отображается на Маркете).
  * @param shopRating Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`. 
  * @param inStock {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-09-09T22:33:09.055496365Z[Etc/UTC]", comments = "Generator version: 7.8.0")
case class ModelOfferDTO(
  discount: Option[Int],
  name: Option[String],
  pos: Option[Int],
  preDiscountPrice: Option[BigDecimal],
  price: Option[BigDecimal],
  regionId: Option[Long],
  shippingCost: Option[BigDecimal],
  shopName: Option[String],
  shopRating: Option[Int],
  inStock: Option[Int]
)

object ModelOfferDTO {
  implicit lazy val modelOfferDTOJsonFormat: Format[ModelOfferDTO] = Json.format[ModelOfferDTO]
}

