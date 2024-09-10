
# ReturnDTO

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **items** | [**kotlin.collections.List&lt;ReturnItemDTO&gt;**](ReturnItemDTO.md) | Список товаров в возврате. |  |
| **id** | **kotlin.Long** | Идентификатор возврата. |  [optional] |
| **orderId** | **kotlin.Long** | Номер заказа. |  [optional] |
| **creationDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Дата создания возврата клиентом. |  [optional] |
| **updateDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Дата обновления возврата. |  [optional] |
| **refundStatus** | [**RefundStatusType**](RefundStatusType.md) |  |  [optional] |
| **logisticPickupPoint** | [**LogisticPickupPointDTO**](LogisticPickupPointDTO.md) |  |  [optional] |
| **shipmentRecipientType** | [**RecipientType**](RecipientType.md) |  |  [optional] |
| **shipmentStatus** | [**ReturnShipmentStatusType**](ReturnShipmentStatusType.md) |  |  [optional] |
| **refundAmount** | **kotlin.Long** | Сумма возврата. |  [optional] |
| **returnType** | [**ReturnType**](ReturnType.md) |  |  [optional] |
| **fastReturn** | **kotlin.Boolean** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  |  [optional] |



