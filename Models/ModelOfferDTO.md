# ModelOfferDTO
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **discount** | **Integer** | Скидка на предложение в процентах. | [optional] [default to null] |
| **name** | **String** | Наименование предложения. | [optional] [default to null] |
| **pos** | **Integer** | Позиция предложения в выдаче Маркета на карточке модели. | [optional] [default to null] |
| **preDiscountPrice** | **BigDecimal** | Цена предложения без скидки магазина. | [optional] [default to null] |
| **price** | **BigDecimal** | Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay. | [optional] [default to null] |
| **regionId** | **Long** | Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре &#x60;regionId&#x60;. Предложения, доставляемые из других регионов, показываются после них.  | [optional] [default to null] |
| **shippingCost** | **BigDecimal** | Стоимость доставки товара в регион:  * &#x60;0&#x60; — доставка осуществляется бесплатно. * &#x60;-1&#x60; — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится.  | [optional] [default to null] |
| **shopName** | **String** | Название магазина (в том виде, в котором отображается на Маркете). | [optional] [default to null] |
| **shopRating** | **Integer** | Рейтинг магазина.  Возможные значения: * &#x60;-1&#x60; — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение &#x60;-1&#x60;. * &#x60;1&#x60;. * &#x60;2&#x60;. * &#x60;3&#x60;. * &#x60;4&#x60;. * &#x60;5&#x60;.  | [optional] [default to null] |
| **inStock** | **Integer** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

