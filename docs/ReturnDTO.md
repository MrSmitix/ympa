

# ReturnDTO

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** | Идентификатор возврата. |  [optional]
**orderId** | **Long** | Номер заказа. |  [optional]
**creationDate** | [**Date**](Date.md) | Дата создания возврата клиентом. |  [optional]
**updateDate** | [**Date**](Date.md) | Дата обновления возврата. |  [optional]
**refundStatus** | [**RefundStatusType**](RefundStatusType.md) |  |  [optional]
**logisticPickupPoint** | [**LogisticPickupPointDTO**](LogisticPickupPointDTO.md) |  |  [optional]
**shipmentRecipientType** | [**RecipientType**](RecipientType.md) |  |  [optional]
**shipmentStatus** | [**ReturnShipmentStatusType**](ReturnShipmentStatusType.md) |  |  [optional]
**refundAmount** | **Long** | Сумма возврата. |  [optional]
**items** | [**List&lt;ReturnItemDTO&gt;**](ReturnItemDTO.md) | Список товаров в возврате. | 
**returnType** | [**ReturnType**](ReturnType.md) |  |  [optional]
**fastReturn** | **Boolean** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  |  [optional]




