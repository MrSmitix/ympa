# GetOutletsResponse

Ответ на запрос информации о точках продаж.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**outlets** | [**List[FullOutletDTO]**](FullOutletDTO.md) | Информация о точках продаж. | 
**paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**pager** | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_outlets_response import GetOutletsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetOutletsResponse from a JSON string
get_outlets_response_instance = GetOutletsResponse.from_json(json)
# print the JSON string representation of the object
print GetOutletsResponse.to_json()

# convert the object into a dict
get_outlets_response_dict = get_outlets_response_instance.to_dict()
# create an instance of GetOutletsResponse from a dict
get_outlets_response_from_dict = GetOutletsResponse.from_dict(get_outlets_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


