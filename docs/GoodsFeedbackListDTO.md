# OpenapiClient::GoodsFeedbackListDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **feedbacks** | [**Array&lt;GoodsFeedbackDTO&gt;**](GoodsFeedbackDTO.md) | Список отзывов. |  |
| **paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GoodsFeedbackListDTO.new(
  feedbacks: null,
  paging: null
)
```

