

# ChatMessageDTO

Информация о сообщениях.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**messageId** | **Long** | Идентификатор сообщения. |  |
|**createdAt** | **OffsetDateTime** | Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  |  |
|**sender** | **ChatMessageSenderType** |  |  |
|**message** | **String** | Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;.  |  [optional] |
|**payload** | [**List&lt;ChatMessagePayloadDTO&gt;**](ChatMessagePayloadDTO.md) | Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр &#x60;message&#x60;.  |  [optional] |



