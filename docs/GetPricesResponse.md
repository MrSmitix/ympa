# GetPricesResponse

Ответ на запрос списка цен.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**ApiResponseStatusType**](ApiResponseStatusType.md) |  | [optional] 
**result** | [**OfferPriceListResponseDTO**](OfferPriceListResponseDTO.md) |  | [optional] 

## Example

```python
from ympa_python_client.models.get_prices_response import GetPricesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetPricesResponse from a JSON string
get_prices_response_instance = GetPricesResponse.from_json(json)
# print the JSON string representation of the object
print(GetPricesResponse.to_json())

# convert the object into a dict
get_prices_response_dict = get_prices_response_instance.to_dict()
# create an instance of GetPricesResponse from a dict
get_prices_response_from_dict = GetPricesResponse.from_dict(get_prices_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


