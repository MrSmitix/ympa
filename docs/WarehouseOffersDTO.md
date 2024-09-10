# OpenapiClient::WarehouseOffersDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **warehouse_id** | **Integer** | Идентификатор склада. |  |
| **offers** | [**Array&lt;WarehouseOfferDTO&gt;**](WarehouseOfferDTO.md) | Информация об остатках. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::WarehouseOffersDTO.new(
  warehouse_id: null,
  offers: null
)
```

