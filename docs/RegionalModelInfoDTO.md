# OpenapiClient::RegionalModelInfoDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] |
| **region_id** | **Integer** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::RegionalModelInfoDTO.new(
  currency: null,
  region_id: null
)
```

