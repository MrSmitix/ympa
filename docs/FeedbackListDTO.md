# OpenapiClient::FeedbackListDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] |
| **feedback_list** | [**Array&lt;FeedbackDTO&gt;**](FeedbackDTO.md) | Список отзывов.  Содержит не более 20 отзывов.  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::FeedbackListDTO.new(
  paging: null,
  feedback_list: null
)
```

