# ReturnDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int64** | Идентификатор возврата. | [optional] 
**orderId** | **Int64** | Номер заказа. | [optional] 
**creationDate** | **Date** | Дата создания возврата клиентом. | [optional] 
**updateDate** | **Date** | Дата обновления возврата. | [optional] 
**refundStatus** | [**RefundStatusType**](RefundStatusType.md) |  | [optional] 
**logisticPickupPoint** | [**LogisticPickupPointDTO**](LogisticPickupPointDTO.md) |  | [optional] 
**shipmentRecipientType** | [**RecipientType**](RecipientType.md) |  | [optional] 
**shipmentStatus** | [**ReturnShipmentStatusType**](ReturnShipmentStatusType.md) |  | [optional] 
**refundAmount** | **Int64** | Сумма возврата. | [optional] 
**items** | [ReturnItemDTO] | Список товаров в возврате. | 
**returnType** | [**ReturnType**](ReturnType.md) |  | [optional] 
**fastReturn** | **Bool** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


