# OpenapiClient::GetChatsInfoDTO

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **chats** | [**Array&lt;GetChatInfoDTO&gt;**](GetChatInfoDTO.md) | Информация о чатах. |  |
| **paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::GetChatsInfoDTO.new(
  chats: null,
  paging: null
)
```

