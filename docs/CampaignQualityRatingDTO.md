# CampaignQualityRatingDTO

Информация об индексе качества магазина.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_id** | **int** | Идентификатор магазина. | 
**ratings** | [**List[QualityRatingDTO]**](QualityRatingDTO.md) | Список значений индекса качества. | 

## Example

```python
from ympa_python_client.models.campaign_quality_rating_dto import CampaignQualityRatingDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignQualityRatingDTO from a JSON string
campaign_quality_rating_dto_instance = CampaignQualityRatingDTO.from_json(json)
# print the JSON string representation of the object
print(CampaignQualityRatingDTO.to_json())

# convert the object into a dict
campaign_quality_rating_dto_dict = campaign_quality_rating_dto_instance.to_dict()
# create an instance of CampaignQualityRatingDTO from a dict
campaign_quality_rating_dto_from_dict = CampaignQualityRatingDTO.from_dict(campaign_quality_rating_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


