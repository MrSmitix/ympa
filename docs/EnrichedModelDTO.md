# EnrichedModelDTO

Модель товара.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор модели товара. | [optional] 
**name** | **str** | Название модели товара. | [optional] 
**prices** | [**ModelPriceDTO**](ModelPriceDTO.md) |  | [optional] 
**offers** | [**List[ModelOfferDTO]**](ModelOfferDTO.md) | Список первых десяти предложений, расположенных на карточке модели.  В ответе на запрос возвращаются предложения различных магазинов. Если есть несколько предложений от одного магазина, в ответе отображается только одно, наиболее релевантное из них.  | [optional] 
**offline_offers** | **int** | Суммарное количество предложений в розничных магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] 
**online_offers** | **int** | Суммарное количество предложений в интернет-магазинах в регионе. Учитываются все предложения от каждого магазина. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.enriched_model_dto import EnrichedModelDTO

# TODO update the JSON string below
json = "{}"
# create an instance of EnrichedModelDTO from a JSON string
enriched_model_dto_instance = EnrichedModelDTO.from_json(json)
# print the JSON string representation of the object
print EnrichedModelDTO.to_json()

# convert the object into a dict
enriched_model_dto_dict = enriched_model_dto_instance.to_dict()
# create an instance of EnrichedModelDTO from a dict
enriched_model_dto_from_dict = EnrichedModelDTO.from_dict(enriched_model_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


