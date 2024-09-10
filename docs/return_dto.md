# return_dto_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **long** | Идентификатор возврата. | [optional] 
**order_id** | **long** | Номер заказа. | [optional] 
**creation_date** | **char \*** | Дата создания возврата клиентом. | [optional] 
**update_date** | **char \*** | Дата обновления возврата. | [optional] 
**refund_status** | **refund_status_type_t \*** |  | [optional] 
**logistic_pickup_point** | [**logistic_pickup_point_dto_t**](logistic_pickup_point_dto.md) \* |  | [optional] 
**shipment_recipient_type** | **recipient_type_t \*** |  | [optional] 
**shipment_status** | **return_shipment_status_type_t \*** |  | [optional] 
**refund_amount** | **long** | Сумма возврата. | [optional] 
**items** | [**list_t**](return_item_dto.md) \* | Список товаров в возврате. | 
**return_type** | **return_type_t \*** |  | [optional] 
**fast_return** | **int** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


