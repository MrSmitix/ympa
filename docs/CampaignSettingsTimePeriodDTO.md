# CampaignSettingsTimePeriodDTO

Период, за который рассчитывается итоговый список нерабочих дней службы доставки.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from_date** | **str** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 
**to_date** | **str** | Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;.  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.campaign_settings_time_period_dto import CampaignSettingsTimePeriodDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignSettingsTimePeriodDTO from a JSON string
campaign_settings_time_period_dto_instance = CampaignSettingsTimePeriodDTO.from_json(json)
# print the JSON string representation of the object
print CampaignSettingsTimePeriodDTO.to_json()

# convert the object into a dict
campaign_settings_time_period_dto_dict = campaign_settings_time_period_dto_instance.to_dict()
# create an instance of CampaignSettingsTimePeriodDTO from a dict
campaign_settings_time_period_dto_from_dict = CampaignSettingsTimePeriodDTO.from_dict(campaign_settings_time_period_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


