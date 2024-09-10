# GetRegionsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**regions** | [**List[RegionDTO]**](RegionDTO.md) | Регион доставки. | 
**paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_regions_response import GetRegionsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetRegionsResponse from a JSON string
get_regions_response_instance = GetRegionsResponse.from_json(json)
# print the JSON string representation of the object
print(GetRegionsResponse.to_json())

# convert the object into a dict
get_regions_response_dict = get_regions_response_instance.to_dict()
# create an instance of GetRegionsResponse from a dict
get_regions_response_from_dict = GetRegionsResponse.from_dict(get_regions_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


