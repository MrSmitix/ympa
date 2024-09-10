# GetModelsOffersResponse

Ответ на запрос списка предложений для моделей.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**models** | [**List[EnrichedModelDTO]**](EnrichedModelDTO.md) | Список моделей товаров. | 
**currency** | [**CurrencyType**](CurrencyType.md) |  | [optional] 
**region_id** | **int** | Идентификатор региона, для которого выводится информация о предложениях модели (доставляемых в этот регион).  Информацию о регионе по идентификатору можно получить с помощью запроса [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_models_offers_response import GetModelsOffersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetModelsOffersResponse from a JSON string
get_models_offers_response_instance = GetModelsOffersResponse.from_json(json)
# print the JSON string representation of the object
print GetModelsOffersResponse.to_json()

# convert the object into a dict
get_models_offers_response_dict = get_models_offers_response_instance.to_dict()
# create an instance of GetModelsOffersResponse from a dict
get_models_offers_response_from_dict = GetModelsOffersResponse.from_dict(get_models_offers_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


