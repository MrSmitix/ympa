# OpenapiClient::UpdateOrderStatusDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор заказа. | [optional] |
| **status** | [**OrderStatusType**](OrderStatusType.md) |  | [optional] |
| **substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] |
| **update_status** | [**OrderUpdateStatusType**](OrderUpdateStatusType.md) |  | [optional] |
| **error_details** | **String** | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::UpdateOrderStatusDTO.new(
  id: null,
  status: null,
  substatus: null,
  update_status: null,
  error_details: null
)
```

