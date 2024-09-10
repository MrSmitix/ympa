# OpenapiClient::SearchShipmentsResponseDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **shipments** | [**Array&lt;ShipmentInfoDTO&gt;**](ShipmentInfoDTO.md) | Список с информацией об отгрузках. |  |
| **paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::SearchShipmentsResponseDTO.new(
  shipments: null,
  paging: null
)
```

