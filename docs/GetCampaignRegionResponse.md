# GetCampaignRegionResponse

Ответ на запрос региона магазина.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**region** | [**RegionDTO**](RegionDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_campaign_region_response import GetCampaignRegionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetCampaignRegionResponse from a JSON string
get_campaign_region_response_instance = GetCampaignRegionResponse.from_json(json)
# print the JSON string representation of the object
print GetCampaignRegionResponse.to_json()

# convert the object into a dict
get_campaign_region_response_dict = get_campaign_region_response_instance.to_dict()
# create an instance of GetCampaignRegionResponse from a dict
get_campaign_region_response_from_dict = GetCampaignRegionResponse.from_dict(get_campaign_region_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


