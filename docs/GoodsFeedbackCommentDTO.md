# OpenapiClient::GoodsFeedbackCommentDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор комментария к отзыву.  |  |
| **text** | **String** | Текст комментария. |  |
| **can_modify** | **Boolean** | Может ли продавец изменять комментарий или удалять его. | [optional] |
| **parent_id** | **Integer** | Идентификатор комментария к отзыву.  | [optional] |
| **author** | [**GoodsFeedbackCommentAuthorDTO**](GoodsFeedbackCommentAuthorDTO.md) |  |  |
| **status** | [**GoodsFeedbackCommentStatusType**](GoodsFeedbackCommentStatusType.md) |  |  |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GoodsFeedbackCommentDTO.new(
  id: null,
  text: null,
  can_modify: null,
  parent_id: null,
  author: null,
  status: null
)
```

