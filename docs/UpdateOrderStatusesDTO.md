# UpdateOrderStatusesDTO

Список заказов, статус которых обновился.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orders** | [**List[UpdateOrderStatusDTO]**](UpdateOrderStatusDTO.md) | Список с обновленными заказами. | 

## Example

```python
from ympa_python_client.models.update_order_statuses_dto import UpdateOrderStatusesDTO

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateOrderStatusesDTO from a JSON string
update_order_statuses_dto_instance = UpdateOrderStatusesDTO.from_json(json)
# print the JSON string representation of the object
print(UpdateOrderStatusesDTO.to_json())

# convert the object into a dict
update_order_statuses_dto_dict = update_order_statuses_dto_instance.to_dict()
# create an instance of UpdateOrderStatusesDTO from a dict
update_order_statuses_dto_from_dict = UpdateOrderStatusesDTO.from_dict(update_order_statuses_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


