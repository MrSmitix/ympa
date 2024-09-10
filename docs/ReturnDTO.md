# ympa_r_client::ReturnDTO

Возврат заказа.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | Идентификатор возврата. | [optional] 
**orderId** | **integer** | Номер заказа. | [optional] 
**creationDate** | **character** | Дата создания возврата клиентом. | [optional] 
**updateDate** | **character** | Дата обновления возврата. | [optional] 
**refundStatus** | [**RefundStatusType**](RefundStatusType.md) |  | [optional] [Enum: ] 
**logisticPickupPoint** | [**LogisticPickupPointDTO**](LogisticPickupPointDTO.md) |  | [optional] 
**shipmentRecipientType** | [**RecipientType**](RecipientType.md) |  | [optional] [Enum: ] 
**shipmentStatus** | [**ReturnShipmentStatusType**](ReturnShipmentStatusType.md) |  | [optional] [Enum: ] 
**refundAmount** | **integer** | Сумма возврата. | [optional] 
**items** | [**array[ReturnItemDTO]**](ReturnItemDTO.md) | Список товаров в возврате. | 
**returnType** | [**ReturnType**](ReturnType.md) |  | [optional] [Enum: ] 
**fastReturn** | **character** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  | [optional] 


