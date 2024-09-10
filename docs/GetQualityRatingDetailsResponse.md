# GetQualityRatingDetailsResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**QualityRatingDetailsDTO**](QualityRatingDetailsDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_quality_rating_details_response import GetQualityRatingDetailsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetQualityRatingDetailsResponse from a JSON string
get_quality_rating_details_response_instance = GetQualityRatingDetailsResponse.from_json(json)
# print the JSON string representation of the object
print GetQualityRatingDetailsResponse.to_json()

# convert the object into a dict
get_quality_rating_details_response_dict = get_quality_rating_details_response_instance.to_dict()
# create an instance of GetQualityRatingDetailsResponse from a dict
get_quality_rating_details_response_from_dict = GetQualityRatingDetailsResponse.from_dict(get_quality_rating_details_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


