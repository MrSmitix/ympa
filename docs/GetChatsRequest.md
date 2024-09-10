# ympa_r_client::GetChatsRequest

Фильтры по чатам, которые нужно вернуть. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderIds** | **array[integer]** | Фильтр по идентификаторам заказов на Маркете. | [optional] [Min. items: 1] 
**types** | [**array[ChatType]**](ChatType.md) | Фильтр по типам чатов. | [optional] [Min. items: 1] 
**statuses** | [**array[ChatStatusType]**](ChatStatusType.md) | Фильтр по статусам чатов. | [optional] [Min. items: 1] 


