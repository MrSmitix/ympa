# PagedReturnsDTO

Возвраты.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paging** | [**ForwardScrollingPagerDTO**](ForwardScrollingPagerDTO.md) |  | [optional] 
**returns** | [**List[ReturnDTO]**](ReturnDTO.md) | Список возвратов. | 

## Example

```python
from ympa_python_client.models.paged_returns_dto import PagedReturnsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of PagedReturnsDTO from a JSON string
paged_returns_dto_instance = PagedReturnsDTO.from_json(json)
# print the JSON string representation of the object
print(PagedReturnsDTO.to_json())

# convert the object into a dict
paged_returns_dto_dict = paged_returns_dto_instance.to_dict()
# create an instance of PagedReturnsDTO from a dict
paged_returns_dto_from_dict = PagedReturnsDTO.from_dict(paged_returns_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


