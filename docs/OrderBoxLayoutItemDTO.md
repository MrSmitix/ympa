# OpenapiClient::OrderBoxLayoutItemDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор товара в заказе.  {% cut \&quot;Где его взять\&quot; %}  Идентификатор приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  {% endcut %}    |  |
| **full_count** | **Integer** | Количество единиц товара в коробке.  Используйте это поле, если в коробке поедут целые товары, не разделенные на части. Не используйте это поле одновременно с &#x60;partialCount&#x60;.  | [optional] |
| **partial_count** | [**OrderBoxLayoutPartialCountDTO**](OrderBoxLayoutPartialCountDTO.md) |  | [optional] |
| **instances** | [**Array&lt;BriefOrderItemInstanceDTO&gt;**](BriefOrderItemInstanceDTO.md) | Переданные вами коды маркировки. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderBoxLayoutItemDTO.new(
  id: null,
  full_count: null,
  partial_count: null,
  instances: null
)
```

