# CHAT_MESSAGE_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_id** | **INTEGER_64** | Идентификатор сообщения. | [default to null]
**created_at** | [**DATE_TIME**](DATE_TIME.md) | Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | [default to null]
**sender** | [**CHAT_MESSAGE_SENDER_TYPE**](ChatMessageSenderType.md) |  | [default to null]
**message** | [**STRING_32**](STRING_32.md) | Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;.  | [optional] [default to null]
**payload** | [**LIST [CHAT_MESSAGE_PAYLOAD_DTO]**](ChatMessagePayloadDTO.md) | Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр &#x60;message&#x60;.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


