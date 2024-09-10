# UpdateOrderStatusDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор заказа. | [optional] 
**status** | [**OpenAPI\Server\Model\OrderStatusType**](OrderStatusType.md) |  | [optional] 
**substatus** | [**OpenAPI\Server\Model\OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 
**updateStatus** | [**OpenAPI\Server\Model\OrderUpdateStatusType**](OrderUpdateStatusType.md) |  | [optional] 
**errorDetails** | **string** | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


