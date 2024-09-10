# GetMappingDTO

Информация о товарах в каталоге. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**market_sku** | **int** | SKU на Маркете. | [optional] 
**market_sku_name** | **str** | Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  | [optional] 
**market_model_id** | **int** | Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  | [optional] 
**market_model_name** | **str** | Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке.  | [optional] 
**market_category_id** | **int** | Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  | [optional] 
**market_category_name** | **str** | Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара.  | [optional] 

## Example

```python
from ympa_python_client.models.get_mapping_dto import GetMappingDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetMappingDTO from a JSON string
get_mapping_dto_instance = GetMappingDTO.from_json(json)
# print the JSON string representation of the object
print(GetMappingDTO.to_json())

# convert the object into a dict
get_mapping_dto_dict = get_mapping_dto_instance.to_dict()
# create an instance of GetMappingDTO from a dict
get_mapping_dto_from_dict = GetMappingDTO.from_dict(get_mapping_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


