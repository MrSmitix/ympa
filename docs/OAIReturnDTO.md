# OAIReturnDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**_id** | **NSNumber*** | Идентификатор возврата. | [optional] 
**orderId** | **NSNumber*** | Номер заказа. | [optional] 
**creationDate** | **NSDate*** | Дата создания возврата клиентом. | [optional] 
**updateDate** | **NSDate*** | Дата обновления возврата. | [optional] 
**refundStatus** | [**OAIRefundStatusType***](OAIRefundStatusType.md) |  | [optional] 
**logisticPickupPoint** | [**OAILogisticPickupPointDTO***](OAILogisticPickupPointDTO.md) |  | [optional] 
**shipmentRecipientType** | [**OAIRecipientType***](OAIRecipientType.md) |  | [optional] 
**shipmentStatus** | [**OAIReturnShipmentStatusType***](OAIReturnShipmentStatusType.md) |  | [optional] 
**refundAmount** | **NSNumber*** | Сумма возврата. | [optional] 
**items** | [**NSArray&lt;OAIReturnItemDTO&gt;***](OAIReturnItemDTO.md) | Список товаров в возврате. | 
**returnType** | [**OAIReturnType***](OAIReturnType.md) |  | [optional] 
**fastReturn** | **NSNumber*** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


