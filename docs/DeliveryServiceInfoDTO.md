# DeliveryServiceInfoDTO

Информация о службе доставки.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор службы доставки. | 
**name** | **str** | Наименование службы доставки. | 

## Example

```python
from ympa_python_client.models.delivery_service_info_dto import DeliveryServiceInfoDTO

# TODO update the JSON string below
json = "{}"
# create an instance of DeliveryServiceInfoDTO from a JSON string
delivery_service_info_dto_instance = DeliveryServiceInfoDTO.from_json(json)
# print the JSON string representation of the object
print(DeliveryServiceInfoDTO.to_json())

# convert the object into a dict
delivery_service_info_dto_dict = delivery_service_info_dto_instance.to_dict()
# create an instance of DeliveryServiceInfoDTO from a dict
delivery_service_info_dto_from_dict = DeliveryServiceInfoDTO.from_dict(delivery_service_info_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


