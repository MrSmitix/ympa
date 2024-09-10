# chat_message_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**message_id** | **long** | Идентификатор сообщения. | 
**created_at** | **char \*** | Дата и время создания сообщения.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | 
**sender** | **chat_message_sender_type_t \*** |  | 
**message** | **char \*** | Текст сообщения.  Необязательный параметр, если возвращается параметр &#x60;payload&#x60;.  | [optional] 
**payload** | [**list_t**](chat_message_payload_dto.md) \* | Информация о приложенных к сообщению файлах.  Необязательный параметр, если возвращается параметр &#x60;message&#x60;.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


