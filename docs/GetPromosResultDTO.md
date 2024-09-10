# GetPromosResultDTO

Информация об акциях Маркета.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**promos** | [**List[GetPromoDTO]**](GetPromoDTO.md) | Акции Маркета. | 

## Example

```python
from ympa_python_client.models.get_promos_result_dto import GetPromosResultDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetPromosResultDTO from a JSON string
get_promos_result_dto_instance = GetPromosResultDTO.from_json(json)
# print the JSON string representation of the object
print(GetPromosResultDTO.to_json())

# convert the object into a dict
get_promos_result_dto_dict = get_promos_result_dto_instance.to_dict()
# create an instance of GetPromosResultDTO from a dict
get_promos_result_dto_from_dict = GetPromosResultDTO.from_dict(get_promos_result_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


