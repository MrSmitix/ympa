
# Table `GetChatsInfoDTO`
(mapped from: GetChatsInfoDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**chats** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;GetChatInfoDTO&gt;**](GetChatInfoDTO.md) | Информация о чатах. | 
**paging** | paging | long |  | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  |  [optional] [foreignkey]


# **Table `GetChatsInfoDTOGetChatInfoDTO`**
(mapped from: GetChatsInfoDTOGetChatInfoDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getChatsInfoDTO | getChatsInfoDTO | long | | kotlin.Long | Primary Key | *one*
getChatInfoDTO | getChatInfoDTO | long | | kotlin.Long | Foreign Key | *many*




