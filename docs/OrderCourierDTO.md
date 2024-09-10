# OrderCourierDTO

Информация о курьере.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**full_name** | **str** | Полное имя курьера. | [optional] 
**phone** | **str** | Номер телефона курьера. | [optional] 
**phone_extension** | **str** | Добавочный номер телефона. | [optional] 
**vehicle_number** | **str** | Номер транспортного средства. | [optional] 
**vehicle_description** | **str** | Описание машины. Например, модель и цвет. | [optional] 

## Example

```python
from ympa_python_client.models.order_courier_dto import OrderCourierDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderCourierDTO from a JSON string
order_courier_dto_instance = OrderCourierDTO.from_json(json)
# print the JSON string representation of the object
print(OrderCourierDTO.to_json())

# convert the object into a dict
order_courier_dto_dict = order_courier_dto_instance.to_dict()
# create an instance of OrderCourierDTO from a dict
order_courier_dto_from_dict = OrderCourierDTO.from_dict(order_courier_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


