# CampaignSettingsLocalRegionDTO

Информация о своем регионе магазина.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | Идентификатор региона. | [optional] 
**name** | **str** | Название региона. | [optional] 
**type** | [**RegionType**](RegionType.md) |  | [optional] 
**delivery_options_source** | [**CampaignSettingsScheduleSourceType**](CampaignSettingsScheduleSourceType.md) |  | [optional] 
**delivery** | [**CampaignSettingsDeliveryDTO**](CampaignSettingsDeliveryDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.campaign_settings_local_region_dto import CampaignSettingsLocalRegionDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignSettingsLocalRegionDTO from a JSON string
campaign_settings_local_region_dto_instance = CampaignSettingsLocalRegionDTO.from_json(json)
# print the JSON string representation of the object
print CampaignSettingsLocalRegionDTO.to_json()

# convert the object into a dict
campaign_settings_local_region_dto_dict = campaign_settings_local_region_dto_instance.to_dict()
# create an instance of CampaignSettingsLocalRegionDTO from a dict
campaign_settings_local_region_dto_from_dict = CampaignSettingsLocalRegionDTO.from_dict(campaign_settings_local_region_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


