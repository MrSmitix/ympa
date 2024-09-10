# OpenapiClient::WarehouseGroupDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | Название группы складов. |  |
| **main_warehouse** | [**WarehouseDTO**](WarehouseDTO.md) |  |  |
| **warehouses** | [**Array&lt;WarehouseDTO&gt;**](WarehouseDTO.md) | Список складов, входящих в группу. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::WarehouseGroupDTO.new(
  name: null,
  main_warehouse: null,
  warehouses: null
)
```

