# OrderParcelBoxDTO

Информация о грузоместе.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор грузоместа. | [optional] 
**fulfilment_id** | **str** | Идентификатор грузового места в информационной системе магазина. | [optional] 

## Example

```python
from ympa_python_client.models.order_parcel_box_dto import OrderParcelBoxDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OrderParcelBoxDTO from a JSON string
order_parcel_box_dto_instance = OrderParcelBoxDTO.from_json(json)
# print the JSON string representation of the object
print(OrderParcelBoxDTO.to_json())

# convert the object into a dict
order_parcel_box_dto_dict = order_parcel_box_dto_instance.to_dict()
# create an instance of OrderParcelBoxDTO from a dict
order_parcel_box_dto_from_dict = OrderParcelBoxDTO.from_dict(order_parcel_box_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


