# OutletWorkingScheduleDTO

Список режимов работы точки продаж. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**work_in_holiday** | **bool** | Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * &#x60;false&#x60; — точка продаж не работает в дни государственных праздников. * &#x60;true&#x60; — точка продаж работает в дни государственных праздников.  | [optional] 
**schedule_items** | [**List[OutletWorkingScheduleItemDTO]**](OutletWorkingScheduleItemDTO.md) | Список расписаний работы точки продаж.  | 

## Example

```python
from ympa_python_client.models.outlet_working_schedule_dto import OutletWorkingScheduleDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OutletWorkingScheduleDTO from a JSON string
outlet_working_schedule_dto_instance = OutletWorkingScheduleDTO.from_json(json)
# print the JSON string representation of the object
print(OutletWorkingScheduleDTO.to_json())

# convert the object into a dict
outlet_working_schedule_dto_dict = outlet_working_schedule_dto_instance.to_dict()
# create an instance of OutletWorkingScheduleDTO from a dict
outlet_working_schedule_dto_from_dict = OutletWorkingScheduleDTO.from_dict(outlet_working_schedule_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


