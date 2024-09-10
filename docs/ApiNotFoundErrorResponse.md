# OpenapiClient::ApiNotFoundErrorResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] |
| **errors** | [**Array&lt;ApiErrorDTO&gt;**](ApiErrorDTO.md) | Список ошибок. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::ApiNotFoundErrorResponse.new(
  status: null,
  errors: null
)
```

