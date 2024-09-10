# OpenapiClient::ShipmentStatusChangeDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **status** | [**ShipmentStatusType**](ShipmentStatusType.md) |  | [optional] |
| **description** | **String** | Описание статуса отгрузки. | [optional] |
| **update_time** | **Time** | Время последнего изменения статуса отгрузки. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ShipmentStatusChangeDTO.new(
  status: null,
  description: null,
  update_time: null
)
```

