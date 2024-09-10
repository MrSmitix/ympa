# OpenapiClient::GoodsFeedbackCommentListDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **comments** | [**Array&lt;GoodsFeedbackCommentDTO&gt;**](GoodsFeedbackCommentDTO.md) | Список комментариев. |  |
| **paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GoodsFeedbackCommentListDTO.new(
  comments: null,
  paging: null
)
```

