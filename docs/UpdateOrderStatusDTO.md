# ympa_r_client::UpdateOrderStatusDTO

Список заказов.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | Идентификатор заказа. | [optional] 
**status** | [**OrderStatusType**](OrderStatusType.md) |  | [optional] [Enum: ] 
**substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] [Enum: ] 
**updateStatus** | [**OrderUpdateStatusType**](OrderUpdateStatusType.md) |  | [optional] [Enum: ] 
**errorDetails** | **character** | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;.  | [optional] 


