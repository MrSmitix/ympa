# DeleteCampaignOffersRequest

Фильтрации удаляемых товаров по offerIds. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offer_ids** | **List[str]** | Идентификаторы товаров в каталоге. | 

## Example

```python
from ympa_python_client.models.delete_campaign_offers_request import DeleteCampaignOffersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteCampaignOffersRequest from a JSON string
delete_campaign_offers_request_instance = DeleteCampaignOffersRequest.from_json(json)
# print the JSON string representation of the object
print(DeleteCampaignOffersRequest.to_json())

# convert the object into a dict
delete_campaign_offers_request_dict = delete_campaign_offers_request_instance.to_dict()
# create an instance of DeleteCampaignOffersRequest from a dict
delete_campaign_offers_request_from_dict = DeleteCampaignOffersRequest.from_dict(delete_campaign_offers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


