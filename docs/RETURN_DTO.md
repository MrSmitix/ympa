# RETURN_DTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_64** | Идентификатор возврата. | [optional] [default to null]
**order_id** | **INTEGER_64** | Номер заказа. | [optional] [default to null]
**creation_date** | [**DATE_TIME**](DATE_TIME.md) | Дата создания возврата клиентом. | [optional] [default to null]
**update_date** | [**DATE_TIME**](DATE_TIME.md) | Дата обновления возврата. | [optional] [default to null]
**refund_status** | [**REFUND_STATUS_TYPE**](RefundStatusType.md) |  | [optional] [default to null]
**logistic_pickup_point** | [**LOGISTIC_PICKUP_POINT_DTO**](LogisticPickupPointDTO.md) |  | [optional] [default to null]
**shipment_recipient_type** | [**RECIPIENT_TYPE**](RecipientType.md) |  | [optional] [default to null]
**shipment_status** | [**RETURN_SHIPMENT_STATUS_TYPE**](ReturnShipmentStatusType.md) |  | [optional] [default to null]
**refund_amount** | **INTEGER_64** | Сумма возврата. | [optional] [default to null]
**items** | [**LIST [RETURN_ITEM_DTO]**](ReturnItemDTO.md) | Список товаров в возврате. | [default to null]
**return_type** | [**RETURN_TYPE**](ReturnType.md) |  | [optional] [default to null]
**fast_return** | **BOOLEAN** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


