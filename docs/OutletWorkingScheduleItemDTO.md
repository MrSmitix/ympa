# OutletWorkingScheduleItemDTO

Расписание работы точки продаж.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**start_day** | [**DayOfWeekType**](DayOfWeekType.md) |  | 
**end_day** | [**DayOfWeekType**](DayOfWeekType.md) |  | 
**start_time** | **str** | Точка продаж работает c указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;.  | 
**end_time** | **str** | Точка продаж работает до указанного часа.  Формат: &#x60;ЧЧ:ММ&#x60;.  | 

## Example

```python
from ympa_python_pydantic_v1_client.models.outlet_working_schedule_item_dto import OutletWorkingScheduleItemDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OutletWorkingScheduleItemDTO from a JSON string
outlet_working_schedule_item_dto_instance = OutletWorkingScheduleItemDTO.from_json(json)
# print the JSON string representation of the object
print OutletWorkingScheduleItemDTO.to_json()

# convert the object into a dict
outlet_working_schedule_item_dto_dict = outlet_working_schedule_item_dto_instance.to_dict()
# create an instance of OutletWorkingScheduleItemDTO from a dict
outlet_working_schedule_item_dto_from_dict = OutletWorkingScheduleItemDTO.from_dict(outlet_working_schedule_item_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


