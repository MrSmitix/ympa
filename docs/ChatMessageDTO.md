# ChatMessageDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**messageId** | **Int64** | Идентификатор сообщения. | [default to nothing]
**createdAt** | **ZonedDateTime** | Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [default to nothing]
**sender** | [***ChatMessageSenderType**](ChatMessageSenderType.md) |  | [default to nothing]
**message** | **String** | Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;.  | [optional] [default to nothing]
**payload** | [**Vector{ChatMessagePayloadDTO}**](ChatMessagePayloadDTO.md) | Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр &#x60;message&#x60;.  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


