# OfferCampaignStatusDTO

Статус товара в магазине.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **int** | Идентификатор кампании.  | 
**status** | [**OfferCampaignStatusType**](OfferCampaignStatusType.md) |  | 

## Example

```python
from ympa_python_client.models.offer_campaign_status_dto import OfferCampaignStatusDTO

# TODO update the JSON string below
json = "{}"
# create an instance of OfferCampaignStatusDTO from a JSON string
offer_campaign_status_dto_instance = OfferCampaignStatusDTO.from_json(json)
# print the JSON string representation of the object
print(OfferCampaignStatusDTO.to_json())

# convert the object into a dict
offer_campaign_status_dto_dict = offer_campaign_status_dto_instance.to_dict()
# create an instance of OfferCampaignStatusDTO from a dict
offer_campaign_status_dto_from_dict = OfferCampaignStatusDTO.from_dict(offer_campaign_status_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


