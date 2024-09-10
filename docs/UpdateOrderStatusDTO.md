# ympa_csharp_client.Model.UpdateOrderStatusDTO
Список заказов.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **long** | Идентификатор заказа. | [optional] 
**Status** | **OrderStatusType** |  | [optional] 
**Substatus** | **OrderSubstatusType** |  | [optional] 
**UpdateStatus** | **OrderUpdateStatusType** |  | [optional] 
**ErrorDetails** | **string** | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

