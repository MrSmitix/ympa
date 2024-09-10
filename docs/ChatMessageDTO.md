# Api.ChatMessageDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **Number** | Идентификатор сообщения. | 
**createdAt** | **Date** | Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | 
**sender** | [**ChatMessageSenderType**](ChatMessageSenderType.md) |  | 
**message** | **String** | Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;.  | [optional] 
**payload** | [**[ChatMessagePayloadDTO]**](ChatMessagePayloadDTO.md) | Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр &#x60;message&#x60;.  | [optional] 


