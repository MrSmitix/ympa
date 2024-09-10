# TimePeriodDTO

Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time_period** | **int** | Продолжительность в указанных единицах. | 
**time_unit** | [**TimeUnitType**](TimeUnitType.md) |  | 
**comment** | **str** | Комментарий. | [optional] 

## Example

```python
from ympa_python_client.models.time_period_dto import TimePeriodDTO

# TODO update the JSON string below
json = "{}"
# create an instance of TimePeriodDTO from a JSON string
time_period_dto_instance = TimePeriodDTO.from_json(json)
# print the JSON string representation of the object
print(TimePeriodDTO.to_json())

# convert the object into a dict
time_period_dto_dict = time_period_dto_instance.to_dict()
# create an instance of TimePeriodDTO from a dict
time_period_dto_from_dict = TimePeriodDTO.from_dict(time_period_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


