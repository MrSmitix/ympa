# GetQuarantineOffersResponse

Ответ на запрос списка товаров в карантине.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**GetQuarantineOffersResultDTO**](GetQuarantineOffersResultDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.get_quarantine_offers_response import GetQuarantineOffersResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetQuarantineOffersResponse from a JSON string
get_quarantine_offers_response_instance = GetQuarantineOffersResponse.from_json(json)
# print the JSON string representation of the object
print GetQuarantineOffersResponse.to_json()

# convert the object into a dict
get_quarantine_offers_response_dict = get_quarantine_offers_response_instance.to_dict()
# create an instance of GetQuarantineOffersResponse from a dict
get_quarantine_offers_response_from_dict = GetQuarantineOffersResponse.from_dict(get_quarantine_offers_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


