# ReturnDTO

Возврат заказа.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор возврата. | [optional] 
**order_id** | **int** | Номер заказа. | [optional] 
**creation_date** | **datetime** | Дата создания возврата клиентом. | [optional] 
**update_date** | **datetime** | Дата обновления возврата. | [optional] 
**refund_status** | [**RefundStatusType**](RefundStatusType.md) |  | [optional] 
**logistic_pickup_point** | [**LogisticPickupPointDTO**](LogisticPickupPointDTO.md) |  | [optional] 
**shipment_recipient_type** | [**RecipientType**](RecipientType.md) |  | [optional] 
**shipment_status** | [**ReturnShipmentStatusType**](ReturnShipmentStatusType.md) |  | [optional] 
**refund_amount** | **int** | Сумма возврата. | [optional] 
**items** | [**List[ReturnItemDTO]**](ReturnItemDTO.md) | Список товаров в возврате. | 
**return_type** | [**ReturnType**](ReturnType.md) |  | [optional] 
**fast_return** | **bool** | Используется ли опция **Быстрый возврат денег за дешевый брак**.  | [optional] 

## Example

```python
from ympa_python_client.models.return_dto import ReturnDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ReturnDTO from a JSON string
return_dto_instance = ReturnDTO.from_json(json)
# print the JSON string representation of the object
print(ReturnDTO.to_json())

# convert the object into a dict
return_dto_dict = return_dto_instance.to_dict()
# create an instance of ReturnDTO from a dict
return_dto_from_dict = ReturnDTO.from_dict(return_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


