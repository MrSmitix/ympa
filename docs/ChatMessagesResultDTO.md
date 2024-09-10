
# Table `ChatMessagesResultDTO`
(mapped from: ChatMessagesResultDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**orderId** | orderId | long NOT NULL |  | **kotlin.Long** | Идентификатор заказа. | 
**messages** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ChatMessageDTO&gt;**](ChatMessageDTO.md) | Информация о сообщениях. | 
**paging** | paging | long |  | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  |  [optional] [foreignkey]



# **Table `ChatMessagesResultDTOChatMessageDTO`**
(mapped from: ChatMessagesResultDTOChatMessageDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
chatMessagesResultDTO | chatMessagesResultDTO | long | | kotlin.Long | Primary Key | *one*
chatMessageDTO | chatMessageDTO | long | | kotlin.Long | Foreign Key | *many*




