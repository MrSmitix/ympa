# GetOfferRecommendationsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**OfferRecommendationsResultDTO**](OfferRecommendationsResultDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_offer_recommendations_response import GetOfferRecommendationsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetOfferRecommendationsResponse from a JSON string
get_offer_recommendations_response_instance = GetOfferRecommendationsResponse.from_json(json)
# print the JSON string representation of the object
print(GetOfferRecommendationsResponse.to_json())

# convert the object into a dict
get_offer_recommendations_response_dict = get_offer_recommendations_response_instance.to_dict()
# create an instance of GetOfferRecommendationsResponse from a dict
get_offer_recommendations_response_from_dict = GetOfferRecommendationsResponse.from_dict(get_offer_recommendations_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


