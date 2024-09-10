# OpenapiClient::QualityRatingAffectedOrderDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **description** | **String** | Описание проблемы. |  |
| **component_type** | [**AffectedOrderQualityRatingComponentType**](AffectedOrderQualityRatingComponentType.md) |  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::QualityRatingAffectedOrderDTO.new(
  order_id: null,
  description: null,
  component_type: null
)
```

