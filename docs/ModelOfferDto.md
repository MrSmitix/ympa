# ModelOfferDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**discount** | **i32** | Скидка на предложение в процентах. | [optional] [default to None]
**name** | **String** | Наименование предложения. | [optional] [default to None]
**pos** | **i32** | Позиция предложения в выдаче Маркета на карточке модели. | [optional] [default to None]
**pre_discount_price** | **f64** | Цена предложения без скидки магазина. | [optional] [default to None]
**price** | **f64** | Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay. | [optional] [default to None]
**region_id** | **i64** | Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре `regionId`. Предложения, доставляемые из других регионов, показываются после них.  | [optional] [default to None]
**shipping_cost** | **f64** | Стоимость доставки товара в регион:  * `0` — доставка осуществляется бесплатно. * `-1` — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится.  | [optional] [default to None]
**shop_name** | **String** | Название магазина (в том виде, в котором отображается на Маркете). | [optional] [default to None]
**shop_rating** | **i32** | Рейтинг магазина.  Возможные значения: * `-1` — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение `-1`. * `1`. * `2`. * `3`. * `4`. * `5`.  | [optional] [default to None]
**in_stock** | **i32** | {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


