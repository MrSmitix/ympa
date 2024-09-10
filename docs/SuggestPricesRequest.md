# SuggestPricesRequest

Запрос на получение списка цен для продвижения.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**offers** | [**List[SuggestOfferPriceDTO]**](SuggestOfferPriceDTO.md) | Список товаров. | 

## Example

```python
from ympa_python_pydantic_v1_client.models.suggest_prices_request import SuggestPricesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of SuggestPricesRequest from a JSON string
suggest_prices_request_instance = SuggestPricesRequest.from_json(json)
# print the JSON string representation of the object
print SuggestPricesRequest.to_json()

# convert the object into a dict
suggest_prices_request_dict = suggest_prices_request_instance.to_dict()
# create an instance of SuggestPricesRequest from a dict
suggest_prices_request_from_dict = SuggestPricesRequest.from_dict(suggest_prices_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


