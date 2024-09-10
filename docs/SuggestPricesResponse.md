# SuggestPricesResponse

Ответ на запрос списка цен для продвижения.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**SuggestPricesResultDTO**](SuggestPricesResultDTO.md) |  | [optional] 

## Example

```python
from ympa_python_pydantic_v1_client.models.suggest_prices_response import SuggestPricesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of SuggestPricesResponse from a JSON string
suggest_prices_response_instance = SuggestPricesResponse.from_json(json)
# print the JSON string representation of the object
print SuggestPricesResponse.to_json()

# convert the object into a dict
suggest_prices_response_dict = suggest_prices_response_instance.to_dict()
# create an instance of SuggestPricesResponse from a dict
suggest_prices_response_from_dict = SuggestPricesResponse.from_dict(suggest_prices_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


