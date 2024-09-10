# ReturnDTO
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Long** | Идентификатор возврата. | [optional] [default to null] |
| **orderId** | **Long** | Номер заказа. | [optional] [default to null] |
| **creationDate** | **Date** | Дата создания возврата клиентом. | [optional] [default to null] |
| **updateDate** | **Date** | Дата обновления возврата. | [optional] [default to null] |
| **refundStatus** | [**RefundStatusType**](RefundStatusType.md) |  | [optional] [default to null] |
| **logisticPickupPoint** | [**LogisticPickupPointDTO**](LogisticPickupPointDTO.md) |  | [optional] [default to null] |
| **shipmentRecipientType** | [**RecipientType**](RecipientType.md) |  | [optional] [default to null] |
| **shipmentStatus** | [**ReturnShipmentStatusType**](ReturnShipmentStatusType.md) |  | [optional] [default to null] |
| **refundAmount** | **Long** | Сумма возврата. | [optional] [default to null] |
| **items** | [**List**](ReturnItemDTO.md) | Список товаров в возврате. | [default to null] |
| **returnType** | [**ReturnType**](ReturnType.md) |  | [optional] [default to null] |
| **fastReturn** | **Boolean** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

