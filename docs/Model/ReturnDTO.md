# ReturnDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор возврата. | [optional] 
**orderId** | **int** | Номер заказа. | [optional] 
**creationDate** | **\DateTime** | Дата создания возврата клиентом. | [optional] 
**updateDate** | **\DateTime** | Дата обновления возврата. | [optional] 
**refundStatus** | [**OpenAPI\Server\Model\RefundStatusType**](RefundStatusType.md) |  | [optional] 
**logisticPickupPoint** | [**OpenAPI\Server\Model\LogisticPickupPointDTO**](LogisticPickupPointDTO.md) |  | [optional] 
**shipmentRecipientType** | [**OpenAPI\Server\Model\RecipientType**](RecipientType.md) |  | [optional] 
**shipmentStatus** | [**OpenAPI\Server\Model\ReturnShipmentStatusType**](ReturnShipmentStatusType.md) |  | [optional] 
**refundAmount** | **int** | Сумма возврата. | [optional] 
**items** | [**OpenAPI\Server\Model\ReturnItemDTO**](ReturnItemDTO.md) | Список товаров в возврате. | 
**returnType** | [**OpenAPI\Server\Model\ReturnType**](ReturnType.md) |  | [optional] 
**fastReturn** | **bool** | Используется ли опция **Быстрый возврат денег за дешевый брак**. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


