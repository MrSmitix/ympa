# GoodsStatsDTO

Отчет по товарам.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shop_skus** | [**List[GoodsStatsGoodsDTO]**](GoodsStatsGoodsDTO.md) | Список товаров. | 

## Example

```python
from ympa_python_client.models.goods_stats_dto import GoodsStatsDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GoodsStatsDTO from a JSON string
goods_stats_dto_instance = GoodsStatsDTO.from_json(json)
# print the JSON string representation of the object
print(GoodsStatsDTO.to_json())

# convert the object into a dict
goods_stats_dto_dict = goods_stats_dto_instance.to_dict()
# create an instance of GoodsStatsDTO from a dict
goods_stats_dto_from_dict = GoodsStatsDTO.from_dict(goods_stats_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


