# OpenapiClient::ReturnInstanceDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **stock_type** | [**ReturnInstanceStockType**](ReturnInstanceStockType.md) |  | [optional] |
| **status** | [**ReturnInstanceStatusType**](ReturnInstanceStatusType.md) |  | [optional] |
| **cis** | **String** | Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/). | [optional] |
| **imei** | **String** | Международный идентификатор мобильного оборудования. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ReturnInstanceDTO.new(
  stock_type: null,
  status: null,
  cis: null,
  imei: null
)
```

