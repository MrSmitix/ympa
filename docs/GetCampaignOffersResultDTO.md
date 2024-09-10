# GetCampaignOffersResultDTO

Список товаров в заданном магазине.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paging** | [**ScrollingPagerDTO**](ScrollingPagerDTO.md) |  | [optional] 
**offers** | [**List[GetCampaignOfferDTO]**](GetCampaignOfferDTO.md) | Страница списка товаров. | 

## Example

```python
from ympa_python_client.models.get_campaign_offers_result_dto import GetCampaignOffersResultDTO

# TODO update the JSON string below
json = "{}"
# create an instance of GetCampaignOffersResultDTO from a JSON string
get_campaign_offers_result_dto_instance = GetCampaignOffersResultDTO.from_json(json)
# print the JSON string representation of the object
print(GetCampaignOffersResultDTO.to_json())

# convert the object into a dict
get_campaign_offers_result_dto_dict = get_campaign_offers_result_dto_instance.to_dict()
# create an instance of GetCampaignOffersResultDTO from a dict
get_campaign_offers_result_dto_from_dict = GetCampaignOffersResultDTO.from_dict(get_campaign_offers_result_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


