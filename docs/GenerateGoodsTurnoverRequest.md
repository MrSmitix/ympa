# GenerateGoodsTurnoverRequest

Данные, необходимые для генерации отчета. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **int** | Идентификатор кампании. | 
**var_date** | **date** | Дата, за которую нужно рассчитать оборачиваемость. Если параметр не указан, используется текущая дата. | [optional] 

## Example

```python
from ympa_python_client.models.generate_goods_turnover_request import GenerateGoodsTurnoverRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GenerateGoodsTurnoverRequest from a JSON string
generate_goods_turnover_request_instance = GenerateGoodsTurnoverRequest.from_json(json)
# print the JSON string representation of the object
print(GenerateGoodsTurnoverRequest.to_json())

# convert the object into a dict
generate_goods_turnover_request_dict = generate_goods_turnover_request_instance.to_dict()
# create an instance of GenerateGoodsTurnoverRequest from a dict
generate_goods_turnover_request_from_dict = GenerateGoodsTurnoverRequest.from_dict(generate_goods_turnover_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


