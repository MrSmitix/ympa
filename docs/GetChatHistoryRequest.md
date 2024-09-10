# OpenapiClient::GetChatHistoryRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **message_id_from** | **Integer** | Идентификатор сообщения, начиная с которого нужно получить все последующие сообщения. | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetChatHistoryRequest.new(
  message_id_from: null
)
```

