# OfferMappingDTO

Информация о текущей карточке товара на Маркете.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**market_sku** | **int** | SKU на Маркете. | [optional] 
**model_id** | **int** | Идентификатор модели для текущей карточки товара на Маркете.  Например, две лопатки разных цветов имеют разные SKU на Маркете (параметр &#x60;marketSku&#x60;), но одинаковый идентификатор модели товара.  | [optional] 
**category_id** | **int** | Идентификатор категории для текущей карточки товара на Маркете. | [optional] 

## Example

```python
from ympa_python_client.models.offer_mapping_dto import OfferMappingDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferMappingDTO from a JSON string
offer_mapping_dto_instance = OfferMappingDTO.from_json(json)
# print the JSON string representation of the object
print(OfferMappingDTO.to_json())

# convert the object into a dict
offer_mapping_dto_dict = offer_mapping_dto_instance.to_dict()
# create an instance of OfferMappingDTO from a dict
offer_mapping_dto_from_dict = OfferMappingDTO.from_dict(offer_mapping_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


