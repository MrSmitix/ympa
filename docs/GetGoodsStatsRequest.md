# GetGoodsStatsRequest

Запрос отчета по товарам.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**shop_skus** | **List[str]** | Список ваших идентификаторов SKU.  | 

## Example

```python
from ympa_python_client.models.get_goods_stats_request import GetGoodsStatsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetGoodsStatsRequest from a JSON string
get_goods_stats_request_instance = GetGoodsStatsRequest.from_json(json)
# print the JSON string representation of the object
print(GetGoodsStatsRequest.to_json())

# convert the object into a dict
get_goods_stats_request_dict = get_goods_stats_request_instance.to_dict()
# create an instance of GetGoodsStatsRequest from a dict
get_goods_stats_request_from_dict = GetGoodsStatsRequest.from_dict(get_goods_stats_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


