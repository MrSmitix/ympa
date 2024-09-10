# GetOutletResponse

Ответ на запрос информации о точке продаж.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**outlet** | [**FullOutletDTO**](FullOutletDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_outlet_response import GetOutletResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetOutletResponse from a JSON string
get_outlet_response_instance = GetOutletResponse.from_json(json)
# print the JSON string representation of the object
print(GetOutletResponse.to_json())

# convert the object into a dict
get_outlet_response_dict = get_outlet_response_instance.to_dict()
# create an instance of GetOutletResponse from a dict
get_outlet_response_from_dict = GetOutletResponse.from_dict(get_outlet_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


