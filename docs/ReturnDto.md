# ReturnDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | Option<**i64**> | Идентификатор возврата. | [optional]
**order_id** | Option<**i64**> | Номер заказа. | [optional]
**creation_date** | Option<**String**> | Дата создания возврата клиентом. | [optional]
**update_date** | Option<**String**> | Дата обновления возврата. | [optional]
**refund_status** | Option<[**models::RefundStatusType**](RefundStatusType.md)> |  | [optional]
**logistic_pickup_point** | Option<[**models::LogisticPickupPointDto**](LogisticPickupPointDTO.md)> |  | [optional]
**shipment_recipient_type** | Option<[**models::RecipientType**](RecipientType.md)> |  | [optional]
**shipment_status** | Option<[**models::ReturnShipmentStatusType**](ReturnShipmentStatusType.md)> |  | [optional]
**refund_amount** | Option<**i64**> | Сумма возврата. | [optional]
**items** | [**Vec<models::ReturnItemDto>**](ReturnItemDTO.md) | Список товаров в возврате. | 
**return_type** | Option<[**models::ReturnType**](ReturnType.md)> |  | [optional]
**fast_return** | Option<**bool**> | Используется ли опция **Быстрый возврат денег за дешевый брак**.  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


