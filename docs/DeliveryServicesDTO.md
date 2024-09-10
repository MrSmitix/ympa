# DeliveryServicesDTO

Информация о службах доставки.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delivery_service** | [**List[DeliveryServiceInfoDTO]**](DeliveryServiceInfoDTO.md) | Информация о службе доставки. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.delivery_services_dto import DeliveryServicesDTO

# TODO update the JSON string below
json = "{}"
# create an instance of DeliveryServicesDTO from a JSON string
delivery_services_dto_instance = DeliveryServicesDTO.from_json(json)
# print the JSON string representation of the object
print DeliveryServicesDTO.to_json()

# convert the object into a dict
delivery_services_dto_dict = delivery_services_dto_instance.to_dict()
# create an instance of DeliveryServicesDTO from a dict
delivery_services_dto_from_dict = DeliveryServicesDTO.from_dict(delivery_services_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


