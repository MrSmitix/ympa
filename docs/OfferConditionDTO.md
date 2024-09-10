# OpenapiClient::OfferConditionDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | [**OfferConditionType**](OfferConditionType.md) |  | [optional] |
| **quality** | [**OfferConditionQualityType**](OfferConditionQualityType.md) |  | [optional] |
| **reason** | **String** | Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать.  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OfferConditionDTO.new(
  type: null,
  quality: null,
  reason: null
)
```

