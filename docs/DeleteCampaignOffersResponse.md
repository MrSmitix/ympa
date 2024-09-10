# DeleteCampaignOffersResponse

Результат удаления товаров.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**DeleteCampaignOffersDTO**](DeleteCampaignOffersDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.delete_campaign_offers_response import DeleteCampaignOffersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteCampaignOffersResponse from a JSON string
delete_campaign_offers_response_instance = DeleteCampaignOffersResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteCampaignOffersResponse.to_json())

# convert the object into a dict
delete_campaign_offers_response_dict = delete_campaign_offers_response_instance.to_dict()
# create an instance of DeleteCampaignOffersResponse from a dict
delete_campaign_offers_response_from_dict = DeleteCampaignOffersResponse.from_dict(delete_campaign_offers_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


