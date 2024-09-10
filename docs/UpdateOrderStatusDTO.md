# UpdateOrderStatusDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int64** | Идентификатор заказа. | [optional] [default to nothing]
**status** | [***OrderStatusType**](OrderStatusType.md) |  | [optional] [default to nothing]
**substatus** | [***OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] [default to nothing]
**updateStatus** | [***OrderUpdateStatusType**](OrderUpdateStatusType.md) |  | [optional] [default to nothing]
**errorDetails** | **String** | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;.  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


