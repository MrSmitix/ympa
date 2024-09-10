

# ReturnDTO

Возврат заказа.

The class is defined in **[ReturnDTO.java](../../src/main/java/org/openapitools/model/ReturnDTO.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Long` | Идентификатор возврата. |  [optional property]
**orderId** | `Long` | Номер заказа. |  [optional property]
**creationDate** | `OffsetDateTime` | Дата создания возврата клиентом. |  [optional property]
**updateDate** | `OffsetDateTime` | Дата обновления возврата. |  [optional property]
**refundStatus** | `RefundStatusType` |  |  [optional property]
**logisticPickupPoint** | [`LogisticPickupPointDTO`](LogisticPickupPointDTO.md) |  |  [optional property]
**shipmentRecipientType** | `RecipientType` |  |  [optional property]
**shipmentStatus** | `ReturnShipmentStatusType` |  |  [optional property]
**refundAmount** | `Long` | Сумма возврата. |  [optional property]
**items** | [`List&lt;ReturnItemDTO&gt;`](ReturnItemDTO.md) | Список товаров в возврате. | 
**returnType** | `ReturnType` |  |  [optional property]
**fastReturn** | `Boolean` | Используется ли опция **Быстрый возврат денег за дешевый брак**.  |  [optional property]














