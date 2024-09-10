# UpdateCampaignOffersRequest

Запрос на обновление предложений товаров магазина.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offers** | [**List[UpdateCampaignOfferDTO]**](UpdateCampaignOfferDTO.md) | Параметры размещения товаров в заданном магазине. | 

## Example

```python
from ympa_python_client.models.update_campaign_offers_request import UpdateCampaignOffersRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateCampaignOffersRequest from a JSON string
update_campaign_offers_request_instance = UpdateCampaignOffersRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateCampaignOffersRequest.to_json())

# convert the object into a dict
update_campaign_offers_request_dict = update_campaign_offers_request_instance.to_dict()
# create an instance of UpdateCampaignOffersRequest from a dict
update_campaign_offers_request_from_dict = UpdateCampaignOffersRequest.from_dict(update_campaign_offers_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


