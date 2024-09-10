# ModelsDTO

Список моделей товаров.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | [**List[ModelDTO]**](ModelDTO.md) | Список моделей товаров. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.models_dto import ModelsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of ModelsDTO from a JSON string
models_dto_instance = ModelsDTO.from_json(json)
# print the JSON string representation of the object
print ModelsDTO.to_json()

# convert the object into a dict
models_dto_dict = models_dto_instance.to_dict()
# create an instance of ModelsDTO from a dict
models_dto_from_dict = ModelsDTO.from_dict(models_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


