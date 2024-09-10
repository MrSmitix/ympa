
# Table `ModelOfferDTO`
(mapped from: ModelOfferDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**discount** | discount | int |  | **kotlin.Int** | Скидка на предложение в процентах. |  [optional]
**name** | name | text |  | **kotlin.String** | Наименование предложения. |  [optional]
**pos** | pos | int |  | **kotlin.Int** | Позиция предложения в выдаче Маркета на карточке модели. |  [optional]
**preDiscountPrice** | preDiscountPrice | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Цена предложения без скидки магазина. |  [optional]
**price** | price | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay. |  [optional]
**regionId** | regionId | long |  | **kotlin.Long** | Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре &#x60;regionId&#x60;. Предложения, доставляемые из других регионов, показываются после них.  |  [optional]
**shippingCost** | shippingCost | decimal |  | [**java.math.BigDecimal**](java.math.BigDecimal.md) | Стоимость доставки товара в регион:  * &#x60;0&#x60; — доставка осуществляется бесплатно. * &#x60;-1&#x60; — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится.  |  [optional]
**shopName** | shopName | text |  | **kotlin.String** | Название магазина (в том виде, в котором отображается на Маркете). |  [optional]
**shopRating** | shopRating | int |  | **kotlin.Int** | Рейтинг магазина.  Возможные значения: * &#x60;-1&#x60; — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение &#x60;-1&#x60;. * &#x60;1&#x60;. * &#x60;2&#x60;. * &#x60;3&#x60;. * &#x60;4&#x60;. * &#x60;5&#x60;.  |  [optional]
**inStock** | inStock | int |  | **kotlin.Int** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  |  [optional]












