# TurnoverDTO

Информация об оборачиваемости товара.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**turnover** | [**TurnoverType**](TurnoverType.md) |  | 
**turnover_days** | **float** | Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html) | [optional] 

## Example

```python
from ympa_python_client.models.turnover_dto import TurnoverDTO

# TODO update the JSON string below
json = "{}"
# create an instance of TurnoverDTO from a JSON string
turnover_dto_instance = TurnoverDTO.from_json(json)
# print the JSON string representation of the object
print(TurnoverDTO.to_json())

# convert the object into a dict
turnover_dto_dict = turnover_dto_instance.to_dict()
# create an instance of TurnoverDTO from a dict
turnover_dto_from_dict = TurnoverDTO.from_dict(turnover_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


