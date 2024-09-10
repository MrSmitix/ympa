# OpenapiClient::ExtensionShipmentDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **current_status** | [**ShipmentStatusChangeDTO**](ShipmentStatusChangeDTO.md) |  | [optional] |
| **available_actions** | [**Array&lt;ShipmentActionType&gt;**](ShipmentActionType.md) | Доступные действия над отгрузкой. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ExtensionShipmentDTO.new(
  current_status: null,
  available_actions: null
)
```

