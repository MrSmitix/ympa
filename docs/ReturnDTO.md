# Api.ReturnDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** | Идентификатор возврата. | [optional] 
**orderId** | **Number** | Номер заказа. | [optional] 
**creationDate** | **Date** | Дата создания возврата клиентом. | [optional] 
**updateDate** | **Date** | Дата обновления возврата. | [optional] 
**refundStatus** | [**RefundStatusType**](RefundStatusType.md) |  | [optional] 
**logisticPickupPoint** | [**LogisticPickupPointDTO**](LogisticPickupPointDTO.md) |  | [optional] 
**shipmentRecipientType** | [**RecipientType**](RecipientType.md) |  | [optional] 
**shipmentStatus** | [**ReturnShipmentStatusType**](ReturnShipmentStatusType.md) |  | [optional] 
**refundAmount** | **Number** | Сумма возврата. | [optional] 
**items** | [**[ReturnItemDTO]**](ReturnItemDTO.md) | Список товаров в возврате. | 
**returnType** | [**ReturnType**](ReturnType.md) |  | [optional] 
**fastReturn** | **Boolean** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  | [optional] 


