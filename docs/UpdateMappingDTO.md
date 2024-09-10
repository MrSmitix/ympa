# UpdateMappingDTO

Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**market_sku** | **int** | SKU на Маркете. | [optional] 

## Example

```python
from ympa_python_client.models.update_mapping_dto import UpdateMappingDTO

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateMappingDTO from a JSON string
update_mapping_dto_instance = UpdateMappingDTO.from_json(json)
# print the JSON string representation of the object
print(UpdateMappingDTO.to_json())

# convert the object into a dict
update_mapping_dto_dict = update_mapping_dto_instance.to_dict()
# create an instance of UpdateMappingDTO from a dict
update_mapping_dto_from_dict = UpdateMappingDTO.from_dict(update_mapping_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


