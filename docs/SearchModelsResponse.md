# SearchModelsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | [**List[ModelDTO]**](ModelDTO.md) | Список моделей товаров. | 
**currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] 
**region_id** | **int** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] 
**pager** | [**FlippingPagerDTO**](FlippingPagerDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.search_models_response import SearchModelsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SearchModelsResponse from a JSON string
search_models_response_instance = SearchModelsResponse.from_json(json)
# print the JSON string representation of the object
print(SearchModelsResponse.to_json())

# convert the object into a dict
search_models_response_dict = search_models_response_instance.to_dict()
# create an instance of SearchModelsResponse from a dict
search_models_response_from_dict = SearchModelsResponse.from_dict(search_models_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


