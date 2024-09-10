# GetCampaignOffersResponse

Ответ на запрос списка товаров в магазине.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**GetCampaignOffersResultDTO**](GetCampaignOffersResultDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_campaign_offers_response import GetCampaignOffersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetCampaignOffersResponse from a JSON string
get_campaign_offers_response_instance = GetCampaignOffersResponse.from_json(json)
# print the JSON string representation of the object
print(GetCampaignOffersResponse.to_json())

# convert the object into a dict
get_campaign_offers_response_dict = get_campaign_offers_response_instance.to_dict()
# create an instance of GetCampaignOffersResponse from a dict
get_campaign_offers_response_from_dict = GetCampaignOffersResponse.from_dict(get_campaign_offers_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


