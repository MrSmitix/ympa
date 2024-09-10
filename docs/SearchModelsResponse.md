# OpenapiClient::SearchModelsResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **models** | [**Array&lt;ModelDTO&gt;**](ModelDTO.md) | Список моделей товаров. |  |
| **currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] |
| **region_id** | **Integer** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] |
| **pager** | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::SearchModelsResponse.new(
  models: null,
  currency: null,
  region_id: null,
  pager: null
)
```

