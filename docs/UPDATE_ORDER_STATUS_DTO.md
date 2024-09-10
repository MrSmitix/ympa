# UPDATE_ORDER_STATUS_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_64** | Идентификатор заказа. | [optional] [default to null]
**status** | [**ORDER_STATUS_TYPE**](OrderStatusType.md) |  | [optional] [default to null]
**substatus** | [**ORDER_SUBSTATUS_TYPE**](OrderSubstatusType.md) |  | [optional] [default to null]
**update_status** | [**ORDER_UPDATE_STATUS_TYPE**](OrderUpdateStatusType.md) |  | [optional] [default to null]
**error_details** | [**STRING_32**](STRING_32.md) | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


