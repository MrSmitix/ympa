# CampaignDTO

Информация о магазине.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**domain** | **str** | URL магазина. | [optional] 
**id** | **int** | Идентификатор кампании. | [optional] 
**client_id** | **int** | Идентификатор плательщика в Яндекс Балансе. | [optional] 
**business** | [**BusinessDTO**](BusinessDTO.md) |  | [optional] 
**placement_type** | [**PlacementType**](PlacementType.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.campaign_dto import CampaignDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignDTO from a JSON string
campaign_dto_instance = CampaignDTO.from_json(json)
# print the JSON string representation of the object
print CampaignDTO.to_json()

# convert the object into a dict
campaign_dto_dict = campaign_dto_instance.to_dict()
# create an instance of CampaignDTO from a dict
campaign_dto_from_dict = CampaignDTO.from_dict(campaign_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


