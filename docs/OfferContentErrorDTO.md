# OpenapiClient::OfferContentErrorDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **type** | [**OfferContentErrorType**](OfferContentErrorType.md) |  |  |
| **parameter_id** | **Integer** | Идентификатор характеристики, с которой связана ошибка. | [optional] |
| **message** | **String** | Текст ошибки. |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::OfferContentErrorDTO.new(
  type: null,
  parameter_id: null,
  message: null
)
```

