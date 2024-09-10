# ReturnDto

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **i64** | Идентификатор возврата. | [optional] [default to None]
**order_id** | **i64** | Номер заказа. | [optional] [default to None]
**creation_date** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Дата создания возврата клиентом. | [optional] [default to None]
**update_date** | [**chrono::DateTime::<chrono::Utc>**](DateTime.md) | Дата обновления возврата. | [optional] [default to None]
**refund_status** | [***models::RefundStatusType**](RefundStatusType.md) |  | [optional] [default to None]
**logistic_pickup_point** | [***models::LogisticPickupPointDto**](LogisticPickupPointDTO.md) |  | [optional] [default to None]
**shipment_recipient_type** | [***models::RecipientType**](RecipientType.md) |  | [optional] [default to None]
**shipment_status** | [***models::ReturnShipmentStatusType**](ReturnShipmentStatusType.md) |  | [optional] [default to None]
**refund_amount** | **i64** | Сумма возврата. | [optional] [default to None]
**items** | [**Vec<models::ReturnItemDto>**](ReturnItemDTO.md) | Список товаров в возврате. | 
**return_type** | [***models::ReturnType**](ReturnType.md) |  | [optional] [default to None]
**fast_return** | **bool** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


