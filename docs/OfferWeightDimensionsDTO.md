# OfferWeightDimensionsDTO

Габариты упаковки и вес товара.  Если товар занимает несколько коробок, перед измерением размеров сложите их компактно.  ![Схема измерения многоместных грузов](../../_images/reference/boxes-measure.png) 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**length** | **float** | Длина упаковки в см.  | 
**width** | **float** | Ширина упаковки в см.  | 
**height** | **float** | Высота упаковки в см.  | 
**weight** | **float** | Вес товара в кг с учетом упаковки (брутто).  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.offer_weight_dimensions_dto import OfferWeightDimensionsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferWeightDimensionsDTO from a JSON string
offer_weight_dimensions_dto_instance = OfferWeightDimensionsDTO.from_json(json)
# print the JSON string representation of the object
print OfferWeightDimensionsDTO.to_json()

# convert the object into a dict
offer_weight_dimensions_dto_dict = offer_weight_dimensions_dto_instance.to_dict()
# create an instance of OfferWeightDimensionsDTO from a dict
offer_weight_dimensions_dto_from_dict = OfferWeightDimensionsDTO.from_dict(offer_weight_dimensions_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


