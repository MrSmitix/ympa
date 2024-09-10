# OAIUpdateOrderStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | Идентификатор заказа. | [optional] 
**status** | [**OAIOrderStatusType***](OAIOrderStatusType.md) |  | [optional] 
**substatus** | [**OAIOrderSubstatusType***](OAIOrderSubstatusType.md) |  | [optional] 
**updateStatus** | [**OAIOrderUpdateStatusType***](OAIOrderUpdateStatusType.md) |  | [optional] 
**errorDetails** | **NSString*** | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


