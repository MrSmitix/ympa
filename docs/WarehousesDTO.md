# OpenapiClient::WarehousesDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **warehouses** | [**Array&lt;WarehouseDTO&gt;**](WarehouseDTO.md) | Список складов, не входящих в группы. |  |
| **warehouse_groups** | [**Array&lt;WarehouseGroupDTO&gt;**](WarehouseGroupDTO.md) | Список групп складов. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::WarehousesDTO.new(
  warehouses: null,
  warehouse_groups: null
)
```

