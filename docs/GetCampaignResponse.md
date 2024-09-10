# GetCampaignResponse

Информация о магазине к данным идентификатора кампании.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign** | [**CampaignDTO**](CampaignDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_campaign_response import GetCampaignResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetCampaignResponse from a JSON string
get_campaign_response_instance = GetCampaignResponse.from_json(json)
# print the JSON string representation of the object
print GetCampaignResponse.to_json()

# convert the object into a dict
get_campaign_response_dict = get_campaign_response_instance.to_dict()
# create an instance of GetCampaignResponse from a dict
get_campaign_response_from_dict = GetCampaignResponse.from_dict(get_campaign_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


