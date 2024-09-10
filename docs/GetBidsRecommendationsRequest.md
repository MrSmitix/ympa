# GetBidsRecommendationsRequest

description.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**skus** | **List[str]** | Список товаров, для которых нужно получить рекомендации по ставкам.  | 

## Example

```python
from ympa_python_client.models.get_bids_recommendations_request import GetBidsRecommendationsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of GetBidsRecommendationsRequest from a JSON string
get_bids_recommendations_request_instance = GetBidsRecommendationsRequest.from_json(json)
# print the JSON string representation of the object
print(GetBidsRecommendationsRequest.to_json())

# convert the object into a dict
get_bids_recommendations_request_dict = get_bids_recommendations_request_instance.to_dict()
# create an instance of GetBidsRecommendationsRequest from a dict
get_bids_recommendations_request_from_dict = GetBidsRecommendationsRequest.from_dict(get_bids_recommendations_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


