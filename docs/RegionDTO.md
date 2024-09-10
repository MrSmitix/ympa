# RegionDTO

Регион доставки.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор региона. | [optional] 
**name** | **str** | Название региона. | 
**type** | [**RegionType**](RegionType.md) |  | 
**parent** | [**RegionDTO**](RegionDTO.md) |  | [optional] 
**children** | [**List[RegionDTO]**](RegionDTO.md) | Дочерние регионы. | [optional] 

## Example

```python
from ympa_python_client.models.region_dto import RegionDTO

# TODO update the JSON string below
json = "{}"
# create an instance of RegionDTO from a JSON string
region_dto_instance = RegionDTO.from_json(json)
# print the JSON string representation of the object
print(RegionDTO.to_json())

# convert the object into a dict
region_dto_dict = region_dto_instance.to_dict()
# create an instance of RegionDTO from a dict
region_dto_from_dict = RegionDTO.from_dict(region_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


