# UpdateOrderStatusDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**i64**> | Идентификатор заказа. | [optional]
**status** | Option<[**models::OrderStatusType**](OrderStatusType.md)> |  | [optional]
**substatus** | Option<[**models::OrderSubstatusType**](OrderSubstatusType.md)> |  | [optional]
**update_status** | Option<[**models::OrderUpdateStatusType**](OrderUpdateStatusType.md)> |  | [optional]
**error_details** | Option<**String**> | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр `updateStatus` принимает значение `ERROR`.  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


