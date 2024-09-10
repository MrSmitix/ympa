# OpenapiClient::OrderItemModificationDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор товара в рамках заказа.  Получить идентификатор можно с помощью ресурсов [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md) или [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  Обязательный параметр.  |  |
| **count** | **Integer** | Новое количество товара. |  |
| **instances** | [**Array&lt;BriefOrderItemInstanceDTO&gt;**](BriefOrderItemInstanceDTO.md) | Информация о маркировке единиц товара.  Передавайте в запросе все единицы товара, который подлежит маркировке.  Обязательный параметр, если в заказе есть товары, подлежащие маркировке [в системе «Честный ЗНАК»](https://честныйзнак.рф/).  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderItemModificationDTO.new(
  id: null,
  count: null,
  instances: null
)
```

