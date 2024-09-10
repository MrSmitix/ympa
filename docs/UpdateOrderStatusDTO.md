# UpdateOrderStatusDTO

Список заказов.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор заказа. | [optional] 
**status** | [**OrderStatusType**](OrderStatusType.md) |  | [optional] 
**substatus** | [**OrderSubstatusType**](OrderSubstatusType.md) |  | [optional] 
**update_status** | [**OrderUpdateStatusType**](OrderUpdateStatusType.md) |  | [optional] 
**error_details** | **str** | Ошибка при изменении статуса заказа. Содержит описание ошибки и идентификатор заказа.  Возвращается, если параметр &#x60;updateStatus&#x60; принимает значение &#x60;ERROR&#x60;.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.update_order_status_dto import UpdateOrderStatusDTO

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateOrderStatusDTO from a JSON string
update_order_status_dto_instance = UpdateOrderStatusDTO.from_json(json)
# print the JSON string representation of the object
print UpdateOrderStatusDTO.to_json()

# convert the object into a dict
update_order_status_dto_dict = update_order_status_dto_instance.to_dict()
# create an instance of UpdateOrderStatusDTO from a dict
update_order_status_dto_from_dict = UpdateOrderStatusDTO.from_dict(update_order_status_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


