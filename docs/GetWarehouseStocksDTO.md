# OpenapiClient::GetWarehouseStocksDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] |
| **warehouses** | [**Array&lt;WarehouseOffersDTO&gt;**](WarehouseOffersDTO.md) | Страница списка складов. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetWarehouseStocksDTO.new(
  paging: null,
  warehouses: null
)
```

