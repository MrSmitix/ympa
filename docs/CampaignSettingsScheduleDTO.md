# CampaignSettingsScheduleDTO

Расписание работы службы доставки в своем регионе.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**available_on_holidays** | **bool** | Признак работы службы доставки в государственные праздники. Возможные значения. * &#x60;false&#x60; — служба доставки не работает в праздничные дни. * &#x60;true&#x60; — служба доставки работает в праздничные дни.  | [optional] 
**custom_holidays** | **List[str]** | Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете. | 
**custom_working_days** | **List[str]** | Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете. | 
**period** | [**CampaignSettingsTimePeriodDTO**](CampaignSettingsTimePeriodDTO.md) |  | [optional] 
**total_holidays** | **List[str]** | Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете. | 
**weekly_holidays** | **List[int]** | Список выходных дней недели и государственных праздников. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.campaign_settings_schedule_dto import CampaignSettingsScheduleDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignSettingsScheduleDTO from a JSON string
campaign_settings_schedule_dto_instance = CampaignSettingsScheduleDTO.from_json(json)
# print the JSON string representation of the object
print CampaignSettingsScheduleDTO.to_json()

# convert the object into a dict
campaign_settings_schedule_dto_dict = campaign_settings_schedule_dto_instance.to_dict()
# create an instance of CampaignSettingsScheduleDTO from a dict
campaign_settings_schedule_dto_from_dict = CampaignSettingsScheduleDTO.from_dict(campaign_settings_schedule_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


