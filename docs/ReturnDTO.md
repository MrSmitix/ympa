# ympa_csharp_client.Model.ReturnDTO
Возврат заказа.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **long** | Идентификатор возврата. | [optional] 
**OrderId** | **long** | Номер заказа. | [optional] 
**CreationDate** | **DateTime** | Дата создания возврата клиентом. | [optional] 
**UpdateDate** | **DateTime** | Дата обновления возврата. | [optional] 
**RefundStatus** | **RefundStatusType** |  | [optional] 
**LogisticPickupPoint** | [**LogisticPickupPointDTO**](LogisticPickupPointDTO.md) |  | [optional] 
**ShipmentRecipientType** | **RecipientType** |  | [optional] 
**ShipmentStatus** | **ReturnShipmentStatusType** |  | [optional] 
**RefundAmount** | **long** | Сумма возврата. | [optional] 
**Items** | [**List&lt;ReturnItemDTO&gt;**](ReturnItemDTO.md) | Список товаров в возврате. | 
**ReturnType** | **ReturnType** |  | [optional] 
**FastReturn** | **bool** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

