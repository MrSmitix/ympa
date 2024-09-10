# WWW::OpenAPIClient::Object::ReturnDTO

## Load the model package
```perl
use WWW::OpenAPIClient::Object::ReturnDTO;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор возврата. | [optional] 
**order_id** | **int** | Номер заказа. | [optional] 
**creation_date** | **DATE_TIME** | Дата создания возврата клиентом. | [optional] 
**update_date** | **DATE_TIME** | Дата обновления возврата. | [optional] 
**refund_status** | [**RefundStatusType**](RefundStatusType.md) |  | [optional] 
**logistic_pickup_point** | [**LogisticPickupPointDTO**](LogisticPickupPointDTO.md) |  | [optional] 
**shipment_recipient_type** | [**RecipientType**](RecipientType.md) |  | [optional] 
**shipment_status** | [**ReturnShipmentStatusType**](ReturnShipmentStatusType.md) |  | [optional] 
**refund_amount** | **int** | Сумма возврата. | [optional] 
**items** | [**ARRAY[ReturnItemDTO]**](ReturnItemDTO.md) | Список товаров в возврате. | 
**return_type** | [**ReturnType**](ReturnType.md) |  | [optional] 
**fast_return** | **boolean** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


