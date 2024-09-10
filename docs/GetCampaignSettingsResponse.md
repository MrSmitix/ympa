# GetCampaignSettingsResponse

Ответ на запрос настроек магазина.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**settings** | [**CampaignSettingsDTO**](CampaignSettingsDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_campaign_settings_response import GetCampaignSettingsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetCampaignSettingsResponse from a JSON string
get_campaign_settings_response_instance = GetCampaignSettingsResponse.from_json(json)
# print the JSON string representation of the object
print GetCampaignSettingsResponse.to_json()

# convert the object into a dict
get_campaign_settings_response_dict = get_campaign_settings_response_instance.to_dict()
# create an instance of GetCampaignSettingsResponse from a dict
get_campaign_settings_response_from_dict = GetCampaignSettingsResponse.from_dict(get_campaign_settings_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


