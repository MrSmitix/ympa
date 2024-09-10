# ympa_r_client::GetChatInfoDTO

Информация о чатах.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chatId** | **integer** | Идентификатор чата. | 
**orderId** | **integer** | Идентификатор заказа. | 
**type** | [**ChatType**](ChatType.md) |  | [Enum: ] 
**status** | [**ChatStatusType**](ChatStatusType.md) |  | [Enum: ] 
**createdAt** | **character** | Дата и время создания чата.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:00:00+03:00&#x60;.  | 
**updatedAt** | **character** | Дата и время последнего сообщения в чате. | 


