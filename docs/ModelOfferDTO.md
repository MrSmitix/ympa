# ModelOfferDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discount** | **Int64** | Скидка на предложение в процентах. | [optional] [default to nothing]
**name** | **String** | Наименование предложения. | [optional] [default to nothing]
**pos** | **Int64** | Позиция предложения в выдаче Маркета на карточке модели. | [optional] [default to nothing]
**preDiscountPrice** | **Float64** | Цена предложения без скидки магазина. | [optional] [default to nothing]
**price** | **Float64** | Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay. | [optional] [default to nothing]
**regionId** | **Int64** | Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре &#x60;regionId&#x60;. Предложения, доставляемые из других регионов, показываются после них.  | [optional] [default to nothing]
**shippingCost** | **Float64** | Стоимость доставки товара в регион:  * &#x60;0&#x60; — доставка осуществляется бесплатно. * &#x60;-1&#x60; — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится.  | [optional] [default to nothing]
**shopName** | **String** | Название магазина (в том виде, в котором отображается на Маркете). | [optional] [default to nothing]
**shopRating** | **Int64** | Рейтинг магазина.  Возможные значения: * &#x60;-1&#x60; — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение &#x60;-1&#x60;. * &#x60;1&#x60;. * &#x60;2&#x60;. * &#x60;3&#x60;. * &#x60;4&#x60;. * &#x60;5&#x60;.  | [optional] [default to nothing]
**inStock** | **Int64** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


