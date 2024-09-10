# OpenapiClient::OfferMappingErrorDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | [**OfferMappingErrorType**](OfferMappingErrorType.md) |  |  |
| **parameter_id** | **Integer** | Идентификатор характеристики, с которой связана ошибка. | [optional] |
| **message** | **String** | Текст ошибки. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OfferMappingErrorDTO.new(
  type: null,
  parameter_id: null,
  message: null
)
```

