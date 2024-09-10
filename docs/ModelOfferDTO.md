# OpenapiClient::ModelOfferDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **discount** | **Integer** | Скидка на предложение в процентах. | [optional] |
| **name** | **String** | Наименование предложения. | [optional] |
| **pos** | **Integer** | Позиция предложения в выдаче Маркета на карточке модели. | [optional] |
| **pre_discount_price** | **Float** | Цена предложения без скидки магазина. | [optional] |
| **price** | **Float** | Цена предложения без скидки, которую получает покупатель при оплате через Yandex Pay. | [optional] |
| **region_id** | **Integer** | Идентификатор региона предложения (регион, откуда доставляется товар).  Сначала показываются предложения, доставляемые из региона, указанного в запросе в параметре &#x60;regionId&#x60;. Предложения, доставляемые из других регионов, показываются после них.  | [optional] |
| **shipping_cost** | **Float** | Стоимость доставки товара в регион:  * &#x60;0&#x60; — доставка осуществляется бесплатно. * &#x60;-1&#x60; — магазин не осуществляет доставку этого товара (самовывоз).  Если стоимость доставки неизвестна, параметр не выводится.  | [optional] |
| **shop_name** | **String** | Название магазина (в том виде, в котором отображается на Маркете). | [optional] |
| **shop_rating** | **Integer** | Рейтинг магазина.  Возможные значения: * &#x60;-1&#x60; — у магазинов, недавно появившихся на Маркете, рейтинг появляется не сразу. До момента появления рейтинга для таких магазинов возвращается значение &#x60;-1&#x60;. * &#x60;1&#x60;. * &#x60;2&#x60;. * &#x60;3&#x60;. * &#x60;4&#x60;. * &#x60;5&#x60;.  | [optional] |
| **in_stock** | **Integer** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %}  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ModelOfferDTO.new(
  discount: null,
  name: null,
  pos: null,
  pre_discount_price: null,
  price: null,
  region_id: null,
  shipping_cost: null,
  shop_name: null,
  shop_rating: null,
  in_stock: null
)
```

