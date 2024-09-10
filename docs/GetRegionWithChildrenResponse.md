# GetRegionWithChildrenResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pager** | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 
**regions** | [**RegionDTO**](RegionDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_region_with_children_response import GetRegionWithChildrenResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetRegionWithChildrenResponse from a JSON string
get_region_with_children_response_instance = GetRegionWithChildrenResponse.from_json(json)
# print the JSON string representation of the object
print(GetRegionWithChildrenResponse.to_json())

# convert the object into a dict
get_region_with_children_response_dict = get_region_with_children_response_instance.to_dict()
# create an instance of GetRegionWithChildrenResponse from a dict
get_region_with_children_response_from_dict = GetRegionWithChildrenResponse.from_dict(get_region_with_children_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


