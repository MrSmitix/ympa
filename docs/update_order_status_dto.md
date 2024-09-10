# update_order_status_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **long** | Идентификатор заказа. | [optional] 
**status** | **order_status_type_t \*** |  | [optional] 
**substatus** | **order_substatus_type_t \*** |  | [optional] 
**update_status** | **order_update_status_type_t \*** |  | [optional] 
**error_details** | **char \*** | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


