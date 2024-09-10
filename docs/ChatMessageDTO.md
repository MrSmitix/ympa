
# Table `ChatMessageDTO`
(mapped from: ChatMessageDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**messageId** | messageId | long NOT NULL |  | **kotlin.Long** | Идентификатор сообщения. | 
**createdAt** | createdAt | datetime NOT NULL |  | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) | Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | 
**sender** | sender | long NOT NULL |  | [**ChatMessageSenderType**](ChatMessageSenderType.md) |  |  [foreignkey]
**message** | message | text |  | **kotlin.String** | Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;.  |  [optional]
**payload** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ChatMessagePayloadDTO&gt;**](ChatMessagePayloadDTO.md) | Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр &#x60;message&#x60;.  |  [optional]






# **Table `ChatMessageDTOChatMessagePayloadDTO`**
(mapped from: ChatMessageDTOChatMessagePayloadDTO)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
chatMessageDTO | chatMessageDTO | long | | kotlin.Long | Primary Key | *one*
chatMessagePayloadDTO | chatMessagePayloadDTO | long | | kotlin.Long | Foreign Key | *many*



