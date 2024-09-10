# UpdateOrderStatusDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i64** | Идентификатор заказа. | [optional] [default to None]
**status** | [***models::OrderStatusType**](OrderStatusType.md) |  | [optional] [default to None]
**substatus** | [***models::OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] [default to None]
**update_status** | [***models::OrderUpdateStatusType**](OrderUpdateStatusType.md) |  | [optional] [default to None]
**error_details** | **String** | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


