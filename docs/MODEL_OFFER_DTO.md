# MODEL_OFFER_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discount** | **INTEGER_32** | Скидка на предложение в процентах. | [optional] [default to null]
**name** | [**STRING_32**](STRING_32.md) | Наименование предложения. | [optional] [default to null]
**pos** | **INTEGER_32** | Позиция предложения в выдаче Маркета на карточке модели. | [optional] [default to null]
**pre_discount_price** | **REAL_32** | Цена предложения без скидки магазина. | [optional] [default to null]
**price** | **REAL_32** | Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay. | [optional] [default to null]
**region_id** | **INTEGER_64** | Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре &#x60;regionId&#x60;. Предложения, доставляемые из других регионов, показываются после них.  | [optional] [default to null]
**shipping_cost** | **REAL_32** | Стоимость доставки товара в регион:  * &#x60;0&#x60; — доставка осуществляется бесплатно. * &#x60;-1&#x60; — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится.  | [optional] [default to null]
**shop_name** | [**STRING_32**](STRING_32.md) | Название магазина (в том виде, в котором отображается на Маркете). | [optional] [default to null]
**shop_rating** | **INTEGER_32** | Рейтинг магазина.  Возможные значения: * &#x60;-1&#x60; — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение &#x60;-1&#x60;. * &#x60;1&#x60;. * &#x60;2&#x60;. * &#x60;3&#x60;. * &#x60;4&#x60;. * &#x60;5&#x60;.  | [optional] [default to null]
**in_stock** | **INTEGER_32** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


