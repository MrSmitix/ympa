# OpenapiClient::OrderDigitalItemDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор товара в заказе.  Он приходит в ответе на запрос [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) и в запросе Маркета [POST order/accept](../../pushapi/reference/orderAccept.md) — параметр &#x60;id&#x60; в &#x60;items&#x60;.  |  |
| **code** | **String** | Сам ключ. |  |
| **slip** | **String** | Инструкция по активации. |  |
| **activate_till** | **Date** | Дата, до которой нужно активировать ключ. Если ключ действует бессрочно, укажите любую дату в отдаленном будущем.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;.  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OrderDigitalItemDTO.new(
  id: null,
  code: null,
  slip: null,
  activate_till: null
)
```

