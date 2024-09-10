# GetPromosRequest

Фильтры для получения списка акций.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**participation** | [**PromoParticipationType**](PromoParticipationType.md) |  | [optional] 
**mechanics** | [**MechanicsType**](MechanicsType.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_promos_request import GetPromosRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetPromosRequest from a JSON string
get_promos_request_instance = GetPromosRequest.from_json(json)
# print the JSON string representation of the object
print GetPromosRequest.to_json()

# convert the object into a dict
get_promos_request_dict = get_promos_request_instance.to_dict()
# create an instance of GetPromosRequest from a dict
get_promos_request_from_dict = GetPromosRequest.from_dict(get_promos_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


