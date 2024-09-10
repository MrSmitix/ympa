# GetHiddenOffersResponse

Ответ на запрос списка скрытий.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**GetHiddenOffersResultDTO**](GetHiddenOffersResultDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_hidden_offers_response import GetHiddenOffersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetHiddenOffersResponse from a JSON string
get_hidden_offers_response_instance = GetHiddenOffersResponse.from_json(json)
# print the JSON string representation of the object
print GetHiddenOffersResponse.to_json()

# convert the object into a dict
get_hidden_offers_response_dict = get_hidden_offers_response_instance.to_dict()
# create an instance of GetHiddenOffersResponse from a dict
get_hidden_offers_response_from_dict = GetHiddenOffersResponse.from_dict(get_hidden_offers_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


