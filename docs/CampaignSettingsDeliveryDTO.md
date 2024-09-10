# CampaignSettingsDeliveryDTO

Информация о доставке в своем регионе магазина.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schedule** | [**CampaignSettingsScheduleDTO**](CampaignSettingsScheduleDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.campaign_settings_delivery_dto import CampaignSettingsDeliveryDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignSettingsDeliveryDTO from a JSON string
campaign_settings_delivery_dto_instance = CampaignSettingsDeliveryDTO.from_json(json)
# print the JSON string representation of the object
print(CampaignSettingsDeliveryDTO.to_json())

# convert the object into a dict
campaign_settings_delivery_dto_dict = campaign_settings_delivery_dto_instance.to_dict()
# create an instance of CampaignSettingsDeliveryDTO from a dict
campaign_settings_delivery_dto_from_dict = CampaignSettingsDeliveryDTO.from_dict(campaign_settings_delivery_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


