# GetQualityRatingResponse

Информация об индексе качества магазинов.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**CampaignsQualityRatingDTO**](CampaignsQualityRatingDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_quality_rating_response import GetQualityRatingResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetQualityRatingResponse from a JSON string
get_quality_rating_response_instance = GetQualityRatingResponse.from_json(json)
# print the JSON string representation of the object
print GetQualityRatingResponse.to_json()

# convert the object into a dict
get_quality_rating_response_dict = get_quality_rating_response_instance.to_dict()
# create an instance of GetQualityRatingResponse from a dict
get_quality_rating_response_from_dict = GetQualityRatingResponse.from_dict(get_quality_rating_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


