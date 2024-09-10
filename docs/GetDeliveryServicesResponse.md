# GetDeliveryServicesResponse

Ответ на запрос списка служб доставки.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**result** | [**DeliveryServicesDTO**](DeliveryServicesDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_delivery_services_response import GetDeliveryServicesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetDeliveryServicesResponse from a JSON string
get_delivery_services_response_instance = GetDeliveryServicesResponse.from_json(json)
# print the JSON string representation of the object
print GetDeliveryServicesResponse.to_json()

# convert the object into a dict
get_delivery_services_response_dict = get_delivery_services_response_instance.to_dict()
# create an instance of GetDeliveryServicesResponse from a dict
get_delivery_services_response_from_dict = GetDeliveryServicesResponse.from_dict(get_delivery_services_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


