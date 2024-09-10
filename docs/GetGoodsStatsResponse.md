# GetGoodsStatsResponse

Ответ на запрос отчета по товарам.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**GoodsStatsDTO**](GoodsStatsDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_goods_stats_response import GetGoodsStatsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetGoodsStatsResponse from a JSON string
get_goods_stats_response_instance = GetGoodsStatsResponse.from_json(json)
# print the JSON string representation of the object
print GetGoodsStatsResponse.to_json()

# convert the object into a dict
get_goods_stats_response_dict = get_goods_stats_response_instance.to_dict()
# create an instance of GetGoodsStatsResponse from a dict
get_goods_stats_response_from_dict = GetGoodsStatsResponse.from_dict(get_goods_stats_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


