# CampaignsQualityRatingDTO

Информация об индексе качества магазинов.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**campaign_ratings** | [**List[CampaignQualityRatingDTO]**](CampaignQualityRatingDTO.md) | Список магазинов c информацией об их индексе качества. | 

## Example

```python
from ympa_python_client.models.campaigns_quality_rating_dto import CampaignsQualityRatingDTO

# TODO update the JSON string below
json = "{}"
# create an instance of CampaignsQualityRatingDTO from a JSON string
campaigns_quality_rating_dto_instance = CampaignsQualityRatingDTO.from_json(json)
# print the JSON string representation of the object
print(CampaignsQualityRatingDTO.to_json())

# convert the object into a dict
campaigns_quality_rating_dto_dict = campaigns_quality_rating_dto_instance.to_dict()
# create an instance of CampaignsQualityRatingDTO from a dict
campaigns_quality_rating_dto_from_dict = CampaignsQualityRatingDTO.from_dict(campaigns_quality_rating_dto_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


