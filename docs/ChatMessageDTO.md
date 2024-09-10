
# ChatMessageDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **messageId** | **kotlin.Long** | Идентификатор сообщения. |  |
| **createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  |  |
| **sender** | [**ChatMessageSenderType**](ChatMessageSenderType.md) |  |  |
| **message** | **kotlin.String** | Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;.  |  [optional] |
| **payload** | [**kotlin.collections.List&lt;ChatMessagePayloadDTO&gt;**](ChatMessagePayloadDTO.md) | Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр &#x60;message&#x60;.  |  [optional] |



