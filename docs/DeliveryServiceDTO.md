# DeliveryServiceDTO

Служба доставки.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор службы доставки. | [optional] 
**name** | **str** | Наименование службы доставки. | [optional] 

## Example

```python
from ympa_python_client.models.delivery_service_dto import DeliveryServiceDTO

# TODO update the JSON string below
json = "{}"
# create an instance of DeliveryServiceDTO from a JSON string
delivery_service_dto_instance = DeliveryServiceDTO.from_json(json)
# print the JSON string representation of the object
print(DeliveryServiceDTO.to_json())

# convert the object into a dict
delivery_service_dto_dict = delivery_service_dto_instance.to_dict()
# create an instance of DeliveryServiceDTO from a dict
delivery_service_dto_from_dict = DeliveryServiceDTO.from_dict(delivery_service_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


