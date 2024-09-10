# EnrichedModelsDTO

Список моделей товаров.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | [**List[EnrichedModelDTO]**](EnrichedModelDTO.md) | Список моделей товаров. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.enriched_models_dto import EnrichedModelsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of EnrichedModelsDTO from a JSON string
enriched_models_dto_instance = EnrichedModelsDTO.from_json(json)
# print the JSON string representation of the object
print EnrichedModelsDTO.to_json()

# convert the object into a dict
enriched_models_dto_dict = enriched_models_dto_instance.to_dict()
# create an instance of EnrichedModelsDTO from a dict
enriched_models_dto_from_dict = EnrichedModelsDTO.from_dict(enriched_models_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


