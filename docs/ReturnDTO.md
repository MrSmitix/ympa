# ReturnDTO


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Int64** | Идентификатор возврата. | [optional] [default to nothing]
**orderId** | **Int64** | Номер заказа. | [optional] [default to nothing]
**creationDate** | **ZonedDateTime** | Дата создания возврата клиентом. | [optional] [default to nothing]
**updateDate** | **ZonedDateTime** | Дата обновления возврата. | [optional] [default to nothing]
**refundStatus** | [***RefundStatusType**](RefundStatusType.md) |  | [optional] [default to nothing]
**logisticPickupPoint** | [***LogisticPickupPointDTO**](LogisticPickupPointDTO.md) |  | [optional] [default to nothing]
**shipmentRecipientType** | [***RecipientType**](RecipientType.md) |  | [optional] [default to nothing]
**shipmentStatus** | [***ReturnShipmentStatusType**](ReturnShipmentStatusType.md) |  | [optional] [default to nothing]
**refundAmount** | **Int64** | Сумма возврата. | [optional] [default to nothing]
**items** | [**Vector{ReturnItemDTO}**](ReturnItemDTO.md) | Список товаров в возврате. | [default to nothing]
**returnType** | [***ReturnType**](ReturnType.md) |  | [optional] [default to nothing]
**fastReturn** | **Bool** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


