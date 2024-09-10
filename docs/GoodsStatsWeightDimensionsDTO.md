# GoodsStatsWeightDimensionsDTO

Информация о весе и габаритах товара.  Если товар уже привязан к карточке (`marketSku`), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**length** | **float** | Длина товара в сантиметрах. | [optional] 
**width** | **float** | Ширина товара в сантиметрах. | [optional] 
**height** | **float** | Высота товара в сантиметрах. | [optional] 
**weight** | **float** | Вес товара в килограммах. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.goods_stats_weight_dimensions_dto import GoodsStatsWeightDimensionsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GoodsStatsWeightDimensionsDTO from a JSON string
goods_stats_weight_dimensions_dto_instance = GoodsStatsWeightDimensionsDTO.from_json(json)
# print the JSON string representation of the object
print GoodsStatsWeightDimensionsDTO.to_json()

# convert the object into a dict
goods_stats_weight_dimensions_dto_dict = goods_stats_weight_dimensions_dto_instance.to_dict()
# create an instance of GoodsStatsWeightDimensionsDTO from a dict
goods_stats_weight_dimensions_dto_from_dict = GoodsStatsWeightDimensionsDTO.from_dict(goods_stats_weight_dimensions_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


