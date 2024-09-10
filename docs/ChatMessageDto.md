# ChatMessageDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_id** | **i64** | Идентификатор сообщения. | 
**created_at** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`.  | 
**sender** | [***models::ChatMessageSenderType**](ChatMessageSenderType.md) |  | 
**message** | **String** | Текст сообщения.  Необязательный параметр, если возвращается параметр `payload`.  | [optional] [default to None]
**payload** | [**Vec<models::ChatMessagePayloadDto>**](ChatMessagePayloadDTO.md) | Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр `message`.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


