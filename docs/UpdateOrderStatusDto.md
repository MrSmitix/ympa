# UpdateOrderStatusDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id_** | **Int!** | Идентификатор заказа. | [optional] [default to null]
**status** | [***OrderStatusType**](OrderStatusType.md) |  | [optional] [default to null]
**substatus** | [***OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] [default to null]
**updateStatus** | [***OrderUpdateStatusType**](OrderUpdateStatusType.md) |  | [optional] [default to null]
**errorDetails** | **String!** | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


