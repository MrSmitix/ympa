# GetModelsRequest

Запрос информации о моделях.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | **List[int]** | Список моделей. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_models_request import GetModelsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetModelsRequest from a JSON string
get_models_request_instance = GetModelsRequest.from_json(json)
# print the JSON string representation of the object
print GetModelsRequest.to_json()

# convert the object into a dict
get_models_request_dict = get_models_request_instance.to_dict()
# create an instance of GetModelsRequest from a dict
get_models_request_from_dict = GetModelsRequest.from_dict(get_models_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


