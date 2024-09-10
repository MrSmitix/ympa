

# ReturnDTO

Возврат заказа.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Идентификатор возврата. |  [optional]
**orderId** | **Long** | Номер заказа. |  [optional]
**creationDate** | **OffsetDateTime** | Дата создания возврата клиентом. |  [optional]
**updateDate** | **OffsetDateTime** | Дата обновления возврата. |  [optional]
**refundStatus** | **RefundStatusType** |  |  [optional]
**logisticPickupPoint** | [**LogisticPickupPointDTO**](LogisticPickupPointDTO.md) |  |  [optional]
**shipmentRecipientType** | **RecipientType** |  |  [optional]
**shipmentStatus** | **ReturnShipmentStatusType** |  |  [optional]
**refundAmount** | **Long** | Сумма возврата. |  [optional]
**items** | [**Seq&lt;ReturnItemDTO&gt;**](ReturnItemDTO.md) | Список товаров в возврате. | 
**returnType** | **ReturnType** |  |  [optional]
**fastReturn** | **Boolean** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  |  [optional]



