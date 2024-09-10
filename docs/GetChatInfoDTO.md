# WWW::OpenAPIClient::Object::GetChatInfoDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::GetChatInfoDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chat_id** | **int** | Идентификатор чата. | 
**order_id** | **int** | Идентификатор заказа. | 
**type** | [**ChatType**](ChatType.md) |  | 
**status** | [**ChatStatusType**](ChatStatusType.md) |  | 
**created_at** | **DATE_TIME** | Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | 
**updated_at** | **DATE_TIME** | Дата и время последнего сообщения в чате. | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


