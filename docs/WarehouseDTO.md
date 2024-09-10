# OpenapiClient::WarehouseDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор склада. |  |
| **name** | **String** | Название склада. |  |
| **campaign_id** | **Integer** | Идентификатор кампании в API и идентификатор магазина. |  |
| **express** | **Boolean** | Возможна ли доставка по модели Экспресс. |  |
| **address** | [**WarehouseAddressDTO**](WarehouseAddressDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::WarehouseDTO.new(
  id: null,
  name: null,
  campaign_id: null,
  express: null,
  address: null
)
```

