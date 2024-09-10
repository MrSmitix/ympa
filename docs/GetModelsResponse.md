# GetModelsResponse

Ответ на запрос информации о моделях.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | [**List[ModelDTO]**](ModelDTO.md) | Список моделей товаров. | 
**currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] 
**region_id** | **int** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_models_response import GetModelsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetModelsResponse from a JSON string
get_models_response_instance = GetModelsResponse.from_json(json)
# print the JSON string representation of the object
print GetModelsResponse.to_json()

# convert the object into a dict
get_models_response_dict = get_models_response_instance.to_dict()
# create an instance of GetModelsResponse from a dict
get_models_response_from_dict = GetModelsResponse.from_dict(get_models_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


