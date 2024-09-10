# DeleteCampaignOffersDTO

Список товаров, которые не удалось удалить, потому что они не найдены или хранятся на складе Маркета.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**not_deleted_offer_ids** | **List[str]** | Список SKU. | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.delete_campaign_offers_dto import DeleteCampaignOffersDTO

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteCampaignOffersDTO from a JSON string
delete_campaign_offers_dto_instance = DeleteCampaignOffersDTO.from_json(json)
# print the JSON string representation of the object
print DeleteCampaignOffersDTO.to_json()

# convert the object into a dict
delete_campaign_offers_dto_dict = delete_campaign_offers_dto_instance.to_dict()
# create an instance of DeleteCampaignOffersDTO from a dict
delete_campaign_offers_dto_from_dict = DeleteCampaignOffersDTO.from_dict(delete_campaign_offers_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


