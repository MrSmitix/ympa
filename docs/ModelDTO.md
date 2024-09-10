# OpenapiClient::ModelDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор модели товара. | [optional] |
| **name** | **String** | Название модели товара. | [optional] |
| **prices** | [**ModelPriceDTO**](ModelPriceDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ModelDTO.new(
  id: null,
  name: null,
  prices: null
)
```

