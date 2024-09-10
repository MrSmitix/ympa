# OpenapiClient::FeedbackCommentDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | Идентификатор ответа. | [optional] |
| **parent_id** | **Integer** | Идентификатор родительского ответа. | [optional] |
| **body** | **String** | Текст ответа. | [optional] |
| **created_at** | **Time** | Дата и время создания ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] |
| **updated_at** | **Time** | Дата и время изменения ответа.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [optional] |
| **author** | [**FeedbackCommentAuthorDTO**](FeedbackCommentAuthorDTO.md) |  | [optional] |
| **children** | [**Array&lt;FeedbackCommentDTO&gt;**](FeedbackCommentDTO.md) | Дочерние ответы. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::FeedbackCommentDTO.new(
  id: null,
  parent_id: null,
  body: null,
  created_at: null,
  updated_at: null,
  author: null,
  children: null
)
```

